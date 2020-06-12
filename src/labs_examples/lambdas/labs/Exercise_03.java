package labs_examples.lambdas.labs;

import java.util.function.Function;
import java.util.function.Supplier;

/**
 * Lambdas Exercise 3:
 *      1) Demonstrate the use of a static method reference
 *      2) Demonstrate the use of an instance method reference
 *      3) Demonstrate the use of a constructor reference
 */
class ExerciseThree{
    public static void main(String[] args) {
// 1) Demonstrate the use of a static method reference (Class::staticMethod)
        Function<Integer,Integer> obj1 = DoSomething :: printAnInt;
        int x = obj1.apply(5);
        System.out.println("Static Method Reference: " + x);

// 2) Demonstrate the use of an instance method reference (obj::instanceMethod)
        NonStaticDoSomething HelloObject = new NonStaticDoSomething();
        Supplier s = HelloObject::sayHello;
        System.out.println("Instance method reference: " + s.get());

//3) Demonstrate the use of a constructor reference
    Supplier sup = Dog::new;
    System.out.println(sup.get());


    }
}

class DoSomething{
    public static Integer printAnInt (int t) {
        return t + 2;
    }

}

class NonStaticDoSomething{
    public String sayHello(){
        return "Hello";
    }
}

class Dog {

    public Dog() {
    }

    @Override
    public String toString() {
        return "Constructor reference: Woof!";
    }
}


