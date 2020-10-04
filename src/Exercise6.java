import java.util.Scanner;

public class Exercise6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Length : ");
        double l = input.nextDouble();
        System.out.print("Width  : ");
        double w = input.nextDouble();

        double a = l * w;
        double p = (l * 2) + (w * 2);
        double d = Math.sqrt(Math.pow(l, 2) + Math.pow(w, 2));

        System.out.print("\nArea      : ");
        System.out.printf("%,.2f", a);
        System.out.print("\nPerimeter : ");
        System.out.printf("%,.2f", p);
        System.out.print("\nDiagonal  : ");
        System.out.printf("%,.2f", d);

        input.close();
    }
}
