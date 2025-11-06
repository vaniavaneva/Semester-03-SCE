package lab07.ex03;

public class RockAlbum extends Album {
    private String producer;
    
    public RockAlbum(String albumName, String artist, int releaseYear, int totalTracks, int pricePerAlbum, String producer){
        super(albumName, artist, releaseYear, totalTracks, pricePerAlbum);
        this.producer = producer;
    }
}
