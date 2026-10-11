import java.util.Scanner;

public class PrimeDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        System.out.print("Prime digits are: ");
        boolean found = false;

        while (n > 0) {
            int digit = n % 10;

            if (digit == 2 || digit == 3 || digit == 5 || digit == 7) {
                System.out.print(digit + " ");
                found = true;
            }

            n = n / 10;
        }

        if (!found) {
            System.out.print("No prime digits found");
        }

        sc.close();
    }
}