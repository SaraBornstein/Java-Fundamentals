package labs_examples.datastructures.linkedlist.labs;
/**
 *      LinkedLists - Exercise_02
 *      Write your own custom LinkedList class. Although it can mimic the CustomLinkedList class we used here, it must be entirely unique.
 *      Please also add at least two additional helper methods that you think could be useful. Refer to Java's built-in LinkedList class for inspiration.
 *      Your new LinkedList class should ONLY allow users to add and remove elements from the front of the list AND the end of the list.
 *      Also, instead of using the index in the get() and remove() methods, these methods should get() and remove() based by the Node's value, not it's index.
**/

//Node
class LinkedListNode<T> {
    T val;
    LinkedListNode next;

    //constructor
    public LinkedListNode(T val) {
        this.val = val;
        this.next = null;
    }

    //overloaded constructor
    public LinkedListNode(T val, LinkedListNode next) {
        this.val = val;
        this.next = next;
    }
}

//Linked List
public class MyCustomLinkedList<T> {

    private LinkedListNode<T> head; //keep track of the head

//Add()
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

//delete()
    public void delete(T val){ //pass in a value
       if(head == null) //if the first element is non existent (null)
           return; //end because there's nothing in this list
       else if(head.val.equals(val)) //otherwise, if the first element (head) equals the value passed in
           head = head.next; // delete that head element by making head equal to the next value
       else{ //otherwise,
           LinkedListNode iter = head; //create variable to iterate through the list so you don't lose head
           while(iter.next != null){ //while the next element is not empty (null)
               if(iter.next.val.equals(val)){ //if the next element equals the value passed in
                   if(iter.next.next == null){ //if the element after the next element is non existent (end of the list)
                       iter.next = null; //cut off the current last element by just making the next element null
                       return; //then return/quit
                       // A -> B -> C
                   }
                   else{ //otherwise, still in the while loop, while the next element isn't null and isn't the last in the list, but the next element is the value passed in,
                       iter.next = iter.next.next; //cut out the value passed in (the next element) by setting iter to the value after that
                       return; //end
                   }
               } else{
                   iter = iter.next; //otherwise move to the the next element and try again from the top of the while loop
               }
           }
       }
    }

//get()
    public boolean contains(T val){
       if(head == null) //if the first element is non existent (null)
           return false; //the list does not contain value passed in
       else if(head.val.equals(val)) //otherwise, if the first element (head) equals the value passed in
           return true; //the list does contain
       else{ //otherwise,
           LinkedListNode iter = head; //create variable to iterate through the list so you don't lose head
           while(iter.next != null){ //while the next element isn't empty
               iter = iter.next; //move to the next element
               if(iter.val.equals(val)) //if the value of that element matches the value passed in
                   return true; //the list does contain
           }
           return false; //otherwise the list does not contain
       }
    }

//Additional Method 1
//Additional Method 2

}
