package labs_examples.objects_classes_methods.labs.objects;

import com.sun.org.apache.xpath.internal.operations.Bool;

//Exercise 3: POJO, at least three overloaded constructors
public class Dog {
    String name;
    String story;
    String color;
    Boolean adventureLover;
    int friends;



    //constructor 1 - Nana
    public Dog(String name, String story, String color, Boolean adventureLover) {
        this.name = name;
        this.story = story;
        this.color = color;
        this.adventureLover = adventureLover;
    }

    //constructor 2 - Clifford
    public Dog(String name){
            this.name = name;
        }

    //constructor 3 - Scooby
    public Dog(String name, int friends){
        this.name = name;
        this.friends = friends;
    }
}
