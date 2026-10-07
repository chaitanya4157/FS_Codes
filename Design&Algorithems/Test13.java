/* 

In a numbering game few numbers are categorized as few specifications as 
mentioned below. Joy is trying to pick a number and find out what kind of 
specification does the number belong to. Help Joy to identify the 
specification whenever he chooses a number. Here are the specifications. 
• If n is odd, print Weird 
• If n is even and in the inclusive range of 2 to 5, print Not Weird 
• If n is even and in the inclusive range of 6 to 20, print Weird 
• If n is even and greater than 20, print Not Weird 

Sample Testcase:1
----------------------------
input=3
output=Weird
Explanation:
-----------------------------------
3 is odd

*/
import java.util.Scanner;

public class Test13{
    public static void main(String[] args) 
{
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n % 2 != 0){
            System.out.println("Weird");
}
        else if (n >= 2 && n <= 5) 
{
            System.out.println("Not Weird");
}
        else if (n >= 6 && n <= 20) 
{
            System.out.println("Weird");
}
        else 
{
            System.out.println("Not Weird");
}
    

}

}


    

