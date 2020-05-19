package labs_examples.input_output.labs.Exercise_03;

import java.io.*;

public class LineNumberReaderWithBufferExample {
    /*
    public static void main(String[] args) throws IOException {

        String fileName = "src/labs_examples/input_output/files/char_data.txt";
        BufferedReader br = new BufferedReader(new FileReader(fileName));
        LineNumberReader lnr = new LineNumberReader(br);

        String st;
        while((st = lnr.readLine()) != null)
            System.out.println(st);

        //close the stream
        lnr.close();
    }
     */

    //OR

    public static void main(String[] args) {
        String fileName = "src/labs_examples/input_output/files/char_data.txt";

        try(BufferedReader br = new BufferedReader(new FileReader(fileName)); LineNumberReader lnr = new LineNumberReader(br)){

        String st;
        while((st = lnr.readLine()) != null)
            System.out.println(st);

        } catch (FileNotFoundException exc) {
            exc.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
