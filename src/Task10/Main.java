package Task10;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Input the number of minutes: ");
        int minutes = sc.nextInt();

        ConvertToYear my = new ConvertToYear();
        my.minutes = minutes;

        my.minutesToYear();
    }
}
