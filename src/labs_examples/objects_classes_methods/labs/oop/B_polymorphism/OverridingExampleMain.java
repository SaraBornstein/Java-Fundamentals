package labs_examples.objects_classes_methods.labs.oop.B_polymorphism;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import org.w3c.dom.ls.LSOutput;

/*
1) Demonstrate Overriding
 */
public class OverridingExampleMain {
    public static void main(String[] args) {
        OverridingExampleParent parent = new OverridingExampleParent();
        OverridingExampleChild child = new OverridingExampleChild();

        parent.OverridingMethod();
        child.OverridingMethod();
    }


}
