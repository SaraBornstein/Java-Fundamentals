package labs_examples.multi_threading.labs;

public class ExtendingThreadExample extends Thread {
    public static void main(String[] args) {
        ExtendingThreadExample aThread = new ExtendingThreadExample();
    }

    ExtendingThreadExample(){
        super();
        start();
    }

    @Override
    public void run() {
        System.out.println("Do Something Here.");
    }
}
