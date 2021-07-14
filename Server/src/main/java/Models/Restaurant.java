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
}
