package ModelTests;

import Models.Table;
import org.junit.Before;
import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.Assert.assertEquals;

@SpringBootTest
public class TableTest {

    Table table;

    @Before
    public void before(){
        table = new Table(4, 1, true);
    }

    @Test
    public void tableHasCapacity(){
        assertEquals(4, table.getCapacity());
    }

    @Test
    public void tableHasNumber(){
        assertEquals(1, table.getTableNumber());
    }

    @Test
    public void tableIsAvailable(){
        assertEquals(true, table.isAvailable());
    }



}
