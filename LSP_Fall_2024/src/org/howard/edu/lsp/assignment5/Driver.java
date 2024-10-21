package org.howard.edu.lsp.assignment5;

public class Driver {
    public static void main(String[] args) {
        // Original Set1
        IntegerSet set1 = new IntegerSet(); //instantiating the set
        set1.add(1);
        set1.add(2);
        set1.add(3);// adding elements

        System.out.println("Value of Set1 is: " + set1.toString());
        System.out.println("Smallest value in Set1 is: " + set1.smallest());// calling method smallest
        System.out.println("Largest value in Set1 is: " + set1.largest());// calling method largest

        // Original Set2
        IntegerSet set2 = new IntegerSet(); //instantiating the set
        set2.add(3);
        set2.add(4);
        set2.add(5);// adding elements

        System.out.println("Value of Set2 is: " + set2.toString());

        // Union of Set1 and Set2
        System.out.println("Union of Set1 and Set2:");
        IntegerSet set1Union = new IntegerSet();
        set1Union.add(1);
        set1Union.add(2);
        set1Union.add(3);// adding elements to turn it to the original set after every operation
        set1Union.union(set2);
        System.out.println("Result of union: " + set1Union.toString());

        // Intersection of Set1 and Set2
        System.out.println("Intersection of Set1 and Set2:");
        IntegerSet set1Intersect = new IntegerSet();
        set1Intersect.add(1);
        set1Intersect.add(2);
        set1Intersect.add(3);// adding elements to turn it to the original set after every operation
        set1Intersect.intersect(set2);
        System.out.println("Result of intersection: " + set1Intersect.toString());

        // Difference of Set1 and Set2
        System.out.println("Difference of Set1 and Set2:");
        IntegerSet set1Diff = new IntegerSet();
        set1Diff.add(1);
        set1Diff.add(2);
        set1Diff.add(3);// adding elements to turn it to the original set after every operation
        set1Diff.diff(set2);
        System.out.println("Result of difference: " + set1Diff.toString());
    }
}
