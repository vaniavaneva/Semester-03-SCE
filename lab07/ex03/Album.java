package lab07.ex03;

import lab07.ex03.OutOfStockException;

public class Album {
    private String albumName;
    private String artist;
    private int releaseYear;
    private int totalTracks;
    private int pricePerAlbum;
    
    public Album(String albumName, String artist, int releaseYear, int totalTracks, int pricePerAlbum){
        this.albumName = albumName;
        this.artist = artist;
        this.releaseYear = releaseYear;
        this.totalTracks = totalTracks;
        this.pricePerAlbum = pricePerAlbum;
    }

    public boolean buyAlbum(int num) throws OutOfStockException{
       if (totalTracks >= num) {
        totalTracks -= num;
        return true;
        } 
        else {
            throw new OutOfStockException("Not enough copies in stock!");
        }
    }
}
