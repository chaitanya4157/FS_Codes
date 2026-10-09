/* 

You are given two axis-aligned rectangles.
Each rectangle is represented as:
[x1, y1, x2, y2]
where:
(x1, y1) = bottom-left corner
(x2, y2) = top-right corner

Return true if the two rectangles overlap with positive area.
If they only touch at an edge or corner, return false.

Sample Testcase:1
-------------------------------
input=0 0 2 2
1 1 3 3
output=true

      (3,3)
        |
    +---+ 
    |   |
  +-+---+
  | |   |
  | +---+
  |     
  +---------
(0,0)
They overlap in this region:
SOLUTION :

*/
import java.util.*;
public class Test2
{
    public static void main(String args[])
{
        Scanner sc=new Scanner(System.in);
        int x1=sc.nextInt();  
        int y1=sc.nextInt();
        int x2=sc.nextInt();
        int y2=sc.nextInt();
        int a1=sc.nextInt();
        int b1=sc.nextInt();
        int a2=sc.nextInt();
        int b2=sc.nextInt();
        if(x1<a2 && x2>a1 && y1<b2 && y2>b1)
{
            System.out.println("true");
}else
{
            System.out.println("false");
}
}

}
