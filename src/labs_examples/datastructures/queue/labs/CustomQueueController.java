package labs_examples.datastructures.queue.labs;

import labs_examples.datastructures.stack.labs.CustomStack;

public class CustomQueueController {
    public static void main(String[] args) {
        CustomQueue<String> myQueue = new CustomQueue();

        myQueue.add("first");
        myQueue.add("second");
        myQueue.add("third");

        System.out.print("The Queue is now: ");
        myQueue.print();
        System.out.println();


        try{
            String s = myQueue.pop();
            System.out.println(s + " has been popped off (removed)");
        } catch (QueueEmptyException exc) {
            System.out.println("Queue is empty.");
        }
/*
        try{
            String t = myQueue.pop();
            System.out.println(t + " has been popped off (removed)");
        } catch (QueueEmptyException exc) {
            System.out.println("Queue is empty.");
        }
 */

        System.out.print("The Queue is now: ");
        myQueue.print();
        System.out.println();

        myQueue.resize();

        System.out.print("The Queue has been shifted, the Queue is now: ");
        myQueue.print();
        System.out.println();


        myQueue.add("fourth");
        myQueue.add("fifth");

        System.out.print("The Queue is now: ");
        myQueue.print();
        System.out.println();
    }
}
