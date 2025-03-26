package Task09;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Input a value for inch: ");
        double inch = sc.nextDouble();

        ConvertToMert im = new ConvertToMert();
        im.inch = inch;

        im.inchToMetres();
    }
}
