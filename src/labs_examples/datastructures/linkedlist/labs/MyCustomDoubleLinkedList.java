package labs_examples.datastructures.linkedlist.labs;

import java.util.Iterator;

public class MyCustomDoubleLinkedList<V> {

    private DoubleLinkListNode<V> head;

    //add
    public void add(V val){

        if(head == null){
            DoubleLinkListNode<V> node = new DoubleLinkListNode(val);
            head = node;
        }
        else{
            DoubleLinkListNode iter = head;
            while(iter.next != null){
                iter = iter.next;
            }
            DoubleLinkListNode<V> node = new DoubleLinkListNode(val, iter); //uses constructor with value and previous
            iter.next = node;
        }
    }

    //delete
    public void delete(V val){
        if(head == null)
            return;
        else if(head.data.equals(val))
                head = head.next;
        else {
            DoubleLinkListNode iter = head;

        }
    }
}

    //get


    //contains
