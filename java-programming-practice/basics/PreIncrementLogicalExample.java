package basics;

// Demonstrates pre-increment and logical AND short circuit

public class PreIncrementLogicalExample {

    public static void main(String[] args) {

        int x = 10;
        int y = 20;

        if (++x >= 15 && y++ > 10) {
            System.out.println("hi");
        } else {
            System.out.println("Hello");
        }

        System.out.println(x);
        System.out.println(y);
    }
}
