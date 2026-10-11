import java.util.Scanner;

public class StringRotations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        int n = str.length();

        System.out.println("All rotations of the string are:");

        for (int i = 0; i < n; i++) {
            String rotation = str.substring(i) + str.substring(0, i);
            System.out.println(rotation);
        }

        sc.close();
    }
}
