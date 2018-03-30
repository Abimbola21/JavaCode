import java.util.ArrayList;
import java.util.Scanner;

public class ATM {

    public static void main(String[] args) {
        String account;
        float checkingBalance, savingsBalance, amountToWithdraw;
        Scanner sc = new Scanner(System.in);
        System.out.println("Select an option");
        while (true) {
            System.out.println("\n 1 withdraw  2 deposit 3 cancel");
            String option = sc.nextLine();
            switch (option.toLowerCase()) {
                case "1":
                case "withdraw":
                    System.out.print("Select an account to withdraw from: ");
                    System.out.println("\n 1 checking  2 savings");
                    account = sc.nextLine();
                    switch (account) {
                        case "1":
                        case "checking":

                    }

            }
        }
    }
}