package labs_examples.input_output.examples;

/* This version of the ShowFile program uses a try-wth-resources
   statement to automatically close a file when it is no longer needed.

   Note: This code requires JDK 7 or later.
*/

import java.io.FileInputStream;
import java.io.IOException;

class ShowFile3 {
    public static void main(String args[])
    {
        int i;

        String filePath = "src/labs_examples/input_output/files/char_data.txt";

        // The following code uses try-with resources to open a file
        // and then automatically close it when the try block is left.
        try(FileInputStream fin = new FileInputStream(filePath)) { //try with resources: initializes and declares the resources we need

            do { //loop through if i does not = -1, print out next char
                i = fin.read();
                if(i != -1)
                    System.out.print((char) i);
            } while(i != -1); //continue looping if i does not equal -1 (the end of file)

        } catch(IOException exc) {
            System.out.println("I/O Error: " + exc);
        }
    } //Don't need the finally with the nested try/catch blocks because the above will close the file when done automatically
}