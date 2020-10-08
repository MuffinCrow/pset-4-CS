import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] arg) {
        Scanner input = new Scanner(System.in);
        System.out.print("Tempurature : ");
        double temp = input.nextDouble();
        System.out.print("Wind speed  : ");
        double wind = input.nextDouble();

        double chill = (((0.4275 * temp) - 35.75) * Math.pow(wind, 0.16));
        chill = chill + 35.74 + (0.6215 * temp);

        System.out.print("\nWind chill  : ");
        System.out.printf("%,.2f\n", chill);
        input.close();
    }
}
