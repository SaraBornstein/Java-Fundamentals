package labs_examples.packages.labs.package1;

import labs_examples.packages.labs.package2.Baker;

public class JavaClass1 {
    public static void main(String[] args) {
        Baker obj = new Baker();
        obj.dress();

        //obj.bakeCake(); Can't call this one.

        serveCake(3);
    }

    protected static void serveCake(int guests){
        Baker chef = new Baker();

        System.out.println("In order to serve cake to " + guests + " guests, the baker will first need to: ");
        chef.dress();
        System.out.print("Then: ");
        //chef.bakeCake(); Can't call this one.
    }
}
