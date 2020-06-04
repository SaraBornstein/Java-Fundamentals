package labs_examples.lambdas.labs;

//Exercise_01 3) Demonstrate creating a functional interface with an abstract method that takes 1 parameter
// and returns a value of the same type as the parameter
@FunctionalInterface
public interface FunctionalInterfaceTwo {
    public Integer anotherAbstractMethod(int a);
}
