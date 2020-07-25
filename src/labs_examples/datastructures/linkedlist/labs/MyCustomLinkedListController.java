package labs_examples.datastructures.linkedlist.labs;

public class MyCustomLinkedListController {

    public static void main(String[] args) {
        MyCustomLinkedList<String> myList = new MyCustomLinkedList(); //create new linked list object of type String

        //add string elements to list
        myList.add("StringOne");
        myList.add("StringTwo");
        myList.add("StringThree");

        //check if list contains these two string elements
        System.out.println(myList.contains("StringOne")); //true
        System.out.println(myList.contains("StringFour")); //false

        //add more elements
        myList.add("StringFour");
        myList.add("StringFive");

        //check if list contains element
        System.out.println(myList.contains("StringFour")); //now true

        //delete first element
        myList.delete("StringOne");

        //check if list contains the deleted element
        System.out.println(myList.contains("StringOne"));

        //delete element in middle
        myList.delete("StringFour");

        //check if list contains deleted element
        System.out.println(myList.contains("StringFour"));

        //find size
        System.out.println(myList.size());
        myList.clear();
        System.out.println(myList.size());

    }
}


/*
   public void add(T val){
       LinkedListNode newVal = new LinkedListNode(val); //create a new element of type node, pass in value for that element

       if(head == null){ //if the first element is non existent (null)
           head = newVal; //the new element can go in the first spot (the head)
       } else{ //otherwise,
           LinkedListNode iter = head; //create variable to iterate through the list so you don't lose head
           while(iter.next != null){ //while the next element is not empty (null)
               iter = iter.next; //iter can move to the next space
           }
           iter.next = newVal; //break out of the while loop when the next space is empty, the new value can be placed then. Value added to ist.
       }

   }
 */
