public class BankAcc implements Measurable  {
    //construts BankAccount with Zero balance
    public BankAcc() {

        balance = 0;

    }
    //Constructs bank account with given balance. initial balance
    public BankAcc(double initialBalance) {

        balance = initialBalance;

    }
    // Deposits money into the bank account.
    public void deposit(double amount) {

        balance = balance + amount;

    }
    //Withdraws money from bank account.
    public void withdraw(double amount) {

        balance = balance - amount;

    }
    //Gets current balance of bank account.
    public double getBalance() {

        return balance;

    }
    //Transfers money from bank account to another account
    public void transfer(BankAcc other, double amount) {

        withdraw(amount);

        other.deposit(amount);

    }

    private double balance;

    @Override
    public double getMeasure() {
        return 0;
    }
}
