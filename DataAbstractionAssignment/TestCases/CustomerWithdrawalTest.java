import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Date;

import static org.junit.Assert.assertEquals;

public class CustomerWithdrawalTest {
    Customer test;
    Date dt = new Date();
    ArrayList<Withdraw> withdraws;

    @Before
    public void setUp(){
        test = new Customer("Jack", 123, 15.0, 30.0);
        withdraws = new ArrayList<>();
    }

    @Test
    public void checkWithdraw(){
        //no overdraft
        assertEquals(test.withdraw(10.0, dt, "Checking"), 5.0, 0);
        //assertEquals();
    }

    @Test
    public void checkOverdraft(){
        assertEquals(test.withdraw(2500.0, dt, "Checking"), 15.0, 0);
    }

}
