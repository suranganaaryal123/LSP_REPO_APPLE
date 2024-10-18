package org.howard.edu.lsp.midterm.question4;

import java.util.HashMap;

public class MapUtilities {
	//counting how many key/value pairs are the same in both maps
    public static int commonKeyValuePairs(HashMap<String, String> map1, HashMap<String, String> map2) {
        int count = 0;

        // Check if either map is empty
        if (map1.isEmpty() || map2.isEmpty()) {
            return 0;
        }

        // Loop through each key in map1
        for (String key : map1.keySet()) {
        	// Check if map2 has the same key and if the values match
            if (map2.containsKey(key) && map1.get(key).equals(map2.get(key))) {
                count++;
            }
        }
        return count;//total number of common pairs we found
    }
}

