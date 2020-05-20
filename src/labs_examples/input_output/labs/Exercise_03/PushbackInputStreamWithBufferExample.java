package labs_examples.input_output.labs.Exercise_03;

import com.sun.xml.internal.messaging.saaj.util.ByteInputStream;

import java.io.*;

public class PushbackInputStreamWithBufferExample {

    public static void main(String[] args){

        String filePath = "src/labs_examples/input_output/labs/Exercise_03/Exercise_03.java";
        try(BufferedInputStream br = new BufferedInputStream(new PushbackInputStream(new FileInputStream(filePath))) ){
            byte[] buffer = new byte[8];
            int i = 0;
            while((i = br.read(buffer)) != -1)
                System.out.print(new String(buffer, 0, i));
        } catch (FileNotFoundException exc) {
            exc.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}