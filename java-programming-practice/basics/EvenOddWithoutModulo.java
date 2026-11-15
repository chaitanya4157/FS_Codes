package basics;

// Check even or odd without using modulo operator

public class EvenOddWithoutModulo {

    public static void main(String[] args) {

        int n = 11;

        if ((n & 1) == 0) {
            System.out.println(n + " is even");
        } else {
            System.out.println(n + " is odd");
        }
    }
}
