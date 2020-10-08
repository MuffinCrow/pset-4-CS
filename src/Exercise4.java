import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Centimeters : ");
        int cent = input.nextInt();

        int kilo = (cent - (cent % 100000)) / 100000;
        cent = cent - (kilo * 100000);

        int meter = (cent - (cent % 100)) / 100;
        cent = cent - (meter * 100);

        System.out.print("\nKilometers  : " + kilo);
        System.out.print("\nMeters      : " + meter);
        System.out.println("\nCentimeters : " + cent);

        input.close();
    }
}
