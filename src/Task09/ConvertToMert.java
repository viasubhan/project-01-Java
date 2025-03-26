package Task09;

import java.util.Formatter;

public class ConvertToMert {
    double inch;
    final double etalon = 0.0254;

    Formatter formatter = new Formatter();

    ConvertToMert(){

    }

    public void inchToMetres(){
        double convertToMetre = inch * etalon;
        formatter.format("%.1f inch is %.1f meters", inch , convertToMetre);
        System.out.println(formatter.out());


    }

}
