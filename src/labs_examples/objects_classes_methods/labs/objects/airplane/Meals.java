package labs_examples.objects_classes_methods.labs.objects.airplane;

//Meals Class
public class Meals {
    private boolean dinner;
    private String snacks;

    //constructor
    public Meals(boolean dinner, String snacks) {
        this.dinner = dinner;
        this.snacks = snacks;
    }

    //getter & setter
    public boolean isDinner() {
        return dinner;
    }

    public void setDinner(boolean dinner) {
        this.dinner = dinner;
    }

    public String getSnacks() {
        return snacks;
    }

    public void setSnacks(String snacks) {
        this.snacks = snacks;
    }

    //to string
    @Override
    public String toString() {
        return "Meals{" +
                "dinner=" + dinner +
                ", snacks='" + snacks + '\'' +
                '}';
    }
}
