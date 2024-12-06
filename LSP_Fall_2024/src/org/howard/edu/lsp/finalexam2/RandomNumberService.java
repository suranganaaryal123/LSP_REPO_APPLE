package src.org.howard.edu.lsp.finalexam2;

public class RandomNumberService {


   private static RandomNumberService instance;

   private RandomNumberGenerator strategy;

   private RandomNumberService() {}

   /**
    * Returns the singleton instance 
    * 
    * @return the singleton instance of RandomNumberService
    */
   public static RandomNumberService getInstance() {
       if (instance == null) {
           instance = new RandomNumberService();
       }
       return instance;
   }

   /**
    * Sets the strategy for generating random numbers.
    * 
    * @param strategy the strategy to set
    */
   public void setStrategy(RandomNumberGenerator strategy) {
       this.strategy = strategy;
   }

   /**
    * Generates a random number using the selected strategy.
    * 
    * @return a positive random integer
    * @throws IllegalStateException if no strategy is set
    */
   public int generateRandomNumber() {
       if (strategy == null) {
           throw new IllegalStateException("Random number generator strategy not set");
       }
       return strategy.generate();
   }
}
