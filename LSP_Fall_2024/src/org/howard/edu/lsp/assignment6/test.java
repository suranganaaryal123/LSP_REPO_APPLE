package src.org.howard.edu.lsp.assignment6;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class test {

    @Test
    public void testSum() {
        SumCalculator calculator = new SumCalculator();

        // Test 1: Sum of 10 and 20
        int result = calculator.sum(10, 20);
        assertEquals("Sum of 10 and 20 should be 30", 30, result);

        // Test 2: Sum of -10 and 20
        result = calculator.sum(-10, 20);
        assertEquals("Sum of -10 and 20 should be 10", 10, result);

        // Test 3: Sum of 0 and 0
        result = calculator.sum(0, 0);
        assertEquals("Sum of 0 and 0 should be 0", 0, result);

        // Test 4: Sum of -10 and -20
        result = calculator.sum(-10, -20);
        assertEquals("Sum of -10 and -20 should be -30", -30, result);
    }
}
