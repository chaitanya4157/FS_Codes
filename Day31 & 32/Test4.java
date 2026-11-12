/* 
We are given n coins and need to arrange them in the shape of a staircase.
Rules:
- Row 1 requires 1 coin.
- Row 2 requires 2 coins.
- Row 3 requires 3 coins.
- Row 4 requires 4 coins.
- The last row can be incomplete.
We need to return the number of completely filled rows.
Sample Testcase:1
-------------------------------
input=5
output=2

*/


import java.util.Scanner;

public class Test4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int rows = 0;

        while (n >= rows + 1) {
            rows++;
            n = n - rows;
        }

        System.out.println(rows);

        sc.close();
    }
}
