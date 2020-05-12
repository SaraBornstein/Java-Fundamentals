package labs_examples.input_output.labs;
/*
 * Input/Output Exercise 2: File encryption
 *      -Using the BufferedReader, read a file character by character and write an encrypted version to a new file.
 *      -For example, change every 'a' to '-' and every 'e' to '~' .
 *      -Make sure you close the connections to both files.
 *
 *      Then, read back the encrypted file using the BufferedReader and
 *      print out the unencrypted version. Does it match the original file?
 *
*/

import java.io.*;

public class FileEncriptionExample {

    public static void main(String[] args) {
        String filePath = "src/labs_examples/input_output/labs/char_data_rewrite.txt";
        String readFilePath = "src/labs_examples/input_output/labs/char_data_rewrite_encrypt.txt";
        encriptFile(filePath);
        unencriptFile(readFilePath);
    }

    public static void encriptFile(String filePath){
        String fileWritePath = "src/labs_examples/input_output/labs/char_data_rewrite_encrypt.txt";

        try
            (BufferedReader br = new BufferedReader(new FileReader(filePath));
            FileWriter fr = new FileWriter(fileWritePath)){

            int i;

            do {
                i = br.read();
                if(i != -1)
                    if ((char) i == 'a')
                        i = '-';
                if ((char) i == 'e')
                    i = '~';
                fr.write((char) i);

            } while(i != -1);

        }catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void unencriptFile(String filePath){
        try(BufferedReader br = new BufferedReader(new FileReader(filePath))){
            int i;

            do {
                i = br.read();
                if(i != -1)
                    if ((char) i == '-')
                        i = 'a';
                if ((char) i == '~')
                    i = 'e';
                System.out.print((char) i);
            } while(i != -1);


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
