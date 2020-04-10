package labs_examples.objects_classes_methods.labs.objects.airplane;

//Meals Class
public class Meals {
    boolean dinner;
    String snacks;

    //constructor
    public Meals(boolean dinner, String snacks) {
        this.dinner = dinner;
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
