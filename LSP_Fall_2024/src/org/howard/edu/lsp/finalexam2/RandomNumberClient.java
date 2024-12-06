package src.org.howard.edu.lsp.finalexam2;

public class RandomNumberClient {

    public static void main(String[] args) {
        // Get the singleton instance of the RandomNumberService
        RandomNumberService service = RandomNumberService.getInstance();

        // Using the built-in random number generator strategy
        service.setStrategy(new BuiltInRandomGenerator());
        System.out.println("Random number using BuiltInRandomGenerator: " + service.generateRandomNumber());

        // Using the custom random number generator strategy with a seed of 12345
        service.setStrategy(new CustomRandomGenerator(12345));
        System.out.println("Random number using CustomRandomGenerator: " + service.generateRandomNumber());
    }
}
