package src.org.howard.edu.lsp.assignment6;

public class SumCalculator {

    // Method to calculate the sum of two numbers
    public int sum(int num1, int num2) {
        return num1 + num2;
    }

    public static void main(String[] args) {
        SumCalculator calculator = new SumCalculator();

        // Test the sum method
        int result = calculator.sum(10, 20);
        System.out.println("Sum of 10 and 20 is: " + result);
    }
}
