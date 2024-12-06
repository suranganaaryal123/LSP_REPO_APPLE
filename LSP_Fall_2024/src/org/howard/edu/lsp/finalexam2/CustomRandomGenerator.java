package src.org.howard.edu.lsp.finalexam2;

public class CustomRandomGenerator implements RandomNumberGenerator {

    private long seed; // Seed for the random number generator

    /**
     * Constructor to initialize the random number generator with a seed.
     * 
     * @param seed the initial seed value for the random number generation.
     */
    public CustomRandomGenerator(long seed) {
        this.seed = seed;
    }

    /**
     * Generates a random number using a simple Linear Congruential Generator.
     * 
     * @return a random positive integer.
     */
    @Override
    public int generate() {
        // Simple Linear Congruential Generator algorithm
        seed = (seed * 1103515245 + 12345) % (1 << 31);
        return (int) (seed % Integer.MAX_VALUE) + 1; // Ensures positive integers
    }
}