import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Diameter : ");
        double diam = input.nextDouble();

        double rad = diam / 2;

        double area = Math.PI * Math.pow(rad, 2);
        double circ = (2 * Math.PI * rad);

        System.out.print("\nArea          : ");
        System.out.printf("%,.2f", area);
        System.out.print("\nCircumference : ");
        System.out.printf("%,.2f\n", circ);

        input.close();
    }
}
