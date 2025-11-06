package lab07.ex01;

public class OutOfStockException extends Exception {
    public OutOfStockException(String message) {
        super(message);
    }
}