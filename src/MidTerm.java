import java.util.Scanner;

/*
 * Write a Java application that includes the following functions:

 (0 points) getString. This method has been provided below
 1 Parameter: String prompt. A message to be printed to the console telling the user what to enter.
 Return type: String - contains the user's response.
 (25 points) getInt
 2 Parameters:
 String prompt: A message to be printed to the console telling the user what to enter.
 int maxValue: user response must be greater than 0 and less than or equal to maxValue.
 Logic:
 getInt should use getString
 Convert the string to an int.
 If the user entered a bad string for a number ("abc") catch the NumberFormatException exception, display an error and request a new value.
 If user response is greater that maxValue or less than or equal to 0 print the prompt again and request a new value
 Stay in the method until the users enters a proper number. (Sounds like some kind of loop to me)
 Return type: int - contains the user's response converted to a number.
 (25 points) in main
 Call getInt. You will need to pass in a prompt "Enter menu option: " and the max value to be entered by the user, 6.
 Assign the return value to an integer named menuOption and
 Switch on the number entered
 if response is 1 - print "You're #1!"
 if response is 2 or 3 create for loop to loop menuOption number of times and print "Yippee! I'm in a loop " + the loop index.
 if response is 4 or 5 just print the value of menuOption
 Loop until the user enters a 6 then exit.

 */

public class MidTerm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int menuOption;

        do {
            menuOption = getInt(sc, "Enter a number between greater than 0. Max Value is 6:",6);

        switch (menuOption) {
            case 1:
                System.out.println("You're #1!");
                break;
            case 2:
            case 3:
                for (int i = 0; i < menuOption; i++) {
                    System.out.println("Yippee! I'm in a loop " + i);
                }
                break;
            case 4:
            case 5:
                  System.out.println(menuOption); break;
            case 6:
                  return;
        }
        } while (menuOption != 6 );
    }
public static Integer getInt(Scanner sc, String prompt,int maxValue) {
    int num = 0;
    do{
    String data = getString(sc, prompt);
        try {
            num = Integer.parseInt(data);
        }
        catch (NumberFormatException e) {
            System.err.println( e.getMessage() + " Invalid entry, pls enter a new Value");
        }
        finally {
                if (num > maxValue){
                System.out.println("Number not in range, pls enter a new value.");
            }
        }
    }   while (num <= 0 || num > maxValue) ;
    return num;
}

    public static String getString(Scanner sc, String prompt){
        System.out.println(prompt);
        String data = sc.nextLine();
        return data;
    }
}
