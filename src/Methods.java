import java.util.Calendar;
import java.util.Date;

public class Methods {


    public String getDatePart(String datePart) {
        String part = "";
        String[] parts = datePart.split(" ");
        Date date = new Date();
        Date now = new Date();

        Calendar calender = Calendar.getInstance();
        calender.setTime(now);
        int am_pm = calender.get(Calendar.PM);
       // for (int i = 0; i < parts.length; i++) {
           // part = (parts[i].equals("Y")) ? part = "" + calender.get(Calendar.YEAR)
             //    :

          /*  return part = (datePart.equals("Y")) ? part = "" + calender.get(Calendar.YEAR)
                    : (datePart.equals("M")) ? part = "" + calender.get(Calendar.MONTH)
                    : (datePart.equals("D")) ? part = "" + calender.get(Calendar.DAY_OF_MONTH)
                    : (datePart.equals("DoW")) ? part = "" + calender.get(Calendar.DAY_OF_WEEK)
                    : (datePart.equals("DoWm")) ? part = "" + calender.get(Calendar.DAY_OF_WEEK_IN_MONTH)
                    : (datePart.equals("DoY")) ? part = "" + calender.get(Calendar.DAY_OF_YEAR)
                    : (datePart.equals("HoD")) ? part = "" + calender.get(Calendar.HOUR_OF_DAY)
                    : (datePart.equals("H")) ? part = "" + calender.get(Calendar.HOUR) + am_pm
                    : (datePart.equals("WoM")) ? part = "" + calender.get(Calendar.WEEK_OF_MONTH)
                    : (datePart.equals("WoY")) ? part = "" + calender.get(Calendar.WEEK_OF_YEAR)

                    : part;*/
        //  }
        return part.trim();
    }
/* Create a method that will accept a person's name-String, the year they were born-int and
their state of residence-String. The method will print a state appropriate greeting to the person
and give their age at the end of this year. State is a two letter abbreviation. "TX", "Tx" and "tx" are
all acceptable and all possible. Provide unique greetings for 2 states and one for everyone else.
* */
    public String sayHello(String name, int year, String fromState){
        int birthYear = ((int) year);
        String state = fromState.toUpperCase();
        Date today = new Date();
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(today);
        int currentYear = calendar.get(Calendar.YEAR);
        int age = currentYear - birthYear;
        String greeting="";

        greeting = (state.equals("TX"))? "Howdy "
                  :(state.equals("CA"))? "Hey "
                  :"Hello ";
        greeting+= name + "! I see you will be " +age+" years old this year";
         return greeting;
    }

    /* Lines 61 - 73 creates 3 methods with the same name
    * each takes different sets of parameters.
    *The goal is to concatenate the parameters
    *and return as a string
    * */
    public String conCat(String str){
        return str;
    }

    public String conCat(String string, int num){
        String strValue = Integer.toString(num);
        return string.concat(strValue);
    }
    public String conCat(String str1, String str2){

        return str1.concat(str2);
    }

    public String conCat(String str1, String str2, String str3){

        return str1.concat(str2).concat(str3);
    }

    public static void main(String[] args) {
        Methods dt = new Methods();
        System.out.println(new Date());
        System.out.println("Year:" +  dt.getDatePart("Y"));
        System.out.println("Month:" + dt.getDatePart("M"));
        System.out.println("Day:" + dt.getDatePart("D"));
        System.out.println("Day of Week:" + dt.getDatePart("DoW"));
        System.out.println("Day of Week in Month:" + dt.getDatePart("DoWm"));
        System.out.println("Day of Year:" + dt.getDatePart("DoY"));
        System.out.println("Hour:" + dt.getDatePart("H"));
        System.out.println("Hour of day:" + dt.getDatePart("HoD"));
        System.out.println("Week of Month:" + dt.getDatePart("WoM"));
        System.out.println("Week of Year:" + dt.getDatePart("WoY"));

        System.out.println(dt.sayHello("Gary",1954,"in"));

        System.out.println(dt.conCat("Howdy!"));
        System.out.println(dt.conCat("My birth month is --> ", 10));
        System.out.println(dt.conCat("Edge Tech", " Academy"));
        System.out.println(dt.conCat("Edge Tech", " Academy", " Hurst,TX"));
    }
}


