package lab07.ex04;

public class ClassicArt extends Exhibition{
    private String eraRepresented;

    public ClassicArt(String title, String artist, String startDate, int totalArtworks, int ticketPrice, String eraRepresented){
        super(title, artist, startDate, totalArtworks, ticketPrice);
        this.eraRepresented = eraRepresented;
    }
}