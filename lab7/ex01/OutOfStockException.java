package lab7.ex01;

public class OutOfStockException extends Exception {
    public OutOfStockException(String message) {
        super(message);
    }
}