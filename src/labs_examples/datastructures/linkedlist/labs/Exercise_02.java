package labs_examples.datastructures.linkedlist.labs;

import labs_examples.datastructures.linkedlist.examples.Node;

/**
 *      LinkedLists - Exercise_02
 *
 *      Write your own custom LinkedList class. Although it can mimic the CustomLinkedList class we used here, it must be entirely unique.
 *
 *      Please also add at least two additional helper methods that you think could be useful. Refer to Java's built-in LinkedList class for inspiration.
 *
 *      Your new LinkedList class should ONLY allow users to add and remove elements from the front of the list AND the end of the list.
 *
 *      Also, instead of using the index in the get() and remove() methods, these methods should get() and remove() based by the Node's value, not it's index.
**/

class Exercise_02{

    static int fib(int n)
    {
        if (n <= 1)
            return n;
        return fib(n-1) + fib(n-2);
    }
    public static void main (String args[])
    {
        int n = 5;
        //System.out.println(fib(n));
        System.out.println(factorial(n));
    }
// 1 2 3 5 8 13 21 34 55


    public static long factorial(int num)
    {
        if (num >= 1) {
            System.out.println("before num = " + num);
            return factorial(num - 1) * num;

        }
        else
            return 1;
    }
}
/*

    24 * 5 = 120
    6 * 4 = 24
    2 * 3 = 6
    1 * 2 = 2
    1 * 1 = 1


 */
