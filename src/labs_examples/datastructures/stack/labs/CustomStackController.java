package labs_examples.datastructures.stack.labs;

public class CustomStackController {
    public static void main(String[] args) {
        CustomStack<String> stack = new CustomStack();

        stack.add("One");
        stack.add("Two");

        String a = stack.pop();
        String b = stack.pop();
        String c = stack.pop();

        System.out.println(a);
        System.out.println(b);

    }
}
