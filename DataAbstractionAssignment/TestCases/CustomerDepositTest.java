import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Date;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class CustomerDepositTest {
    Customer test;
    Date dt = new Date();
    ArrayList<Deposit> deposits;

    @Before
    public void setUp(){
        test = new Customer("Jack", 123, 15.0, 30.0);
        deposits = new ArrayList<>();
    }

    @Test
    public void checkDeposit(){
        ////double dep = test.deposit(10.0, dt, "Checking");
        //Deposit dep = new Deposit(amt, date, account)
        //assertEquals(deposits.size(), 1);
        //assertTrue(deposits.contains(10.0));
        assertEquals(test.deposit(10.0, dt, "Checking"), 25.0, 0);
        //assertEquals();
    }

    @Test
    public void checkAccountBalance(){
        //assertEquals(test.getCheckBalance(), 25.0, 0);
        assertEquals(test.getSavingBalance(), 30.0, 0);
    }
}
