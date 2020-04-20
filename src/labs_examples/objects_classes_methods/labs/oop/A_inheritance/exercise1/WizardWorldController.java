package labs_examples.objects_classes_methods.labs.oop.A_inheritance.exercise1;

public class WizardWorldController {
    public static void main(String[] args) {

        WizardStudent Harry = new WizardStudent(true, "Harry Potter", true, "wizard", "Phoenix Feather", "Owl", "Gryffindor");
        WizardStudent Hermione = new WizardStudent(true, "Harry Potter", true, "witch", "some wand type", "cat", "Gryffindor");
        WizardStudent Ron = new WizardStudent(true, "Harry Potter", true, "wizard", "other wand type", "rat", "Gryffindor");

        System.out.println(Harry.toString());
        Harry.travelMethod();

        HogwartsProfessor Dumbledore = new HogwartsProfessor(true, "Harry Potter", false, "wizard", "none");
        HogwartsProfessor McGonagall = new HogwartsProfessor(true, "Harry Potter", false, "witch", "Transfiguration");
        HogwartsProfessor Snape = new HogwartsProfessor(true,"Harry Potter", false, "wizard","Potions");

        Dumbledore.travelMethod();

        MagicalCreature Buckbeak = new MagicalCreature(false, "Harry Potter", false, "animal", "Hippogryff");
        MagicalCreature Headwig = new MagicalCreature(false, "Harry Potter", false, "animal", "owl");
        MagicalCreature Scabbers = new MagicalCreature(true, "Harry Potter", false, "animagus", "rat and human");

        Buckbeak.travelMethod();

    }
}
