import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Length   : ");
        double length = input.nextDouble();
        System.out.print("Width    : ");
        double width = input.nextDouble();
        System.out.print("Diameter : ");
        double diam = input.nextDouble();

        double sa = (length * width) - (Math.PI * Math.pow(diam / 2, 2));

        System.out.print("\nSurface area : ");
        System.out.printf("%,.2f\n", sa);
        input.close();
    }
}
