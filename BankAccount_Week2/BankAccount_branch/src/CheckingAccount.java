public class CheckingAccount extends BankAcc {
        
        //Constructs checking account
        public CheckingAccount(int initialBalance) {
                super(initialBalance);
                transactionCount = 0;
        }

        public void deposit(double amount) {
                transactionCount++;
                
                // construct superclass
                super.deposit(amount);
        }

        public void withdraw(double amount) {
                transactionCount++;
                super.withdraw(amount);
        }

        public void deductFees() {
                if (transactionCount > FREE_TRANSACTIONS) {
                        double fees = TRANSACTION_FEE * (transactionCount - FREE_TRANSACTIONS);
                        super.withdraw(fees);
                }
                transactionCount = 0;
        }

        private int transactionCount;

        private static final int FREE_TRANSACTIONS = 3;

        private static final double TRANSACTION_FEE = 2.0;

}



