package labs_examples.input_output.labs.Exercise_03;

import java.io.*;

public class CharacterArrayReaderExample {

    public static void main(String[] args) throws IOException {

        // Initailizing the character array
        char[] name = {'S', 'A', 'R', 'A'};

        // Initializing the char_array
        CharArrayReader char_array1 = new CharArrayReader(name);
        CharArrayReader char_array2 = new CharArrayReader(name);

        int a = 0;
        System.out.print("Use of read() method : ");
        // Use of read() method : reading each character one by one
        while((a = char_array1.read()) != -1) {
            char c1 = (char)a;
            System.out.print(c1);
        }
        System.out.println("");

        // Use of read(char[] char_array, int offset, int maxlen) : reading a part of array
        char_array2.read(name, 0, 1);

        int b = 0;

        System.out.print("Use of read(char[] char_array, int offset, int maxlen) method : ");

        while((b = char_array2.read()) != -1) {
            char c2 = (char)b;
            System.out.print(c2);
        }
    }
}
