import Interfaces.Submersible;

public class BankAccount implements Submersible{

    private String name;
    private double balance;
    private long accountNumber;
    private long routingNumber;
    private String productType;

    //getters and setters
    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public long getRoutingNumber() {
        return routingNumber;
    }
    public void setRoutingNumber(int routingNumber) {
        this.routingNumber = routingNumber;
    }

    public String getProductType() {
        return productType;
    }

    public void setProductType(String productType) {
        this.productType = productType;
    }


    public String getName() {
        return name;
    }

    //constructor
    public BankAccount(String name, double balance, long accountNumber, long routingNumber, String productType) {
        this.name = name;
        this.balance = balance;
        this.accountNumber = accountNumber;
        this.routingNumber = routingNumber;
        this.productType = productType;
    }
    //no parameter constructor ..to be used if no parent constructor is specified in the child class constructor
    public BankAccount (){

    }

    public void setName(String name) {
        this.name = name;
    }


    //toString() method
    @Override
    public String toString() {
        return "BankAccount{" +
                "name='" + name + '\'' +
                ", balance=" + balance +
                ", accountNumber='" + accountNumber + '\'' +
                ", routingNumber='" + routingNumber + '\'' +
                ", productType='" + productType + '\'' +
                '}';
    }

    //withdraw Money method
    public double withdrawMoney (double amount){
        if(amount < balance){
            balance -= amount;}
        else {
            System.out.println("Not enough money");
        }
        return balance;
    }

    //deposit  method
    public double makeDeposit (double amount){
        balance += amount;
        return balance;
    }

    public void makeTransfer (BankAccount toAccount, double transferAmount){
        this.withdrawMoney(transferAmount);
        toAccount.makeDeposit(transferAmount);
    }

    //view account balance
    public void viewBalance(){
        System.out.println("Your account balance is " +balance);;
    }


    public static void main(String[] args) {
        //instantiating 3 bank accounts

        BankAccount checking = new BankAccount("Victoria",5000,5954520148l,225812526,"Checking");
        BankAccount savings = new BankAccount("Victoria",7000,2354520148l,239845815,"Savings");
        BankAccount deposit = new BankAccount("Victoria",10000,2354520148l,258212586,"Savings");

        System.out.println(checking);
        System.out.println(savings);
        System.out.println(deposit);

        System.out.println("Checking balance after withdrawal: " + checking.withdrawMoney(150));
        System.out.println("Checking balance after deposit: " + checking.makeDeposit(140.50));
        System.out.println("Savings balance after withdrawal:" + savings.withdrawMoney(9000));
        //System.out.println("Savings balance after deposit: " + savings.makeDeposit(760.40));

        if(checking.getBalance() > savings.getBalance()){

            System.out.println("Checking account has the larger balance");
        }
        else {
            System.out.println("Savings account has the larger balance");
        }
        deposit.makeTransfer(savings,5000);
        System.out.println(savings.getBalance());
        System.out.println(deposit.getBalance());

       // System.out.println("Bank Account Checking has a balance of $", );

        System.out.println(checking.dive(3));
        System.out.println(checking.dive(3));
    }

    @Override
    public double dive(int depth) {
        return -500;
    }

    @Override
    public double surface(int depth) {
        return 0;
    }

    @Override
    public double sink() {
        return -200;
    }
}
