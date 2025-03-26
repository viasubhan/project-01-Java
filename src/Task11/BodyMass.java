package Task11;

import java.util.Formatter;

public class BodyMass {
    double weight;
    double height;
    Formatter formatter = new Formatter();

    BodyMass(){

    }

    public void calculateBodyMass(){
        double forHeight = Math.pow(height,2);
        double conclusion = weight / forHeight;
        formatter.format("Your IBM is %.2f",conclusion);
        System.out.println(formatter.out());
    }
}
