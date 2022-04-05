package org.howard.edu.lsp.assignment6.integerset;

import java.util.ArrayList;
import java.util.Collections;

/**
 * 
 * @author Najah Greene
 *
 */


public class IntegerSet {

	private ArrayList<Integer> set = new ArrayList<Integer>();
	/**
	 * @return the set when called.
	 */
	public ArrayList<Integer> getSet() { return set; } 
	
	/**
	 * Default Constructor
	 * Creates a new set when called
	 */
	public IntegerSet() {


		
		ArrayList<Integer> set = new ArrayList<Integer>();
		
		}
	
	
	/**
	 * Clears the internal representation of our set
	 */
	public void clear() {		
		set.clear();
		
	};


	/**
	 * @return the length of set.
	 */
	public int length() {
		return set.size();
		
	};
	

	/**
	 * @param b is set b
	 * @return true if the 2 sets are equal, otherwise false.
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
	
	
	/**
	 * @param value taken in
	 * @return true if the set contains the value, otherwise false.
	 */
	public boolean contains(int value) {
		
		if (set.contains(value)) {
			return true;
			
			
		} else {
			return false;
		}
	};
	

	/**
	 * @return the largest item in the set. If the set is empty, and exception is thrown.
	 */
	public int largest() {

		if (set.isEmpty()) {
			throw new IntegerSetException("This set is empty");
		} else {
			Collections.sort(set);
			int result = set.get(set.size() - 1);
			return result;
					
		}
		
		
	};
	
	/**
	 * @return the smallest item in the set. If the set is empty, and exception is thrown.
	 */
	public int smallest() {
		
		if (set.isEmpty()) {
			throw new IntegerSetException("This set is empty");
		} else {
			Collections.sort(set);
			int result = set.get(0);
			return result;	
			
		}
	
		
	
	};



	/**
	 * @param item is added to the set if the item is not already in the set.
	 */
	public void add(int item) { //Given by Professor Woolfolk during lecture.

		if(!set.contains(item)) {
			set.add(item);
		}
		
	};

	
	/**
	 * @param item is removed from the set if it is present. An exception is thrown if the set is empty.
	 */
	public void remove(int item) {

		if (set.isEmpty()) {
			throw new IntegerSetException("This set is empty");
			
			} else {
				set.remove(item);
			}
		
	};  

	
	/**
	 * @param intSetb
	 * A union of the two sets is created.
	 */
	public void union(IntegerSet intSetb) {

		for (int num : intSetb.getSet()) {
			if (!set.contains(num)) {
				set.add(num);
			}
			
		}
	};

	/**
	 * @param intSetb
	 * Finds the values that the two sets have in common.
	 */
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

	
	/**
	 * @param intSetb
	 * Finds the values that differ between the two sets.
	 */
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


	/**
	 * @return true if the set is empty and returns false if not.
	 */
	public boolean isEmpty() {

		return set.isEmpty();
	};

	
	/**
	 * @return the string version of the set.
	 */
	public String toString() { //Given by Professor Woolfolk
		return set.toString(); 
	  
	};

}

