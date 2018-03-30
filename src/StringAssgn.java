public class StringAssgn {

    public static void main(String[] args) {
        String fullname = "Victoria Lasode";
        String[] names = fullname.split(" ");
        String Initial = " " ;
        for (int i = 0; i < names.length; i++) {
             Initial += names[i].charAt(0) + ".";
        }
        System.out.println(String.format("Initial of %s\n is %s\n", fullname, Initial.toLowerCase()));


        System.out.println("She said,\"Oh,no you did't\" and I said, \"Oh yes I did\"" );

        String  expression = "She said,\"Oh,no you did't\" and I said, \"Oh yes I did\"";
        System.out.println(expression.replace("She", "Barbara"));

        int lastIndexOfOh = (int)expression.lastIndexOf("Oh"); // return the index of O where it finds the last Oh in the string
        int lastIndexOfdid = expression.lastIndexOf("did");
        expression = expression.substring(0,(lastIndexOfOh+2)) + "," + expression.substring(lastIndexOfOh+2); //  starts from index 0 of the expression and ends in index lastIndexOfOh+2
        // i.e the space after the last oh and inserts a comma, then adds the rest of the expression starting from the lastIndexOfOh+2 i.e the space after the last oh in the original string.d
      //  expression.substring(lastIndexOfdid).toUpperCase();
        System.out.printf(expression);
    }
}
