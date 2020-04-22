package labs_examples.objects_classes_methods.labs.oop.B_polymorphism.Exercise_01_02_and_03;

public class Dependency {
    //interface as instance variable (Exercise 3)
    StuffedCompanion stuffy;

    //constructor that takes in the interface as a parameter
    public Dependency(StuffedCompanion stuffy) {
        this.stuffy = stuffy;
    }

    //method
    public void stuffyMethod(){
        stuffy.craft("fur");
        stuffy.stuff(3);
    }

    //setter that allows you to update the interface object
    public void setStuffy(StuffedCompanion stuffy) {
        this.stuffy = stuffy;
    }
}
