package labs_examples.objects_classes_methods.labs.oop.A_inheritance.exercise1;

public class MagicalCreature extends WizardWorldInhabitant {
    String animalType;

    @Override
    public void travelMethod() {
        System.out.println("A Magical Creature travels using wings.");
    }

    //constructor
    public MagicalCreature(boolean magical, String bookSeriesTitle, boolean limitedPowers, String beingType, String animalType) {
        super(magical, bookSeriesTitle, limitedPowers, beingType);
        this.animalType = animalType;
    }

    //getter and setter
    public String getAnimalType() {
        return animalType;
    }

    public void setAnimalType(String animalType) {
        this.animalType = animalType;
    }

    //to string
    @Override
    public String toString() {
        return "MagicalCreature{" +
                "animalType='" + animalType + '\'' +
                ", limitedPowers=" + limitedPowers +
                ", beingType='" + beingType + '\'' +
                ", magical=" + magical +
                ", BookSeriesTitle='" + BookSeriesTitle + '\'' +
                '}';
    }
}
