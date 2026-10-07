/* 
QUESTION 20 : 

Given a string s, create a new string by taking characters alternately from 
the beginning and end of the string.

Start with the first character, then take the last character, then the 
second character, then the second-last character, and so on.

Sample Testcase:1
-----------------------
input=abcdef
output=afbecd

Explanation:
---------------------------------------
First  → a
Last   → f
Second → b
Second last → e
Third  → c
Third last → d
So:a + f + b + e + c + d
*/
import java.util.*;

public class Test18 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        int left = 0;
        int right = s.length() - 1;

        String result = "";

        while (left <= right) {

            result = result + s.charAt(left);

            if (left != right) {
                result = result + s.charAt(right);
            }

            left++;
            right--;
        }

        System.out.println(result);

        sc.close();
    }
}

