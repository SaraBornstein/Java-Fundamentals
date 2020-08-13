package labs_examples.datastructures.queue.labs;

import labs_examples.datastructures.stack.labs.CustomStack;

public class CustomQueueController {
    public static void main(String[] args) {
        CustomQueue<String> myQueue = new CustomQueue();
/*
        myQueue.add("first");
        myQueue.add("second");
        myQueue.add("third");

        myQueue.print();
        System.out.println();
 */
        String s = myQueue.pop();
        System.out.println(s);

        myQueue.print();
        System.out.println();


    }
}
