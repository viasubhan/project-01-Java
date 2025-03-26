package Task07;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.print("Width = " );
        double width = sc.nextDouble();

        System.out.print("Height = ");
        double height = sc.nextDouble();

        Rectangle rc = new Rectangle();
        rc.width = width;
        rc.height = height;

        rc.AreaOfRectangle();
        rc.PerimeterOfRectangle();


    }
}
