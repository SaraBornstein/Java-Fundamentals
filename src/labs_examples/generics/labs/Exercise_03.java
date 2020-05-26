package labs_examples.generics.labs;

import java.util.ArrayList;

/**
 * Generics Exercise 3:
 *      1) Write a generic method that accepts two generic arguments. This generic method should only accept
 *      arguments which are sublasses of Number. The generic method must return the sum (as a double) of whatever two
 *      numbers were passed in regardless of their type.
 *
 *      2) Write a generic method to count the number of elements in a "Collection" of Strings that are palindromes

 *      3) Write a generic method to exchange the positions of two different elements in an array.
 *
 *      4) Write a generic method to find the largest element within the range (begin, end) of a list.
 */

class GenericExerciseThree {
    public static void main(String[] args) {
        //1
        System.out.println(addition(3.4, 5f));

        //2
        ArrayList<String> strArr = new ArrayList();
        strArr.add("Hello");
        strArr.add("Goodbye");
        strArr.add("toot");
        palindromeCount(strArr);

        //3
        int[] arr = {1, 2, 3, 4, 5};
        //changePositions(Integer[] arr);

        //4
        ArrayList<Integer> intArr = new ArrayList();
        intArr.add(1);
        intArr.add(2);
        intArr.add(3);
        intArr.add(4);
        intArr.add(5);
        //maxOfRange(intArr);

    }
    //1
    public static <T extends Number> Double addition(T a, T b){
        double sum = a.doubleValue() + b.doubleValue();
        return sum;
    }
    //2
    public static <E> void palindromeCount(ArrayList<E> palindromes){
        int count = 0;
        for(E str : palindromes){

            StringBuilder input1 = new StringBuilder();

            input1.append(str); // append a string into StringBuilder input1

            input1 = input1.reverse(); // reverse StringBuilder input1

            if(str.equals(input1.toString())) {
                count++;
            }
        }
        System.out.println(count);
    }

    //3 Write a generic method to exchange the positions of two different elements in an array. TODO
    public static <P> void changePositions(P[] parr){
        P first = parr[0];
        P last = parr[parr.length-1];

        for(int i = 0; i < parr.length; i++){

        }
    }

    //4 Write a generic method to find the largest element within the range (begin, end) of a list.
/*    public static <V extends Number> V maxOfRange (ArrayList<V> range){

        V max = null;
        for(V elem : range){
            if(max < elem){
                max = elem;
            }
        }
        return max;

    }*/
}
