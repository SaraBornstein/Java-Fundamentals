package labs_examples.objects_classes_methods.labs.objects.airplane;

//FlightPath class
public class FlightPath {
    String destination;
    int departureHour;
    int arrivalHour;

    //constructor
    public FlightPath(String destination, int departureHour, int arrivalHour) {
        this.destination = destination;
        this.departureHour = departureHour;
        this.arrivalHour = arrivalHour;
    }

    //to string
    @Override
    public String toString() {
        return "FlightPath{" +
                "destination='" + destination + '\'' +
                ", departureHour=" + departureHour +
                ", arrivalHour=" + arrivalHour +
                '}';
    }
}
