package labs_examples.exception_handling.labs;

import java.util.Scanner;

public class TryCatchDemonstration {

    public static void main(String[] args) {
        int[] arr = {3, 2, 1};

        System.out.print("Please enter a number from 1-10: ");
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();

        try {
            System.out.println("The number in the array at the index you chose is: " + arr[x]);
        } catch (ArrayIndexOutOfBoundsException exc) {
            System.out.println("Sorry, array is not that long.");
        }
    }
}
