package Task08;

import java.util.Formatter;

public class FarahteinToSelsium {
    double faranheit;
    Formatter formatter = new Formatter();


    FarahteinToSelsium(){

    }

    public void ConvertTo(){
        double selsium = (faranheit - 32) / 1.8;
        formatter.format("%.1f degree Fahrenheit is equal to %.1f in Celsius", faranheit, selsium);
        System.out.println(formatter.out());
    }
}
