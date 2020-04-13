package labs_examples.objects_classes_methods.labs.methods;

/**
 * Created by ryandesmond - https://codingnomads.co
 */
public class Exercise_01 {

    public static void main(String[] args) {

        // please create the methods as instructed below then
        // call each of those methods from here, within the main()
        int m = multiply(2, 3);
        System.out.println(m);

        int d = divide(6, 2);
        System.out.println(d);

        joke("Knock knock");

        int y = yearsToSeconds(5);
        System.out.println(y);

        int v = varArgsMethod(4, 5, 6, 7);
        System.out.println(v);
    }


    // 1) Create a static multiply() method below that takes two int arguments (int a, int b) and
    //    returns the result of a * b
    public static int multiply(int a, int b){
        return a * b;
    }

    // 2) Create a static divide() method below that takes two int arguments (int a, int b) and
    //    returns the result of a / b
    public static int divide(int a, int b){
        return a / b;
    }

    // 3) Create a static void method that will print of joke of your choice to the console
    public static void joke(String jokeStr){
        System.out.println(jokeStr);
    }

    // 4) Create a static method that takes in a number in years (int years) as an argument
    //    and returns the number of seconds that number in years represents
    public static int yearsToSeconds(int years){
        int seconds = (((years * 365) * 24) * 60) * 60;
        return seconds;
    }

    // 5) Create a varargs method that will return the length of the varargs array passed in
    public static int varArgsMethod(int... args){
       int count = 0;
       for(int num : args){
           count++;
       }
       return count;
    }





}
