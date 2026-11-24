/* 
There are n chores and chore i has complexity h. Petya will do exactly a chores 
and Vasya will do exactly b chores, with a + b = n. Petya takes the chores whose
complexity is strictly greater than some integer x, and Vasya takes the ones
with complexity at most x. Count the integer values of x that give Petya exactly 
a chores and Vasya exactly b.

Input Format:
-------------------
 n a b, then n complexities.   
 (2 <= n <= 2000, a + b = n, a >= 1, b >= 1, 1 <= h_i <= 10^9)
 
Output Format:
-------------------
One integer: the number of valid x.

Sample Testcase:1
-----------------------------
input=6 2 4
10 3 7 3 15 8
output=2

Sample Testcase:2
-----------------------------
input=3 1 2
4 4 9
output=5

Explanation:
----------------------------------

Sample 1: 10 3 7 3 15 8 the answer is 2.

*/
import java.util.*;

public class Prog1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);

        long left = arr[b - 1];
        long right = arr[b];

        System.out.println(right - left);

        sc.close();
    }
}