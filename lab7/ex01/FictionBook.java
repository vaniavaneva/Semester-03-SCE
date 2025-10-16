package lab7.ex01;

public class FictionBook extends Book{
    private String genre;
    
    public FictionBook(String title, String author, int releaseYear, int totalCopies, int pricePerCopy, String genre){
        super(title, author, releaseYear, totalCopies, pricePerCopy);
        this.genre = genre;
    }

    @Override
    public boolean sellBook(int num) throws OutOfStockException{
        if (totalCopies >= num) {
        totalCopies -= num;
        return true;
        } 
        else {
            throw new OutOfStockException("Not enough copies in stock!");
        }
    }
}
