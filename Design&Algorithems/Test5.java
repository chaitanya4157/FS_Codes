
/* 
You are given a sorted character array and a target character.
Find the smallest character that is greater than the target.
If there is no such character, return the first character.

Sample Testcase:1
-----------------------------------
input=c f j
a
output=c

Explanation:
--------------------------
The smallest character greater than target is c
SOLUTION :

*/
import java.util.*;

public class Test5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        char[] arr = new char[3];

        for (int i = 0; i < 3; i++) {
            arr[i] = sc.next().charAt(0);
        }

        char target = sc.next().charAt(0);

        char ans = arr[0];

        for (int i = 0; i < 3; i++) {
            if (arr[i] > target) {
                ans = arr[i];
                break;
            }
        }

        System.out.println(ans);
    }
}

