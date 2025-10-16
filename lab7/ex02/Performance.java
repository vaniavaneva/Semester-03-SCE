package lab7.ex02;

public class Performance implements Ticketable{
    private String title;
    private String director;
    private String date;
    private int totalSeats;
    private int pricePerSeats;
    
    public Performance(String title, String director, String date, int totalSeats, int pricePerSeats){
        this.title = title;
        this.director = director;
        this.date = date;
        this.totalSeats = totalSeats;
        this.pricePerSeats = pricePerSeats;
    }

    @Override
    public boolean book(int num) throws NoMoreSeatsException{
       if (totalSeats >= num) {
        totalSeats -= num;
        return true;
        } 
        else {
            throw new NoMoreSeatsException("Not enough copies in stock!");
        }
    }
}
