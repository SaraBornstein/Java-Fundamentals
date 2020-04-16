package labs_examples.objects_classes_methods.labs.objects.airplane;

//FlightPath class
public class FlightPath {
    private String destination;
    private int departureHour;
    private int arrivalHour;

    //constructor
    public FlightPath(String destination, int departureHour, int arrivalHour) {
        this.destination = destination;
        this.departureHour = departureHour;
        this.arrivalHour = arrivalHour;
    }

    //getter & setters
    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public int getDepartureHour() {
        return departureHour;
    }

    public void setDepartureHour(int departureHour) {
        this.departureHour = departureHour;
    }

    public int getArrivalHour() {
        return arrivalHour;
    }

    public void setArrivalHour(int arrivalHour) {
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
