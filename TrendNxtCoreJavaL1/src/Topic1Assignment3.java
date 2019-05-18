import java.util.Scanner;

public class Topic1Assignment3 {
	public static void main(String a[])
	{
		double minutesInYear = 60 * 24 * 365;

        Scanner sc = new Scanner(System.in);

        System.out.print("Input the number of minutes: ");

        double min = sc.nextDouble();

        long years = (long) (min / minutesInYear);
        int days = (int) (min / 60 / 24) % 365;
        System.out.println((int) min + " minutes is approximately " + years + " years and " + days + " days");

	}

}
