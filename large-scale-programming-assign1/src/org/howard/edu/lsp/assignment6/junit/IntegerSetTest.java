package org.howard.edu.lsp.assignment6.junit;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertThrows;
import static org.junit.Assert.assertTrue;

import org.howard.edu.lsp.assignment6.integerset.IntegerSet;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class IntegerSetTest {
	@Test
	@DisplayName("IntegerSet.clear test case")
	public void testClear() {
		IntegerSet set1 = new IntegerSet();
		
		set1.add(5);
		set1.add(32);
		set1.add(11);
		set1.add(65);
		System.out.println(set1.toString());
	
		
		set1.clear();
		
		System.out.println(set1.toString());
		assertEquals("[]",set1.toString());
		assertNotEquals("[5,32,11,65",set1.toString());
	}
	
	@Test
	@DisplayName("IntegerSet.length test case")
	public void testLength() {
		IntegerSet set1 = new IntegerSet();
		set1.add(7);
		set1.add(22);
		set1.add(15);
		set1.add(43);
		
		System.out.println(set1.length());
		assertEquals(4,set1.length());
		assertNotEquals(0,set1.length());
	}
	
	@Test
	@DisplayName("IntegerSet.equals test case")
	public void testEquals() {
		IntegerSet set1 = new IntegerSet();
		IntegerSet set2 = new IntegerSet();
		IntegerSet set3 = new IntegerSet();
		IntegerSet set4 = new IntegerSet();
		
		set1.add(5);
		set1.add(32);
		set1.add(11);
		set1.add(65);
		
		set2.add(5);
		set2.add(32);
		set2.add(11);
		set2.add(65);
		
		set3.add(11);
		set3.add(5);
		set3.add(65);
		set3.add(32);
		
		set4.add(1);
		set4.add(2);
		set4.add(3);
		set4.add(4);
		
		System.out.println(set1.toString());
		System.out.println(set2.toString());
		System.out.println(set3.toString());
		System.out.println(set4.toString());
		
		assertTrue(set1.equals(set2));
		assertTrue(set1.equals(set3));
		assertFalse(set1.equals(set4));	
	}
	
	@Test
	@DisplayName("IntegerSet.contains test case")
	public void testContains() {
		
		IntegerSet set1 = new IntegerSet();
		
		set1.add(11);
		set1.add(5);
		set1.add(65);
		set1.add(32);
		
		System.out.println(set1.toString());
		assertTrue(set1.contains(65));
		assertFalse(set1.contains(1));
	}
	
	@Test
	@DisplayName("IntegerSet.length test case")
	public void testLargest() {
		IntegerSet set1 = new IntegerSet();
		
		Exception exception = assertThrows(RuntimeException.class,() -> {
			set1.largest();
		});
		
		String expectedMessage = "This set is empty";
		String actualMessage = exception.getMessage();
		
		assertTrue(actualMessage.contains(expectedMessage));
		
		set1.add(11);
		set1.add(5);
		set1.add(65);
		set1.add(32);
		
		System.out.println(set1.toString());
		assertEquals(65,set1.largest());
		assertNotEquals(11,set1.largest());
		assertNotEquals(5,set1.largest());
		assertNotEquals(32,set1.largest());
	}
	
	@Test
	@DisplayName("IntegerSet.smallest test case")
	public void testSmallest() {
		IntegerSet set1 = new IntegerSet();
		
		Exception exception = assertThrows(RuntimeException.class,() -> {
			set1.smallest();
		});
		
		String expectedMessage = "This set is empty";
		String actualMessage = exception.getMessage();
		
		assertTrue(actualMessage.contains(expectedMessage)); //may change to equals
		
		set1.add(11);
		set1.add(5);
		set1.add(65);
		set1.add(32);
		
		System.out.println(set1.toString());
		assertEquals(5,set1.smallest());
		assertNotEquals(11,set1.smallest());
		assertNotEquals(65,set1.smallest());
		assertNotEquals(32,set1.smallest());
		
	}
	
	@Test
	@DisplayName("IntegerSet.add test case")
	public void testAdd() {
		IntegerSet set1 = new IntegerSet();
		
		set1.add(5);
		set1.add(32);
		set1.add(11);
		set1.add(65);
		
		System.out.println(set1.toString());
		assertEquals("[5,32,11,65]",set1.toString());
		assertNotEquals("[]",set1.toString());
		
		set1.add(7);
		set1.add(11);
		
		System.out.println(set1.toString());
		assertEquals("[5,32,11,65,7]",set1.toString());
		assertNotEquals("[5,32,11,65]",set1.toString());
		assertNotEquals("[5,32,11,65,7,11]",set1.toString());
		
	}
	
	@Test
	@DisplayName("IntegerSet.remove test case")
	public void testRemove() {
		IntegerSet set1 = new IntegerSet();
		
		Exception exception = assertThrows(RuntimeException.class,() -> {
			set1.remove(11);
		});
		
		String expectedMessage = "This set is empty";
		String actualMessage = exception.getMessage();
		
		assertTrue(actualMessage.contains(expectedMessage));
		
		set1.add(11);
		set1.add(5);
		set1.add(65);
		set1.add(32);
		System.out.println(set1.toString());
		
		set1.remove(11);
		
		System.out.println(set1.toString());
		assertEquals("[5,65,32]",set1.toString());
		assertNotEquals("[11,5,65,32]",set1.toString());

	}
	
	@Test
	@DisplayName("IntegerSet.union test case")
	public void testUnion() {
		
		IntegerSet set1 = new IntegerSet();
		IntegerSet set2 = new IntegerSet();
			
		set1.add(1);
		set1.add(2);
		
		set2.add(3);
		set2.add(4);
		System.out.println(set1.toString());
		System.out.println(set2.toString());
		
		
		assertEquals("[1,2,3,4]",set1.toString());
		assertNotEquals("[1,2]",set1.toString());
		
		IntegerSet set3 = new IntegerSet();
		IntegerSet set4 = new IntegerSet();
		
		set3.add(1);
		set3.add(2);
		
		set4.add(1);
		set4.add(3);
		System.out.println(set3.toString());
		System.out.println(set4.toString());
		
		assertEquals("[1,2,3]",set1.toString());
		assertNotEquals("[1,2,1,3]",set1.toString());
	}
	
	@Test
	@DisplayName("IntegerSet.length test case")
	public void testIntersect() {
		
		IntegerSet set1 = new IntegerSet();
		IntegerSet set2 = new IntegerSet();
		
		set1.add(1);
		set1.add(2);
		set1.add(3);
		
		set2.add(2);
		set2.add(3);
		set2.add(4);
		
		System.out.println(set1.toString());
		System.out.println(set2.toString());
		
		assertEquals("[2,3]",set1.toString());
		assertNotEquals("[1,2,3]",set1.toString());
	}
	
	@Test
	@DisplayName("IntegerSet.diff test case")
	public void testDifference() {
		IntegerSet set1 = new IntegerSet();
		IntegerSet set2 = new IntegerSet();
		
		set1.add(1);
		set1.add(2);
		set1.add(3);
		
		set2.add(2);
		set2.add(3);
		set2.add(4);
		
		System.out.println(set1.toString());
		System.out.println(set2.toString());
		
		assertEquals("[1,4]",set1.toString());
		assertNotEquals("[1,2,3]",set1.toString());
		
		
	}
	
	
	@Test
	@DisplayName("IntegerSet.isEmpty test cases")
	public void testIsEmpty() {
		IntegerSet set1 = new IntegerSet();
		assertTrue(set1.isEmpty());
		
		set1.add(13);
		set1.add(4);
		set1.add(21);
		set1.add(36);
		assertFalse(set1.isEmpty());
		
	}
	
	@Test
	@DisplayName("IntegerSet.toString test cases")
	public void testToString() {
		IntegerSet set1 = new IntegerSet();
		set1.add(13);
		set1.add(4);
		set1.add(21);
		set1.add(36);
		
		System.out.println(set1.toString());
		assertEquals("[13,4,21,36]",set1.toString());
		assertNotEquals("[]",set1.toString());
		
	}
}
