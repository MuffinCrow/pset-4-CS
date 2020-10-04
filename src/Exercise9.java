import java.util.Scanner;
import java.util.Arrays;

public class Exercise9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("First name  : ");
        String first = input.nextLine();
        System.out.print("Middle name : ");
        String mid = input.nextLine();
        System.out.print("Last name   : ");
        String last = input.nextLine();

        StringBuilder strb = new StringBuilder();

        char[] ch = first.toCharArray();
        strb.append(ch[0]);
        ch = mid.toCharArray();
        strb.append(ch[0]);
        ch = last.toCharArray();
        strb.append(ch[0]);

        String output = strb.toString().toUpperCase();

        System.out.print("\n" + output + ".");

        input.close();
    }
}
