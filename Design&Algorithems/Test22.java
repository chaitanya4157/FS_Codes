/* 
Clara has a string containing uppercase and lowercase English letters. 
She wants to clean the string using the following rules.
Cleaning Rules
1. In one operation, the machine can remove any occurrence of:
   - "ab" — lowercase a followed immediately by lowercase b
   - "AB" — uppercase A followed immediately by uppercase B
2. After removing "ab" or "AB", the remaining parts of the string are joined 
together.
3. The operation can be performed any number of times, until there are no
"ab" or "AB" substrings left.
4. The order in which the pairs are removed does not matter.

Return the final cleaned string.

Input Format
------------------------
A string s containing uppercase and lowercase English letters.
Output Format
--------------------------
Return the string after removing all possible occurrences of "ab" and "AB".

Sample Testcase:1
----------------------------
input=aBxabABcab
output=aBxc

*/
import java.util.*;

public class Test22 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        String result = "";

        for (int i = 0; i < s.length(); i++) {

            result = result + s.charAt(i);

            if (result.length() >= 2) {

                int n = result.length();

                if ((result.charAt(n - 2) == 'a' && result.charAt(n - 1) == 'b') ||
                    (result.charAt(n - 2) == 'A' && result.charAt(n - 1) == 'B')) {

                    result = result.substring(0, n - 2);
                }
            }
        }

        System.out.println(result);

        sc.close();
    }
}



