import javafx.beans.binding.DoubleExpression;

import java.util.Date;

public class Withdraw {
    private double amount;
    private Date date;
    private String account;

    //constructor
    Withdraw(double amount, Date date, String account){
        this.amount = amount;
        this.date = date;
        this.account = account;
    }

    //Requires: call from withdraw in customer class
    //Effects: prints bank statement based on withdrawal method in customer class
    public String toString(){
        //your code here
        //System.out.println("Withdraw: $" + amount + " Date: " + date + " into account: " + account);
        System.out.println();
        return ("Withdrawal of: $" + amount + " Date: " + date + " from account: " + account);
    }
}
