/* 
Given a string s, reverse the string according to the following rules:

All the characters that are not English letters remain in the same position.
All the English letters (lowercase or uppercase) should be reversed.
Return s after reversing it.

Sample Testcase:1
-------------------------------
input=ab-cd
output=dc-ba
*/
import java.util.*;
public class Test15
{
    public static void main(String args[])
{
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        char[] a=s.toCharArray();
        int l=0;
        int r=a.length-1;
        while(l<r)
{
            if(!Character.isLetter(a[l]))
{
                l++;
}
            else if(!Character.isLetter(a[r]))
{
                r--;
}else
{
                char t=a[l];
                a[l]=a[r];
                a[r]=t;
                l++;
                r--;
}
}
        System.out.println(new String(a));
}

}
