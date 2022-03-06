package org.howard.edu.lsp.assignment5.test;
import org.howard.edu.lsp.assignment5.implementation.IntegerSet;

public class Driver {
	public static void main(String[] args) {
		
		
	//The following lines demonstrate both the InterSet(), toString(), and add() methods	
	System.out.println("IntegerSet(), toString(), and add() method demonstrations:");	
	IntegerSet set1 = new IntegerSet();
	System.out.println("string value of set1 is: " + set1.toString());
	set1.add(44);
	set1.add(21);
	set1.add(6);
	set1.add(34);
	set1.add(19);
	set1.add(8);
	set1.add(19);
	System.out.println("Values added to set1");
	System.out.println("Value of set1 is: " + set1.toString());
	
	
	//The following lines demonstrate the length(), contains(), and remove() methods
	System.out.println("length(), remove(), and contains() method demonstrations:");
	System.out.println("Value of set1 is: " + set1.toString());
	System.out.println("length of set1: " + set1.length());
	System.out.println("set1 contains the number 34:");
	System.out.println(set1.contains(34));
	System.out.println("value removed from set1");
	set1.remove(3);
	System.out.println("Value of set1 is: " + set1.toString());
	System.out.println("length of set1: " + set1.length());
	System.out.println("set1 contains the number 34:");
	System.out.println(set1.contains(34));
	
	
	IntegerSet set2 = new IntegerSet();
	set2.add(3);
	set2.add(19);
	set2.add(10);
	set2.add(38);
	set2.add(6);
	set2.add(68);
	set2.add(13);
	set2.add(39);
	
	
	//The following lines demonstrate the equals() and clear() methods
	System.out.println("equals() and clear()  method demonstrations:");
	System.out.println("Value of set1 is: " + set1.toString());
	System.out.println("Value of set2 is: " + set2.toString());
	System.out.println("set1 equals set2:");
	System.out.println(set1.equals(set2));
	System.out.println("set2 is cleared");
	set2.clear();
	System.out.println("Value of set2 is: " + set2.toString());
	System.out.println("New set2 values added");
	set2.add(44);
	set2.add(21);
	set2.add(6);
	set2.add(19);
	set2.add(8);
	System.out.println("Value of set2 is: " + set2.toString());
	System.out.println("set1 equals set2:");
	System.out.println(set1.equals(set2));
	
	
	set2.clear();
	set2.add(3);
	set2.add(19);
	set2.add(10);
	set2.add(38);
	set2.add(6);
	set2.add(68);
	set2.add(13);
	set2.add(39);
	
	
	//The following lines demonstrate the union() method
	System.out.println("union() method demonstration:");
	System.out.println("Value of set1 is: " + set1.toString());
	System.out.println("Value of set2 is: " + set2.toString());
	set1.union(set2);
	System.out.println("Result of union of set1 and set2:" + set1.toString());
	

	
	
	//The following lines demonstrate the isEmpty() method
	System.out.println("isEmpty() method demonstration:");
	System.out.println("Value of set1 is: " + set1.toString());
	System.out.println("set1 is Empty:");
	System.out.println(set1.isEmpty());
	System.out.println("set1 is cleared");
	set1.clear();
	System.out.println("Value of set1 is: " + set1.toString());
	System.out.println("set1 is Empty:");
	System.out.println(set1.isEmpty());

	
	
	set2.clear();
	
	set1.add(4);
	set1.add(22);
	set1.add(13);
	set1.add(63);
	set1.add(9);
	
	set2.add(13);
	set2.add(74);
	set2.add(4);
	
	
	//The following lines demonstrate the intersect() method:
	System.out.println("intersect() method demonstration:");
	System.out.println("Value of set1 is: " + set1.toString());
	System.out.println("Value of set2 is: " + set2.toString());
	System.out.println("The intersection of set1 and set2:");
	set1.intersect(set2);
	System.out.println(set1);
	
	
	set1.clear();
	set1.add(4);
	set1.add(22);
	set1.add(13);
	set1.add(63);
	set1.add(9);
	
	
	//The following lines demonstrate the diff() method:
	System.out.println("diff() method demonstration:");
	System.out.println("Value of set1 is: " + set1.toString());
	System.out.println("Value of set2 is: " + set2.toString());
	set1.diff(set2);
	System.out.println("The difference between set1 and set2:");
	System.out.println("Value of set1 is: " + set1.toString());
	System.out.println("Value of set2 is: " + set2.toString());
	
	//The following lines demonstrate the largest() and smallest() methods
	System.out.println("largest() and smallest() methods demonstrations:");
	System.out.println("Value of set1 is: " + set1.toString());
	System.out.println("largest value in set1: " + set1.largest());
	System.out.println("smallest value in set1: " + set1.smallest());
	
	
	//The following lines demonstrate the largest(), smallest(), and remove() method exception
	System.out.println("largest(), mallest(), and remove method exception demonstrations:");
	System.out.println("Value of set1 is: " + set1.toString());
	System.out.println("set1 is cleared");
	set1.clear();
	System.out.println("The largest and smallest values are attmepted to be found. A value is also attempted to be removed.");
	System.out.println(set1.largest());
	System.out.println(set1.smallest());
	set1.remove(2);
	


	}
}
