public class DataSetTest {
    public static void main(String[] args) {
        DataSet bankData = new DataSet();

        bankData.add(new BankAcc(0));
        bankData.add(new BankAcc(10000));
        bankData.add(new BankAcc(2000));

        System.out.println("Average balance = " + bankData.getAverage());
        Measurable max = bankData.getMaximum();
        System.out.println("Highest balance = " + max.getMeasure());
    }

}