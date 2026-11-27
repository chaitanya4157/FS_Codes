/* 

Mr. Crazy Robert plans to visit N interconnected stalls in a shopping mall.
He must start at stall 0 and visit all stalls in order up to stall N-1.
Visiting stall i costs amount[i] INR, a non-negative integer.

Robert has a coupon worth C INR that can be applied to at most one stall.
At that stall the coupon reduces the fee by the smaller of C and the fee.
Any unused coupon value is lost and cannot be used at another stall.

Robert must maintain at least 1 INR at all times, including after every
payment. He receives no additional money during the visit.
Find the minimum initial amount of money needed to visit all stalls.

Constraints
-----------
1 <= N <= 10^5
0 <= C <= 10^9
0 <= amount[i] <= 10^9

Input Format
------------
Line 1: Two integers N and C, the number of stalls and coupon value.
Line 2: N comma-separated integers representing the stall fees.

Output Format
-------------
Print the minimum initial amount in INR.

Sample Input-1
--------------
6 4
1,5,10,8,6,4

Sample Output-1
---------------
31

Explanation
-----------
The total fee is 34 INR. Apply the coupon at the stall costing 6 INR,
reducing that fee to 2 INR. Total payment is 30 INR. Starting with
31 INR leaves 1 INR after all payments.


Sample Input-2
--------------
6 12
7,7,9,6,2,6

Sample Output-2
---------------
29

Explanation
-----------
The total fee is 37 INR. Apply the coupon to the stall costing 9 INR.
Total payment is 28 INR, so the required initial amount is 29 INR.
Sample Input-3
--------------
6 0
7,7,9,6,2,6

Sample Output-3
---------------
38

Explanation
-----------
The coupon provides no discount. Total payment is 37 INR.
Robert needs 38 INR initially.

*/
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useDelimiter("[,\\s]+");

        int n = sc.nextInt();
        long c = sc.nextLong();

        long sum = 0;
        long max = 0;

        for (int i = 0; i < n; i++) {
            long fee = sc.nextLong();
         
         
         sum += fee;
         if(fee > max){
             max = fee;
         }
        
        }
        long discount = Math.min(c,max);
        long answer = sum -discount+1;
        System.out.println(answer);
        sc.close();
        
    }
}


