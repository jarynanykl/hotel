package com.engeto.hotel;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Booking {
    Client mainClient;
    List<Client> otherClients = new ArrayList<>();
    Room room;
    LocalDate begin;
    LocalDate end;
    TypeOfStay type;

    public Booking(Client mainClient, Room room, LocalDate begin, LocalDate end, TypeOfStay type ) {
        this.mainClient = mainClient;
        this.room = room;
        this.begin = begin;
        this.end = end;
        this.type = type;
    }

    public Booking(Client mainClient, Room room) {
        this(mainClient, room, LocalDate.now(), LocalDate.now().plusDays(7), TypeOfStay.HOLIDAY);
    }

    public Client getMainClient() {
        return mainClient;
    }

    public void setMainClient(Client mainClient) {
        this.mainClient = mainClient;
    }

    public TypeOfStay getType() {
        return type;
    }

    public void setType(TypeOfStay type) {
        this.type = type;
    }

    public void addClient(Client newClient) {
        otherClients.add(newClient);
    }

    public void removeClient(Client client) {
        otherClients.remove(client);
    }

    public void clearOtherClients() {
        otherClients.clear();
    }

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    public LocalDate getBegin() {
        return begin;
    }

    public void setBegin(LocalDate begin) {
        this.begin = begin;
    }

    public LocalDate getEnd() {
        return end;
    }

    public void setEnd(LocalDate end) {
        this.end = end;
    }
    //*public boolean getDescription() {
    //*    return getDescription();
    //*}

    public String getDescription() {
        StringBuilder result = new StringBuilder("Rezervace pro " + mainClient.getFullName() + " (" + type +
                ") od " + begin.toString() + " do " + end.toString() + " other guests: ");
        for (Client client : otherClients) {
            result.append(client.getFullName()).append(", ");
        }
        return result.toString();
    }
}