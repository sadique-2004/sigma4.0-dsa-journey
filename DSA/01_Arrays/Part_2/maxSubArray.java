// Brute Force Approach
// Time Complexity: O(n^3)
// Space Complexity: O(1)

public class maxSubArray {

    public static void Print(int numbers[]){
        int maxsum = Integer.MIN_VALUE;
        int n = numbers.length;

        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                int sum = 0;
                for (int k = i; k <= j; k++) {
                    sum += numbers[k];
                }
                maxsum = Math.max(maxsum, sum);
            }
        }

        System.out.println("Maximum sum of subarray is: " + maxsum);
    }
    public static void main(String[] args) {
        int numbers[] = { 2,4,6,8,10};

        Print(numbers);
    }
}
