public class BankAcc {

    public BankAcc() {

        balance = 0;

    }
    public BankAcc(double initialBalance) {

        balance = initialBalance;

    }

    public void deposit(double amount) {

        balance = balance + amount;

    }

    public void withdraw(double amount) {

        balance = balance - amount;

    }

    public double getBalance() {

        return balance;

    }

    public void transfer(BankAcc other, double amount) {

        withdraw(amount);

        other.deposit(amount);

    }

    private double balance;

}
