public class Arrays {

    public static void main(String[] args) {

        String [] students = {"Tim", "Anthony","Bryan","Victoria"};
        int[] array = new int [20]  ;
        array[4] = 5;
        array[9] = 10;
        array[14] = 15;
        array[19] = 20;

        double [] prices = new double[30];
        prices[0] = 99.99 ;
        prices[prices.length - 1] = 99.99;

        System.out.println("Length of Students array is " + students.length);

        students[0] = "Brandon";
        students[students.length - 2] = "John";
        System.out.println("Name of last student is " + students[students.length - 1]);

        int arraySize = (int)(Math.random() * 50) + 10;

        int[] myRandom;
        myRandom = new int [arraySize];
        for (int i = 0; i < myRandom.length; i++) {

            myRandom[i] = (int)(Math.random() * 100) + 5;

        }
        System.out.printf("Length of array is " +myRandom.length + "\n");
        for (int r = 0; r < 5; r++) {
            System.out.println("array[" + r + "] = " +myRandom[r]);
        }
        System.out.println("\n");
        for (int s = myRandom.length - 5; s < myRandom.length; s++) {
            System.out.println("array[" +s+ "] = " +myRandom[s]);
        }

        String phone = String.join("-","682", "334","5679");
        System.out.println(phone);


        String rick = "Louie, I think this is the beginning of a beautiful friendship.";
        System.out.println(rick.length());

        String renault = "I'm shocked, shocked to find that gambling is going on in here!";
        System.out.println(renault.replace("shocked", "SHOCKED"));

        System.out.println(renault.charAt (13));
        System.out.println("Play it, Sam. Play ‘As Time Goes By.’".substring (19, 35).length());

        String original = "Java Software";
        int   space  = original.indexOf(' ');
        String soft  = original.substring(space+1,space+5);
        String ware  = original.substring(9);
        System.out.println(ware.toUpperCase() + " " + soft.toLowerCase());

        String[] words = "This is a string with how many words".split(" ");
        System.out.println("this is the 4th word in the string " + words[3]);
        System.out.println("The string had how many words? " + words.length);

        String replace = original.replace("a","_");
        System.out.println(replace);
        System.out.println(original.replaceFirst("a","_"));
    }



}


