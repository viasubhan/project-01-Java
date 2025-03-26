package Task06;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Pls ender the radius: ");
        double radius = sc.nextDouble();

        Circle rp = new Circle();
        rp.radius = radius;

        System.out.print("Perimeter is = ");
        rp.PerimetersOfCircle();
        System.out.print("Area is = ");
        rp.AreaOfCircle();


    }
}
