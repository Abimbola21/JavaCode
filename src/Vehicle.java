import Interfaces.Submersible;

/**
 * Created by Edge Tech Academy on 11/10/2016.
 */
public class Vehicle implements Submersible {

    @Override
    public double dive(int depth) {
        return depth/5;
    }

    @Override
    public double surface(int depth) {
        return depth*2;
    }

    @Override
    public double sink() {
        return 0;
    }

    public enum WHEELS{
        TWO_WHEELS,THREE_WHEELS, FOUR_WHEELS;
    }

    public enum DOORS{
        TWO_DOORS,FOUR_DOORS;
    }

    public enum SEATING_CAPACITY{
        SEATS_2, SEATS_3, SEATS_5;
    }

    public enum COLOR{
        WHITE,GREY,BLACK,RED,BLUE,SILVER;
    }

    //  unchanging fields
    private WHEELS wheels;
    private int engineSize;     //  in cubic cm
    private DOORS doors;
    private int gearCount;
    private boolean isAutomatic;  //  true if isAutomatic. false if manual
    private SEATING_CAPACITY seatingCapacity;
    private String model;
    private COLOR color;
    private String[] accessories;          //TODO add code for accessories

    //  driver changeable fields
    private boolean running;
    private int gear;
    private int speed;

    //  unchanging fields
    public WHEELS getWheels() {
        return wheels;
    }

    public int getEngineSize() {
        return engineSize;
    }

    public DOORS getDoors() {
        return doors;
    }

    public COLOR getColor() {
        return color;
    }

    public int getGearCount() {
        return gearCount;
    }

    public SEATING_CAPACITY getSeatingCapacity() {
        return seatingCapacity;
    }

    public String getModel() {
        return model;
    }

    public boolean isAutomatic() {
        return isAutomatic;
    }


    //  driver changeable fields
    public int getGear() {
        return gear;
    }

    public void setGear(int gear) {
        this.gear = gear;
    }

    public boolean isRunning() {
        return running;
    }

    public void setRunning(boolean running) {
        this.running = running;
    }

    public int getSpeed() {
        return speed;
    }

    public void setspeed(int speed) {
        this.speed = speed;
    }

    public Vehicle(int engineSize, int gearCount, COLOR color, String model) {
        this(WHEELS.FOUR_WHEELS, DOORS.FOUR_DOORS, engineSize, gearCount, true, SEATING_CAPACITY.SEATS_5, color, model);
    }

    public Vehicle(WHEELS wheels, DOORS doors, int engineSize, int gearCount, boolean automatic, SEATING_CAPACITY seatingCapacity, COLOR color, String model) {
        this.wheels = wheels;
        this.doors = doors;
        this.engineSize = engineSize;
        this.gearCount = gearCount;
        this.isAutomatic = automatic;
        this.seatingCapacity = seatingCapacity;
        this.color = color;
        this.model = model;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "wheels=" + wheels +
                ", engineSize=" + engineSize +
                ", doors=" + doors +
                ", gearCount=" + gearCount +
                ", isAutomatic=" + isAutomatic +
                ", seatingCapacity=" + seatingCapacity +
                ", model='" + model + '\'' +
                ", color=" + color +
                ", running=" + running +
                ", gear=" + gear +
                ", speed=" + speed +
                '}';
    }

    public static void main(String[] args) {
        Vehicle acuraTLX =   new Vehicle(WHEELS.FOUR_WHEELS, DOORS.FOUR_DOORS, 300, 8, true, SEATING_CAPACITY.SEATS_5, COLOR.BLACK, "Acura TLX");
        Vehicle acuraTSX =   new Vehicle(300, 8, COLOR.SILVER, "Acura TSX");
        Vehicle fordF150 =   new Vehicle(WHEELS.FOUR_WHEELS, DOORS.TWO_DOORS, 450, 3, true, SEATING_CAPACITY.SEATS_5, COLOR.WHITE, "Ford F150");
        Vehicle miniCooper = new Vehicle(WHEELS.FOUR_WHEELS, DOORS.TWO_DOORS, 200, 3, true, SEATING_CAPACITY.SEATS_2, COLOR.GREY, "Mini Cooper");
        Vehicle spider =     new Vehicle(WHEELS.FOUR_WHEELS, DOORS.TWO_DOORS, 300, 4, false,SEATING_CAPACITY.SEATS_2, COLOR.BLACK, "Spider");
        Vehicle indian =     new Vehicle(WHEELS.TWO_WHEELS, DOORS.TWO_DOORS, 450, 4,  false, SEATING_CAPACITY.SEATS_2, COLOR.BLUE, "Indian!");

        System.out.println(spider);
        System.out.println(fordF150);
        spider.setGear(3);
        System.out.println(spider);

//calling interface method sink
        System.out.println(spider.sink());
        System.out.println(spider.dive(2));
        System.out.println(spider.surface(3));
    }
}