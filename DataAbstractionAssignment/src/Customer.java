import java.util.ArrayList;
import java.util.Date;

public class Customer {
    private int accountNumber;
    private ArrayList<Deposit> deposits;
    private ArrayList<Withdraw> withdraws;
    private double checkBalance;
    private double savingBalance;
    private double savingRate;
    private String name;
    public static final String CHECKING = "Checking";
    public static final String SAVING = "Saving";
    private final int OVERDRAFT = -100;

    Customer(){
        //create default constructor
        name = "Eleanor";
        checkBalance = 87.9;
        savingBalance = 87.2;
        savingRate = 11.1;
        accountNumber = 123;
    }
    Customer(String name, int accountNumber, double checkDeposit, double savingDeposit){
        //constructor code here
        this.name = name;
        this.accountNumber = accountNumber;
        deposits = new ArrayList<>();
        withdraws = new ArrayList<>();
        this.checkBalance = checkDeposit;
        this.savingBalance = savingDeposit;
    }
   public double accountBalance;

    //Requires: double amt deposit, date object, string account name
    //Modifies: this
    //Effects: puts amt into specified account, calls to string
    public double deposit(double amt, Date date, String account){
        //your code here
        //account choice's balance returned
        if (account.equals(CHECKING)){
            checkBalance += amt;
            accountBalance = checkBalance;
        } else if (account.equals(SAVING)){
            savingBalance += amt;
            accountBalance = savingBalance;
        }
        // Instantiate and add new deposit object to the list of deposits
        Deposit dep = new Deposit(amt, date, account);
        deposits.add(dep);
        System.out.println("Deposit of: $" + amt + " Date: " + date + " into account: " + account +
                " Current Balance in " + account + " is $" + accountBalance);
        //System.out.println(accountChoice);
        return accountBalance;
    }

    //requires: double, amt, date object, string account name
    //modifies: this
    //effects: checks if overdraft in account, then withdraws amt from the account states
    public double withdraw(double amt, Date date, String account){
        //your code her
        if (checkOverdraft(amt, account)){
            System.out.println("Error: your " + account + " account is in overdraft" );
            if (account.equals(CHECKING)){
                accountBalance = checkBalance;
            } else if (account.equals(SAVING)){
                accountBalance = savingBalance;
            }
        } else {
           // System.out.println("account balance before " + accountBalance);
            if (account.equals(CHECKING)){
                checkBalance -= amt;
                accountBalance = checkBalance;
            } else if (account.equals(SAVING)){
                savingBalance -= amt;
                accountBalance = savingBalance;
            }
            // Instantiate and add new withdraw object to the list of withdraws
            Withdraw wd = new Withdraw(amt, date, account);
            withdraws.add(wd);
        }
        //System.out.println("acct balance after" + accountBalance);
        System.out.println("Withdrawal of: $" + amt + " Date: " + date + " from account: " + account +
                " Current Balance in " + account + " is $" + accountBalance);
        return accountBalance;
    }

    //Requires: double amt from withdrawal, string account name
    //Effects: returns true if account true in overdraft, else return false
    private boolean checkOverdraft(double amt, String account){
        //your code here
        boolean checkOd = false;
        if (account.equals(CHECKING)){
            if (checkBalance - amt <= OVERDRAFT){
                checkOd = true;
            }
        } else if (account.equals(SAVING)){
            if (savingBalance - amt <= OVERDRAFT){
                checkOd = true;
            }
        }
        return checkOd;
    }

    // getter method for savingBalance
    //Effects: returns balance of saving account
    public double getSavingBalance(){
        return savingBalance;
    }

    // getter method for checkBalance
    // Effects: returns balance of checking account
    public double getCheckBalance(){
        return checkBalance;
    }



    //do not modify
    public void displayDeposits(){
        for(Deposit d : deposits){
            System.out.println(d);
        }
    }
    //do not modify
    public void displayWithdraws(){
        for(Withdraw w : withdraws){
            System.out.println(w);
        }
    }

}
