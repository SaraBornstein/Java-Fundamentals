package labs_examples.objects_classes_methods.labs.oop.B_polymorphism.Exercise_01_02_and_03;

public class Controller {
    public static void main(String[] args) {
        TeddyBear paddington = new TeddyBear("bear", "The Browns", "London", "Blue coat and red hat", "travel");
        //paddington.craft("fur");
        //paddington.stuff(3);

        Doll molly = new Doll();
        //molly.craft("porcelain");
        //molly.stuff(2);

        Dependency example = new Dependency(paddington);
        example.stuffyMethod();

        //example of using the setter to update the interface object
        example.setStuffy(molly);
        example.stuffyMethod();


    }
}
