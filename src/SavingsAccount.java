public class SavingsAccount extends BankAccount {

    public float interestRate;

    public float getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(float interestRate) {
        this.interestRate = interestRate;
    }

    //constructor
    public SavingsAccount(String name, double balance, long accountNumber, long routingNumber, String productType, float interestRate) {
        super(name, balance, accountNumber, routingNumber, productType);
        this.interestRate = interestRate;
    }

    public SavingsAccount (float interestRate){
        this.interestRate = interestRate;
    }

    @Override
    public String toString() {
        return "SavingsAccount{" +
                "interestRate=" + interestRate +
                '}';
    }
    public void printFeatures(){
        super.toString();
        System.out.println("Savings Account: Interest rate is " + interestRate);
    }
    public static void main(String[] args) {
        SavingsAccount savings = new SavingsAccount(0.03f);
        BankAccount deposit;
        deposit = new SavingsAccount(0.02f);

        System.out.println(deposit);
        deposit.getBalance();

        System.out.println(savings);
        savings.printFeatures();


    }
}
