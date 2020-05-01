package labs_examples.exception_handling.labs;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

/**
 * Exception Handling Exercise 4:
 *
 *      Demonstrate a nested try/catch.
 *
 */

public class NestedTryCatchDemo {
    public static void main(String[] args) {

        try{
            int x = 5/0;
            System.out.println(x);
        }catch(Exception exc2){

            try{
                int y = 4/0;
                System.out.println(y);

            }catch(ArithmeticException exc1){

                System.out.println("There is no y.");
            }

            System.out.println("Shut the program down.");
        }
    }
}
