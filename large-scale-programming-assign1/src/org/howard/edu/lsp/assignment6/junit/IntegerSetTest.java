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
	@DisplayName("IntegerSet.clear test cases")
	public void testClear() {
		IntegerSet set1 = new IntegerSet();
		
		set1.add(5);
		set1.add(32);
		set1.add(11);
		set1.add(65);
		
		set1.clear();

		assertEquals("[]",set1.toString());
		assertNotEquals("[5,32,11,65]",set1.toString());
	}
	
	@Test
	@DisplayName("IntegerSet.length test cases")
	public void testLength() {
		IntegerSet set1 = new IntegerSet();
		set1.add(7);
		set1.add(22);
		set1.add(15);
		set1.add(43);
		
		assertEquals(4,set1.length());
		assertNotEquals(0,set1.length());
		
		set1.add(25);
		set1.add(71);
		
		assertEquals(6,set1.length());
		assertNotEquals(4,set1.length());
	}
	
	@Test
	@DisplayName("IntegerSet.equals test cases")
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
		
		assertTrue(set1.equals(set2));
		assertTrue(set1.equals(set3));
		assertFalse(set1.equals(set4));	
	}
	
	@Test
	@DisplayName("IntegerSet.contains test cases")
	public void testContains() {
		
		IntegerSet set1 = new IntegerSet();
		
		set1.add(11);
		set1.add(5);
		set1.add(65);
		set1.add(32);
		
		assertTrue(set1.contains(65));
		assertFalse(set1.contains(1));
		
		set1.remove(2);
		
		assertFalse(set1.contains(65));
	}
	
	@Test
	@DisplayName("IntegerSet.largest test case")
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
		
		assertEquals(65,set1.largest());
		assertNotEquals(11,set1.largest());
		assertNotEquals(5,set1.largest());
		assertNotEquals(32,set1.largest());
		
		set1.add(77);
		
		assertEquals(77,set1.largest());
		assertNotEquals(1,set1.largest());
		assertNotEquals(5,set1.largest());
		assertNotEquals(65,set1.largest());
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
		
		assertTrue(actualMessage.contains(expectedMessage));
		
		set1.add(11);
		set1.add(5);
		set1.add(65);
		set1.add(32);
		

		assertEquals(5,set1.smallest());
		assertNotEquals(11,set1.smallest());
		assertNotEquals(65,set1.smallest());
		assertNotEquals(32,set1.smallest());
		
		set1.add(2);
		
		assertEquals(2,set1.smallest());
		assertNotEquals(11,set1.smallest());
		assertNotEquals(5,set1.smallest());
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
		
		assertEquals("[5, 32, 11, 65]",set1.toString());
		assertNotEquals("[]",set1.toString());
		
		set1.add(7);
		set1.add(11);
		
		assertEquals("[5, 32, 11, 65, 7]",set1.toString());
		assertNotEquals("[5, 32, 11, 65]",set1.toString());
		assertNotEquals("[5, 32, 11, 65, 7, 11]",set1.toString());
		
	}
	
	@Test
	@DisplayName("IntegerSet.remove test case")
	public void testRemove() {
		IntegerSet set1 = new IntegerSet();
		
		Exception exception = assertThrows(RuntimeException.class,() -> {
			set1.remove(0);
		});
		
		String expectedMessage = "This set is empty";
		String actualMessage = exception.getMessage();
		
		assertTrue(actualMessage.contains(expectedMessage));
		
		set1.add(11);
		set1.add(5);
		set1.add(65);
		set1.add(32);
		
		set1.remove(0);
		
		assertEquals("[5, 65, 32]",set1.toString());
		assertNotEquals("[11, 5, 65, 32]",set1.toString());

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
		
		set1.union(set2);
		
		assertEquals("[1, 2, 3, 4]",set1.toString());
		assertNotEquals("[1,2]",set1.toString());
		
		IntegerSet set3 = new IntegerSet();
		IntegerSet set4 = new IntegerSet();
		
		set3.add(1);
		set3.add(2);
		
		set4.add(1);
		set4.add(3);
		
		set3.union(set4);
		
		assertEquals("[1, 2, 3]",set3.toString());
		assertNotEquals("[1, 2, 1, 3]",set3.toString());
	}
	
	@Test
	@DisplayName("IntegerSet.intersect test case")
	public void testIntersect() {
		
		IntegerSet set1 = new IntegerSet();
		IntegerSet set2 = new IntegerSet();
		IntegerSet set3 = new IntegerSet();
		IntegerSet set4 = new IntegerSet();
		
		
		set1.add(1);
		set1.add(2);
		set1.add(3);
		
		set2.add(2);
		set2.add(3);
		set2.add(4);
		
		System.out.println(set1.toString());
		System.out.println(set2.toString());
		
		set1.intersect(set2);
		
		assertEquals("[2, 3]",set1.toString());
		assertNotEquals("[1, 2, 3]",set1.toString());
		
		set3.add(1);
		set3.add(2);
		set3.add(3);
		
		set4.add(4);
		set4.add(5);
		set4.add(6);
		
		set3.intersect(set4);
		
		assertEquals("[]",set3.toString());
		assertNotEquals("[1, 2, 3]",set3.toString());
	}
	
	@Test
	@DisplayName("IntegerSet.diff test case")
	public void testDifference() {
		IntegerSet set1 = new IntegerSet();
		IntegerSet set2 = new IntegerSet();
		
		set1.add(1);
		set1.add(2);
		set1.add(3); 
		set1.add(4);
		
		set2.add(2);
		set2.add(3);
		set2.add(5);
		set2.add(6);
		
		set1.diff(set2);
		
		assertEquals("[1, 4]",set1.toString());
		assertNotEquals("[1,2,3,4]",set1.toString());
		set1.clear();
		
		set1.add(1);
		set1.add(2);
		set1.add(3);
		set1.add(4);
		
		set2.diff(set1);
		
		assertEquals("[5, 6]",set2.toString());
		assertNotEquals("[2,3,5,6]",set2.toString());
		
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
		
		assertEquals("[13, 4, 21, 36]",set1.toString());
		
	}
}
