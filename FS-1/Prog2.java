/* 

You are given an array of n integers sorted in ascending order 
(non-decreasing order). The array may contain duplicate elements.

You are also given k queries. Each query consists of an integer x.

For every query, find the smallest 1-based index of an element in the array 
that is greater than or equal to x.

If no such element exists, print n + 1.
Input Format:
---------------------------
- The first line contains two integers n and k, representing the size of the 
  array and the number of queries.
- The second line contains n integers in ascending order.
- The next line contains k integers, representing the queries.

Output Format
----------------------------------------------
For each query, print the smallest 1-based index i such that:
a[i]>=x
If no such index exists, print n + 1.
Print each answer on a separate line.
Note: Do it in O(log n) complexity

Sample Testcase:1
------------------------------------
input=5 5
2 4 4 7 9
4 1 10 8 7
output=2 1 6 5 4

Explanation:
-------------------------------
 In sample 1, x = 4 first appears at index 2. x = 1 is smaller than everything, 
so the answer is 1. x = 10 is larger than everything, so the answer 
is n + 1 = 6. x = 8 first fits at 9, which is index 5.

*/
import java.util.Scanner;

public class Prog2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        for (int j = 0; j < k; j++) {
            int x = sc.nextInt();

            int low = 0;
            int high = n - 1;
            int ans = n;

            while (low <= high) {
                int mid = low + (high - low) / 2;

                if (arr[mid] >= x) {
                    ans = mid;
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            }

            System.out.println(ans + 1);
        }

        sc.close();
    }
}
