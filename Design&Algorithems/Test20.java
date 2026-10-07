/* 
Given a binary string s, return the number of non-empty substrings that have the 
same number of 0's and 1's, and all the 0's and all the 1's in these substrings
 are grouped consecutively.

Substrings that occur multiple times are counted the number of times they occur.

Sample Testcase:1
-------------------------------
input=00110011
output=6

Explanation:
-------------------------------
There are 6 substrings that have equal number of consecutive 
1's and 0's: "0011", "01", "1100", "10", "0011", and "01".
Notice that some of these substrings repeat and are counted the number of 
times they occur.
Also, "00110011" is not a valid substring because all the 0's (and 1's) are not 
grouped together.

SOLUTION:
*/
import java.util.Scanner;
public class Test20
{
    public static int countBinarySubstrings(String s) 
{
        int previous = 0;
        int current = 1;
        int count = 0;
        for (int i = 1; i < s.length(); i++) 
{
            if (s.charAt(i) == s.charAt(i - 1)) 
{
                current++;
} else 
{
                count += Math.min(previous, current);
                previous = current;
                current = 1;
}
}
        count += Math.min(previous, current);
        return count;
}
    public static void main(String[] args) 
{
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(countBinarySubstrings(s));
}

}

