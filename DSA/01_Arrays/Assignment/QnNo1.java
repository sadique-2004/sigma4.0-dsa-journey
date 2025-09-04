import java.util.*;

/*  Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct 

Example 
1:Input:nums = [1, 2, 3, 1]
Output:   true Example 
2:Input:nums = [1, 2, 3, 4]
Output:   false 
Example 3:Input:nums = [1, 1, 1, 3, 3, 4, 3, 2, 4, 2]
Output:   true 
Constraints:•1 <= nums .  lengtth <= 105•-109 <= nums [ i ] <= 109
 
*/

public class QnNo1 {

    public static boolean isElementAppierTwice(int [] arr){

        // boolean isTwice = false;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    return true;
                }
            }
        }

        return false;

    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        int [] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = scan.nextInt();
        }

        boolean res = isElementAppierTwice(arr);
        System.out.println(res);


    }
}
