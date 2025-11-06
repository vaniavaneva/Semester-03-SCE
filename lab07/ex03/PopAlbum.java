package lab07.ex03;

public class PopAlbum extends Album {
    private String bandName;
    
    public PopAlbum(String albumName, String artist, int releaseYear, int totalTracks, int pricePerAlbum, String bandName){
        super(albumName, artist, releaseYear, totalTracks, pricePerAlbum);
        this.bandName = bandName;
    }
}
