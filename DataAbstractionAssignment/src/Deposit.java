import java.util.Date;

public class Deposit {
    private double amount;
    private Date date;
    private String account;

    // account balance
    //private double balance;
    Deposit(double amount, Date date, String account){
        this.amount = amount;
        this.date = date;
        this.account = account;
    }

    //Requires: call from deposit
    //Effects: prints bank statement based on deposit method in customer class
    public String toString(){
        //your code here
        //double choice = 0.0;
       /*** if (account.equals(Customer.CHECKING)){
            balance = Customer.getCheckBalance();
        } else if (account.equals(Customer.SAVING)){
            balance = Customer.getSavingBalance();
        }***/
        System.out.println();
        return ("Deposit of: $" + amount + " Date: " + date + " into account: " + account);
    }
}
