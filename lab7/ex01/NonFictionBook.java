package lab7.ex01;

public class NonFictionBook extends Book{
    private String subject;
    
    public NonFictionBook(String title, String author, int releaseYear, int totalCopies, double pricePerCopy, String subject){
        super(title, author, releaseYear, totalCopies, pricePerCopy);
        this.subject = subject;
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
