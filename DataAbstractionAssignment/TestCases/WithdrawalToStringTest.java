import org.junit.Before;
import org.junit.Test;

import java.util.Date;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

public class WithdrawalToStringTest {
    Withdraw testWithdrawal;
    Date dt = new Date();

    @Before
    public void setUp() {
        testWithdrawal = new Withdraw(10, dt, "Checking");
    }

    @Test
    public void testToString() {
        //check if string printed matches
        assertEquals(testWithdrawal.toString(), ("Withdrawal of: $10.0 Date: " + dt + " from account: Checking"));
    }
}
