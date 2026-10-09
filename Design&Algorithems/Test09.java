 
/*This method should return the largest value in an array, but it fails
for arrays containing all negative numbers.

input=-5 -2 -9 -1
output=-1
*/
import java.util.*;

public class Test09 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();

        String[] values = input.split(" ");

        int max = Integer.parseInt(values[0]);

        for (int i = 1; i < values.length; i++) {

            int num = Integer.parseInt(values[i]);

            if (num > max) {
                max = num;
            }
        }

        System.out.println(max);
    }
}