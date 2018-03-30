import java.util.Scanner;

public class Switching {

    public float  deliveryCost(String destination, float orderValue, boolean saturdayDelivery) {
        float deliveryCost = 0.0f;

        switch (destination){
            case "US":      deliveryCost = 20.0f + discount(destination, orderValue);
                if(saturdayDelivery){
                    deliveryCost += 10.0;
                }
            break;
            case "Mexico":  deliveryCost = 32.0f + discount(destination, orderValue);
                if(saturdayDelivery){
                    deliveryCost += 20.0;
                }
            break;
            case "Canada":   deliveryCost = 25.0f + discount(destination, orderValue);
                if(saturdayDelivery){
                    deliveryCost += 12.0;
                }
            break;
                default:  deliveryCost = 30.0f; //base for all countries.
        }
        return deliveryCost;
   }

    public float discount(String destination,float orderValue){
        float discount = 0.0f;
        switch (destination){
            case "US":
                if(orderValue > 100 ){
                    discount = -5.00f;
                }
            break;
            case "Mexico":
            case "Canada":
                if(orderValue > 100 ){
                    discount = -7.00f;
                }
            break;
        }
        return discount;
    }

    public int getWeekDayNum (String dayOfWeek){
        int numOfWeekday = 7;

        dayOfWeek = dayOfWeek.toLowerCase();
        switch (dayOfWeek) {
            case "sunday" : numOfWeekday = 0;break;
            case "monday" : numOfWeekday = 1;break;
            case "tuesday" : numOfWeekday = 2;break;
            case "wednesday" : numOfWeekday = 3;break;
            case "thursday" : numOfWeekday = 4;break;
            case "friday" : numOfWeekday = 5;break;
            case "saturday" : numOfWeekday = 6;break;
        }
        return numOfWeekday;
    }

    public static void main(String[] args) {
        Switching test = new Switching();
        System.out.println("Order Amount: $200, Destination: Canada, Delivery day: Saturday, Shipping Cost is $" +
                test.deliveryCost("Canada", 200, true));
        System.out.println("Order Amount: $100, Destination: Mexico, Delivery day: Weekday, Shipping Cost is $ " +
                test.deliveryCost("Mexico", 100, false));
        System.out.println("Order Amount: $50, Destination: US, Delivery day: Saturday, Shipping Cost is $" +
                test.deliveryCost("US", 50, true));
        System.out.println("Order Amount: $600, Destination: US, Delivery day: Weekday, Shipping Cost is $" +
                test.deliveryCost("US", 600, false));
        System.out.println("Order Amount: $100, Destination: Canada, Delivery day: Weekday, Shipping Cost is $" +
                test.deliveryCost("Canada", 100, false));
        System.out.println("Order Amount: $100, Destination: None, Delivery day: Weekday, Shipping Cost is $" +
                test.deliveryCost("None", 100, false) + "\n");


        int num = 0;
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Enter a day of the week: ");
            String dayOfWeek = sc.nextLine();

            num = test.getWeekDayNum(dayOfWeek);
            if (num == 7) {
                System.out.println("Invalid day of week");
            } else {
                System.out.println("Number of the day is " + num);
            }
            if(dayOfWeek.equals("")){
                return;
            }
        }
    }
}
