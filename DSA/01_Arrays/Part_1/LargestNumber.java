// Time Complexity: O(n)
// Space Complexity: O(1)

public class LargestNumber {

    public static int findLargest(int[] numbers) {
        int largest = Integer.MIN_VALUE; // Initialize largest to the smallest possible integer value

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > largest) {
                largest = numbers[i]; // Update largest if the current number is greater
            } else {

            }
        }
        return largest;
    }

    public static void main(String[] args) {

        int[] numbers = { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100 };

        int LargestNumber = findLargest(numbers);
        System.out.println("The largest number in the array is: " + LargestNumber);

    }

}
