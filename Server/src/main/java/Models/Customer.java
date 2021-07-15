package Models;

public class Customer {

    private Long id;
    private String name;
    private int numberOfVisits;
    private Booking booking;

    public Customer(String name, int numberOfVisits, Booking booking){
        this.name = name;
        this.numberOfVisits = numberOfVisits;
        this.booking = booking;
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

    public int getNumberOfVisits() {
        return numberOfVisits;
    }

    public void setNumberOfVisits(int numberOfVisits) {
        this.numberOfVisits = numberOfVisits;
    }

    public Booking getBooking() {
        return booking;
    }

    public void setBooking(Booking booking) {
        this.booking = booking;
    }
}
