package labs_examples.datastructures.queue.labs;

public class CustomQueue<V> {
    private Object[] myCustomQueue; //array
    private int numElements; //elements in the queue
    private int oldestElement; //first element in the queue

    //constructor
    public CustomQueue() {
        this.myCustomQueue = new Object[10];
        this.numElements = 0;
        this.oldestElement = 0;
    }

    //add
    public void add(V val){
        myCustomQueue[numElements] = val;
        numElements++;
        System.out.println(val + " has been added and numElements equals " + numElements);
        resize();
    }

    //resize
    public void resize(){
        Object[] old = myCustomQueue;

        //shuffle all the elements down to the bottom
        if(old[0] == null){
            Object[] shuffle = new Object[old.length - oldestElement];
            for(int i = oldestElement; i < numElements; i++){
                shuffle[i-oldestElement] = old[i];
                numElements--;
            }
            myCustomQueue = shuffle;
        }

        //resize the Queue (the underlying array) to be twice the size when the Queue is more than 3/4 full
        if(numElements > old.length * .75){
            Object[] doubleSize = new Object[old.length * 2];
            for(int i = 0; i < numElements; i++){
                doubleSize[i] = old[i];
            }
            myCustomQueue = doubleSize;
            System.out.println("The array has been resized to " + myCustomQueue.length);
        }

        //resize the Queue (the underlying array) to be half the size when the Queue is more than 1/4 empty
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
    public V pop() throws QueueEmptyException{
        if(myCustomQueue[oldestElement] != null){
            V poppedVal = (V) myCustomQueue[oldestElement];
            myCustomQueue[oldestElement] = null;
            oldestElement++;
            return poppedVal;
        }
        else
            throw new QueueEmptyException("Queue is empty");
    }

    //contain the methods peekFirst() and peekLast()
    //peekFirst
    public V peekFirst(){
        return (V) myCustomQueue[oldestElement];
    }


    //peekLast
    public V peekLast(){
        return (V) myCustomQueue[numElements];
    }

    //size/length: contain a size() method
    public int size() {
        return numElements-1;
    }

    //print: contain a method to print out the data of all elements in the Queue
    public void print(){
        for(int i = 0; i < numElements; i++){
            System.out.print(myCustomQueue[i] + " ");
        }
    }
}
