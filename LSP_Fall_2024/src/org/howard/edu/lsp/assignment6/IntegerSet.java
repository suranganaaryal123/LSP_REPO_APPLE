package org.howard.edu.assignment6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * This class will accept set of integers.
 * This class has several methods
 * Clearing the set, finding the length, comparing two sets,
 * finding the largest/smallest element from the set, and removing an element
 * finding the union, intersection and difference between two sets, complement of the given set
 * displaying the string representation of the set
 */
public class IntegerSet {
    private List<Integer> set = new ArrayList<Integer>();

    /**
     * constructor that creates an empty set
     */
    public IntegerSet() {}

    /**
     * constructor to initializes a set with a given  list of integers
     * @param set is a list of integers to initialize the set
     */
    public IntegerSet(ArrayList<Integer> set) {
        this.set = set;
    }

    /**
     * this method clears the entire set
     */
    public void clear() {
        set.clear();
    }

    /**
     * this method returns the number of elements in the set.
     * @return the number of elements in the set
     */
    public int length() {
        return set.size();
    }

    /**
     * this method checks if two sets are equal
     * two sets are considered equal if they contain the same elements
     * @param o the object to compare with.
     * @return true if the sets are equal and false otherwise.
     */
    @Override
    public boolean equals(Object o) {
        if (!(o instanceof IntegerSet)) {
            return false;
        }
        IntegerSet otherSet = (IntegerSet) o;
        List<Integer> sortedThisSet = new ArrayList<>(set);
        List<Integer> sortedOtherSet = new ArrayList<>(otherSet.set);
        Collections.sort(sortedThisSet);
        Collections.sort(sortedOtherSet);
        return sortedThisSet.equals(sortedOtherSet);
    }

    /**
     * checks if the set contains a specific value
     * @param value is the value we are looking for
     * @return true if the set contains the value and false otherwise
     */
    public boolean contains(int value) {
        return set.contains(value);
    }

    /**
     * this method is to find the largest element in the set
     * @return the largest element
     * @throws IllegalStateException if the set is empty, this is a new change that i made
     */
    public int largest() throws IntegerSetException {
        if (set.isEmpty()) {
            throw new IntegerSetException("The set is empty.");
        }
        return Collections.max(set);
    }

    /**
     * this method is to find the smallest element in the set
     * @return the smallest element
     * @throws IllegalStateException if the set is empty, this is a new change that i made
     */
     public int smallest() throws IntegerSetException {
         if (set.isEmpty()) {
              throw new IntegerSetException("The set is empty.");
         }
         return Collections.min(set);
        }

    /**
     * this method adds an element to the set if it is not already present
     * @param item the element to be added
     */
    public void add(int item) {
        if (!set.contains(item)) {
            set.add(item);
        }
    }

    /**
     * this method removes an element from the set if it exists
     * @param item the element to be removed
     */
    public void remove(int item) {
        set.remove(Integer.valueOf(item));
    }

    /**
     * this method changes the set to be the union of it and another set
     * @param intSetb the set to be combined with this set
     */
    public void union(IntegerSet intSetb) {
        for (int item : intSetb.set) {
            if (!set.contains(item)) {
                set.add(item);
            }
        }
    }

    /**
     * this method changes the set to be the union of it and another set
     * @param intSetb the set to be intersected with this set
     */
    public void intersect(IntegerSet intSetb) {
        set.retainAll(intSetb.set);
    }

    /**
     * this method changes the set to be the difference between it and another set 
     * @param intSetb is the new set it will be subtracted from
     */
    public void diff(IntegerSet intSetb) {
        set.removeAll(intSetb.set);
    }

    /**
     * this method changes the set to include elements not in the current set 
     * @param intSetb the set to be compared with this
     */
    public void complement(IntegerSet intSetb) {
        List<Integer> complementSet = new ArrayList<>();
        for (int item : intSetb.set) {
            if (!set.contains(item)) {
                complementSet.add(item);
            }
        }
        set.clear();
        set.addAll(complementSet);
    }

    /**
     * checks if the set is empty
     * @return true if the set is empty and false otherwise
     */
    public boolean isEmpty() {
        return set.isEmpty();
    }

    /**
     * this method returns a string representation of the set.
     * @return a string representation of the set.
     */
    @Override
    public String toString() {
        return set.toString();
    }
}
