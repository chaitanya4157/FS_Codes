/* 
You are given an integer array prices where prices[i] represents the price of 
a stock on the i-th day.
You want to maximize your profit by choosing one day to buy one stock and a 
different day in the future to sell that stock.

Return the maximum profit you can achieve from this transaction.

If you cannot achieve any profit, return 0.

Important: You must buy before you sell.

Sample Testcase:1
------------------------------
input=6
7 1 5 3 6 4
output=5

Explanation:
-------------------------------
Buy the stock on day 2 at price 1.
Sell the stock on day 5 at price 6.
Profit = 6 - 1 = 5.

Day 1: Minimum price = 7.
Day 2: Found a better buying price = 1.
Day 3: Profit = 5 - 1 = 4.
Day 4: Profit = 3 - 1 = 2.
Day 5: Profit = 6 - 1 = 5.
Day 6: Profit = 4 - 1 = 3.
Maximum profit = 5

*/
import java.util.Scanner;
class Test2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int prices[] = new int[n];
        for (int i = 0; i < n; i++) {
            prices[i] = sc.nextInt();
        }
        int minPrice = prices[0];
        int maxProfit = 0;
        for (int i = 1; i < n; i++) {
            if (prices[i] < minPrice) {
                minPrice = prices[i];
            }
            int profit = prices[i] - minPrice;
            if (profit > maxProfit) {
                maxProfit = profit;
            }
        }
        System.out.println(maxProfit);
    }

}     

