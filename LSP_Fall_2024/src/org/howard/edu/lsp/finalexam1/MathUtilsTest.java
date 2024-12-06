package src.org.howard.edu.lsp.finalexam1;

import static org.junit.Assert.*;

import org.junit.Test;

public class MathUtilsTest {
	MathUtils mathUtils = new MathUtils();

    // Test cases for the factorial method
    @Test
    public void testFactorialWithZero() {
        assertEquals("Factorial of 0 should be 1", 1, mathUtils.factorial(0));
    }

    @Test
    public void testFactorialWithPositiveNumber() {
        assertEquals("Factorial of 5 should be 120", 120, mathUtils.factorial(5));
    }

    @Test
    public void testFactorialWithOne() {
        assertEquals("Factorial of 1 should be 1", 1, mathUtils.factorial(1));
    }

    // Test cases for the isPrime method
    @Test
    public void testIsPrimeWithPrimeNumber() {
        assertTrue("7 should be a prime number", mathUtils.isPrime(7));
    }

    @Test
    public void testIsPrimeWithNonPrimeNumber() {
        assertFalse("4 should not be a prime number", mathUtils.isPrime(4));
    }

    @Test
    public void testIsPrimeWithOne() {
        assertFalse("1 should not be a prime number", mathUtils.isPrime(1));
    }

    @Test
    public void testIsPrimeWithNegativeNumber() {
        assertFalse("-7 should not be a prime number", mathUtils.isPrime(-7));
    }

    @Test
    public void testIsPrimeWithZero() {
        assertFalse("0 should not be a prime number", mathUtils.isPrime(0));
    }

    // Test cases for the gcd method
    @Test
    public void testGcdWithPositiveNumbers() {
        assertEquals("GCD of 54 and 24 should be 6", 6, mathUtils.gcd(54, 24));
    }

    @Test
    public void testGcdWithOneZero() {
        assertEquals("GCD of 7 and 0 should be 7", 7, mathUtils.gcd(7, 0));
        assertEquals("GCD of 0 and 9 should be 9", 9, mathUtils.gcd(0, 9));
    }

    @Test
    public void testGcdWithBothZero() {
        try {
            mathUtils.gcd(0, 0);
            fail("Expected IllegalArgumentException to be thrown");
        } catch (IllegalArgumentException e) {
            assertEquals("Both numbers cannot be zero", e.getMessage());
        }
    }

    @Test
    public void testGcdWithNegativeNumbers() {
        assertEquals("GCD of -54 and 24 should be 6", 6, mathUtils.gcd(-54, 24));
        assertEquals("GCD of 54 and -24 should be 6", 6, mathUtils.gcd(54, -24));
        assertEquals("GCD of -54 and -24 should be 6", 6, mathUtils.gcd(-54, -24));
    }

}
