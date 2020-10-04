import java.util.Scanner;
import java.util.Arrays;

public class Exercise10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("What's your favorite city? ");
        String city = input.nextLine();

        System.out.print("\nText   : " + city);
        System.out.print("\nLength : " + city.length());
        System.out.print("\nUpper  : " + city.toUpperCase());
        System.out.print("\nLower  : " + city.toLowerCase());

        input.close();
    }
}
