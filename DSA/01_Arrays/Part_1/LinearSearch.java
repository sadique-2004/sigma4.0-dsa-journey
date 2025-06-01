// Linear search is a simple search algorithm that checks each element in the array sequentially until it finds the target value or reaches the end of the array.
// Linear search has a time complexity of O(n), where n is the number of elements in the array.
// Linear search is not the most efficient search algorithm, especially for large arrays, but it is easy to implement and understand.
// Linear search is useful for small arrays or when the array is unsorted.

public class LinearSearch {
   
    public static int LinearSearch( int arr[], int target) {
        int n= arr.length;
        for (int i = 0; i < n; i++) {
            if (arr[i] == target) {
                return i; // return the index if target is found
                
            }  
        }
        return -1; // return -1 if target is not found  
    }
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int target = -5;

        int result = LinearSearch(arr, target);

        if (result != -1) {
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found in the array.");
        }
    }
}
