package labs_examples.input_output.labs;

import java.io.*;

public class CharacterStreamExample {

    public static void main(String[] args) throws IOException {

        // Initailizing the character array
        char[] geek = {'G', 'E', 'E', 'K', 'S'};

        // Initailizing the char_array
        CharArrayReader char_array1 = new CharArrayReader(geek);
        CharArrayReader char_array2 = new CharArrayReader(geek);

        // Use of ready() method
        boolean check1 = char_array1.ready();
        if(check1 ==true)
            System.out.println("char_array1 is ready");
        else
            System.out.println("char_array1 is not ready");


        int a = 0;
        System.out.print("Use of read() method : ");
        // Use of read() method : reading each character one by one
        while((a = char_array1.read()) != -1)
        {
            char c1 = (char)a;
            System.out.println(c1);

        }
        System.out.println("");


        // Use of ready() method
        boolean check2 = char_array2.ready();
        if(check2 ==true)
            System.out.println("char_array2 is ready");
        else
            System.out.println("char_array2 is not ready");


        // Use of read(char[] char_array, int offset, int maxlen) : reding a part of array
        char_array2.read(geek, 1, 2);

        int b = 0;

        System.out.print("Use of read(char[] char_array, int offset, int maxlen) method : ");

        while((b = char_array2.read()) != -1)
        {
            char c2 = (char)b;
            System.out.print(c2);
        }

    }
}
