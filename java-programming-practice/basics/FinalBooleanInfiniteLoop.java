package basics;

// Demonstrates compile time error due to unreachable code

public class FinalBooleanInfiniteLoop {

    public static void main(String[] args) {

        final boolean b = true;

        while (b) {
            System.out.println("hi");
        }
        // System.out.println("hello"); // unreachable code → compile time error
    }
}
//→  