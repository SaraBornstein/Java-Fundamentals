package labs_examples.multi_threading.labs;

public class ImplementingRunnableExample implements Runnable {
    public static void main(String[] args) {
        ImplementingRunnableExample example1 = new ImplementingRunnableExample("Thread 1");
        new Thread(new ImplementingRunnableExample(), "Thread 2").start();

    }

    Thread thread;

    public ImplementingRunnableExample() {
    }

    public ImplementingRunnableExample(String name) {
        thread = new Thread(this, name);
        thread.start();
    }

    @Override
    public void run() {
        System.out.print(Thread.currentThread().getName() + ": ");
        for(int i = 0; i < 10; i++){
            System.out.print(i + ",");
        }
        System.out.println("\n");
    }
}
