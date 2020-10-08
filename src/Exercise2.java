import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Inches : ");
        int inches = input.nextInt();

        int miles = (inches - (inches % 63360)) / 63360;
        inches = inches - (miles * 63360);

        int feet = (inches - (inches % 12)) / 12;
        inches = inches - (feet * 12);

        System.out.print("\nMiles  : " + miles);
        System.out.print("\nFeet   : " + feet);
        System.out.println("\nInches : " + inches);
        input.close();
    }
}
