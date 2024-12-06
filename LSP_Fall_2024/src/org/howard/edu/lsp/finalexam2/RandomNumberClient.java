package src.org.howard.edu.lsp.finalexam2;

public class RandomNumberClient {

    public static void main(String[] args) {
        // Get the singleton instance 
        RandomNumberService service = RandomNumberService.getInstance();

        // built-in random number generator strategy
        service.setStrategy(new BuiltInRandomGenerator());
        System.out.println("Random number using BuiltInRandomGenerator: " + service.generateRandomNumber());

        // custom random number generator strategy 
        service.setStrategy(new CustomRandomGenerator(12345));
        System.out.println("Random number using CustomRandomGenerator: " + service.generateRandomNumber());
    }
}
