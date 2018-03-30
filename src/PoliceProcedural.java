public class PoliceProcedural {
    private boolean ensemble;           // true - ensemble, false buddy
    private String style;              //  "Gritty", "Comedy", "Drama", "Inner City"
    private String location;           // New York, Chicago, LA
    private boolean forensicBased;      //  true = CSI, NCIS, false - Dragnet, Monk, Dick Tracy

    //constructor
    public PoliceProcedural(boolean ensemble, String style, String location, boolean forensicBased) {
        this.ensemble = ensemble;
        this.style = style;
        this.location = location;
        this.forensicBased = forensicBased;
    }

    public PoliceProcedural(String location) {
        this(true, "Drama", location, true);
    }

    public PoliceProcedural(String style, String location) {
        this.style = style;
        this.location = location;
    }



    @Override
    public String toString() {
        return "PoliceProcedural{" +
                "ensemble=" + ensemble +
                ", style='" + style + '\'' +
                ", location='" + location + '\'' +
                ", forensicBased=" + forensicBased +
                '}';
    }

    public static void passMethod(int notNoticeMe) {
        notNoticeMe = 10;
    }

    public static void main(String[] args) {
        PoliceProcedural criminalMinds = new PoliceProcedural("Ouantico, Virginia");
        PoliceProcedural lawAndOrder = new PoliceProcedural("Drama", "New York City");
        PoliceProcedural csi = new PoliceProcedural(true, "Drama", "Las Vegas", true);
        PoliceProcedural theWire = new PoliceProcedural("Baltimore");


        System.out.println(criminalMinds);
        System.out.println(lawAndOrder);
        System.out.println(csi);
        System.out.println(theWire);


        int noticeMe = 3;

        // invoke passMethod () with
        // noticeMe as argument
        passMethod(noticeMe);

        // print noticeMe to see if its
        // value has changed
        System.out.println("After invoking passMethod, noticeMe = " +noticeMe);
    }

    // change parameter in passMethod ()

}
