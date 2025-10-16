package lab7.ex04;

public class ModernArt extends Exhibition{
    private String mainTheme;

    public ModernArt(String title, String artist, String startDate, int totalArtworks, int ticketPrice, String mainTheme){
        super(title, artist, startDate, totalArtworks, ticketPrice);
        this.mainTheme = mainTheme;
    }
}
