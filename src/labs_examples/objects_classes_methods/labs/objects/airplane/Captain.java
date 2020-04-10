package labs_examples.objects_classes_methods.labs.objects.airplane;

//Captain Class
public class Captain {
    int yearsOfService;

    //constructor
    public Captain(int yearsOfService) {
        this.yearsOfService = yearsOfService;
    }

    //to string
    @Override
    public String toString() {
        return "Captain{" +
                "yearsOfService=" + yearsOfService +
                '}';
    }
}
