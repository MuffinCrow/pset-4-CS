import java.util.Scanner;
import java.util.Arrays;

public class Exercise8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Text : ");
        String text = input.nextLine();

        int fhalf = (int) Math.ceil(text.length() / 2);
        int bhalf = (int) Math.floor(text.length() / 2);

        StringBuilder end1 = new StringBuilder();
        StringBuilder end2 = new StringBuilder();
        String out1;
        String out2;

        char[] ch = text.toCharArray();
        char[] fhalfA = Arrays.copyOfRange(ch, 0, fhalf);
        char[] bhalfA = Arrays.copyOfRange(ch, bhalf, text.length()+1);

        end1.append(fhalfA);
        end2.append(bhalfA);

        out1 = end1.toString();
        out2 = end2.toString();

        out1 = out1.toUpperCase();
        out2 = out2.toUpperCase();

        System.out.println("\n" + out2 + out1 + ".");

        input.close();
    }
}
