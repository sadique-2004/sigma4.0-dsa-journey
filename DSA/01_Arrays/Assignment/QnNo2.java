import java.util.Scanner;
/*

Question 3:You  are  given  an  array prices where prices[i] is  the  price  of  a  given  stock  on  the ith day.Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0. 

Example 
1:Input:prices = [7, 1, 5, 3, 6,  4]   
Output:   5 Explanation:Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5. Note that buying on day 2 and selling on day 1 is not allowed because you must buy before you sell.Example 

2:Input:Prices = [7, 6, 4,  3, 1]   Output:   0 Explanation:In this case, no transactions are done and the max profit = 0.

Constraints:•1 <= prices . length <= 105•0   <= prices [ i ] <= 10

 */

 public class QnNo2 {

    public static void buyAndSell(int [] arr){
        int buy = arr[0];  // or int buy = Integer.MAX_VALUE;
        int profit = 0;

        //  1st Version
        for (int i = 0; i < arr.length; i++) {
            if (buy < arr[i]) {
                int todayProfit = arr[i] - buy;
                profit = Math.max(todayProfit, profit);
            }else{
                buy = arr[i];
            }
        }

        // 2nd Version
        // for(int i=1; i<arr.length; i++){
        //     if (arr[i] < buy) {
        //         buy = arr[i];
        //     }

        //     if (profit < arr[i]-buy) {
        //         profit = arr[i]-buy;
        //     }
        // }

        System.out.print(profit);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int [] arr = new int [n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = scan.nextInt();
        }

        buyAndSell(arr);


    }
    
}
