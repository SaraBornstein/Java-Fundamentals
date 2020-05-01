package labs_examples.exception_handling.labs;

/**
 * Exception Handling Exercise 6:
 *
 *      Demonstrate throwing an exception in one method and catching it in another method.
 *
 */

public class MultiMethodTryCatch {
    public static void main(String[] args) {
        try{
            multiply();
        }catch(ArrayIndexOutOfBoundsException exc){
            System.out.println("You can't divide by an index number greater than 3.");
        }

    }

    public static void methodOne() throws ArrayIndexOutOfBoundsException{
        multiply();
    }

    public static int multiply() throws ArrayIndexOutOfBoundsException{
        int[] arr = {25, 50, 75, 100};
        try {
            return 2 * arr[4];
        }catch(ArrayIndexOutOfBoundsException exc){
            throw exc;
        }
    }

}
