package labs_examples.objects_classes_methods.labs.oop.B_polymorphism.Exercise_01_01;

/*
1) Demonstrate Overriding
 */
public class OverridingExampleMain {
    public static void main(String[] args) {
        OverridingExampleParent parent = new OverridingExampleParent();
        OverridingExampleChild child = new OverridingExampleChild();

        parent.OverridingMethod();
        child.OverridingMethod();
    }


}
