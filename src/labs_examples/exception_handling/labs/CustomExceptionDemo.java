package labs_examples.exception_handling.labs;

import java.lang.reflect.Array;
import java.util.Scanner;

/**
 * Exception Handling Exercise 7:
 *
 *      1) Create a custom exception.
 *      2) Demonstrate a method throwing your custom exception.
 */

public class CustomExceptionDemo {

    public static void main(String[] args) {
        try {
            boardFlight();
        } catch(FullFlightException exc){
            System.out.println(exc.toString());
        }
    }

    public static void boardFlight() throws FullFlightException {
        System.out.print("Please enter your waitlist number: ");
        Scanner scanner = new Scanner(System.in);

        if(scanner.nextInt() > 125)
            throw new FullFlightException();
        else
            System.out.println("Please board the flight.");
    }
}
