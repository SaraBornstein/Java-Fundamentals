package labs_examples.objects_classes_methods.labs.oop.B_polymorphism.Exercise_01_01;

public class InterfaceCakeExample implements InterfaceExample{
    @Override
    public void recipe() {
        System.out.println("The recipe includes ingredients, mixing directions, and bake time.");
    }

    @Override
    public void ingredients(int ingredient) {
        System.out.println("The ingredients include flour, sugar, butter and " + ingredient);
    }

    @Override
    public void bake(int time) {
        System.out.println("Bake the cake for " + time + " minutes.");
    }

    @Override
    public boolean yum() {
    int good = 1;
        if(good == 1)
        return true;
        else
            return false;
    }
}
