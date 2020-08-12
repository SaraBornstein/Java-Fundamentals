package labs_examples.datastructures.stack.labs;

public class CustomStackController {
    public static void main(String[] args) {
        CustomStack<String> stack = new CustomStack();

        stack.add("One");
        stack.add("Two");
        stack.add("Three");
        stack.add("Four");
        stack.add("Five");

        stack.print();
        System.out.println();

        String pop = stack.pop();
        System.out.println("Pop should return the last element added: " + pop);

        stack.print();
        System.out.println();

        String peekFirst = stack.peekFirst();
        System.out.println("peekFirst: " + peekFirst);
        String peekLast = stack.peekLast();
        System.out.println("peekLast: " + peekLast);

        System.out.println("The stack has a length of: " + stack.length());



    }
}
