package org.howard.edu.lsp.midterm.question4;

import java.util.HashMap;

public class MapUtilitiesDriver {
    public static void main(String[] args) {
        HashMap<String, String> map1 = new HashMap<>();
        HashMap<String, String> map2 = new HashMap<>();

        // Add values to map1
        map1.put("Alice", "Healthy");
        map1.put("Mary", "Ecstatic");
        map1.put("Bob", "Happy");
        map1.put("Chuck", "Fine");
        map1.put("Felix", "Sick");

        // Add values to map2
        map2.put("Mary", "Ecstatic");
        map2.put("Felix", "Healthy");
        map2.put("Ricardo", "Superb");
        map2.put("Tam", "Fine");
        map2.put("Bob", "Happy");

        // Output the number of common key/value pairs
        System.out.println("Number of common key/value pairs is: " + 
            MapUtilities.commonKeyValuePairs(map1, map2)); 
    }
}