package labs_examples.arrays.labs;
import java.util.Scanner;

/**
 * Arrays calculator
 *
 *      Take in 10 numbers from the user. Place the numbers in an array. Using the loop of your choice,
 *      calculate the sum of all of the numbers in the array as well as the average.
 *
 *      Print the results to the console.
 *
 */

public class Exercise_01 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number 1: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter number 2: ");
        int num2 = scanner.nextInt();

        System.out.print("Enter number 3: ");
        int num3 = scanner.nextInt();

        System.out.print("Enter number 4: ");
        int num4 = scanner.nextInt();

        System.out.print("Enter number 5: ");
        int num5 = scanner.nextInt();

        System.out.print("Enter number 6: ");
        int num6 = scanner.nextInt();

        System.out.print("Enter number 7: ");
        int num7 = scanner.nextInt();

        System.out.print("Enter number 8: ");
        int num8 = scanner.nextInt();

        System.out.print("Enter number 9: ");
        int num9 = scanner.nextInt();

        System.out.print("Enter number 10: ");
        int num10 = scanner.nextInt();

        int[] arr = {num1, num2, num3, num4, num5, num6, num7, num8, num9, num10};

        int sum = 0;

        for(int i = 0; i<arr.length; i++){
            sum = sum + arr[i];
        }

        System.out.println("The sum = " + sum);

        int avg = sum / arr.length;
        System.out.println("The average = " + avg);
    }
}