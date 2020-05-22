package labs_examples.multi_threading.labs;
/*
 * Multithreading Exercise 6:
Write a program that will print 1-100 sequentially from at least two distinct threads. For instance, thread1 will
print "1", then thread2 will print "2", then thread1 will print "3", then thread2 will print "4" and so on.
 */
class OneToAHundred implements Runnable{

    private int max;
    private boolean isEven;
    private Worker worker;

    //constructor
    public OneToAHundred(int max, boolean isEven, Worker worker) {
        this.max = max;
        this.isEven = isEven;
        this.worker = worker;
    }

    @Override
    public void run() {
        int number = isEven ? 2 : 1; //true = 2, false = 1
        while(number <= max){
            if(isEven){
                worker.printEven(number);
            }else{
                worker.printOdd(number);
            }
            number+=2;
        }
    }
}

class Worker{

    private volatile boolean isOdd; //volatile is visible across threads

    synchronized void printEven(int number){
        while(!isOdd){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(number + " " + Thread.currentThread().getName());
        isOdd = false;
        notify();
    }

    synchronized void printOdd(int number){
        while(isOdd){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(number + " " + Thread.currentThread().getName());
        isOdd = true;
        notify();
    }
}

class Example {
    public static void main(String[] args) {
        Worker worker = new Worker();

        Thread thread1 = new Thread(new OneToAHundred(100, false, worker), "Thread 1");
        Thread thread2 = new Thread(new OneToAHundred(100, true, worker), "Thread 2");
        thread1.start();
        thread2.start();
    }
}