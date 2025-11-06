package lab07.ex02;

public interface Ticketable {
    boolean book(int num) throws NoMoreSeatsException;
}
