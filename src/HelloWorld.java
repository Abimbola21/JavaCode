/**
 * Created by Edge Tech Academy on 10/31/2016.
 *       Demonstrating a simple Class definition
 */

@SuppressWarnings("WeakerAccess")
public class HelloWorld {

    private String  name;

    private HelloWorld() {      }

    private HelloWorld(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Hello " + name + "!: Welcome to Edge Tech Academy";
    }

    public static void main(String[] args) {

        HelloWorld student1 = new HelloWorld("Alice");         //  Create your first Object
        System.out.println(student1);

        HelloWorld student2 = new HelloWorld();                //  Create your 2nd Object
        student2.setName("Benjamin");
        System.out.println("This is the name of our 2nd student " + student2.getName());

        for (int i = 0; i < args.length; i++) {
            HelloWorld me = new HelloWorld(args[i]);           //  Create your me Object
            System.out.println(me);
        }
        if ( args.length == 1 ) {
            HelloWorld me = new HelloWorld(args[0]);           //  Create your me Object
            System.out.println(me);
        }
    }
}