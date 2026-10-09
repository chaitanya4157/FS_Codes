/* 

Question 1
There are n children standing in a line, numbered from:0 to n-1

Initially, the ball is with child 0.
Every second, the ball is passed to the next child in the current direction.
When the ball reaches either end of the line, the direction reverses.
Given n and k, return the number of the child who has the ball after k seconds.

Input Format:
--------------------------
Line-1: n(children) value and k(seconds) value

Sample Testcase:1
------------------------------
input=4 5
output=1

Explanation:
--------------------------------
Movement:
0 → 1 → 2 → 3 → 2 → 1

*/


import java.util.Scanner;
class Test01
{
    public static void main(String[] args) 
{
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int child = 0;
        int direction = 1;
        for (int i = 0; i < k; i++) 
{
            child = child + direction;
            if (child == n - 1 || child == 0) 
{
                direction = -direction;
}
}
        System.out.println(child);
}

}

