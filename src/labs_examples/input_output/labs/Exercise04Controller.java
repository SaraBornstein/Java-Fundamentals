package labs_examples.input_output.labs;

import labs_examples.input_output.examples.csv_parser.Student;
import labs_examples.objects_classes_methods.labs.oop.B_polymorphism.Exercise_01_01.InterfaceExample;

import java.io.*;
import java.util.ArrayList;

public class Exercise04Controller {
    public static void main(String[] args) {
        //writeCsv();
        flowerCsvParse();
    }

    //Parse CSV file to Flower object and write toString of arrayList
    public static void flowerCsvParse(){
        ArrayList<Flower> flowers = new ArrayList<>();

        String filePath = "src/labs_examples/input_output/labs/Exercise_04.csv";

        try (BufferedReader br =
                     new BufferedReader(new FileReader(filePath))) {

            String line;

            while ((line = br.readLine()) != null) {
                String[] values = line.split(",");
                flowers.add(mapValuesToFlowerObject(values));
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        String csvOut = "src/labs_examples/input_output/labs/Flower.csv";
        //write arraylist to new CSV file
        try (FileWriter fw = new FileWriter(csvOut)) {
            for(Flower flower : flowers) {
                System.out.println(flower.toString());
                String str = flower.getFlowerType() + "," + flower.getFlowerColor() + "," + flower.getNumInGarden() + "\r\n";;
                fw.write(str);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static Flower mapValuesToFlowerObject(String[] values) {

        Flower flower = new Flower();

        flower.setFlowerType(values[0]);
        flower.setFlowerColor(values[1]);
        flower.setNumInGarden(Integer.parseInt(values[2]));

        return flower;
    }

    //write CSV file (each line contains Flower Type, Color, Number in Garden)
    public static void writeCsv(){
        String str;
        String filePath = "src/labs_examples/input_output/labs/Exercise_04.csv";

        BufferedReader br =
                new BufferedReader(
                        new InputStreamReader(System.in));

        try (FileWriter fw = new FileWriter(filePath))
        {
            do {
                System.out.print("Type line: ");
                str = br.readLine(); //NOTE: Do NOT put spaces before items in CSV file

                if(str.compareTo("stop") == 0)
                    break;

                str = str + "\r\n"; // add newline
                fw.write(str);
            } while(str.compareTo("stop") != 0);
        } catch(IOException exc) {
            System.out.println("I/O Error: " + exc);
        }
    }
}
