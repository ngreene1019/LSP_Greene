package org.howard.edu.lsp.assignment5.test;
import org.howard.edu.lsp.assignment5.implementation.IntegerSet;

public class Driver {
	public static void main(String[] args) {
		
		
		
	IntegerSet seta = new IntegerSet();
	seta.add(35);
	seta.add(2);
	seta.add(4);
	seta.add(5);
	//seta.add(5);
	//seta.clear();
	//seta.remove(0);
	//System.out.println(seta.toString());
	//System.out.println(seta.smallest());
	
	IntegerSet setb = new IntegerSet();
	setb.add(2);
	setb.add(3);
	setb.add(35);
	
	seta.diff(setb);
	System.out.println(seta);
	System.out.println(setb);

	//seta.union(setb);
	//System.out.println(seta);
	seta.intersect(setb);
	System.out.println(seta);
	System.out.println(seta.equals(setb));
	System.out.println(seta.length());
	System.out.println(seta.contains(2));
	seta.clear();
	System.out.println(seta.length());
	System.out.println(seta.isEmpty());
	System.out.println(seta.toString());


	}
}
