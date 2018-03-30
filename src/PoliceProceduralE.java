
public class PoliceProceduralE {

    public enum CastStyle {
        ENSEMBLE, BUDDY;
    }

    public enum ScriptStyle {
        GRITTY, DRAMA,COMEDY,INNER_CITY;
    }

    public enum PlotLine {
        FORENSIC, LEGAL, DETECTIVE, COP;
    }

    private CastStyle castStyle;            // true - ensemble, false buddy
    private ScriptStyle scriptStyle;       // "Gritty", "Comedy", "Drama", "Inner City"
    private String location;              // New York, Chicago, LA
    private PlotLine plotLine;           // true = CSI, NCIS, false - Dragnet, Monk, Dick Tracy

    //constructor
    public PoliceProceduralE(CastStyle castStyle, ScriptStyle scriptStyle, String location, PlotLine plotLine) {
        this.castStyle = castStyle;
        this.scriptStyle = scriptStyle;
        this.location = location;
        this.plotLine = plotLine;
    }


    public PoliceProceduralE(String location) {
        this(CastStyle.ENSEMBLE, ScriptStyle.DRAMA, location, PlotLine.FORENSIC);
    }

    public PoliceProceduralE(ScriptStyle scriptStyle, String location) {
        this.scriptStyle = scriptStyle;
        this.location = location;
    }


    @Override
    public String toString() {
        return "PoliceProceduralE{" +
                "castStyle=" + castStyle +
                ", scriptStyle=" + scriptStyle +
                ", location='" + location + '\'' +
                ", plotLine=" + plotLine +
                '}';
    }


    public static void main(String[] args) {
        PoliceProceduralE criminalMinds = new PoliceProceduralE("Ouantico, Virginia");
        PoliceProceduralE lawAndOrder = new PoliceProceduralE(ScriptStyle.DRAMA, "New York City");
        PoliceProceduralE csi = new PoliceProceduralE(CastStyle.BUDDY, ScriptStyle.DRAMA, "Las Vegas", PlotLine.FORENSIC);
        PoliceProceduralE theWire = new PoliceProceduralE("Baltimore");


        System.out.println(criminalMinds);
        System.out.println(lawAndOrder);
        System.out.println(csi);
        System.out.println(theWire);


    }

    // change parameter in passMethod ()

}
