import java.util.Scanner;

public class AsciiValues {

    public int charToValue (String letter){
        int asciiValue = 128;
    switch (letter){
        case "A": asciiValue = 65; break;
        case "B": asciiValue = 66; break;
        case "C": asciiValue = 67; break;
        case "D": asciiValue = 68; break;
        case "E": asciiValue = 69; break;
        case "F": asciiValue = 70; break;

        case "a": asciiValue = 97; break;
        case "b": asciiValue = 98; break;
        case "c": asciiValue = 99; break;
        case "d": asciiValue = 100; break;
        case "e": asciiValue = 101; break;
        case "f": asciiValue = 102; break;
      }
        return asciiValue;
    }

    public static void main(String[] args) {
        int num = 0;
        AsciiValues val = new AsciiValues();
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Enter a lowercase or uppercase letter between A and F \n");
            String letter = sc.nextLine();
            num = val.charToValue(letter);
            if(num == 128){
                System.out.printf("You entered an invalid letter\n");
            }
            else{
                System.out.println("ASCII Dec Value: " +num);
            }
            if(letter.equals("")){
                System.out.printf("Good bye!");
                return;
            }
        }
    }
}
