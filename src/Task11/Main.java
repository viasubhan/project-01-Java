package Task11;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Input weight in kg: ");
        double weight = sc.nextDouble();

        System.out.print("Input height in m: ");
        double height = sc.nextDouble();


        BodyMass bm = new BodyMass();
        bm.height = height;
        bm.weight = weight;

        bm.calculateBodyMass();

    }
}
