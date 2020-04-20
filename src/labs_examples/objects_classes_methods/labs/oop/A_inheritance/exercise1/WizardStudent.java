package labs_examples.objects_classes_methods.labs.oop.A_inheritance.exercise1;

public class WizardStudent extends WizardWorldInhabitant {
    //(wandType, petType, schoolHouse, travel by train and flying car)
    String wandType;
    String petType;
    String schoolHouse;

    @Override
    public void travelMethod() {
        System.out.println("A Wizard Student travels by train or flying car.");
    }

    //constructor
    public WizardStudent(boolean magical, String bookSeriesTitle, boolean limitedPowers, String beingType, String wandType, String petType, String schoolHouse) {
        super(magical, bookSeriesTitle, limitedPowers, beingType);
        this.wandType = wandType;
        this.petType = petType;
        this.schoolHouse = schoolHouse;
    }

    //getter and setter
    public String getWandType() {
        return wandType;
    }

    public void setWandType(String wandType) {
        this.wandType = wandType;
    }

    public String getPetType() {
        return petType;
    }

    public void setPetType(String petType) {
        this.petType = petType;
    }

    public String getSchoolHouse() {
        return schoolHouse;
    }

    public void setSchoolHouse(String schoolHouse) {
        this.schoolHouse = schoolHouse;
    }
//to string
    @Override
    public String toString() {
        return "WizardStudent{" +
                "wandType='" + wandType + '\'' +
                ", petType='" + petType + '\'' +
                ", schoolHouse='" + schoolHouse + '\'' +
                ", limitedPowers=" + limitedPowers +
                ", beingType='" + beingType + '\'' +
                ", magical=" + magical +
                ", BookSeriesTitle='" + BookSeriesTitle + '\'' +
                '}';
    }
}
