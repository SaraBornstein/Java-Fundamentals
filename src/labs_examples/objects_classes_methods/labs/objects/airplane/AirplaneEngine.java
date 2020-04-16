package labs_examples.objects_classes_methods.labs.objects.airplane;

//Engine Class
public class AirplaneEngine {
    private double horsePower;

    //constructor
    public AirplaneEngine(double horsePower) {
        this.horsePower = horsePower;
    }

    //getter and setter
    public double getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(double horsePower) {
        this.horsePower = horsePower;
    }

    //to string
    @Override
    public String toString() {
        return "Engine{" +
                "horsePower=" + horsePower +
                '}';
    }
}