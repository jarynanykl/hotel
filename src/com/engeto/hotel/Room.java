package com.engeto.hotel;

public class Room {
    int numberOfRoom;
    int numberOfBed;
    boolean hasTerrace;
    boolean hasViewOfTheSea;
    int priceOfNight;

    public Room(int numberOfRoom, int numberOfBed, boolean hasTerrace, boolean hasViewOfTheSea, int priceOfNight) {
        this.numberOfRoom = numberOfRoom;
        this.numberOfBed = numberOfBed;
        this.hasTerrace = hasTerrace;
        this.hasViewOfTheSea = hasViewOfTheSea;
        this.priceOfNight = priceOfNight;
    }

    public int getnumberOfRoom() {
        return numberOfRoom;
    }

    public void setNumberOfRoom(int numberOfRoom) {
        this.numberOfRoom = numberOfRoom;
    }

    public int getNumberOfBed() {
        return numberOfBed;
    }

    public void setNumberOfBed(int numberOfBed) {
        this.numberOfBed = numberOfBed;
    }

    public boolean isHasTerrace() {
        return hasTerrace;
    }

    public void setHasTerrace(boolean hasTerrace) {
        this.hasTerrace = hasTerrace;
    }

    public boolean isHasViewOfTheSea() {
        return hasViewOfTheSea;
    }

    public void setHasViewOfTheSea(boolean hasViewOfTheSea) {
        this.hasViewOfTheSea = hasViewOfTheSea;
    }

    public int getPriceOfNight() {
        return priceOfNight;
    }

    public void setPriceOfNight(int priceOfNight) {
        this.priceOfNight = priceOfNight;
    }

    public String getDescription() {
        return "Pokoj číslo "+numberOfRoom+" má postelí "+numberOfBed+", balkon "+hasTerrace+
                ", výhled na moře "+hasViewOfTheSea+", cena "+priceOfNight+" Kč/noc.";
    }
}
