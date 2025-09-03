import java.util.Scanner;;

public class Kadanes_Algo {

    public static int maxSubArraySum(int [] numbers){
        int currentSum = 0;
        int maxSum = Integer.MIN_VALUE;

        for (int i = 0; i < numbers.length; i++) {

            currentSum += numbers[i];

            maxSum = Math.max(maxSum, currentSum);  // if we want it works for -ve array as well

            if (currentSum < 0) {
                currentSum = 0;
            }    

            // maxSum = Math.max(maxSum, currentSum);  // if we want it works only for +ve if all are -ve it will resturn 0
        }

        return maxSum;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int [] numbers = new int [n];

        for(int i=0; i<n; i++){
            numbers[i] = scan.nextInt();
        }

        scan.close();

        System.out.println(maxSubArraySum(numbers));
    }
}
