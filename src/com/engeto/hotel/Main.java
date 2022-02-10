package com.engeto.hotel;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        Client adela = new Client("Adéla", "Malíková", LocalDate.of(1993, 3, 13));
        Client jan = new Client("Jan", "Dvořáček", LocalDate.of(1995, 5, 5));
        System.out.println(adela.getDescription());
        System.out.println(jan.getDescription());

        Room room1 = new Room(1, 1, true, true, 1000);
        Room room2 = new Room(2, 1, true, true, 1000);
        Room room3 = new Room(3, 3, false, true, 2400);
        System.out.println(room1.getDescription());
        System.out.println(room2.getDescription());
        System.out.println(room3.getDescription());

        Bookings bookings = new Bookings();
        Booking booking = new Booking(adela, room1, LocalDate.of(2021, 7, 19),
                LocalDate.of(2021, 7, 26), TypeOfStay.HOLIDAY);
        bookings.addBooking(booking);
        booking = new Booking(adela, room3,
                LocalDate.of(2021, 9, 1), LocalDate.of(2021, 9, 14),
                TypeOfStay.WORKING);
        System.out.println(bookings);
        booking.addClient(jan);
        bookings.addBooking(booking);
        bookings.printBookings();
    }
}