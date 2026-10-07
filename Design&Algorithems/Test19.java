/* 
QUESTION 23:
Given two strings s and t, return true if s is a subsequence of t, or false otherwise.

A subsequence of a string is a new string that is formed from the original 
string by deleting some (can be none) of the characters without disturbing 
the relative positions of the remaining characters. (i.e., "ace" is a 
subsequence of "abcde" while "aec" is not).

Sample Testcase:1
-----------------------------------
input=abc
ahbgdc
output=true

Sample Testcase:2
-----------------------------------
input=axc
ahbgdc
output=false

SOLUTION :
*/
import java.util.Scanner;
public class Test19
{
    public static void main(String[] args) 
{
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String t = sc.nextLine();
        int i = 0;
        int j = 0;
        while (i < s.length() && j < t.length()) 
{
            if (s.charAt(i) == t.charAt(j)) 
{
                i++;
}
            j++;
}

        System.out.println(i == s.length());
    

}

}

