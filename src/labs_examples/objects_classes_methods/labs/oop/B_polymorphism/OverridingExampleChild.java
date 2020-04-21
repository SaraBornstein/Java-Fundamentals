package labs_examples.objects_classes_methods.labs.oop.B_polymorphism;
/*
1) Demonstrate Overriding
 */
public class OverridingExampleChild extends OverridingExampleParent{
    @Override
    public void OverridingMethod(){
        System.out.println("The Child method has been called.");
    }
}
