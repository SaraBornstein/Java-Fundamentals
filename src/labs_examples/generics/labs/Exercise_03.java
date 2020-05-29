package labs_examples.generics.labs;

import com.sun.deploy.security.SelectableSecurityManager;
import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Generics Exercise 3:
 *      1) Write a generic method that accepts two generic arguments. This generic method should only accept
 *      arguments which are sublasses of Number. The generic method must return the sum (as a double) of whatever two
 *      numbers were passed in regardless of their type.
 *
 *      2) Write a generic method to count the number of elements in a "Collection" of Strings that are palindromes

 *      3) Write a generic method to exchange the positions of two different elements in an array.
 *
 *      4) Write a generic method to find the largest element within the range (begin, end) of a list.
 */

class GenericExerciseThree {
    public static void main(String[] args) {
        //1
        System.out.println("#1: " + addition(3.4, 5f));

        //2
        ArrayList<String> strArr = new ArrayList();
        strArr.add("Hello");
        strArr.add("Goodbye");
        strArr.add("toot");
        System.out.print("#2: ");
        palindromeCount(strArr);

        //3
        Double[] arr = {1.2, 2.3, 3.2, 4.3, 5.2};
        System.out.print("#3: ");
        System.out.println(Arrays.toString(arr));
        changePositions(arr);

        //4
        ArrayList<Integer> intArr = new ArrayList();
        intArr.add(1);
        intArr.add(2);
        intArr.add(3);
        intArr.add(4);
        intArr.add(5);
        System.out.println("#4: The largest element of the array is " + largestElem(intArr));

    }
    //1
    public static <T extends Number> Double addition(T a, T b){
        double sum = a.doubleValue() + b.doubleValue();
        return sum;
    }
    //2
    public static <E> void palindromeCount(ArrayList<E> palindromes){
        int count = 0;
        for(E str : palindromes){

            StringBuilder input1 = new StringBuilder();

            input1.append(str); // append a string into StringBuilder input1

            input1 = input1.reverse(); // reverse StringBuilder input1

            if(str.equals(input1.toString())) {
                count++;
            }
        }
        System.out.println(count);
    }

    //3 Write a generic method to exchange the positions of two different elements in an array.
    public static <P> void changePositions(P[] anArray){
        P temp = anArray[0];
        anArray[0] = anArray[1];
        anArray[1] = temp;
        System.out.println(Arrays.toString(anArray));
    }


    //4 Write a generic method to find the largest element within the range (begin, end) of a list.
    public static <V extends Number> int largestElem (ArrayList<V> range){
        int max = 0;
        for(V elem : range){
            if(elem.doubleValue() > max)
                max = elem.intValue();
        } return max;

    }
}
