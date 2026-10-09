/* 
QUESTION 3 
Given two integers left and right, return the count of numbers in the inclusive 
range [left, right] that have a prime number of set bits in their binary
representation.

A set bit is a 1 in the binary representation.

Sample Testcase:1
------------------------------------
input=6 10
output=4

Explanation:
------------------------------------------
Binary:
6  = 110   → 2 set bits → prime
7  = 111   → 3 set bits → prime
8  = 1000  → 1 set bit  → not prime
9  = 1001  → 2 set bits → prime
10 = 1010  → 2 set bits → prime

SOLUTION :
*/
import java.util.*;
public class Test04
{
    public static void main(String args[])
{
        Scanner sc=new Scanner(System.in);
        int l=sc.nextInt();
        int r=sc.nextInt();
        int s=0;
        for(int i=l;i<=r;i++)
{
            int k=Integer.bitCount(i);
            boolean p=true;
            if(k<2)
{
                p=false;
}else

{
                for(int j=2;j<=Math.sqrt(k);j++)
{
                    if(k%j==0)
{
                        p=false;
                        break;
}
}   
}    
            if(p)
{
                s++;
}
}
        System.out.println(s);
    

}

}
