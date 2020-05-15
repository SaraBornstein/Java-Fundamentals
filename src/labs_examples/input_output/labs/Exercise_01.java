package labs_examples.input_output.labs;

import java.io.*;

/**
 * Input/Output Exercise 1: File input/output
 *      Using the BufferedInputStream, read a text file 5 bytes at a time and write each byte to a new file.
 *      Make sure you close the connections to both files.
 */

class Example {
    public static void main(String[] args) {

        FileInputStream fin = null;
        FileOutputStream fout = null;
        BufferedInputStream bin = null;

        String filePath = "src/labs_examples/input_output/files/char_data.txt";
        String fileWritePath = "src/labs_examples/input_output/labs/char_data_rewrite.txt";

        try {
            bin = new BufferedInputStream(new FileInputStream(filePath));
            fout = new FileOutputStream(fileWritePath);
            byte[] buffer = new byte[5];
            int bytesRead = 0;

            while ((bytesRead = bin.read(buffer)) != -1) {
                fout.write(buffer, 0, bytesRead);
            }
        } catch (FileNotFoundException exc) {
            exc.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        } finally {
            try {
                //fin.close();
                if(fin != null) {
                    fin.close();
                }
                bin.close();

                if(fout != null) {
                    fout.close();
                }
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }
}