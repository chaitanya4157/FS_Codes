/* 
public You are given a string s consisting of numerical characters (0–9). 
Your task is to find the largest non-empty substring that represents an odd number.
A substring is a contiguous sequence of characters within a string.
If no odd digit is found in the string, return an empty string "".

Input Format
--------------------------------------------
- A string s containing only numerical characters (0–9).

Output Format
----------------------------------------------
- Return the largest odd-number substring as a string.
- If no odd number can be formed, return "-1".


Sample Testcase:1
----------------------------------
input=23467850
output=2346785 
    
*/import java.util.Scanner;

public class Test24 {
    public static String largestOddNumber(String s) {
        for (int i = s.length() - 1; i >= 0; i--) {
            int digit = s.charAt(i) - '0';

            if (digit % 2 != 0) {
                return s.substring(0, i + 1);
            }
        }
        return "-1";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        System.out.println(largestOddNumber(s));

        sc.close();
    }
}

