package src.org.howard.edu.lsp.finalexam2;

import java.util.Random;

/**
 * Random number generator abcd check
 */
public class BuiltInRandomGenerator implements RandomNumberGenerator {
    private final Random random = new Random();

    /**
     * Generates a random number 
     * 
     * @return a random positive integer.
     */
    @Override
    public int generate() {
        return random.nextInt(Integer.MAX_VALUE) + 1; 
    }
}
