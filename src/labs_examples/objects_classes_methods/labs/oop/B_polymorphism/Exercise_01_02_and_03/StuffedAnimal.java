package labs_examples.objects_classes_methods.labs.oop.B_polymorphism.Exercise_01_02_and_03;

public class StuffedAnimal implements StuffedCompanion{
    //instance variables
    String animalType;
    String owner;
    String home;

    //implements methods
    @Override
    public void craft(String material) {
        //Pick fabric type & pattern
        System.out.println("To craft this animal you will need a pattern and " + material + ".");
    }

    @Override
    public void stuff(int PoundsOfFluff) {
        //Choose stuffing type and amount
        System.out.println("To stuff this animal you will need " + PoundsOfFluff + " pounds of fluff.");
    }

    //constructor
    public StuffedAnimal(String animalType, String owner, String home) {
        this.animalType = animalType;
        this.owner = owner;
        this.home = home;
    }

    //getter and setter
    public String getAnimalType() {
        return animalType;
    }

    public void setAnimalType(String animalType) {
        this.animalType = animalType;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getHome() {
        return home;
    }

    public void setHome(String home) {
        this.home = home;
    }
}
