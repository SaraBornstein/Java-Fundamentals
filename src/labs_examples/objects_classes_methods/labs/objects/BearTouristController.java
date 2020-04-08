package labs_examples.objects_classes_methods.labs.objects;

//Exercise 2: Controller Class
//Controller Class - main method: create an object of each POJO you just created and associate the two together

public class BearTouristController {
    public static void main(String[] args) {

        Bear aBear = new Bear("Brown", "Alaska");
        Tourist tourists = new Tourist(100, "Cruise Ship");

        System.out.println(tourists.groupSize + " tourists have arrived by " + tourists.travelMeans + " to see the " + aBear.color + " bear in " + aBear.home);
    }
}
