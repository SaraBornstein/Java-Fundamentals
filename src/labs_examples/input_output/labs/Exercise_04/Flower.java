package labs_examples.input_output.labs.Exercise_04;

//Flower POJO
public class Flower {
   //instance variables in csv file
    private String flowerType;
    private String flowerColor;
    private int numInGarden;

    //constructors
    public Flower() {
    }

    public Flower(String flowerType, String flowerColor, int numInGarden) {
        this.flowerType = flowerType;
        this.flowerColor = flowerColor;
        this.numInGarden = numInGarden;
    }

    //get and set
    public String getFlowerType() {
        return flowerType;
    }

    public void setFlowerType(String flowerType) {
        this.flowerType = flowerType;
    }

    public String getFlowerColor() {
        return flowerColor;
    }

    public void setFlowerColor(String flowerColor) {
        this.flowerColor = flowerColor;
    }

    public int getNumInGarden() {
        return numInGarden;
    }

    public void setNumInGarden(int numInGarden) {
        this.numInGarden = numInGarden;
    }

    //toString

    @Override
    public String toString() {
        return "Flower{" +
                "flowerType='" + flowerType + '\'' +
                ", flowerColor='" + flowerColor + '\'' +
                ", numInGarden=" + numInGarden +
                '}';
    }
}
