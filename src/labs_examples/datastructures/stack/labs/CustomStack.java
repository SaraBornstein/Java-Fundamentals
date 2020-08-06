package labs_examples.datastructures.stack.labs;

import java.lang.reflect.Array;

public class CustomStack<T> {
    T myCustomStack[];

    //throw a custom exception when trying to pop an element from an empty Stack
    public void pop(){
        try{


        } catch (NullPointerException ex) {
            System.out.println("Can't pop an element from an empty Stack!");
        }

    }

    /*
    resize array to be twice the size when the Stack is more than 3/4 full
    resize array to be half the size when the Stack is more than 1/4 empty
    */
    public void resize(){

    }

    //peekFirst()
    public T peekFirst(){
        return myCustomStack[0];
    }

    // peekLast()
    public T peekLast(){
        return myCustomStack[myCustomStack.length-1];
    }

    //size()
    public int size(){
        return  myCustomStack.length;
    }

    //method to print out the data of all elements in the Stack
    public void print(){
        System.out.println(myCustomStack.toString());
        /*
        for(int i = 0; i < myCustomStack.length; i++){
            System.out.println(myCustomStack[i]);
        }

         */
    }

}
