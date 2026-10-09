/* 
    
You are given:arr1,arr2,d
For every element x in arr1, check whether there is any element
y in arr2 such that: |x - y| <= d

If such an element exists, x is not counted.
Otherwise, count x.
Return the total count.

Sample Testcase:1
-----------------------------------
input=3
4 5 8
4
10 9 1 8
2
output=2

Explanation:
---------------------------------
For 4:
|4-10| = 6
|4-9|  = 5
|4-1|  = 3
|4-8|  = 4
All are greater than 2.
For 5:
|5-8| = 3
For 8:
|8-9| = 1
SOLUTION :
 */
import java.util.*;

public class Test06 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        
        int n = sc.nextInt();


        int[] arr1 = new int[n];

        for (int i = 0; i < n; i++) {
            arr1[i] = sc.nextInt();
        }
        int m = sc.nextInt();
        int[] arr2 = new int[m];

        for (int i = 0; i < m; i++) {
            arr2[i] = sc.nextInt();
        }

   
        int d = sc.nextInt();

        int count = 0;

        
        for (int i = 0; i < n; i++) {

            boolean found = false;

           
            for (int j = 0; j < m; j++) {

                if (Math.abs(arr1[i] - arr2[j]) <= d) {
                    found = true;
                    break;
                }
            }

          
            if (!found) {
                count++;
            }
        }

        System.out.println(count);

        sc.close();
    }
}