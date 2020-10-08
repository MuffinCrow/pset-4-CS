import java.util.Scanner;

public class Exercise7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Side : ");
        double side = input.nextDouble();

        double a = ((3 * Math.sqrt(3)) * (Math.pow(side, 2))) / 2;
        double p = (side * 6);

        System.out.print("\nArea      : ");
        System.out.printf("%,.2f", a);
        System.out.print("\nPerimeter : ");
        System.out.printf("%,.2f\n", p);

        input.close();
    }
}
