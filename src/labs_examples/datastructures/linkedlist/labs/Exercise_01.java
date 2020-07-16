package labs_examples.datastructures.linkedlist.labs;

import java.util.*;

/**
 *      LinkedLists - Exercise_01
 *
 *      Demonstrate your mastery of Java's built-in LinkedList class by demonstrating the following:
 *
 *      1) create a LinkedList (from Java's libraries)
 *      2) add()
 *      3) addAll()
 *      4) addFirst()
 *      5) addLast()
 *      6) getFirst()
 *      7) getLast()
 *      8) get()
 *      9) set()
 *      10) push()
 *      11) pop()
 *      12) remove()
 *      13) contains()
 *      14) listIterator()
 *      15) clear()
 */

class LinkedListClass {
    public static void main(String[] args) {
        //#1
        LinkedList <String> havingFun = new LinkedList();

        //#2
        havingFun.add("Hello");
        havingFun.add("This");
        havingFun.add("linkedList");
        havingFun.add("is");
        havingFun.add("so");
        havingFun.add("much");
        havingFun.add("fun");
        havingFun.add("goodbye");

        System.out.println("LinkedList: " + havingFun);

        //#3
        Collection <String> collect = new ArrayList();
        collect.add("just");
        collect.add("kidding");

        havingFun.addAll(7, collect);

        System.out.println("AddAll at index 7: " + havingFun);

        //#4
        havingFun.addFirst("Why");
        System.out.println("AddFirst: " + havingFun);

        //#5
        havingFun.addLast("!");
        System.out.println("AddLast: " + havingFun);

        //#6
        String first = havingFun.getFirst();
        System.out.println("GetFirst: " + first);

        //#7
        String last = havingFun.getLast();
        System.out.println("GetLast: " + last);

        //#8
        String getHello = havingFun.get(1);
        System.out.println("getHello: " + getHello);

        //#9
        havingFun.set(2, "there");
        System.out.println("Set: " + havingFun);

        //#10
        havingFun.push("Pushed");
        System.out.println("Push: " + havingFun);

        //#11
        havingFun.pop();
        System.out.println("Popped: " + havingFun);

        //#12
        havingFun.remove(0);
        System.out.println("Remove index 0: " +  havingFun);

        //#13
        boolean contains = havingFun.contains("Hello");
        System.out.println("havingFun contains \"Hello\"? " + contains);

        boolean alsoContains = havingFun.contains("Hola");
        System.out.println("havingFun contains \"Hola\"? " + alsoContains);

        //#14
        ListIterator listIter = havingFun.listIterator();
        System.out.print("List Iterator: ");
        while (listIter.hasNext()){
            System.out.print(listIter.next() + " ");
        }
        System.out.println();

        //#15
        havingFun.clear();
        System.out.println("havingFun cleared: " + havingFun);

    }
}


