// finding maximum sub array sum using prefix sum array
// Time Complexity: O(n)
// Space Complexity: O(n)

public class prefixMSA {
    public static void maxsumarraysum( int arr[]){
        int n = arr.length;
        int prefix[] = new int [n];
        prefix[0] = arr[0];

        // calculate prefix sum array
        for (int i = 1; i < n; i++) {
            prefix[i] = prefix[i-1] + arr[i];
        }
    }
    public static void main(String[] args) {
        int[] arr = {1, -2, 3, 4, -5};
    }
}
