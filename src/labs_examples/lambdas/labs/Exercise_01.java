package labs_examples.lambdas.labs;

import java.util.function.BinaryOperator;
import java.util.function.Predicate;

/**
 * Lambdas Exercise 1:
 *DONE      1) Demonstrate creating a functional interface with an abstract method that takes no parameters and returns void
 * DONE     2) Implement the previous functional interface with a lambda expression and use it. Also demonstrate creating
 *          an anonymous inner class from this interface.
 * DONE     3) Demonstrate creating a functional interface with an abstract method that takes 1 parameter and returns a
 *          value of the same type as the parameter
 * DONE     4) Implement the previous functional interface with a lambda expression and use it. Also demonstrate creating
 *          an anonymous inner class from this interface.
 * DONE     5) Demonstrate creating a functional interface with an abstract method that takes 2 parameters and returns a
 *            value
 * DONE     6) Implement the previous functional interface with a lambda expression and use it. Also demonstrate creating
 *          an anonymous inner class from this interface.
 *      7) Demonstrate the use of at least two built-in functional interfaces from the java.util.function package.
 */


class LambdaExerciseOne {

    public static void main(String[] args) {

//2 Implement the previous functional interface with a lambda expression and use it.
        FunctionalInterfaceNumberOne lambdaExObj = () -> {
            System.out.println("Help! I'm stuck inside the lambda expression!");
        };
        lambdaExObj.anAbstractMethod();

        //Also demonstrate creating an anonymous inner class from this interface.
        FunctionalInterfaceNumberOne obj2 = new FunctionalInterfaceNumberOne() {
            @Override
            public void anAbstractMethod() {
                System.out.println("This is the anonymous inner class reporting for duty!");
            }
        };
        obj2.anAbstractMethod();

//4) Implement the previous functional interface with a lambda expression and use it.
        FunctionalInterfaceTwo obj3 = (int a) -> a * 5;
        int x = obj3.anotherAbstractMethod(3);
        System.out.println("Functional Interface Lambda expression with one parameter: " + x);
// Also demonstrate creating an anonymous inner class from this interface.
        FunctionalInterfaceTwo obj4 = new FunctionalInterfaceTwo() {
            @Override
            public Integer anotherAbstractMethod(int a) {
                return a * a + 6;
            }
        };
        System.out.println("Functional Interface anonymous inner class with one parameter: " + obj4.anotherAbstractMethod(5));

//6) Implement the previous functional interface with a lambda expression and use it.
        FunctionalInterfaceThree obj5 = (int a, int b) -> (a * 2) + (b * 4);
            int y = obj5.anotherAbstractMethod(1, 2);
            System.out.println("Functional Interface Lambda expression with 2 parameters: " + y);

// Also demonstrate creating an anonymous inner class from this interface.
        FunctionalInterfaceThree obj6 = new FunctionalInterfaceThree() {
            @Override
            public Integer anotherAbstractMethod(int a, int b) {
                return 2 * (a + b);
            }
        };
        int z = obj6.anotherAbstractMethod(3, 4);
        System.out.println("Functional Interface anonymous inner class with 2 parameters: " + z);

//7) Demonstrate the use of at least two built-in functional interfaces from the java.util.function package.
//Predicate
        Predicate<String> sameStr = t -> t.equalsIgnoreCase("This is true or false.");
        System.out.println("Predicate: " + sameStr.test("Watson, we have a problem."));

//BinaryOperator
        BinaryOperator<Integer> biOp = (Integer a, Integer b) -> {
            if(a < b)
                return a;
            return b;
        };
        System.out.println("The smaller number is: " + biOp.apply(8, 7));
    }

}