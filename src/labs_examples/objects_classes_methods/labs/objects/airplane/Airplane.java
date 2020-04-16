package labs_examples.objects_classes_methods.labs.objects.airplane;

public class Airplane {
    //The Airplane class must be composed of at least 4 other classes
    private Meals meals;
    private Captain captain;
    private FlightPath flightPath;
    private AirplaneEngine airplaneEngine;

    //The Airplane class itself should have a fuel capacity (double) variable, as well as a currentFuelLevel variable.
    private double fuelCapacity;
    private int currentFuelLevel;
    private int passengerLoad;
    private int propellerNum;
    private String model;

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

    //getters and setters
    public Meals getMeals() {
        return meals;
    }

    public void setMeals(Meals meals) {
        this.meals = meals;
    }

    public Captain getCaptain() {
        return captain;
    }

    public void setCaptain(Captain captain) {
        this.captain = captain;
    }

    public FlightPath getFlightPath() {
        return flightPath;
    }

    public void setFlightPath(FlightPath flightPath) {
        this.flightPath = flightPath;
    }

    public AirplaneEngine getAirplaneEngine(double horsePower) {
        return airplaneEngine;
    }

    public void setAirplaneEngine(AirplaneEngine airplaneEngine) {
        this.airplaneEngine = airplaneEngine;
    }

    public double getFuelCapacity() {
        return fuelCapacity;
    }

    public void setFuelCapacity(double fuelCapacity) {
        this.fuelCapacity = fuelCapacity;
    }

    public int getCurrentFuelLevel() {
        return currentFuelLevel;
    }

    public void setCurrentFuelLevel(int currentFuelLevel) {
        this.currentFuelLevel = currentFuelLevel;
    }

    public int getPassengerLoad() {
        return passengerLoad;
    }

    public void setPassengerLoad(int passengerLoad) {
        this.passengerLoad = passengerLoad;
    }

    public int getPropellerNum() {
        return propellerNum;
    }

    public void setPropellerNum(int propellerNum) {
        this.propellerNum = propellerNum;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
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
