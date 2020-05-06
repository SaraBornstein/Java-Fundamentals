package labs_examples.input_output.examples;

/* Copy a text file.
   To use this program, specify the name
   of the source file and the destination file.
   For example, to copy a file called FIRST.TXT
   to a file called SECOND.TXT, use the following
   command line.

   java CopyFile FIRST.TXT SECOND.TXT
*/

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

class CopyFile { //copy a file and read it to another byte by byte
    public static void main(String args[]) throws IOException
    {
        int i;

        String fileReadPath = "src/labs_examples/input_output/files/char_data.txt";
        String fileWritePath = "src/labs_examples/input_output/files/char_data_rewrite.txt";

        FileInputStream fin = null;
        FileOutputStream fout = null;

        // Copy a File.
        try {
            // Attempt to open the files.
            fin = new FileInputStream(fileReadPath);
            fout = new FileOutputStream(fileWritePath);

            do { //read write loop
                i = fin.read(); //read a byte
                if(i != -1)
                    if ((char) i == '.')
                        i = '!';
                    fout.write(i); //write a byte
            } while(i != -1); //as long as i does not = -1, meaning the end of the file

        } catch(IOException exc) {
            System.out.println("I/O Error: " + exc);
        } finally {
            try { //try catch to close input stream
                if(fin != null) {
                    fin.close();
                }
            } catch(IOException exc) {
                System.out.println("Error Closing Input File");
            }
            try { //try catch to close output stream
                if(fout != null) {
                    fout.close();
                }
            } catch(IOException exc) {
                System.out.println("Error Closing Output File");
            }
        }
    }
}