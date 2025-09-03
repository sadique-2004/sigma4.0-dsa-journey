
public class prefixMSA {

    public static void prefixmaxsum(int[] array) {

        int maxSum = Integer.MIN_VALUE;
        int currentSum = 0;

        int[] prefixSum = new int[array.length];

        // calculating prefix sum in the array

        prefixSum[0] = array[0];
        for (int i = 1; i < prefixSum.length; i++) {
            prefixSum[i] = prefixSum[i - 1] + array[i];
        }

        for (int i = 0; i < array.length; i++) {

            for (int j = i + 1; j < array.length; j++) {

                currentSum = i == 0 ? prefixSum[j] : prefixSum[j] - prefixSum[i-1];

                if (maxSum < currentSum) {
                    maxSum = currentSum;
                }

            }

        }

        System.out.println("Max sub array sum is : "+maxSum);

    }

    public static void main(String[] args) {
        int[] array = { 1, -2, 6, -1, 3 };

        prefixmaxsum(array);

    }
}
