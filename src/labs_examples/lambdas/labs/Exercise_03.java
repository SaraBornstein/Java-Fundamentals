package labs_examples.lambdas.labs;

import java.util.function.Function;

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
        System.out.println(x);

// 2) Demonstrate the use of an instance method reference (ObjectType::instanceMethod)


    }
}

class DoSomething{
    public static Integer printAnInt (int t) {
        return t + 2;
    }
}



