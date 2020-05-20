package labs_examples.input_output.labs.Exercise_03;

import java.io.*;

public class SequenceInputStreamExample {
    public static void main(String[] args) throws IOException {
        String filePath1 = "src/labs_examples/input_output/labs/Exercise_03/Exercise_03.java";
        String filePath2 = "src/labs_examples/input_output/labs/Exercise_04/Exercise_04.java";

        InputStream input1 = new FileInputStream(filePath1);
        InputStream input2 = new FileInputStream(filePath2);

        SequenceInputStream sequenceInputStream = new SequenceInputStream(input1, input2);

        int data = sequenceInputStream.read();
        while(data != -1){
            System.out.print((char) data);
            data = sequenceInputStream.read();
        }
    }
}
