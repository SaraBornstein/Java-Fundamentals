package labs_examples.datastructures.linkedlist.labs;

public class MyCustomLinkedListController {
    public static void main(String[] args) {
        MyCustomLinkedList<String> myList = new MyCustomLinkedList();
        myList.add("StringOne");
        myList.add("StringTwo");
        myList.add("StringThree");
        System.out.println(myList.contains("StringOne"));
        System.out.println(myList.contains("StringFour"));
        myList.add("StringFour");
        myList.add("StringFive");
        System.out.println(myList.contains("StringFour"));
        myList.delete("StringOne");
        System.out.println(myList.contains("StringOne"));
        myList.delete("StringFour");
        System.out.println(myList.contains("StringFour"));

    }
}
