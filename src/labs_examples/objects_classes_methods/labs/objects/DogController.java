package labs_examples.objects_classes_methods.labs.objects;

//Exercise 3: Controller, main- at least 3 objects of your POJO class, each using a different constructor.
public class DogController {
    public static void main(String[] args) {
        Dog scooby = new Dog("Scooby", 4);
        Dog clifford = new Dog("Clifford");
        Dog nana = new Dog("Nana", "Peter Pan", "brown and white", false);

        System.out.println(nana.toString());
        System.out.println(clifford.toString());
        System.out.println(scooby.toString());
    }

}
