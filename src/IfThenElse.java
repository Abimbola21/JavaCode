public class IfThenElse {

        public float  deliveryCost(String destination, float orderValue, boolean saturdayDelivery) {
            float deliveryCost = 0.0f;

            if(destination.equals("US")){
                deliveryCost = 20.0f + discount(destination, orderValue);
                if(saturdayDelivery){
                    deliveryCost += 10.0;
                }
            }
            else if(destination.equals("Mexico")){
                deliveryCost = 32.0f + discount(destination, orderValue);
                if(saturdayDelivery){
                    deliveryCost += 20.0;
                }
            }
            else if(destination.equals("Canada")){
                deliveryCost = 25.0f + discount(destination, orderValue);
                if(saturdayDelivery){
                    deliveryCost += 12.0;
                }
            }
            else {
                deliveryCost = 30.0f; //base for all countries.
            }
            return deliveryCost;
        }

        public float discount(String destination,float orderValue){
            float discount = 0.0f;
            if(destination.equals("US") && orderValue > 100 ){
                discount = -5.00f;
            }
            else if((destination.equals("Mexico") || destination.equals("Canada")) && orderValue > 100.0 ){
                discount = -7.00f;
            }
            return discount;
        }

        /** Q2 Using if statements, create a method that has one parameter int number - it has a range between 0 and 5. The method will return a string with information about the number.
         * Some numbers will match multiple criteria. You need to return all the information for that number.

         "This Number " + number + " is prime."              For 2, 3, 5
         "This Number " + number + " a perfect square."      For 4
         "This Number " + number + " is the unit number."    For 1
         "This Number " + number + " is even."               For 2, 4
         "This Number " + number + " is 0."                  For 0
         */

        public String numberInfo(int n)
        {
            String numberInfo = "";
            boolean isPrime = true, isEven = false;
//check if no is zero
            if(n == 0){
                numberInfo= "This number " +n+ " is 0.";
            }
            else if(n == 1){
                numberInfo= "This number " +n+ " is the unit number.";
            }
            else if(n > 1) {
//check if number is prime
                for (int j = 2; j < Math.sqrt(n); j++) {
                    if ((n % j) == 0) {
                        isPrime = false;
                    }
                }
                if(isPrime == true) {
                    numberInfo = "This number " + n + " is prime" + "\n";
                }
//check if no is even
                if ((n % 2) == 0) {
                    isEven = true;
                    numberInfo +=  "This number " + n + " is even" + "\n";
                }
//check if no is a perfect square
                int sqrt = (int) Math.sqrt(n);
                if(sqrt*sqrt == n) {
                    numberInfo += "This number " +n+ ", is a perfect square!";
                }
                if(numberInfo.equals("")){
                    numberInfo = "Sorry, there's no information about number " + n;
                }
            }

            return numberInfo;
        }

        /** Q3
         *Consider the following code snippet.

         if (aNumber >= 0)
         if (aNumber == 0)
         System.out.println ("first string");
         else System.out.println ("second string");
         System.out.println ("third string");
         What output do you think the code will produce if aNumber is 3?
         Write a test program containing the previous code snippet; set aNumber = 3. What is the output of the program? Is it what you predicted? Explain why the output is what it is; in other words, what is the control flow for the code snippet?
         _________________________________________________
         _________________________________________________
         Using only spaces and line breaks, reformat the code snippet to make the control flow easier to understand.
         Use braces, { and }, to further clarify the code.
         Paste your thoughts and code in the text area.
         *
         */
        public static void main(String[] args) {
            IfThenElse conditions = new IfThenElse();
            System.out.println("Order Amount: $200, Destination: Canada, Delivery day: Saturday, Shipping Cost is $" +
                    conditions.deliveryCost("Canada",200,true));
            System.out.println("Order Amount: $100, Destination: Mexico, Delivery day: Weekday, Shipping Cost is $ " +
                    conditions.deliveryCost("Mexico",100,false));
            System.out.println("Order Amount: $50, Destination: US, Delivery day: Saturday, Shipping Cost is $" +
                    conditions.deliveryCost("US",50,true));
            System.out.println("Order Amount: $600, Destination: US, Delivery day: Weekday, Shipping Cost is $" +
                    conditions.deliveryCost("US",600,false));
            System.out.println("Order Amount: $100, Destination: Canada, Delivery day: Weekday, Shipping Cost is $" +
                    conditions.deliveryCost("Canada",100,false));
            System.out.println("Order Amount: $100, Destination: None, Delivery day: Weekday, Shipping Cost is $" +
                    conditions.deliveryCost("None",100,false));

            System.out.println();
            for (int i = 0; i < 6; i++) {
                System.out.println(conditions.numberInfo(i));
            }



           int  myCount = 11;
            System.out.println("Even numbers  are :");
            for( int i = myCount ; i >= 0 ; i--){
                if((i%2) == 0){
                System.out.printf(i + ",\n");
                }
            }

           int j = myCount;
            System.out.println("Even numbers  are :");
            while (j >= 0) {
                if ((j % 2) == 0) {
                    System.out.printf(j + ",\n");
                }
                j--;
            }

            int k  = myCount;
            System.out.println("Even numbers  are :");
            do {
                if((k%2) == 0){
                    System.out.printf(k + ",");
                }
                k--;

            }   while (k >= 0);

int aNumber = 3;
            if (aNumber >= 0)
                if (aNumber == 0)
                    System.out.println ("first string");
                else System.out.println ("second string");
            System.out.println ("third string");
        }

}
