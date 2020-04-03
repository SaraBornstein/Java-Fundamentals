package labs_examples.arrays.labs;

import java.util.ArrayList;

/**
 *  ArrayLists
 *
 *      Please demonstrate how to create an ArrayList, populate an array list, access elements within an ArrayList.
 *      Also take a moment to explore the many methods that are available to you when you use an ArrayList. By simply
 *      typing the dot operator (".") after the ArrayList object that you create. You should see a menu pop up that
 *      shows a list of methods.
 *
 */
public class Exercise_07 {
    public static void main(String[] args) {
        ArrayList<String> arrList = new ArrayList();
        arrList.add("head");
        arrList.add("shoulders");
        arrList.add("knees");
        arrList.add("toes");
        arrList.add("eyes");
        arrList.add("ears");
        arrList.add("nose");
        arrList.add("mouth");

        System.out.println(arrList);

        int size = arrList.size();
        System.out.println("The arrayList has " + size + " items.");

        if(arrList.contains("knees")){
            System.out.println(true);
        } else{
            System.out.println(false);
        }

        arrList.remove(arrList.get(2));
        System.out.println(arrList);

        if(arrList.contains("knees")){
            System.out.println(true);
        } else{
            System.out.println(false);
        }

        arrList.clear();
        System.out.println(arrList);


    }
}
