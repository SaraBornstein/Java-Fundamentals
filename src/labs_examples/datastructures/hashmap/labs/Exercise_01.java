package labs_examples.datastructures.hashmap.labs;

import java.util.HashMap;
import java.util.function.BiConsumer;

/**
 *  HashMaps Exercise_01
 *
 *  Demonstrate you're mastery of using Java's built-in HashMap class below.
 *
 *  Using a HashMap demonstrate the use of the following methods:
 *
 *  put()
 *  get()
 *  putAll()
 *  size()
 *  contains()
 *  keySet()
 *  entrySet()
 *  putIfAbsent()
 *  remove()
 *  replace()
 *  forEach()
 *  clear()
 *
 */
class HashMapExerciseOne {
    public static void main(String[] args) {

        // create the hashMap
        HashMap<String, Abook> myBookHashMap = new HashMap();

        // create a few objects
        Abook BookOne = new Abook("TitleOne", "AuthorOne");
        Abook BookTwo = new Abook("TitleTwo", "AuthorTwo");
        Abook BookThree = new Abook("TitleThree", "AuthorThree");

        //put() the objects into a HashMap
        myBookHashMap.put(BookOne.getTitle(), BookOne);
        myBookHashMap.put(BookTwo.getTitle(), BookTwo);
        myBookHashMap.put(BookThree.getTitle(), BookThree);

        //get()
        Abook getAnElement = myBookHashMap.get("TitleOne");
        System.out.println("get(): " + getAnElement.toString());

        //putall() - copies values from existing HashMap to a new HashMap
        HashMap<String, Abook> secondHashMap = new HashMap();
        secondHashMap.putAll(myBookHashMap);
        System.out.println("putall(): " + secondHashMap.toString());

        //size()
        int hashMapSize = myBookHashMap.size();
        System.out.println("size(): " + hashMapSize);

        //contains()
        System.out.println("HashMap contains TitleOne? " + myBookHashMap.containsKey("TitleOne"));

        //keySet()
        System.out.println("The key set is: " + myBookHashMap.keySet());

        //entrySet()
        System.out.println("The entry set is: " + myBookHashMap.entrySet());

        //putIfAbsent()
        //create new object
        Abook BookFour = new Abook("TitleFour", "AuthorFour");
        //add new object
        myBookHashMap.putIfAbsent("TitleFour", BookFour);
        //print HashMap with new object added
        System.out.println("HashMap with new object added: " + myBookHashMap.toString());

        //remove()
        myBookHashMap.remove("TitleFour", BookFour);
        //print HashMap with new object removed
        System.out.println("HashMap with new object removed: " + myBookHashMap.toString());

        //replace()
        //create new object
        Abook BookFive = new Abook("TitleFive", "AuthorFive");
        //replace BookOne with BookFive
        myBookHashMap.replace("TitleOne", BookFive);
        System.out.println(myBookHashMap.toString());
        System.out.println("Was this item replaced? " + myBookHashMap.replace("TitleOne", BookFive, BookOne));

        //forEach()
        BiConsumer<String, Abook> action = new MyBiConsumer();
        myBookHashMap.forEach(action);

        //clear()
        myBookHashMap.clear();
        System.out.println("Hashmap cleared: " + myBookHashMap.toString());
    }
}

