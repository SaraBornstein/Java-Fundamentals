package labs_examples.datastructures.hashmap.labs;

public class Ball {
    private String color;
    private int size;

    public Ball() {
        color = "green";
        size = 3;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "Ball{" +
                "color='" + color + '\'' +
                ", size=" + size +
                '}';
    }
}
