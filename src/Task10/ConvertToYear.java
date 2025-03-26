package Task10;

import Task09.ConvertToMert;

import java.util.Formatter;

public class ConvertToYear {
    long minutes;
    final long etalon = 525948L;

    Formatter formatter = new Formatter();

    ConvertToYear(){

    }

    public void minutesToYear(){
        double year = Math.floor(minutes / etalon);
        formatter.format("%d minutes is approximately %.0f years ", minutes, year);
        System.out.println(formatter.out());
    }

}
