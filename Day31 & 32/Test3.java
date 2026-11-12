/* 

We need to find a peak element and return its index.

The important condition is that the solution must run in O(log n) time.
Therefore, we should use Binary Search instead of checking every element one by one.

Sample Testcase:1
----------------------------
input=4
1 2 3 1
output=3

*/
import java.util.Scanner;
class sol{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int low = 0;
        int high = n - 1;
        while (low < high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] < arr[mid + 1]) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }
        System.out.println(low);
    }

}
