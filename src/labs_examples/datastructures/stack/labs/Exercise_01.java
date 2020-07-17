package labs_examples.datastructures.stack.labs;

import java.util.Stack;

/**
 *      Demonstrate your mastery of Java's built-in Stack class by completing the following:
 *
 *      1) instantiate a new Stack
 *      2) demonstrate the use of EVERY method in the Stack class - there are 5
 */
class stackExerciseOne {
    public static void main(String[] args) {
        Stack<String> stackExercise = new Stack();

        stackExercise.add("StackOne");
        stackExercise.add("StackTwo");
        stackExercise.add("StackThree");
        stackExercise.add("StackFour");
        stackExercise.add("StackFive");
        stackExercise.add("StackSix");
        System.out.println(stackExercise);

        //Push, Pop, Peek, Empty, Search
        //Push
        stackExercise.push("StackSeven");
        System.out.println(stackExercise);

        //Pop
        stackExercise.pop();
        System.out.println(stackExercise);

        //Peek
        System.out.println(stackExercise.peek());

        //Empty
        System.out.println("stackExercise is Empty: " + stackExercise.empty());

        //Search
        System.out.println(stackExercise.search("StackFive"));
    }
}
