package labs_examples.datastructures.linkedlist.labs;

import labs_examples.datastructures.linkedlist.examples.Node;

/**
 *      LinkedLists - Exercise_02
 *
 *      Write your own custom LinkedList class. Although it can mimic the CustomLinkedList class we used here, it must be entirely unique.
 *
 *      Please also add at least two additional helper methods that you think could be useful. Refer to Java's built-in LinkedList class for inspiration.
 *      
 *      Your new LinkedList class should ONLY allow users to add and remove elements from the front of the list AND the end of the list.
 *
 *      Also, instead of using the index in the get() and remove() methods, these methods should get() and remove() based by the Node's value, not it's index.
 */
class CustomLinkedListExercise<T> {
    private Node head; // this "head" variable will always keep track of the first Node in the list.

    // this constructor uses VarArgs - meaning you can pass in zero or more data elements to add to the list
    public CustomLinkedListExercise(T... data) {

        if (data.length < 1) {
            // if you don't pass in any data elements it will just instantiate an empty LinkedList (where "head" == null)
            head = null;
        } else {
            // if you pass in 1 or more elements, each element will be added to the LinkedList by calling the add() method
            for (int i = 0; i < data.length; i++) {
                add(data[i]);
            }
        }
    }

    public void add(T data) {
        // call the insert() method, pass in the data as well as the current size of the LinkedList
        // by calling the size() method which will return the length of the LinkedList
        insert(data, size());
    }

    //Removed inserting into the middle
    public void insert(T data, int index) {
        // if "head" is null, create new root node
        if (head == null) {
            head = new Node(data);
        } else {

            // make a new reference to the head node that we can use to traverse the list
            // we do this so we NEVER lose a secure reference to the head node
            Node iterator = head;

            if (index == 0) {

                // if we hit this "if" block it means the user wants to insert a new node
                // to the front of the list, insert new node in front
                head = new Node(data, head);

            } else {

                // if we hit this "else" block, it means the user wants to attach the new node to the end of the list

                // so we need to iterate all the way through list to find last node
                // we'll know we've hit the last node when "iterator.next" is equal to null
                while (iterator.next != null) {
                    iterator = iterator.next;
                }

                // once we exit the loop above, "iterator.next" will be referencing the final node in the list
                // at this point we can attach the new Node to the "next" variable of the final node in th list
                iterator.next = new Node(data);
            }
        }
    }

    //change index to node value in remove and get
    public void remove(Node value) {
        try {
        int count = 0;
        Node iterator = head;
        while (count != value) {
            previous = iterator;
            iterator = iterator.next;
            count++;
        }
            previous.next = iterator.next;
        } catch (NullPointerException ex) {
            System.out.println("invalid value");
        }
    }

    public T get(Node value) {
        try {
            // simple variable to use for looping over the list
            int count = 0;

            // creating a new variable that initially references the "head" node
            // we'll use this new variable to traverse across the list
            Node iterator = head;

            // iterate until index is reach
            while (count != value) {
                iterator = iterator.next;
                count++;
            }
            return (T) iterator.data;

        } catch (NullPointerException ex) {
            return null; // list is empty
        }
    }

    //2 additional helper methods

}
