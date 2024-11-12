package org.howard.edu.assignment6;

//How to Download and Install JUnit in Eclipse? https://staragile.com/blog/install-junit-in-eclipse 


import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class IntegerSetTest {
    private IntegerSet set1;
    private IntegerSet set2;
    
    @BeforeEach
    void setUp() {
        set1 = new IntegerSet();
        set2 = new IntegerSet();
    }
    
    @Test
    @DisplayName("Test case for clear")
    public void testClear() {
        set1.add(1);
        set1.add(2);
        set1.clear();
        assertTrue(set1.isEmpty());
        assertEquals(0, set1.length());
    }
    
    @Test
    @DisplayName("Test case for length")
    public void testLength() {
        assertEquals(0, set1.length());
        set1.add(1);
        assertEquals(1, set1.length());
        set1.add(2);
        assertEquals(2, set1.length());
        // Test duplicate
        set1.add(2);
        assertEquals(2, set1.length());
    }
    
    @Test
    @DisplayName("Test case for equals")
    public void testEquals() {
        assertTrue(set1.equals(set2)); // Empty sets should be equal
        
        set1.add(1);
        set1.add(2);
        set2.add(2);
        set2.add(1);
        assertTrue(set1.equals(set2)); // Sets with same elements in different order
        
        set2.add(3);
        assertFalse(set1.equals(set2)); // Different sets
    }
    
    @Test
    @DisplayName("Test case for contains")
    public void testContains() {
        set1.add(1);
        set1.add(2);
        
        assertTrue(set1.contains(1));
        assertTrue(set1.contains(2));
        assertFalse(set1.contains(3));
    }
    
    @Test
    @DisplayName("Test case for largest")
    public void testLargest() throws IntegerSetException { //throws an error when set is empty
        set1.add(1);
        set1.add(3);
        set1.add(2);
        
        assertEquals(3, set1.largest());
    }
    
    @Test
    @DisplayName("Test case for largest with empty set")
    public void testLargestEmpty() {
        assertThrows(IntegerSetException.class, () -> { //throws an error when set is empty
            set1.largest();
        });
    }
    
    @Test
    @DisplayName("Test case for smallest")
    public void testSmallest() throws IntegerSetException {
        set1.add(3);
        set1.add(1);
        set1.add(2);
        
        assertEquals(1, set1.smallest());
    }
    
    @Test
    @DisplayName("Test case for smallest with empty set")
    public void testSmallestEmpty() {
        assertThrows(IntegerSetException.class, () -> {
            set1.smallest();
        });
    }
    
    @Test
    @DisplayName("Test case for add")
    public void testAdd() {
        set1.add(1);
        assertTrue(set1.contains(1));
        assertEquals(1, set1.length());
        
        // Test adding duplicate
        set1.add(1);
        assertEquals(1, set1.length());
    }
    
    @Test
    @DisplayName("Test case for remove")
    public void testRemove() {
        set1.add(1);
        set1.add(2);
        
        set1.remove(1);
        assertFalse(set1.contains(1));
        assertEquals(1, set1.length());
        
        // Test removing non-existent element
        set1.remove(3);
        assertEquals(1, set1.length());
    }
    
    @Test
    @DisplayName("Test case for union")
    public void testUnion() {
        set1.add(1);
        set1.add(2);
        set2.add(2);
        set2.add(3);
        
        set1.union(set2);
        assertTrue(set1.contains(1));
        assertTrue(set1.contains(2));
        assertTrue(set1.contains(3));
        assertEquals(3, set1.length());
    }
    
    @Test
    @DisplayName("Test case for intersect")
    public void testIntersect() {
        set1.add(1);
        set1.add(2);
        set2.add(2);
        set2.add(3);
        
        set1.intersect(set2);
        assertFalse(set1.contains(1));
        assertTrue(set1.contains(2));
        assertFalse(set1.contains(3));
        assertEquals(1, set1.length());
    }
    
    @Test
    @DisplayName("Test case for diff")
    public void testDiff() {
        set1.add(1);
        set1.add(2);
        set2.add(2);
        set2.add(3);
        
        set1.diff(set2);
        assertTrue(set1.contains(1));
        assertFalse(set1.contains(2));
        assertFalse(set1.contains(3));
        assertEquals(1, set1.length());
    }
    
    @Test
    @DisplayName("Test case for complement")
    public void testComplement() {
        set1.add(1);
        set1.add(2);
        set2.add(1);
        set2.add(2);
        set2.add(3);

        IntegerSet result = set2.complement(set1);
    
        assertFalse(result.contains(1)); 
        assertFalse(result.contains(2)); 
        assertTrue(result.contains(3));  
        assertEquals(1, result.length()); 
    }
    
    @Test
    @DisplayName("Test case for isEmpty")
    public void testIsEmpty() {
        assertTrue(set1.isEmpty());
        
        set1.add(1);
        assertFalse(set1.isEmpty());
        
        set1.clear();
        assertTrue(set1.isEmpty());
    }
    
    @Test
    @DisplayName("Test case for toString")
    public void testToString() {
        assertEquals("[]", set1.toString());
        
        set1.add(1);
        set1.add(2);
        assertEquals("[1, 2]", set1.toString());
    }
}
