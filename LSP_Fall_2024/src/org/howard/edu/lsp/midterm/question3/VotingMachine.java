package org.howard.edu.lsp.midterm.question3;
//citation
//hashmaps: https://www.w3schools.com/java/java_hashmap.asp
import java.util.HashMap;

public class VotingMachine {
	//HashMap to store candidate names and their vote counts
    private HashMap<String, Integer> candidates;

    // Constructor
    public VotingMachine() {
        candidates = new HashMap<>();
    }

    // Add a candidate to the list
    public void addCandidate(String name) {
        candidates.put(name, 0);// set initial value to 0
    }

    // Cast a vote for a candidate
    public void castVote(String name) {
    	// Check if the candidate is in the list
        if (candidates.containsKey(name)) {
        	//if exist increase the votecount by 1
            candidates.put(name, candidates.get(name) + 1);
        } else {
            System.out.println("Candidate does not exist.");
        }
    }

    // Override toString to print candidate vote count
    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        // Loop through all candidates
        for (String candidate : candidates.keySet()) {
        	// Append each candidate and their vote count to the result
            result.append(candidate).append(": ").append(candidates.get(candidate)).append(" votes\n");
        }
        return result.toString();
    }

    // VotingMachineDriver for testing to instantiate the class
    public static void main(String[] args) {
        VotingMachine vm = new VotingMachine();
        vm.addCandidate("Alsobrooks");
        vm.castVote("Alsobrooks");
        vm.addCandidate("Hogan");
        vm.castVote("Alsobrooks"); 
        System.out.println(vm.toString()); 
    }
}
