import java.util.Scanner;
public class SumOfFactorsInRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the lower bound (l): ");
        int l = sc.nextInt();
        System.out.print("Enter the upper bound (r): ");
        int r = sc.nextInt();

        long totalSum = 0; // Initialize the total sum

        for (int num = l; num <= r; num++) {
            long sumOfFactors = 0; // Initialize the sum of factors for the current number

            // Find factors for 'num'
            for (int i = 1; i <= num; i++) {
                if (num % i == 0) {
                    sumOfFactors += i;
                }
            }

            totalSum += sumOfFactors; // Add the sum of factors to the total sum
        }

        System.out.println("Sum of factors in the range [" + l + ", " + r + "]: " + totalSum);
        sc.close();
    }
}
