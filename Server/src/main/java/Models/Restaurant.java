package Models;

import java.util.ArrayList;

public class Restaurant {

    private Long id;
    private String name;
    private ArrayList<Booking> bookings;
    private ArrayList<Table> tables;

    public Restaurant(String name) {
        this.name = name;
        this.bookings = new ArrayList<>();
        this.tables = new ArrayList<>();
    }

    public Long getId() {
        return id;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Booking> getBookings() {
        return bookings;
    }

    public void setBookings(ArrayList<Booking> bookings) {
        this.bookings = bookings;
    }

    public ArrayList<Table> getTables() {
        return tables;
    }

    public void setTables(ArrayList<Table> tables) {
        this.tables = tables;
    }
}
