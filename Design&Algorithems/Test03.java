/*   
QUESTION 4 
A confusing number is a number that, when rotated 180 degrees, 
becomes a different valid number.

When rotating digits:
0 → 0
1 → 1
6 → 9
8 → 8
9 → 6

Digits 2, 3, 4, 5, 7 are invalid because they cannot be rotated into
valid digits.

Given an integer n, return true if it is a confusing number; 
otherwise return false.

Sample Testcase:1
---------------------------------------
input=6
output=true

Explanation:
--------------------------------
6 → 9
The rotated number is different.
SOLUTION :
*/

import java.util.*;
public class Test03
{
    public static void main(String args[])
{
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=n;
        int s=0;
        HashMap<Integer,Integer> h=new HashMap<>();
        h.put(0,0);
        h.put(1,1);
        h.put(6,9);
        h.put(9,6);
        h.put(8,8);
        while(n>0)
{
            int d=n%10;
            if(!h.containsKey(d))
{
                System.out.println("false");
}
            s=s*10+h.get(d);
            n/=10;
}
        if(m!=n)
{
            System.out.println("true");
}else
{
            System.out.println("false");
}
}
}


