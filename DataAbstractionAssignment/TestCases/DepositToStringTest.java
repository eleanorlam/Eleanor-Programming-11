import org.junit.Before;
import org.junit.Test;

import java.util.Date;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

public class DepositToStringTest {
    Deposit testDeposit;
    Date dt = new Date();

    @Before
    public void setUp(){
        testDeposit = new Deposit(10, dt, "Checking");
    }

    @Test
    public void testToString(){
       //check if string printed matches
        assertEquals(testDeposit.toString(), ("Deposit of: $10.0 Date: " + dt + " into account: Checking"));
    }


}
