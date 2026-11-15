package basics;

// Print "Hi" 10 times using while loop

public class WhileLoopExample {
    public static void main(String[] args) {
        int x = 1;
        while (x <= 10) {
            System.out.println("Hi");
            x++;
        }
        System.out.println(x); // when it becomes 11 it stops, and print 11.
    }
}