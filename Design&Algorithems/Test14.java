/* 
Bob is building a chat application that stores text messages efficiently.
To save storage space, he wants to compress consecutive repeated characters in a message.
Compression Rules
1. Consecutive repeated characters are replaced by:
   character + number of repetitions
2. The count must always be included, even when the character appears only once.
3. If the compressed string is greater than or equal to the length of the
 original string, return the original string instead.

Input Format:
---------------------------
A string s containing lowercase English letters.

Output Format:
----------------------------
Return the compressed string if it is shorter than the 
original string; otherwise, return the original string.

Sample Testcase:1
---------------------------------
input=aaaabbbbacccdddd
output=a4b4a1c3d4

*/
import java.util.*;
public class Test14
{
    public static void main(String args[])
{
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String res="";
        int c=1;
        for(int i=1;i<=s.length()-1;i++)
{
            if(s.charAt(i)==s.charAt(i-1))
{
                c++;
}else

{
                res+=String.valueOf(s.charAt(i-1))+c;
                c=1;
}
}
        res+=String.valueOf(s.charAt(s.length()-1))+c;
        System.out.println(res);
}

}


