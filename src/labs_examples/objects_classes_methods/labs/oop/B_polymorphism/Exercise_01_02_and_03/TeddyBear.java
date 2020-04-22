package labs_examples.objects_classes_methods.labs.oop.B_polymorphism.Exercise_01_02_and_03;

public class TeddyBear extends StuffedAnimal {
    //instance variables
    String outfit;
    String likes;

    //constructor
    public TeddyBear(String animalType, String owner, String home, String outfit, String likes) {
        super(animalType, owner, home);
        this.outfit = outfit;
        this.likes = likes;
    }

    //getter and setter
    public String getOutfit() {
        return outfit;
    }

    public void setOutfit(String outfit) {
        this.outfit = outfit;
    }

    public String getLikes() {
        return likes;
    }

    public void setLikes(String likes) {
        this.likes = likes;
    }
}
