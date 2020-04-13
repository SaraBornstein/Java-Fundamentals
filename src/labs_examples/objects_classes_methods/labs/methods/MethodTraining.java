package labs_examples.objects_classes_methods.labs.methods;

/*
Methods: Exercise 3:
Create a new class called MethodTraining.java and in this class please do the following:

    2) Demonstrate "pass by reference"

    5) Write a method that will print some kind of ascii art to the console (Google "ascii art" if needed)

    6) Write a method that will determine whether or not a number is prime

    7) Write a method that will return a small array containing the highest and lowest numbers in a given numeric array,
            which is passed in as an argument

    8) Write a method that takes 3 arguments (int maxNum, int divisor1, int divisor2) and returns an Integer Arraylist.
        In this method create an Integer ArrayList and populate it with each number between zero and maxNum that is
        divisible by both divisor1 and divisor2. Then return this ArrayList. After calling this method, print out the
        length of the returned list


    9) Write a method that will reverse an array in place use only one extra temp variable. For this exercise you cannot
        instantiate a second array. You must reverse the array in place using only one extra temp variable. Hint: this
        variable is used to temporarily store individual values in the array
 */

public class MethodTraining {

    public static void main(String[] args) {
        //calling #1
        int m = multiply(2, 4);
        System.out.println("multiply: " + m);

        //#2 Pass by Value: int passByVal remains the same value after passing to addition().
        int passByVal = 1;
        int g = addition(passByVal, 4);
        System.out.println("pass by value: " + passByVal);

        //#2 Pass by Reference

        //#3 Largest of Four method
        int l = largestOfFour(1, 2, 3, 4);
        System.out.println("largest of 4: " + l);

        //#4 Count consonants
        int cc = countConsonants("Hello World");
        System.out.println("count consonants: " + cc);

        //#5 Ascii Art
        asciiArt();

        //#6 Prime Num
        //boolean primeNum = prime(7);
        //System.out.println(primeNum);

    }

    //1) Demonstrate method overloading in this class
    public static int multiply(int a, int b){
        return a * b;
    }
    public static double multiply(double a, double b, double c){
        return a * b * c;
    }

    //2) Demonstrate the difference between "pass by value" and "pass by reference"

    public static int addition(int x, int y){
        return x + y;
    }

    //3) Create a method that will return the largest of 4 numbers (all of which are passed in as arguments)
    public static int largestOfFour(int a, int b, int c, int d){
        int largest = a;
        if(a < b)
            largest = b;
        else
            largest = a;

        if(largest < c)
            largest = c;
        else
            largest = largest;

        if(largest < d)
            largest = d;
        else
            largest = largest;

       return largest;
    }

    //4) Write a method to count all consonants (the opposite of vowels) in a String
    public static int countConsonants(String str){
        int count = 0;
        for(int i = 0; i < str.length()-1; i++){
            String vowels = "aeiou";
            if(vowels.indexOf(str.charAt(i)) == -1) {
                count++;
            }
        }
        return count;
    }

    //5) Write a method that will print some kind of ascii art to the console
    public static void asciiArt(){
        for(int i = 0; i < 5; i++){
            for(int j = 0; j < 5; j++){
                System.out.print("-***-|");
            }
            System.out.println();
        }
    }

    //6) Write a method that will determine whether or not a number is prime
    //public static boolean prime(int a){
        //if(a > 1 && a)
            //return true;
        //else
            //return false;
    //}
    /*
        // Corner case
        if (n <= 1) return false;

        // Check from 2 to n-1
        for (int i = 2; i < n; i++)
            if (n % i == 0)
                return false;

        return true;
     */

}
