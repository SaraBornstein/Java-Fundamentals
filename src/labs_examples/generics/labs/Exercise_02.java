package labs_examples.generics.labs;

import java.util.ArrayList;

/**
 * Generics Exercise 2:
 *
 *      Create a class with a generic method that takes in an ArrayList of any Numeric type and returns the sum of all
 *      Numbers in the ArrayList
 */

class GenericExerciseTwo {

    public static <T extends Number> int T (ArrayList<? extends Number> arr){
        Number sum = 0;
        for(Number elem : arr){
            sum = sum.intValue() + elem.intValue();
        }
        return sum.intValue();
    }
}