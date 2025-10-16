package lab7.ex02;

public class Comedy extends Performance{
    private String leadComedian;
    
    public Comedy(String title, String director, String date, int totalSeats, int pricePerSeats, String leadComedian){
        super(title, director, date, totalSeats, pricePerSeats);
        this.leadComedian = leadComedian;
    }
}
