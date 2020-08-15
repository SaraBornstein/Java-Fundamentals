package labs_examples.datastructures.queue.labs;

public class QueueEmptyException extends Exception{
    public QueueEmptyException(String queue_is_empty) {
    }

    @Override
    public String toString() {
        return "QueueEmptyException{ Queue is empty }";
    }
}
