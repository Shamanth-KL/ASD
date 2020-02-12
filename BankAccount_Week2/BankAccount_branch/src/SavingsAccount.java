public class SavingsAccount extends BankAcc {
    public SavingsAccount(double rate){
        interestRate = rate;
    }
    
     //Constructs bank account with given balance and interest rate
	public SavingsAccount(double initialBalance, double rate) {
		super(initialBalance);
		interestRate = rate;
	}

    public void addInterest(){
        double interest = getBalance() * interestRate / 100;
        deposit(interest);
    }
    
    public String toString(){
		return "type SavingsAccount – balance £" + this.getBalance();
	}


    private double interestRate;
}


