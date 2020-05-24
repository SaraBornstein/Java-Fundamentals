package labs_examples.generics.labs;

/**
 * Generics Exercise 1:
 *
 *      1.) Write a generic class with at least two instance variables, a constructor, and getter and setter methods.
 *      2.) Create a few objects of your generic class with different data types to demonstrate it's
 *          dynamic usage.
 */

class GenericClassExample <T>{
    public static void main(String[] args) {
        GenericClassExample <String> obj1 = new GenericClassExample("one", "two");
        GenericClassExample <Integer> obj2 = new GenericClassExample(1,2);
        GenericClassExample <Double> obj3 = new GenericClassExample(1.2,2.3);

        obj1.print();
        obj2.print();
        obj3.print();


    }

    //2 instance variables
    private T val1;
    private T val2;

    public void print(){
        System.out.println(val1 + " and " + val2);
    }

    //constructor
    public GenericClassExample(T val1, T val2) {
        this.val1 = val1;
        this.val2 = val2;
    }

//getters & setters

    public T getVal1() {
        return val1;
    }

    public void setVal1(T val1) {
        this.val1 = val1;
    }

    public T getVal2() {
        return val2;
    }

    public void setVal2(T val2) {
        this.val2 = val2;
    }
}
