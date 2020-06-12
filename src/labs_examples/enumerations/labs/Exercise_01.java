package labs_examples.enumerations.labs;

import java.util.Arrays;

/**
 * Enumerations Exercise 1:
 *
 *      1) Create an enumeration. Use a controller class to demonstrate the use of the enum from a seperate class.
 *      2) Create a parameterized enumeration that passes one or more values to it's constructor. Demonstrate the use
 *      of this enum from a seperate class.
 */

enum Podcast {
    FREECODECAMP(45),
    BASECS(20),
    CODENEWBIE(30),
    LEARNTOCODE(15);

    private int lengthMin;

    Podcast(int lengthMin) {
        this.lengthMin = lengthMin;
    }

    public int getLengthMin() {
        return lengthMin;
    }

    public void setLengthMin(int lengthMin) {
        this.lengthMin = lengthMin;
    }
}

class EnumController {
    public static void main(String[] args) {
        for(Podcast pod : Podcast.values()){
            System.out.println(pod + " is " + pod.getLengthMin() + " minutes long.");

        }

    }
}