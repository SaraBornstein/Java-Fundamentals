package labs_examples.objects_classes_methods.labs.oop.A_inheritance.exercise1;

public class HogwartsProfessor extends WizardWorldInhabitant {
    String classSubject;

    @Override
    public void travelMethod() {
        System.out.println("A Hogwarts Professor travels by apparating or floo powder.");
    }

    //constructor
    public HogwartsProfessor(boolean magical, String bookSeriesTitle, boolean limitedPowers, String beingType, String classSubject) {
        super(magical, bookSeriesTitle, limitedPowers, beingType);
        this.classSubject = classSubject;
    }

    //getter and setter
    public String getClassSubject() {
        return classSubject;
    }

    public void setClassSubject(String classSubject) {
        this.classSubject = classSubject;
    }

    //to string
    @Override
    public String toString() {
        return "HogwartsProfessor{" +
                "classSubject='" + classSubject + '\'' +
                ", limitedPowers=" + limitedPowers +
                ", beingType='" + beingType + '\'' +
                ", magical=" + magical +
                ", BookSeriesTitle='" + BookSeriesTitle + '\'' +
                '}';
    }
}
