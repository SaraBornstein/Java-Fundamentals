package labs_examples.static_nonstatic.labs;

public class ClassA {

    public static void staticMethodOne(){
        //1) A static method calling another static method in the same class
        staticMethodTwo();

        //2) A static method calling a non-static method in the same class
        ClassA obj = new ClassA();
        obj.nonStaticMethodOne();

    }

    public static void staticMethodTwo(){
        System.out.println("Method 2 has been called.");

    }


    public void nonStaticMethodOne(){
        System.out.println("nonStaticMethodOne has been called.");

        //5) A non-static method calling a non-static method in the same class
        nonStaticMethodTwo();

        //7) A non-static method calling a static method in the same class
        ClassA.staticMethodOne();
    }

    public void nonStaticMethodTwo(){
        System.out.println("nonStaticMethodTwo has been called.");
    }


}
