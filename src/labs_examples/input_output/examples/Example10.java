package labs_examples.input_output.examples;

// Demonstrate random access files.

// This code requires JDK 7 or later.

import java.io.IOException;
import java.io.RandomAccessFile;

class RandomAccessDemo {
    public static void main(String args[])
    {
        double data[] = { 19.4, 10.1, 123.54, 33.0, 87.9, 74.25 };
        double d;

        String filePath = "src/labs_examples/input_output/files/random.dat";

        // Open and use a random access file.
        //unusual to access files at a random location
        try (RandomAccessFile raf = new RandomAccessFile(filePath, "rw")) //setting mode to read/write
        {
            // Write values to the file. The data is from the array above (dara[])
            for(int i=0; i < data.length; i++) {
                raf.writeDouble(data[i]);
            }

            // Now, read back specific values
            raf.seek(0); // seek to first double (at 0 bytes)
            d = raf.readDouble();
            System.out.println("First value is " + d);

            raf.seek(8); // seek to second double (at the 8th byte)
            d = raf.readDouble();
            System.out.println("Second value is " + d);

            raf.seek(8 * 3); // seek to fourth double (at the 24th byte)
            d = raf.readDouble();
            System.out.println("Fourth value is " + d);

            System.out.println();

            // Now, read every other value.
            System.out.println("Here is every other value: ");
            for(int i=0; i < data.length; i+=2) {
                raf.seek(8 * i); // seek to ith double
                d = raf.readDouble();
                System.out.print(d + " ");
            }
        }
        catch(IOException exc) {
            System.out.println("I/O Error: " + exc);
        }
    }
}