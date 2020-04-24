package labs_examples.static_nonstatic.labs;

public class ClassB {

    public static void main(String[] args) {
        //3) A static method calling a static method in another class
        ClassA.staticMethodOne();

        //4) A static method calling a non-static method in another class
        ClassA objA = new ClassA();
        objA.nonStaticMethodOne();
    }

    public void nonStaticMethodB(){
        System.out.println("nonStaticMethodB has been called.");

        //6) A non-static method calling a non-static method in another class
        ClassA objB = new ClassA();
        objB.nonStaticMethodOne();

        //8) A non-static method calling a static method in another class
        ClassA.staticMethodOne();
    }
}
