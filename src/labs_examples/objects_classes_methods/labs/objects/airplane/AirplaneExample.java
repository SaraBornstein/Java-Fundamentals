package labs_examples.objects_classes_methods.labs.objects.airplane;

//Exercise 1:

import labs_examples.objects_classes_methods.labs.objects.airplane.AirplaneEngine;
import labs_examples.objects_classes_methods.labs.objects.airplane.Captain;
import labs_examples.objects_classes_methods.labs.objects.airplane.FlightPath;
import labs_examples.objects_classes_methods.labs.objects.airplane.Meals;

public class AirplaneExample {

    public static void main(String[] args) {

        Meals food = new Meals(false, "peanuts");
        Captain myCaptain = new Captain(20);
        FlightPath vacation = new FlightPath("Sitka, AK", 10, 11);
        AirplaneEngine myAirplaneEngine = myAirplaneEngine = new AirplaneEngine(400);
        Airplane myAirplane = new Airplane(food, myCaptain, vacation, myAirplaneEngine, 56.5, 25, 6, 4, "DeHaviland");

        System.out.println(myAirplane.toString());
        System.out.println(myAirplane.airplaneEngine.horsePower);
    }
}
