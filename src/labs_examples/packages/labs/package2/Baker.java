package labs_examples.packages.labs.package2;

import labs_examples.packages.labs.package1.JavaClass1;

public class Baker {
    public void dress(){
        System.out.println("The baker puts on his hat and apron.");

        JavaClass1 obj = new JavaClass1();
        //obj.serveCake(3); Can't call this one
    }

    protected void bakeCake(int lbsOfFlour){
        System.out.println("The baker will need " + lbsOfFlour + " to bake the dessert.");
    }
}
