public class FirstClass {

    public static void main(String[] args) {

        System.out.println("Hello World!");

        int number = 37;
        int mini = Integer.MIN_VALUE;
        int maxi = Integer.MAX_VALUE;
        System.out.println("This is a number " + number);
        System.out.println("This is an Integer. Min value =  " + mini + " , Max value = " + maxi);

        long sum = (long) 1 + maxi;
        System.out.println("Total value of integers " + sum);

        char character = 'z';
        System.out.println("this is a character " + character);

        double pi = Math.PI;
        System.out.println("The famous number PI " + pi);

        byte minb = Byte.MIN_VALUE;
        byte maxb = Byte.MAX_VALUE;
        System.out.println("This is a byte. Min value =  " + minb + " , Max value = " + maxb);

        long minl = Long.MIN_VALUE;
        long maxl = Long.MAX_VALUE;
        System.out.println("This is a long. Min value =  " + (int)minl + " , Max value = " + maxl);

        float minf = Float.MIN_VALUE;
        float maxf = Float.MAX_VALUE;
        System.out.println("This is a float. Min value =  " + minf + " , Max value = " + maxf);

        short mins = Short.MIN_VALUE;
        short maxs = Short.MAX_VALUE;
        System.out.println("This is a short. Min value =  " + mins + "," + (char)mins + " , Max value = " + maxs);

        boolean ans = true ;
        System.out.println("This is a boolean:  " + ans);

        char[] charArray = {'a','b','c','d','e'};
        int[] randomNum = new int[20];
        int rand = (int) Math.floor(Math.random() * 20);
        System.out.println("rand = " +rand);

        for (int i = 0; i < randomNum.length; i++) {
            randomNum[i] = (int)Math.floor(Math.random()*20);
        }

        for (int r = 0; r < randomNum.length; r++) {
            System.out.println("randomNum["+r+"] = " + randomNum[r]);
        }

        for (int a = charArray.length - 1 ; a >= 0 ; a--) {
            System.out.println("charArray["+a+"] = " + charArray[a]);
        }


       int [] score = {44,88,8,99,11,100,33,23,11,88,44,73,884,432};
       int total = 0;
       for (int i = 0; i < score.length; i++) {
           total  += score[i];
        }
        System.out.println("average scores = " +total/score.length);

        for (int r = 0; r < score.length; r++) {
            System.out.println("score[" +r+"] = "  +score[r]);

        }
    }


}
