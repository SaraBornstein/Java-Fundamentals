package labs_examples.exception_handling.labs;

/**
 * Exception Handling Exercise 5:
 *
 *      Demonstrate how to throw an exception.
 *
 */

public class ThrowExceptionDemo {
    public static void main(String[] args) {
        try {
            divide();
        }catch(ArithmeticException exc){
            System.out.println("This won't work because I said so.");
        }
    }

    public static int divide() throws ArithmeticException{
            int x = 100 / 0;
            return x;
    }
}
