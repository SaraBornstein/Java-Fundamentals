package labs_examples.generics.labs;

import java.util.ArrayList;

/**
 * Generics Exercise 2:
 *
 *      Create a class with a generic method that takes in an ArrayList of any Numeric type and returns the sum of all
 *      Numbers in the ArrayList
 */

class GenericExerciseTwo {

    public static <T extends Number> double adding (ArrayList<? extends Number> arr){
        Number sum = 0;
        for(Number elem : arr){
            sum = sum.doubleValue() + elem.doubleValue();
        }
        return sum.doubleValue();
    }

    public static void main(String[] args) {
        ArrayList<Float> arr = new ArrayList();
        arr.add(1.4f);
        arr.add(2.3f);
        arr.add(3.4f);
        System.out.println(adding(arr));
    }
}