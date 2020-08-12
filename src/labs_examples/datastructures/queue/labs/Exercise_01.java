package labs_examples.datastructures.queue.labs;

import java.util.PriorityQueue;
import java.util.Queue;

/**
 *      Demonstrate your mastery of Java's (sun's) built-in Queue class (as seen in the import statement
 *      above) by completing the following:
 *
 *      1) instantiate a new Queue
 *      2) demonstrate the use of EVERY method in the Queue class - there are 7
 */
class aQueue{
    public static void main(String[] args) {

        Queue<String> myQueue = new PriorityQueue();

        myQueue.add("StringOne");
        myQueue.add("StringTwo");
        myQueue.add("StringThree");
        myQueue.add("StringFour");

        System.out.println("The head of the queue is: " + myQueue.element());
        System.out.println("Peek: " + myQueue.peek());
        System.out.println("Poll: " + myQueue.poll());

        boolean x = myQueue.offer("StringFour");
        if(x){
            System.out.println(true);
        }

        String removed = myQueue.remove();
        System.out.println("Remove: " + removed);
        System.out.println("The head of the queue is: " + myQueue.element());

        String removed2 = myQueue.remove();
        System.out.println("Remove: " + removed2);
        System.out.println("The head of the queue is: " + myQueue.element());


    }
}