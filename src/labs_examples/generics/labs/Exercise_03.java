package labs_examples.generics.labs;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Generics Exercise 3:
 *
 *      1) Write a generic method that accepts two generic arguments. This generic method should only accept
 *      arguments which are sublasses of Number. The generic method must return the sum (as a double) of whatever two
 *      numbers were passed in regardless of their type.
 *
 *      2) Write a generic method to count the number of elements in a "Collection" of Strings that are palindromes

 *      3) Write a generic method to exchange the positions of two different elements in an array.
 *
 *      4) Write a generic method to find the largest element within the range (begin, end) of a list.
 *
 */


class GenericExerciseThree {
    public static void main(String[] args) {
        System.out.println(addition(3.4, 5f));

        ArrayList<String> strArr = new ArrayList();
        strArr.add("Hello");
        strArr.add("Goodbye");
        strArr.add("toot");
        palindromeCount(strArr); //TODO not printing
    }
    //1
    public static <T extends Number> Double addition(T a, T b){
        double sum = a.doubleValue() + b.doubleValue();
        return sum;
    }
    //2
    public static <E> int palindromeCount(ArrayList<String> palindromes){
        int count = 0;
        for(String str : palindromes){

            StringBuilder input1 = new StringBuilder();

            input1.append(str); // append a string into StringBuilder input1

            input1 = input1.reverse(); // reverse StringBuilder input1

            if(str.equalsIgnoreCase(input1.toString()))
                count++;
        }
        return count;
    }

    //3
    public static <P> void changePositions(P[] parr){
        P temp = parr[0];

        for(int i = 0; i < parr.length; i++){

        }
    }
}
