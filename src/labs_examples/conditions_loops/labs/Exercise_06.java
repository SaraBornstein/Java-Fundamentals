package labs_examples.conditions_loops.labs;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import org.w3c.dom.ls.LSOutput;

/**
 * Conditions and Loops Exercise 6: Basic while loop
 *
 *      Use a "while" loop find the sum of numbers to from 1-100. Print the sum to the console
 *
 */

public class Exercise_06 {

    public static void main(String[] args) {
        int sum = 0;
        int number = 1;

        while(number <=100)
        {
            number++;
            sum = sum + number;

        }
        System.out.println(sum);
    }



}
