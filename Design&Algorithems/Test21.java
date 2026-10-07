/* 
You are given a 0-indexed integer array nums and an integer threshold.

Find the length of the longest subarray of nums starting at index l
and ending at index r (0 <= l <= r < nums.length) that satisfies the following
conditions:

nums[l] % 2 == 0
For all indices i in the range [l, r - 1], nums[i] % 2 != nums[i + 1] % 2
For all indices i in the range [l, r], nums[i] <= threshold
Return an integer denoting the length of the longest such subarray.

Note: A subarray is a contiguous non-empty sequence of elements within an array.

Sample Testcase:1
-------------------------------------
input=3 2 5 4
5
output=3
Explanation:
----------------------------------------
In this example, we can select the subarray that starts at l = 1 and
ends at r = 3 => [2,5,4]. This subarray satisfies the conditions.
Hence, the answer is the length of the subarray, 3. We can show that 3 is 
the maximum possible achievable length.

*/
import java.util.*;

public class Test21 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String line = sc.nextLine();
        String[] a = line.split(" ");

        int[] nums = new int[a.length];

        for (int i = 0; i < a.length; i++) {
            nums[i] = Integer.parseInt(a[i]);
        }

        int threshold = sc.nextInt();

        int max = 0;

        for (int i = 0; i < nums.length; i++) {

            if (nums[i] % 2 != 0 || nums[i] > threshold) {
                continue;
            }

            int length = 1;

            for (int j = i + 1; j < nums.length; j++) {

                if (nums[j] > threshold) {
                    break;
                }

                if (nums[j] % 2 == nums[j - 1] % 2) {
                    break;
                }

                length++;
            }

            if (length > max) {
                max = length;
            }
        }

        System.out.println(max);

        sc.close();
    }
}