package labs_examples.datastructures.linkedlist.labs;
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
**/

//Node
class LinkedListNode<T> {
    T val;
    LinkedListNode next;

    public LinkedListNode(T val) {
        this.val = val;
        this.next = null;
    }

    public LinkedListNode(T val, LinkedListNode next) {
        this.val = val;
        this.next = next;
    }
}

//Linked List
public class MyCustomLinkedList<T> {

    private LinkedListNode<T> head;

//Add()
   public void add(T val){
       LinkedListNode newVal = new LinkedListNode(val);

       if(head == null){
           head = newVal;
       } else{
           LinkedListNode iter = head;
           while(iter.next != null){
               iter = iter.next;
           }
           iter.next = newVal;
       }

   }

//remove()
    public void delete(T val){
       if(head == null)
           return;
       else if(head.val.equals(val))
           head = head.next;
       else{
           LinkedListNode iter = head;
           while(iter.next != null){
               if(iter.next.val.equals(val)){
                   if(iter.next.next == null){
                       iter.next = null;
                       return;
                       // A -> B -> C
                   }
                   else{
                       iter.next = iter.next.next;
                       return;
                   }
               } else{
                   iter = iter.next;
               }
           }
       }
    }

//get()
    public boolean contains(T val){
       if(head == null)
           return false;
       else if(head.val.equals(val))
           return true;
       else{
           LinkedListNode iter = head;
           while(iter.next != null){
               iter = iter.next;
               if(iter.val.equals(val))
                   return true;
           }
           return false;
       }
    }

//Additional Method 1
//Additional Method 2

}
