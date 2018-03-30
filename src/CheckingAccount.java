public class CheckingAccount extends BankAccount {

    public float minBal;



    public float getMinBal() {
        return minBal;
    }

    public void setMinBal(float minBal) {
        this.minBal = minBal;
    }

//constructor
    public CheckingAccount(String name, double balance, long accountNumber, long routingNumber, String productType, float minBal) {
        super(name, balance, accountNumber, routingNumber, productType); //this super class constructor is used instead of the no name constructor in the parent class
        this.minBal = minBal;
    }

    public CheckingAccount(float minBal) {
       this.minBal = minBal;
    }

    @Override
    public String toString() {
        return "CheckingAccount{" +
                "minBal=" + minBal +
                '}';
    }
    public void printFeatures(){
        String str = super.toString();
        System.out.println( str + " \n Checking Account: Minimum balance rate is " + minBal);
    }
    public static void main(String[] args) {
        CheckingAccount checking = new CheckingAccount(3000);
        CheckingAccount checking2 = new CheckingAccount(2500);
        System.out.println(checking);
        System.out.println(checking2);

       // checking.printFeatures() ;
        System.out.println("\n");

        BankAccount deposit = checking;
        System.out.println(deposit);
        BankAccount deposit2 = checking2;
        System.out.println(deposit2);
        deposit.viewBalance();

        BankAccount deposit3 = new CheckingAccount(1000);

        //calling interface methods
        System.out.println(checking.dive(3));
        System.out.println(deposit.surface(2));


    }
}
