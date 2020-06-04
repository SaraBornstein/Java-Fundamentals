package labs_examples.lambdas.labs;

/**
 * Lambdas Exercise 1:
 *DONE      1) Demonstrate creating a functional interface with an abstract method that takes no parameters and returns void
 * DONE     2) Implement the previous functional interface with a lambda expression and use it. Also demonstrate creating
 *          an anonymous inner class from this interface.
 *      3) Demonstrate creating a functional interface with an abstract method that takes 1 parameter and returns a
 *          value of the same type as the parameter
 *      4) Implement the previous functional interface with a lambda expression and use it. Also demonstrate creating
 *          an anonymous inner class from this interface.
 *      5) Demonstrate creating a functional interface with an abstract method that takes 2 parameters and returns a
 *          value
 *      6) Implement the previous functional interface with a lambda expression and use it. Also demonstrate creating
 *          an anonymous inner class from this interface.
 *      7) Demonstrate the use of at least two built-in functional interfaces from the java.util.function package.
 */


class LambdaExerciseOne {

    public static void main(String[] args) {

//2 Implement the previous functional interface with a lambda expression and use it.
        FunctionalInterfaceExerciseOne lambdaExObj = () -> {
            System.out.println("Help! I'm stuck inside the lambda expression!");
        };

        lambdaExObj.anAbstractMethod();

        //Also demonstrate creating an anonymous inner class from this interface.
        FunctionalInterfaceExerciseOne obj2 = new FunctionalInterfaceExerciseOne() {
            @Override
            public void anAbstractMethod() {
                System.out.println("This is the anonymous inner class reporting for duty!");
            }
        };

        obj2.anAbstractMethod();
    }

}