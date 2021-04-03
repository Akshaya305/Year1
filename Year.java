import java.util.Scanner;
public class Year {

    public static void main(String[] Strings) {


        double minutesInYear = 60 * 24 * 365;

        Scanner a = new Scanner(System.in);

        System.out.print("Input the number : ");

        double min = a.nextDouble();

        long years = (long) (min / minutesInYear);
        int days = (int) (min / 60 / 24) % 365;

        System.out.println((int) min + " minutes is approximately " + years + " years and " + days + " days");
    }
}
