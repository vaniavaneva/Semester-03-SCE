package lab7.ex01;

public abstract class Book {
    private String title;
    private String author;
    private int releaseYear;
    protected int totalCopies;
    private int pricePerCopy;
    
    public Book(String title, String author, int releaseYear, int totalCopies, int pricePerCopy){
        this.title = title;
        this.author = author;
        this.releaseYear = releaseYear;
        this.totalCopies = totalCopies;
        this.pricePerCopy = pricePerCopy;
    }
    
    public abstract boolean sellBook(int num) throws OutOfStockException;
        /* try{
            return num;
        }
        catch(OutOfStockException ex){
            return ex;
        } */
}