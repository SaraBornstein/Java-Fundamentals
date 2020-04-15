package labs_examples.objects_classes_methods.labs.methods;

import java.util.ArrayList;
import java.util.Arrays;

//Methods: Exercise 3:
public class MethodTraining {

    public static void main(String[] args) {

        //calling #1
            int m = multiply(2, 4);
            System.out.println("1. multiply: " + m);

        //#2 Pass by Value: int passByVal remains the same value after passing to addition().
            int passByVal = 1;
            System.out.println("2. passByVal starts as 1. passByValMethod(passByVal) = " + passByValMethod(passByVal) +
                    ". After calling the method, passByVal still equals " + passByVal + ".");

        //#2 Pass by Reference
            ArrayList<Integer> passByRef = new ArrayList<>();
            passByRef.add(1);
            passByRef.add(2);
            passByRef.add(3);
            passByRef.add(4);
            System.out.println("passByRef ArrayList before: " + passByRef);
            passByRefMethod(passByRef);
            System.out.println("passByRef after passByRefMethod call: " + passByRef);

        //#3 Largest of Four method
            int l = largestOfFour(1, 2, 3, 4);
            System.out.println("3. largest of 4: " + l);

        //#4 Count consonants
            int cc = countConsonants("Hello World");
            System.out.println("4. count consonants: " + cc);

        //#5 Ascii Art
            System.out.println("5. ascii art: ");
            asciiArt();

        //#6 Prime Num
            boolean primeNum = prime(7);
            System.out.println("6. Prime Number: " + primeNum);

        //#7 Highest/Lowest array
            int[] highLowArr = arr(1, 2, 3, 4, 5, 6, 7);
            System.out.println("7. Highest/Lowest array: " + Arrays.toString(highLowArr));

        //#8 Array List: After calling this method, print out the length of the returned list
            ArrayList<Integer> thisArrList = myArrList(50, 5, 3);
            System.out.println("8. ArrayList: " + thisArrList + ", length: " + thisArrList.size());

        //#9 Reverse Array

        System.out.print("9. Contents of reversed array: ");
            for(int i : reverseAnArr(5, 10, 15, 20, 25)){
                System.out.print(i + " ");
            }
    }

    //1) Demonstrate method overloading in this class
        public static int multiply(int a, int b){
            return a * b;
        }
        public static double multiply(double a, double b, double c){
            return a * b * c;
        }

    //2) Demonstrate the difference between "pass by value" and "pass by reference"
        public static int passByValMethod(int x){
        return x + 6;
        }

        public static void passByRefMethod(ArrayList arrayList){
            arrayList.add(10);
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
                    System.out.print("-***-");
                }
                System.out.println();
            }
        }

    //6) Write a method that will determine whether or not a number is prime
    public static boolean prime(int a){
        if(a <= 1)
            return false;

        for(int i = 2; i < a; i++)
            if (a % i == 0)
                return false;
            return true;
    }

    //7) Write a method that will return a small array containing the highest and lowest numbers in a given numeric array,
    //which is passed in as an argument
        public static int[] arr(int... args){
            int highest = 0;
            int lowest =10000;

            for(int num : args){
                if(num > highest)
                    highest = num;
                else
                    highest = highest;

                if(num < lowest)
                    lowest = num;
                else
                    lowest = lowest;

            }
            return new int[]{lowest, highest};
        }

    /*
    8) Write a method that takes 3 arguments (int maxNum, int divisor1, int divisor2) and returns an Integer Arraylist.
        In this method create an Integer ArrayList and populate it with each number between zero and maxNum that is
        divisible by both divisor1 and divisor2. Then return this ArrayList. After calling this method, print out the
        length of the returned list
     */
        public static ArrayList<Integer> myArrList(int maxNum, int divisor1, int divisor2){
            ArrayList<Integer> arrListPractice = new ArrayList<>();

            for(int i = 0; i < maxNum; i++){
                if(i % divisor1 == 0 && i % divisor2 == 0)
                    arrListPractice.add(i);
            }
            return arrListPractice;
        }
    /*
    9) Write a method that will reverse an array in place use only one extra temp variable. For this exercise you cannot
        instantiate a second array. You must reverse the array in place using only one extra temp variable. Hint: this
        variable is used to temporarily store individual values in the array
     */
        public static int[] reverseAnArr(int... args){
            int temp;
            for(int i = 0; i < args.length/2; i++){
                temp = args[i];
                args[i] = args[args.length-1-i];
                args[args.length-1-i] = temp;
            }
            return args;
        }
}

