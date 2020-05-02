package labs_examples.exception_handling.labs;

public class FullFlightException extends Exception{
    @Override
    public String toString() {
        return "This flight is full.";
    }
}
