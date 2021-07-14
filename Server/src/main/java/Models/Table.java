package Models;

public class Table {

    private Long id;
    private int capacity;
    private int tableNumber;
    private boolean availability;

    public Table(int capacity, int tableNumber, boolean availability) {
        this.capacity = capacity;
        this.tableNumber = tableNumber;
        this.availability = availability;
    }

    public Long getId() {
        return id;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getTableNumber() {
        return tableNumber;
    }

    public void setTableNumber(int tableNumber) {
        this.tableNumber = tableNumber;
    }

    public boolean isAvailability() {
        return availability;
    }

    public void setAvailability(boolean availability) {
        this.availability = availability;
    }


}
