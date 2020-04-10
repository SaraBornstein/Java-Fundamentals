package labs_examples.objects_classes_methods.labs.objects.airplane;

public class Airplane {
    //The Airplane class must be composed of at least 4 other classes
    Meals meals;
    Captain captain;
    FlightPath flightPath;
    AirplaneEngine airplaneEngine;

    //The Airplane class itself should have a fuel capacity (double) variable, as well as a currentFuelLevel variable.
    double fuelCapacity;
    int currentFuelLevel;
    int passengerLoad;
    int propellerNum;
    String model;

    //constructor
    public Airplane(Meals meals, Captain captain, FlightPath flightPath, AirplaneEngine airplaneEngine, double fuelCapacity, int currentFuelLevel, int passengerLoad, int propellerNum, String model) {
        this.meals = meals;
        this.captain = captain;
        this.flightPath = flightPath;
        this.airplaneEngine = airplaneEngine;
        this.fuelCapacity = fuelCapacity;
        this.currentFuelLevel = currentFuelLevel;
        this.passengerLoad = passengerLoad;
        this.propellerNum = propellerNum;
        this.model = model;
    }

    //To String Method
    @Override
    public String toString() {
        return "Airplane{" +
                "meals=" + meals +
                ", captain=" + captain +
                ", flightPath=" + flightPath +
                ", engine=" + airplaneEngine +
                ", fuelCapacity=" + fuelCapacity +
                ", currentFuelLevel=" + currentFuelLevel +
                ", passengerLoad=" + passengerLoad +
                ", propellerNum=" + propellerNum +
                ", model='" + model + '\'' +
                '}';
    }
}
