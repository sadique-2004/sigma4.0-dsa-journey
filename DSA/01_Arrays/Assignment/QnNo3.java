import java.util.Scanner;

/*
 * Question 4:Given n non-negative integers representing an elevation map where the width of each bar is 1, compute how much water it can trap after raining
 */

public class QnNo3 {

    public static int trappingRainWater(int [] arr){
        int trap_water =0;
        int n = arr.length;

        // left max helper array
        int [] maxLeft = new int [n];
        maxLeft[0] = arr[0];

        for (int i = 1; i <n; i++) {
            maxLeft[i] = Math.max(maxLeft[i-1], arr[i]);
        }

        // right max helper array
        int [] rightMax = new int [n];
        rightMax[n-1] = arr[n-1];

        for(int i= n-2; i>=0; i--){
            rightMax[i] = Math.max(rightMax[i+1], arr[i]);
        }

     

        for (int j = 0; j < n; j++) {
            int waterLevel = Math.min(rightMax[j], maxLeft[j]);
            trap_water += waterLevel - arr[j];
        }

        

        return trap_water;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();

        int [] arr = new int [n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = scan.nextInt();
        }

        int res = trappingRainWater(arr);
        System.out.println(res);
    }
    
}
