package basics;

// Check if a number is power of 2

public class PowerOfTwoCheck {
    public static void main(String[] args) {
        int n = 18;
        if (n > 0 && (n & (n - 1)) == 0) {
            System.out.println(n + " is power of 2");
        } else {
            System.out.println(n + " is not power of 2");
        }
    }
}


//Checks power of 2: if n > 0 and (n & (n - 1)) == 0, it means only one(1) bit is set
