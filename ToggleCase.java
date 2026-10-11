import java.util.Scanner;

public class ToggleCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read the input string
        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        String result = "";

        // Convert the case of each character
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (Character.isUpperCase(ch)) {
                result += Character.toLowerCase(ch);
            } else if (Character.isLowerCase(ch)) {
                result += Character.toUpperCase(ch);
            } else {
                result += ch; // Keep digits, spaces, and symbols unchanged
            }
        }

        // Display the result
        System.out.println("Converted string: " + result);

        sc.close();
    }
}