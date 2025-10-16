package lab7.ex04;

public interface Purchasable {
    boolean purchase(int num) throws SoldOutException;
}
