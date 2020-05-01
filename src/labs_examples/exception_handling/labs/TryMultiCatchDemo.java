package labs_examples.exception_handling.labs;

/**
 * Exception Handling Exercise 2:
 *
 *      Demonstrate a try/catch with multiple catch statements.
 *
 */

public class TryMultiCatchDemo {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 0};

        try {
            int x = array[2] / array[5];
            System.out.println(x);
        } catch (ArrayIndexOutOfBoundsException exc1){
            System.out.println("The array is not that long.");
        } catch (ArithmeticException exc2){
            System.out.println("You can't divide by 0.");
        } catch (Exception exc3){
            System.out.println("Something went wrong.");
        }
    }
}
