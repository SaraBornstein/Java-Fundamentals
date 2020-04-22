package labs_examples.objects_classes_methods.labs.oop.B_polymorphism.Exercise_01_02_and_03;

public class Doll implements StuffedCompanion {

    //implements methods
    @Override
    public void craft(String material) {
        System.out.println("To sew this doll you will need a pattern and " + material + ".");
    }

    @Override
    public void stuff(int PoundsOfFluff) {
        System.out.println("To stuff this doll you will need " + PoundsOfFluff + " pounds of fluff.");
    }
}
