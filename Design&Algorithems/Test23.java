/* 
Given two integers L and R, find the total number of set bits (1s) present 
in the binary representations of all integers from L to R, inclusive.

A set bit is a bit whose value is 1.

Sample Testcase:1
-----------------------------------
input=2 5
output=6

Explanation:
--------------------------------------------------
Binary representations:

2 = 10     → 1 set bit
3 = 11     → 2 set bits
4 = 100    → 1 set bit
5 = 101    → 2 set bits

Total:
1 + 2 + 1 + 2 = 6

*/
import java.util.*;

public class Test23 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int L = sc.nextInt();
        int R = sc.nextInt();

        int total = 0;

        for (int i = L; i <= R; i++) {
            int n = i;

            while (n > 0) {
                total = total + (n & 1);
                n = n >> 1;
            }
        }

        System.out.println(total);
    }
}