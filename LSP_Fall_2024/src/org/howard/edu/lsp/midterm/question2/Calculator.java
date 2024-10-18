package org.howard.edu.lsp.midterm.question2;

public class Calculator {
	//adds two integers together and returns the result
    public static int sum(int a, int b) {
        return a + b;
    }

    // Sum two double values
    public static double sum(double a, double b) {
        return a + b;
    }

    // Sum array of integers
    public static int sum(int[] arr) {
        int total = 0;
        // loops through ecah number
        for (int num : arr) {
            total += num;
        }
        return total;
    }
}

