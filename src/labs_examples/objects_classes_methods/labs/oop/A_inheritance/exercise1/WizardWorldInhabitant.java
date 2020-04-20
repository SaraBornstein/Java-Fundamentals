package labs_examples.objects_classes_methods.labs.oop.A_inheritance.exercise1;

public class WizardWorldInhabitant extends FictionalCharacter {
    boolean limitedPowers;
    String beingType;
    public void travelMethod(){
        System.out.println("A Wizard World Inhabitant travels by broom.");
    }

    //constructor
    public WizardWorldInhabitant(boolean magical, String bookSeriesTitle, boolean limitedPowers, String beingType) {
        super(magical, bookSeriesTitle);
        this.limitedPowers = limitedPowers;
        this.beingType = beingType;
    }

    //getter and setter
    public boolean isLimitedPowers() {
        return limitedPowers;
    }

    public void setLimitedPowers(boolean limitedPowers) {
        this.limitedPowers = limitedPowers;
    }

    public String getBeingType() {
        return beingType;
    }

    public void setBeingType(String beingType) {
        this.beingType = beingType;
    }
}
