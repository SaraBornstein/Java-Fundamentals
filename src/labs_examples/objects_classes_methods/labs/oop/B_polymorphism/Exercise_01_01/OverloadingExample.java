package labs_examples.objects_classes_methods.labs.oop.B_polymorphism.Exercise_01_01;
/*
1) Demonstrate Overloading
*/
public class OverloadingExample {
    public int adding(int a, int b){
        return a + b;
    }
    public int adding(int a, int b, int c){
        return a + b + c;
    }
    public double adding(double a, double b){
        return a + b;
    }
}
