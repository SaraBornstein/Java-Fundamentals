package labs_examples.objects_classes_methods.labs.objects;

//Exercise 1:

public class AirplaneExample {

    public static void main(String[] args) {

        Meals food = new Meals(false, "peanuts");
        Captain myCaptain = new Captain(20);
        FlightPath vacation = new FlightPath("Sitka, AK", 10, 11);
        Engine myEngine = myEngine = new Engine(400);
        Airplane myAirplane = new Airplane(food, myCaptain, vacation, myEngine, 56.5, 25, 6, 4, "DeHaviland");

        System.out.println(myAirplane.toString());


    }

    public static class Airplane {
        //The Airplane class must be composed of at least 4 other classes
        Meals meals;
        Captain captain;
        FlightPath flightPath;
        Engine engine;

        //The Airplane class itself should have a fuel capacity (double) variable, as well as a currentFuelLevel variable.
        double fuelCapacity;
        int currentFuelLevel;
        int passengerLoad;
        int propellerNum;
        String model;

        //constructor
        public Airplane(Meals meals, Captain captain, FlightPath flightPath, Engine engine, double fuelCapacity, int currentFuelLevel, int passengerLoad, int propellerNum, String model) {
            this.meals = meals;
            this.captain = captain;
            this.flightPath = flightPath;
            this.engine = engine;
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
                    ", engine=" + engine +
                    ", fuelCapacity=" + fuelCapacity +
                    ", currentFuelLevel=" + currentFuelLevel +
                    ", passengerLoad=" + passengerLoad +
                    ", propellerNum=" + propellerNum +
                    ", model='" + model + '\'' +
                    '}';
        }
    }

    //Captain Class
    public static class Captain {
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

    //Engine Class
    public static class Engine {
        double horsePower;

        //constructor
        public Engine(double horsePower) {
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

    //FlightPath class
    public static class FlightPath {
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

    //Meals Class
    public static class Meals {
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


}
