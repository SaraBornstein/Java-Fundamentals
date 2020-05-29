package labs_examples.lambdas.examples.anonymous_inner_classes;

import labs_examples.lambdas.examples.traditional_interface_implementation.SimpleClass;
import labs_examples.lambdas.examples.functional_interfaces.SimpleInterface;

/**
 * Created by ryandesmond - https://codingnomads.co
 */
public class AnonymousInnerClass { //when this class is compiled it will create an anonymous class file only available in this main method
//not a general class, not available to whole application like other classes
    public static void main(String[] args) {

        SimpleInterface obj = new SimpleInterface() { //create object of interface
            @Override
            public void methodOne() {
                System.out.println("in methodOne - in anon");
            }
        }; //This is all technically one line of code, i.e. "in line"

        SimpleClass obj2 = new SimpleClass(); //OR create object of the class that implements interface

        obj.methodOne();
        obj2.methodOne();


        //runnable is an interface with one method in it.
        //if you need to just quickly run another thread, and don't need to create another class, use anonymous inner class
        Runnable myRunnable = new Runnable() {
            @Override //implement the method
            public void run() {
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("inside run method");
            }
        };

        Thread myThread = new Thread(myRunnable); //create new object and pass in the runnable object
        myThread.start();

        System.out.println("done with main thread");

    }
}
