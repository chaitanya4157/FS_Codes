/* 
QUESTION 19 : 

Given a string containing only X and Y, count the number of non-empty 
substrings that contain equal numbers of X and Y, and all Xs and Ys 
occur in consecutive groups.

Sample Testcase:1
-----------------------
input=XXXYYYXX
output=5

Explanation:
-----------------------------
XXXYYY,XXYY,XYY,YYXX,YX

*/
import java.util.*;

public class Test17 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        int prev = 0;
        int curr = 1;
        int count = 0;

        for (int i = 1; i < s.length(); i++) {

            if (s.charAt(i) == s.charAt(i - 1)) {
                curr++;
            } else {
                count += Math.min(prev, curr);

                prev = curr;
                curr = 1;
            }
        }

        count += Math.min(prev, curr);

        System.out.println(count);

        sc.close();
    }
}
