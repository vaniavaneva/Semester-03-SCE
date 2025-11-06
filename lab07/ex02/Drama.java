package lab07.ex02;

public class Drama extends Performance{
    private String mainActor;
    
    public Drama(String title, String director, String date, int totalSeats, int pricePerSeats, String mainActor){
        super(title, director, date, totalSeats, pricePerSeats);
        this.mainActor = mainActor;
    }
}
