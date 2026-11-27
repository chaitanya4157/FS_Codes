/* 

Meera is the head librarian of a busy city library. All the library cards are 
kept on one long shelf in strictly increasing order of their card numbers, and 
no card number is ever repeated. One afternoon a visitor hands her a card with 
the number x. If this card is already on the shelf, Meera wants to tell the 
visitor exactly where it sits, counting positions from 0. If the card is not 
on the shelf, she must find the place where it should be slotted in so that 
the shelf stays perfectly sorted, and tell the visitor that position instead. 
Help Meera by printing the required position. Required: O(log n).

Input Format
------------
- Line 1: An integer n, representing the number of cards
- Line 2: N space-separated distinct integers in strictly increasing order, representing the card numbers on the shelf.
- Line 3: An integer x, representing the card number to look for.

Output Format
-------------
Print a single integer representing the 0-indexed position of x if it is on the shelf, otherwise the position at which x should be inserted to keep the shelf sorted.

Sample test cases
--------------------------------------------------------------------
case=1
input=4
2 4 6 9
6
output=2
Explanation: Card 6 is on the shelf at index 2, therefore 2 is printed.

case=2
input=4
2 4 6 9
3
output=1
Explanation: Card 3 is not on the shelf; it is greater than 2 (index 0) and smaller than 4 (index 1), therefore it must be inserted at index 1.

case=3
input=4
2 4 6 9
10
output=4
Explanation: Card 10 is greater than every card on the shelf, therefore it goes after the last card, at index 4.

*/

import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int x = sc.nextInt();

        int low = 0;
        int high = n - 1;
        int ans = n;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] >= x) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        System.out.println(ans);
        sc.close();
    }
}
