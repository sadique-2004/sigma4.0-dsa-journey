//  Time Complexity: O(n^3)
//  Space Complexity: O(1)
//  This code prints all subarrays of a given array and calculates the maximum sum of any subarray.

public class printSubArray {

    public static void Print(int numbers[]) {

        for (int i = 0; i < numbers.length; i++) {

            for (int j = i+1; j < numbers.length; j++) {
                
                for (int k = i; k < j; k++) {
                    System.out.print(numbers[k]+" ");
                }

                System.out.println();
            }
            System.out.println();

        }
    }

    public static void main(String[] args) {
        int numbers[] = { 2, 4, 6, 8, 10, 12, 14, 16, 18, 20 };

        Print(numbers);
    }
}