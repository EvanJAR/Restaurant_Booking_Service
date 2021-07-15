package ModelTests;

import Models.Booking;
import Models.Restaurant;
import Models.Table;
import org.junit.Before;
import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.Assert.assertEquals;

@SpringBootTest
public class RestaurantTest {

    Restaurant restaurant;
    Booking booking1;
    Table table;


    @Before
    public void before(){
        restaurant = new Restaurant("Room in the Elephant");
        table = new Table(4, 1, true);
        booking1 = new Booking("14:45", "10-01-21", table, 4);
    }

    @Test
    public void hasName(){
        assertEquals("Room in the Elephant", restaurant.getName());
    }

    @Test
    public void bookingsStartsEmpty(){
        assertEquals(0, restaurant.getBookings().size());
    }

    @Test
    public void canAddBooking(){
        restaurant.addBooking(booking1);
        assertEquals(1, restaurant.getBookings().size());
    }

    @Test
    public void canChangeBookingDetails(){
        assertEquals("10-01-21", booking1.getDate());
        assertEquals(table, booking1.getTable());
        assertEquals("14:45", booking1.getTime());
        assertEquals(4, booking1.getNumberOfCustomers());
        restaurant.changeBookingDetails(booking1, "14:15", "10-01-21", table, 3);
        assertEquals("10-01-21", booking1.getDate());
        assertEquals(table, booking1.getTable());
        assertEquals("14:15", booking1.getTime());
        assertEquals(3, booking1.getNumberOfCustomers());
    }
}
