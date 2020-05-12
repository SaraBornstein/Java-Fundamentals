package labs_examples.input_output.labs;
/*
 BufferedReader in = new BufferedReader(new FileReader("foo.in"));

 do {
 i = fin.read();
 if(i != -1)
 if ((char) i == 'a')
 i = '-';
 if ((char) i == 'e')
 i = '~';
 fout.write(i);
 } while(i != -1);
*/

import java.io.*;

public class FileEncriptionExample {
    public static void main(String[] args) {

        FileInputStream fin = null;
        FileOutputStream fout = null;
        BufferedReader brin = null;

        String filePath = "src/labs_examples/input_output/files/char_data_rewrite.txt";
        String fileWritePath = "src/labs_examples/input_output/labs/char_data_rewrite_encrypt.txt";

        try {
            brin = new BufferedReader(new FileReader(filePath));
            fout = new FileOutputStream(fileWritePath);
            byte[] buffer = new byte[1];
            int bytesRead = 0;
            int i = brin.read();

            do {
                if(i != -1)
                    if ((char) i == 'a')
                        i = '-';
                if ((char) i == 'e')
                    i = '~';
                fout.write(i);
            } while(i != -1);

            while ((bytesRead = brin.read(buffer)) != -1) {
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
}
