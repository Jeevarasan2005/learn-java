import java.util.Scanner;

public class Days {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter total number of days: ");
        int totalDays = scanner.nextInt();

        int years = totalDays / 365;
        int remainingDays = totalDays % 365;

        int months = remainingDays / 30;
        remainingDays = remainingDays % 30;

        System.out.println("Years: " + years);
        System.out.println("Months: " + months);
        System.out.println("Days: " + remainingDays);
    }
}
