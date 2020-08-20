package labs_examples.datastructures.hashmap.labs;

import labs_examples.datastructures.hashmap.examples.Entry;

/**
 *      HashMaps Exercise_02
 *
 *      Rewrite the CustomHashMap class to meet the following requirements:
 *      1) no method has the same name as any in CustomHashMap
 *          (do not use refactor - do it manually)
 *      2) no variable has the same name as any in CustomHashMap
 *          (do not use refactor - do it manually)
 *
 *      3) resize the HashMap when the underlying array is more than half full
 *      4) triple the size of the underlying array on resize()
 *      5) instead of checking the number of keys to resize, check the number of values
 *
 *      6) on collisions, add new elements to the front of the LinkedList, not the end
 *
 *      7) anytime someone tries to get/update/remove an element that does not exist, print
 *          out a message indicating that the element does not exist
 *
 *      8) add at least one more method that you think could be useful to the HashMap
 *          review Java's built-in HashMap for inspiration
 */
public class CustomHashMapRewrite<X, Y> {

    private ObjectOfData<X, Y>[] underlyingArr =  new ObjectOfData[10];

    //hash method - findIndex
    private int findIndex(X objectCategory){
        int indexNum = Math.abs(objectCategory.hashCode() % underlyingArr.length);
        // the result will be the index where we can find and/or place entries
        return indexNum;
    }

    //put method - addToHashMap
    private void addToHashMap(X objectCategory, Y objectInfo){
        int indexNum = findIndex(objectCategory);

        ObjectOfData<X, Y> dataEntry = new ObjectOfData(objectCategory, objectInfo);

        if (underlyingArr[indexNum] == null) {
            underlyingArr[indexNum] = dataEntry;
        }
        else {
            ObjectOfData<X, Y> firstEntryAtIndex = underlyingArr[indexNum];
            while (firstEntryAtIndex.next != null) {
                firstEntryAtIndex = firstEntryAtIndex.next;
            }
            firstEntryAtIndex.next = dataEntry;
        }
        //Instead of checking the number of keys to resize, check the number of values
        if (listOfCategories().size() > underlyingArr.length * .50) {
            // the resize method will create a bigger underlying array and
            // add all values in the existing array to the new, larger array
            growUnderlyingArray();
        }
    }

    //resize method - growUnderlyingArray
    //When the underlying array is more than half full, triple the size of the underlying array
    private void growUnderlyingArray(){
        ObjectOfData<X, Y>[] copyOfOldTable = underlyingArr;
        underlyingArr = new ObjectOfData[copyOfOldTable.length * 3]; //create a new [] that is 3x the size of the old one

        for (int i = 0; i < copyOfOldTable.length; i++) {
            try {
                ObjectOfData dataEntry = copyOfOldTable[i]; // get the Entry at the index of "i" from the "old" table
                // call the put() method passing the key and value to add this element to the new table
                addToHashMap((X) dataEntry.getObjectCategory(), (Y) dataEntry.getObjectInfo());

                // check to see if this entry is actually the start of a linked list
                while (dataEntry.next != null) {
                    // if it is, traverse to the next node
                    dataEntry = dataEntry.next;
                    // and call the put() method to add this element
                    addToHashMap((X) dataEntry.getObjectCategory(), (Y) dataEntry.getObjectInfo());
                    // loop
                }
            } catch (Exception e) {
                // do nothing - this is just to handle empty indexes
            }
        }
    }

    //remove method - delete
    public void delete(X objectCategory){
        // ensure key exists by calling the get() method
        if (get(key) == null) {
            // if the get() method returns null, there's nothing to delete
            return;
        }

        // otherwise, get the index for the key by calling the hash() method
        int index = hash(key);

        // get the Entry at the index
        Entry<K, V> entry = table[index];

        // if this entry has the matching key, remove the element at this index
        if (entry.getKey().equals(key)){
            table[index] = null;
        }

        // otherwise, if the next element in the linked list is not null
        while (entry.next != null ) {
            // if the key of the next element in the linked list is not the key we're looking for
            if (entry.next.getKey() != key) {
                // traverse the linked list to the next node
                entry = entry.next;
            }
        }

        // when we exit the loop above, entry.next will contain the key we're looking for
        // if we're deleting from the middle of a linked list we need to link
        // entry.next to entry.next.next - this is basically like turning this list:
        // a -> b -> c
        // into this list:
        // a -> c
        if(entry.next.next != null){
            entry.next = entry.next.next;
        }
        // otherwise, entry.next is the end of the list so we can just chop it off
        else {
            entry.next = null;
        }
    }

    //get method - find

    //keys (returns all keys) - listOfCategories
    //public LinkedList<K> listOfCategories(){

    //}

    //new method -

}