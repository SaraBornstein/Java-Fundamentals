package labs_examples.objects_classes_methods.labs.objects.airplane;

//Captain Class
public class Captain {
    private int yearsOfService;

    //constructor
    public Captain(int yearsOfService) {
        this.yearsOfService = yearsOfService;
    }

    //getter & setter
    public int getYearsOfService() {
        return yearsOfService;
    }

    public void setYearsOfService(int yearsOfService) {
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
