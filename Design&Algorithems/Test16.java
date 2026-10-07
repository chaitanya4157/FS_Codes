/* 
QUESTION 18 : STRING QUESTION 

Given a string containing only lowercase a and b, return the number 
of non-empty substrings that contain an equal number of as and bs, 
where all as and all bs in the substring are grouped consecutively.

Sample Testcase:1
-----------------------
input=aabbabb
output=4

Explanation:
-----------------------------
The valid substrings are:aabb,ab,bba,ba

*/
import java.util.*;

public class Test16 {
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

  

