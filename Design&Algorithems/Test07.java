  
/*
This method should count vowels in a string regardless of case,
but it undercounts.

input=Hello World
output=3
*/
import java.util.*;

public class Test07 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        int count = 0;

        for (int i = 0; i < s.length(); i++) {

            char ch = Character.toLowerCase(s.charAt(i));

            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++;
            }
        }

        System.out.println(count);
    }
}