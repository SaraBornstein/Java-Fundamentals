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

    }
}
