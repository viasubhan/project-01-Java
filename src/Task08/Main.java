package Task08;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Degree in Fahrenheit:");
        double faranheit = sc.nextDouble();

        FarahteinToSelsium fs = new FarahteinToSelsium();
        fs.faranheit = faranheit;

        fs.ConvertTo();



    }
}
