package src.org.howard.edu.lsp.finalexam2;

import java.util.Random;

/**
 * Random number generator using Java's built-in Random class. abcd check
 */
public class BuiltInRandomGenerator implements RandomNumberGenerator {
    private final Random random = new Random();

    /**
     * Generates a random number between 1 and Integer.MAX_VALUE.
     * 
     * @return a random positive integer.
     */
    @Override
    public int generate() {
        return random.nextInt(Integer.MAX_VALUE) + 1; // Ensures positive integers
    }
}