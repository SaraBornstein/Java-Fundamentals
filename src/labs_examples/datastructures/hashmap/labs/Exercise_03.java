package labs_examples.datastructures.hashmap.labs;

import java.time.Duration;
import java.time.Instant;
import java.util.*;

/**
 *      HashMaps Exercise_03
 *
 *      Create a new class that does the following:
 *
 *      1) create a LinkedList
 *      2) create a Stack
 *      3) create a Queue
 *      4) create a HashMap
 *
 *      Then, add millisecond timers before and after each data structure above and print out
 *      how long it takes for each to complete EACH the following tasks, and the total time for
 *      each data structure:
 *
 *      1) add 100 elements
 *      2) update 100 elements
 *      3) search for 100 elements
 *      4) delete 100 elements
 */

class ExerciseThree{
    public static void main(String[] args) {

        Instant linkedListStart = Instant.now(); //Start LinkedList timer
        // 1) create a LinkedList
        LinkedList<Ball> ballLinkedList = new LinkedList();

        //1) add 100 elements
        Instant linkedListAddElementsStart = Instant.now();
        for(int i = 0; i < 100; i++){
            Ball ballObj = new Ball();
            ballLinkedList.add(i, ballObj);
        }
        Instant linkedListAddElementsEnd = Instant.now();
        System.out.println("LinkedList add elements time: " + Duration.between(linkedListAddElementsStart, linkedListAddElementsEnd).toMillis());

        //2) update 100 elements
        Instant linkedListUpdateElementsStart = Instant.now();
            for(Ball b : ballLinkedList){
                b.setColor("blue");
                b.setSize(2);
            }
        Instant linkedListUpdateElementsEnd = Instant.now();
        System.out.println("LinkedList Update Elements time: " + Duration.between(linkedListUpdateElementsStart, linkedListUpdateElementsEnd).toMillis());

        //3) search for 100 elements
        Instant linkedListSearchElementsStart = Instant.now();
        if(ballLinkedList.size() == 100){
            System.out.println("true");
        }
        Instant linkedListSearchElementsEnd = Instant.now();
        System.out.println("LinkedList Search Elements time: " + Duration.between(linkedListSearchElementsStart, linkedListSearchElementsEnd).toMillis());

        //4) delete 100 elements
        Instant linkedListDeleteElementsStart = Instant.now();
        ballLinkedList.clear();
        Instant linkedListDeleteElementsEnd = Instant.now();
        System.out.println("LinkedList delete elements time: " + Duration.between(linkedListDeleteElementsStart, linkedListDeleteElementsEnd).toMillis());

        Instant linkedListEnd = Instant.now();
        System.out.println("LinkedList complete: " + Duration.between(linkedListStart, linkedListEnd).toMillis());

    //2) create a Stack
        Instant stackStart = Instant.now();
        Stack<Ball> ballStack = new Stack();

        //1) add 100 elements
        Instant stackAddElementsStart = Instant.now();
        for(int i = 0; i < 100; i++){
            Ball ballObj = new Ball();
            ballStack.add(i, ballObj);
        }
        Instant stackAddElementsEnd = Instant.now();
        System.out.println("Stack add elements time: " + Duration.between(stackAddElementsStart, stackAddElementsEnd).toMillis());

        //2) update 100 elements
        Instant stackUpdateElementsStart = Instant.now();
        for(Ball b : ballStack){
            b.setColor("blue");
            b.setSize(2);
        }
        Instant stackUpdateElementsEnd = Instant.now();
        System.out.println("Stack Update Elements time: " + Duration.between(stackUpdateElementsStart, stackUpdateElementsEnd).toMillis());

        //3) search for 100 elements
        Instant stackSearchElementsStart = Instant.now();
        if(ballStack.size() == 100){
            System.out.println("true");
        }
        Instant stackSearchElementsEnd = Instant.now();
        System.out.println("Stack Search Elements time: " + Duration.between(stackSearchElementsStart, stackSearchElementsEnd).toMillis());

        //4) delete 100 elements
        Instant stackDeleteElementsStart = Instant.now();
        ballStack.removeAllElements();
        Instant stackDeleteElementsEnd = Instant.now();
        System.out.println("Stack delete elements time: " + Duration.between(stackDeleteElementsStart, stackDeleteElementsEnd).toMillis());

        Instant stackEnd = Instant.now();
        System.out.println("Stack complete: " + Duration.between(stackStart, stackEnd).toMillis());

        //3) create a Queue
        //Instant queueStart = Instant.now();
        PriorityQueue<Ball> ballQueue = new PriorityQueue();

        //1) add 100 elements
        Instant queueAddElementsStart = Instant.now();
        for(int i = 0; i < 100; i++){
            Ball ballObj = new Ball();
            //ballQueue.add(ballObj); //TODO ???
        }
        Instant queueAddElementsEnd = Instant.now();
        System.out.println("Queue add elements time: " + Duration.between(queueAddElementsStart, queueAddElementsEnd).toMillis());
/*
        //2) update 100 elements
        Instant queueUpdateElementsStart = Instant.now();

        Instant queueUpdateElementsEnd = Instant.now();
        System.out.println("Queue Update Elements time: " + Duration.between(queueUpdateElementsStart, queueUpdateElementsEnd).toMillis());

        //3) search for 100 elements
        Instant queueSearchElementsStart = Instant.now();

        Instant queueSearchElementsEnd = Instant.now();
        System.out.println("Queue Search Elements time: " + Duration.between(queueSearchElementsStart, queueSearchElementsEnd).toMillis());

        //4) delete 100 elements
        Instant queueDeleteElementsStart = Instant.now();

        Instant queueDeleteElementsEnd = Instant.now();
        System.out.println("Queue delete elements time: " + Duration.between(queueDeleteElementsStart, queueDeleteElementsEnd).toMillis());

        Instant queueEnd = Instant.now();
        System.out.println("Queue complete: " + Duration.between(queueStart, queueEnd).toMillis());
*/


    //4) create a HashMap
        Instant hashMapStart = Instant.now();
        HashMap<Integer, Ball> ballHashMap = new HashMap();

    //1) add 100 elements
        Instant hashMapAddElementsStart = Instant.now();
        for(int i = 0; i < 100; i++){
            Ball ballObj = new Ball();
            ballHashMap.put(i, ballObj);
        }
        Instant hashMapAddElementsEnd = Instant.now();
        System.out.println("HashMap add elements time: " + Duration.between(hashMapAddElementsStart, hashMapAddElementsEnd).toMillis());


    //2) update 100 elements
        Instant hashMapUpdateElementsStart = Instant.now();

        for(int i = 0; i < 100; i++) {
            Ball secondBallObj = new Ball();
            ballHashMap.replace(i, secondBallObj);
        }
        Instant hashMapUpdateElementsEnd = Instant.now();
        System.out.println("HashMap Update Elements time: " + Duration.between(hashMapUpdateElementsStart, hashMapUpdateElementsEnd).toMillis());

    //3) search for 100 elements
        Instant hashMapSearchElementsStart = Instant.now();
        if(ballHashMap.size() == 100){
            System.out.println("true");
        } else {
            System.out.println("false");
        }
        Instant hashMapSearchElementsEnd = Instant.now();
        System.out.println("HashMap Search Elements time: " + Duration.between(hashMapSearchElementsStart, hashMapSearchElementsEnd).toMillis());

        //4) delete 100 elements
        Instant hashMapDeleteElementsStart = Instant.now();
        for(int i = 0; i < 100; i++)
            ballHashMap.remove(i);
        Instant hashMapDeleteElementsEnd = Instant.now();
        System.out.println("HashMap delete elements time: " + Duration.between(hashMapDeleteElementsStart, hashMapDeleteElementsEnd).toMillis());

        Instant hasMapEnd = Instant.now();
        System.out.println("HashMap complete: " + Duration.between(hashMapStart, hasMapEnd).toMillis());
    }
}