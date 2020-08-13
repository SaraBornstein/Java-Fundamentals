package labs_examples.datastructures.queue.labs;

import java.io.ObjectInputStream;

public class CustomQueue<V> {
    //array
    private Object[] myCustomQueue;
    //elements in the queue
    private int numElements;

    //constructor
    public CustomQueue() {
        this.myCustomQueue = new Object[10];
        this.numElements = 0;
    }

    //add
    public void add(V val){
        myCustomQueue[numElements] = val;
        numElements++;
        System.out.println(val + " has been added and numElements equals " + numElements);
        resize();
    }

    //resize
    //resize the Queue (the underlying array) to be twice the size when the Queue is more than 3/4 full
    //resize the Queue (the underlying array) to be half the size when the Queue is more than 1/4 empty
    public void resize(){
        Object[] old = myCustomQueue;

        if(numElements > old.length * .75){
            Object[] doubleSize = new Object[old.length * 2];
            for(int i = 0; i < numElements; i++){
                doubleSize[i] = old[i];
            }
            myCustomQueue = doubleSize;
            System.out.println("The array has been resized to " + myCustomQueue.length);
        }
        else if(numElements < old.length * .25){
            Object[] halfSize = new Object[old.length / 2];
            for(int i = 0; i < numElements; i++){
                halfSize[i] = old[i];
            }
            myCustomQueue = halfSize;
            System.out.println("The array has been resized to " + myCustomQueue.length);
        }
        else{
            return;
        }
    }

    //pop: throw a custom exception when trying to pop an element from an empty Queue
    public V pop(){
        try{
            V poppedVal = (V) myCustomQueue[0];
            Object[] old = myCustomQueue;
            Object[] poppedArr = new Object[old.length];
            for (int i = 1; i < numElements; i++) {
                poppedArr[i - 1] = old[i];
            }
            myCustomQueue = poppedArr;
            numElements--;
            resize();
            return (V) (poppedVal + " has been popped");
        } catch (Exception exc) {
            System.out.println("Can't pop an element from an empty queue!");
            return null;
        }
    }

//contain the methods peekFirst() and peekLast()
    //peekFirst

    //peekLast

    //size/length: contain a size() method

    //print: contain a method to print out the data of all elements in the Queue
    public void print(){
        for(int i = 0; i < numElements; i++){
            System.out.print(myCustomQueue[i] + " ");
        }
    }
}
