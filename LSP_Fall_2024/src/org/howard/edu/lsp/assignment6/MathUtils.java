package src.org.howard.edu.lsp.assignment6;

public class MathUtils {
    /**
     * Returns the factorial of a given non-negative integer.
     * If the input is negative, throws IllegalArgumentException.
     */
    public int factorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Number must be non-negative");
        }
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    /**
     * Returns true if the given number is a prime number, 
     * false otherwise.
     */
    public boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    /**
     * Returns the greatest common divisor (GCD) of two 
     * integers using the Euclidean algorithm. If either input 
     * is zero, returns the absolute value of the non-zero input.
     * If both inputs are zero, throws IllegalArgumentException.
     */
    public int gcd(int a, int b) {
        if (a == 0 && b == 0) {
            throw new IllegalArgumentException("Both numbers cannot be zero");
        }
        a = Math.abs(a);
        b = Math.abs(b);
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    // Main method for testing
    public static void main(String[] args) {
        MathUtils mathUtils = new MathUtils();

        // Testing factorial method
        System.out.println("Factorial of 5: " + mathUtils.factorial(5));  // Should print 120
        System.out.println("Factorial of 0: " + mathUtils.factorial(0));  // Should print 1

        // Testing isPrime method
        System.out.println("Is 7 prime? " + mathUtils.isPrime(7));  // Should print true
        System.out.println("Is 4 prime? " + mathUtils.isPrime(4));  // Should print false

        // Testing gcd method
        System.out.println("GCD of 54 and 24: " + mathUtils.gcd(54, 24));  // Should print 6
        System.out.println("GCD of 0 and 9: " + mathUtils.gcd(0, 9));  // Should print 9
    }
}
