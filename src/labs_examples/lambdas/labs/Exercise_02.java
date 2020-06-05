package labs_examples.lambdas.labs;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.function.*;

/**
 * Lambdas Exercise 2:
 *
 *      1) Demonstrate the use of 10 pre-built Functional Interfaces from the java.util.functions package. That's right,
 *      10 of them! You can do it! You'll know so much about them when you're done!
 *
 */

class PreBuiltFunctionalInterfaces{
    public static void main(String[] args) {
/*
1. Function: accepts an argument and produces a result
Function<T, R> {
R apply(T t);
}
 */
        Function<String,Integer> obj1 = (String str) -> Integer.parseInt(str);
        System.out.println("1. Function: " + obj1.apply("4"));

/*
2. Supplier: a supplier of results.
Supplier<T>{
T get();
}
 */
        Supplier<String> obj2 = () -> {
            String sentence = "This is the supplier functional interface.";
            return sentence;
        };
        System.out.println("2. Supplier: " + obj2.get());

/*
3. Consumer<T>{
void accept(T t);
}
 */
        Consumer<String> obj3 = (String t) -> System.out.println(t);
        String consumer = "3. This is the consumer functional interface.";
        obj3.accept(consumer);
/*
4. DoublePredicate
@FunctionalInterface
public interface DoublePredicate {
boolean test(double value);
}
 */
        DoublePredicate obj4 = (double x) -> {
            double[] arr = new double[]{3.5, 6.7, 8.9, 8.4};
            for(double num : arr){
                if(num / 2 == x)
                    return true;
            }
            return false;
        };
        System.out.println("4. This is the DoublePredicate functional interface: " + obj4.test(4.2));
/*
5. DoubleToIntFunction (accepts a double-valued argument and produces an
 * int-valued result.)
@FunctionalInterface
public interface DoubleToIntFunction {
int applyAsInt(double value);
}
 */
        DoubleToIntFunction obj5 = (double arg) -> {
            return (int) arg;
        };
        System.out.println("5. This is the DoubleToIntFunction functional interface: " + obj5.applyAsInt(5.5));
/*
6. LongBinaryOperator
@FunctionalInterface
public interface LongBinaryOperator {
long applyAsLong(long left, long right);
}
 */
        LongBinaryOperator obj6 = (long l, long r) -> {
            return l + r;
        };
        System.out.println("6. This is the LongBinaryOperator functional interface: " +
                obj6.applyAsLong(3904395749830L, 54321098765L));
/*
7. ToIntBiFunction (accepts two arguments and produces an int-valued)
@FunctionalInterface * result.
public interface ToIntBiFunction<T, U> {
    int applyAsInt(T t, U u);
}
*/
        ToIntBiFunction<String, Integer> obj7 = (String r, Integer v) -> {
            return Integer.parseInt(r) + v;
        };
        System.out.println("7. This is the ToIntBiFunction functional interface: " +
        obj7.applyAsInt("6", 6));

/*
8. BooleanSupplier
@FunctionalInterface
public interface BooleanSupplier {
    boolean getAsBoolean();
}
*/
        BooleanSupplier obj8 = () -> {
             int[] arr2 = new int[]{2, 3, 4, 5};
             for(int n : arr2){
                 if(n % 2 == 0)
                     return true;
             }
            return false;
        };
        System.out.println("8. This is the BooleanSupplier functional interface: " +
        obj8.getAsBoolean());
/*
9. BiPredicate
@FunctionalInterface
public interface BiPredicate<T, U> {
    boolean test(T t, U u);
}
*/
        BiPredicate<String, String> obj9 = (String a, String b) -> {
            ArrayList<String> list = new ArrayList();
            list.add("one");
            list.add("two");
            list.add("three");
            list.add("four");
            list.add("five");
            if(list.contains(a) || list.contains(b))
                return true;
            return false;
        };
        System.out.println("9. This is the BiPredicate functional interface: " +
        obj9.test("one", "two"));
/*
10. IntFunction
@FunctionalInterface
public interface IntFunction<R> {
     R apply(int value);
 }
 */
        IntFunction<Integer> obj10 = (c) -> {
            return c;
        };
        System.out.println("10. This is the IntFunction functional interface: " +
                obj10.apply(4));

    }
}

