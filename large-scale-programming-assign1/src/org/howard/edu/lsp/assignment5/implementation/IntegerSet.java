package org.howard.edu.lsp.assignment5.implementation;

import java.util.ArrayList;
import java.util.Collections;

public class IntegerSet {
	
	private ArrayList<Integer> set = new ArrayList<Integer>();
	public ArrayList<Integer> getSet() { return set; }
	
	// Default Constructor
	public IntegerSet() {
		
		ArrayList<Integer> set = new ArrayList<Integer>();
		
		}
	
	// Clears the internal representation of the set
	public void clear() {
		set.clear();
		
	};

	// Returns the length of the  set
	public int length() {
		return set.size();
		
	};
	
	/*
	 * * Returns true if the 2 sets are equal, false otherwise;
	 * Two sets are equal if they contain all of the same values in ANY order.
	*/
	
	public boolean equals(IntegerSet b) {
		int first = 0;
		int sec = 0;
		for (int num : set) {
			if(b.getSet().contains(num)) {
				first++;
			} else {
				return false;

			}
		}
		
		if (first == set.size()) {
			for(int num2 : b.getSet()) {
				if (set.contains(num2)) {
					sec++;
				} else {
					return false;
				}
		if (sec == b.getSet().size()) {
			return true;
		}
			}
		}
		return true;
		
		
	};
	
	// Returns true if the set contains the value, otherwise false
	public boolean contains(int value) {
		if (set.contains(value)) {
			return true;
			
			
		} else {
			return false;
		}
	};
	
	// Returns the largest item in the set; Throws a IntegerSetException if the set is empty 
	public int largest() {
		//throws IntegerSetException
		if (set.isEmpty()) {
			throw new IntegerSetException("This set is empty");
		} else {
			Collections.sort(set);
			int result = set.get(set.size() - 1);
			return result;
					
		}
		
		
	};
	
	// Returns the smallest item in the set; Throws a IntegerSetException if the set is empty
	public int smallest() {
		//throws IntegerSetException
		if (set.isEmpty()) {
			throw new IntegerSetException("This set is empty");
		} else {
			Collections.sort(set);
			int result = set.get(0);
			return result;	
			
		}
	
		
	
	};


		// Adds an item to the set or does nothing to it

	public void add(int item) {
		if(!set.contains(item)) {
			set.add(item);
		}
		
	};

		// Removes an item from the set or does nothing if not there
	public void remove(int item) {
		//throws IntegerSetException
		if (set.isEmpty()) {
			throw new IntegerSetException("This set is empty");
			
			} else {
				set.remove(item);
			}
		
	};  //Throws a IntegerSetException of the set is empty

	// Set union
	public void union(IntegerSet intSetb) {
		for (int num : intSetb.getSet()) {
			set.add(num);
		}
	};

	// Set intersection
	public void intersect(IntegerSet intSetb) {
		ArrayList<Integer> interset = new ArrayList<Integer>();
		for (int num : set) {
			if (intSetb.getSet().contains(num)) {
				interset.add(num);
			}
		
		}
		
		for (int num : intSetb.getSet()) {
			if (set.contains(num)) {
				interset.add(num);
			}
		}
		
		set.clear();
		for (int num : interset) {
			if (!set.contains(num)) {
				set.add(num);
			}
		}
		
		
		
		}; 

	// Set difference, i.e., s1 –s2
	public void diff(IntegerSet intSetb) {
		ArrayList<Integer> set1 = new ArrayList<Integer>();
		ArrayList<Integer> set2 = new ArrayList<Integer>();
		for (int num : set) {
			if (!intSetb.getSet().contains(num)) {
				if(!set1.contains(num)) {
					set1.add(num);
				}
			}
		
		}
		
		
		
		for (int num : intSetb.getSet()) {
			if (!set.contains(num)) {
				if(!set2.contains(num)) {
					set2.add(num);
				}
			}
		}
		
		set.clear();
		for (int num : set1) {
			set.add(num);
		}
		
		intSetb.getSet().clear();
		for (int num : set2) {
			intSetb.getSet().add(num);
		}
		
		
	};

	// Returns true if the set is empty, false otherwise
	public boolean isEmpty() {
		return set.isEmpty();
	};

	// Return String representation of your set
	public String toString() {
		return set.toString();
	  
	};

}
