package Models;

public class Booking {

    private Long id;
    private String time;
    private String date;
    private Table table;
    private int numberOfCustomers;

    public Booking(String time, String date, Table table, int numberOfCustomers) {
        this.time = time;
        this.date = date;
        this.table = table;
        this.numberOfCustomers = numberOfCustomers;
    }

    public Long getId() {
        return id;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Table getTable() {
        return table;
    }

    public void setTable(Table table) {
        this.table = table;
    }

    public int getNumberOfCustomers() {
        return numberOfCustomers;
    }

    public void setNumberOfCustomers(int numberOfCustomers) {
        this.numberOfCustomers = numberOfCustomers;
    }
}
