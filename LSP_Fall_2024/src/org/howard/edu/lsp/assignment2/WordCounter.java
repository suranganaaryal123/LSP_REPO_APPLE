//Name: Surangana Aryal

package org.howard.edu.lsp.assignment2;

import java.io.BufferedReader;
import java.io.FileReader; // to read files
import java.io.IOException; // to handle errors
import java.util.HashMap; 
import java.util.Map; // count the number of occurrence of each word

public class WordCounter {

	public static void main(String[] args) {
		// creating a hashmap to count the occurrence of each word
        Map<String, Integer> wordCounts = new HashMap<>();

        try {
            BufferedReader reader = new BufferedReader(new FileReader("src/org/howard/edu/lsp/assignment2/words.txt"));
            String line;
            // read until the last line
            while ((line = reader.readLine()) != null) {
            	// store each word from the line in the words array
                String[] words = line.toLowerCase().split("[^a-z]+");
                // iterate through each word of the array
                for (String word : words) {
                    if (word.length() > 3) { //include those words whose length is greater than 3
                        wordCounts.put(word, wordCounts.getOrDefault(word, 0) + 1);
                    }
                }
            }

            reader.close();
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());// prints the error message when the file can't be read
            return;
        }

        for (Map.Entry<String, Integer> entry : wordCounts.entrySet()) { // iterates through each key, value pair of hashmap
            System.out.println(entry.getKey() + " " + entry.getValue()); //prints the word alongside its number of occurrence
        }

	}

}
