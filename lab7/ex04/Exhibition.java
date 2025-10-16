package lab7.ex04;

import lab7.ex03.OutOfStockException;

public class Exhibition implements Purchasable{
    private String title;
    private String artist;
    private String startDate;
    private int totalArtworks;
    private int ticketPrice;

    public Exhibition(String title, String artist, String startDate, int totalArtworks, int ticketPrice){
        this.title = title;
        this.artist = artist;
        this.startDate = startDate;
        this.totalArtworks = totalArtworks;
        this.ticketPrice = ticketPrice;
    }

    @Override
    public boolean purchase(int num) throws SoldOutException{
        if (totalArtworks >= num) {
        totalArtworks -= num;
        return true;
        } 
        else {
            throw new SoldOutException("Not enough copies in stock!");
        }
    }
}
