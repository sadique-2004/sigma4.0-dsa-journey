// Time Complexity: O(n)
// Space Complexity: O(1)
import java.util.Scanner;

public class ReverseArray {

    public static void reverse(int array[]) {

      int start = 0; int end = array.length-1; int temp =0;

      while (start < end) {
        temp = array[start];
        array[start] = array[end];
        array[end] = temp;

        start++;
        end--;
      }
       
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();

        int [] array = new int [n];

        for(int i=0; i<n; i++){
            array[i] = scan.nextInt();
        }

        reverse(array);

        scan.close();

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+" ");
        }
       
    }
}
