import java.util.Scanner;

public class SearchMe {

    public boolean findStudentRecord (String studentName) {
        String[] studentNames = this.getStudentList();
        boolean found = false;
        int i =0;
        while(i<studentNames.length){
            if(studentNames[i].equals(studentName)){
                found = true;
                break;
            }
            i++;
        }

        return found;
    }

    public String[] getStudentList() {
        String [] test = {"Allen", "Bob", "Clara", "Davros", "Ethan", "Frank", "Goth", "Hank", "Ivan", "Jeremiah", "Kate"};
        return test;
    }

    public static void main (String[] args) {
        SearchMe search = new SearchMe();
        boolean foundRecord;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a name: ");
        String who = sc.nextLine();
// call your find student record function using the name entered by the user
        foundRecord = search.findStudentRecord(who);
// save the result and display whether the name was found or not

        System.out.println(foundRecord);
    }
}

