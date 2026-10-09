/* 
You are given a string s.

Reverse only the vowels in the string. All other characters must 
remain in their original positions.
The vowels are:

a, e, i, o, u
A, E, I, O, U

Return the modified string.

Sample Testcase:1
----------------------------------
input=hello
output=holle

Explanation:
----------------------------------------
The vowels are e and o. After reversing them, the string becomes holle.

ANSWER : 
 */
import java.util.Scanner;
class Test08
{
    public static void main(String[] args)
{
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char[] a = s.toCharArray();
        int i = 0;
        int j = a.length - 1;
         while(i<j)
{
            while (i < j && "aeiouAEIOU".indexOf(a[i]) == -1)
                i++;
            while (i < j && "aeiouAEIOU".indexOf(a[j]) == -1)
                j--;
            if(i<j)
{
                char temp = a[i];
                a[i] = a[j];
                a[j] = temp;
                i++;
                j--;

}
}
        System.out.print(new String(a));
}
}


    

