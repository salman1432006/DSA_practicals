import java.util.Scanner;

public class MiniMaxSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[5];
        long total = 0;

        System.out.println("Enter 5 positive integers:");

        for (int i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();
            total += arr[i];
        }

        long minSum = Long.MAX_VALUE;
        long maxSum = Long.MIN_VALUE;

        for (int i = 0; i < 5; i++) {
            long sum = total - arr[i]; // Sum of the other four numbers

            if (sum < minSum) {
                minSum = sum;
            }

            if (sum > maxSum) {
                maxSum = sum;
            }
        }

        System.out.println(minSum + " " + maxSum);

        sc.close();
    }
}
