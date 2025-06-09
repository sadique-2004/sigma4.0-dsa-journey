//  Time Complexity: O(n^3)
//  Space Complexity: O(1)
//  This code prints all subarrays of a given array and calculates the maximum sum of any subarray.

public class printSubArray {

    public static void Print(int numbers[]) {
        int n = numbers.length;
        int sumOfSubArray = 0;
        int maxSum = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            int start = i;
            for (int j = i; j < n; j++) {
                int end = j;
                sumOfSubArray = 0;

                // System.out.println("Subarray from index " + start + " to " + end + ":");
                for (int k = start; k <= end; k++) {
                    System.out.print(numbers[k] + "  ");
                    sumOfSubArray += numbers[k];

                }
                System.out.print(" = " + sumOfSubArray);

                if (sumOfSubArray > maxSum) {
                    maxSum = sumOfSubArray;
                }

                System.out.println();
            }

            System.out.println("-----------------");
        }
        System.out.println("  maxsum of subarray is " + maxSum);

    }

    public static void main(String[] args) {
        int numbers[] = { 2, 4, 6, 8, 10, 12, 14, 16, 18, 20 };

        Print(numbers);
    }
}