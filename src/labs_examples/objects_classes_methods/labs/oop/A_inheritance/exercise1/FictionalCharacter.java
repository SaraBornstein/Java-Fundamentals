package labs_examples.objects_classes_methods.labs.oop.A_inheritance.exercise1;

public class FictionalCharacter {
    protected boolean magical;
    protected String BookSeriesTitle;

    //constructor
    public FictionalCharacter(boolean magical, String bookSeriesTitle) {
        this.magical = magical;
        BookSeriesTitle = bookSeriesTitle;
    }

    //getter and setter
    public boolean isMagical() {
        return magical;
    }

    public void setMagical(boolean magical) {
        this.magical = magical;
    }

    public String getBookSeriesTitle() {
        return BookSeriesTitle;
    }

    public void setBookSeriesTitle(String bookSeriesTitle) {
        BookSeriesTitle = bookSeriesTitle;
    }

    //to string
    @Override
    public String toString() {
        return "FictionalCharacter{" +
                "magical=" + magical +
                ", BookSeriesTitle='" + BookSeriesTitle + '\'' +
                '}';
    }
}
