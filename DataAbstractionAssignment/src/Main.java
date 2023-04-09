import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Customer panda = new Customer("panda", 123, 200.00, 1250.00);
        Customer raptor = new Customer("raptor", 246, 200.00, 1250.00);



        Date dt = new Date();
        //System.out.println("eleanor");
        panda.deposit(8000.00, dt, "Checking");
        panda.withdraw(100.00, dt, "Checking");
        panda.deposit(800.00, dt, "Checking");
        panda.displayDeposits();
        panda.displayWithdraws();

        raptor.deposit(88.00, dt, "Saving");
        raptor.withdraw(100.00, dt, "Saving");
        raptor.displayDeposits();
        raptor.displayWithdraws();
        //panda.displayWithdraws();



    }
}