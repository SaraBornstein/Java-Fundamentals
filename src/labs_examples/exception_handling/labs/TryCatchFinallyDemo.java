package labs_examples.exception_handling.labs;

/**
 * Exception Handling Exercise 3:
 *
 *      Demonstrate a try/catch/finally block.
 *
 */

public class TryCatchFinallyDemo {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 0};

        try {
            int x = array[2] / array[5];
            System.out.println(x);
        } catch (ArithmeticException exc2) {
            System.out.println("You can't divide by 0.");
        } finally {
            System.out.println("This command is going to execute whether you want to divide by zero or not.");
        }
    }
}
