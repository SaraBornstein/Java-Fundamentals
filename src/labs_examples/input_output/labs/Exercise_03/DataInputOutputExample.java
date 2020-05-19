package labs_examples.input_output.labs.Exercise_03;

import java.io.*;

public class DataInputOutputExample {
    public static void main(String[] args) {

        int i = 5;
        double d = 4.5;
        char c = 'S';

        String filePath = "src/labs_examples/input_output/labs/Exercise_03/Data.dat";

        try (DataOutputStream dout = new DataOutputStream(new FileOutputStream(filePath))) {

            dout.writeInt(i);
            dout.writeDouble(d);
            dout.writeChar(c);

        } catch (FileNotFoundException e) {
            System.out.println("File not found");;
        } catch (IOException e) {
            System.out.println("Write error");
            return;
        }

        try (DataInputStream din = new DataInputStream(new FileInputStream(filePath))){
            i = din.readInt();
            d = din.readDouble();
            c = din.readChar();
            System.out.println("i = " + i + "\nd = " + d + "\nc = " + c);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
