package labs_examples.datastructures.stack.labs;

public class CustomStack<T> {
    //These are private and can only be interacted with via the public methods which are called in the controller class main method
    private Object[] myCustomStack; //
    private int numElements; //variable to keep track of the elements added to the stack, which differs from the size of the array

    //constructor
    public CustomStack() {
        this.myCustomStack = new Object[10]; //array starts with 10 spaces, all empty
         numElements = 0; //stack starts with zero elements

    }

    public void add(T val){ //pass in a value to be added to the array
        myCustomStack[numElements] = val; // myCustomStack[0] = new value, using numElements as index of next open space
        numElements++; //increase numElements by one each time a value is added to the stack, numElements will always be one more than number of elements in stack
        resize(); //call resize to check if array needs resizing
    }

    //make it so no error occurs when you pop() an empty stack, throw a custom exception when trying to pop an element from an empty Stack
    public T pop() { //pop = remove the last element added to the array, in a stack last in, first out (in a queue pop and push from different ends)
        try {
            T getOut = (T) myCustomStack[numElements - 1]; //variable for element to remove (pop off) = last element (if you have 7 elements, the index # is 6)
            myCustomStack[numElements] = null; //remove element by making it null
            numElements--; //remove last element, decrease the numElements
            return getOut; //return popped number

        } catch (Exception exc) {
            System.out.println("Can't pop from empty stack!");
            return null;
        }
    }

        //resize underlying array when necessary after each push() and pop()
    public void resize(){
        Object[] old  = myCustomStack;
        //resize array to be twice the size when the Stack is more than 3/4 full
        if(numElements > old.length * .75){
            Object[] resizedArr = new Object[old.length * 2];
            for(int i = 0; i < numElements; i++){
                resizedArr[i] = old[i];
            }
            myCustomStack  = resizedArr;
            System.out.println("Array has been resized to twice the size. Array length: " + myCustomStack.length);
        }
        //resize array to be half the size when the Stack is more than 1/4 empty
        else if(numElements < old.length * .25){
            Object[] resizedArr = new Object[old.length / 2];
            for(int i = 0; i < numElements; i++){
                resizedArr[i] = old[i];
            }
            myCustomStack = resizedArr;
            System.out.println("Array has been resized to half the size. Array length: " + myCustomStack.length);
        }
        else{
            return;
        }
    }

    //peekFirst()
    public T peekFirst(){
        return (T) myCustomStack[numElements-1];
    }

    // peekLast()
    public T peekLast(){
        return (T) myCustomStack[0];
    }

    //length()
    public int length(){
        return  numElements;
    }

    //method to print out the data of all elements in the Stack
    public void print(){
        for(int i = 0; i < numElements; i++){
            System.out.print(myCustomStack[i] + " ");
        }
    }
}
