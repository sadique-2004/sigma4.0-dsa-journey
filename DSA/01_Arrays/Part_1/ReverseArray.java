// Time Complexity: O(n)
// Space Complexity: O(1)

public class ReverseArray {

    public static void reverse(int arr[]) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

        System.out.println("Original Array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        reverse(arr);
        System.out.println("Reversed Array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
