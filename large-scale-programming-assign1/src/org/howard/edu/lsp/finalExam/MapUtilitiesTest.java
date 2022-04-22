package org.howard.edu.lsp.finalExam;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertThrows;
import static org.junit.Assert.assertTrue;

import java.util.HashMap;

import org.howard.edu.lsp.finalExam.MapUtilities;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


public class MapUtilitiesTest {
	@Test
	@DisplayName("Common pairs test cases")
	public void MapPairs() {
		HashMap<String, String> map1 = new HashMap<>();
		HashMap<String, String> map2 = new HashMap<>();
		
		map1.put("Apple", "Fruit");
		map1.put("Bannana","Yellow");
		map1.put("Cucumber", "Green");
		map1.put("Orange","Fruit");
		map1.put("Carrot", "Vegetable");
		
		map2.put("Tomato", "Red");
		map2.put("Bannana","Yellow");
		map2.put("Eggplant", "Purple");
		map2.put("Cauliflower","White");
		map2.put("Eggplant", "Vegetable");
		
		assertEquals(1,MapUtilities.commonKeyValuePairs(map1,map2));
		
		HashMap<String, String> map3 = new HashMap<>();
		
		map3.put("Apple", "Red");
		map3.put("Bannana","Yellow");
		map3.put("Cucumber", "Greennn");
		map3.put("Cauliflower","White");
		map3.put("Carrot", "Orange");
		
		assertEquals(1,MapUtilities.commonKeyValuePairs(map1,map3));
		assertNotEquals(3,MapUtilities.commonKeyValuePairs(map1,map3));
		
		HashMap<String, String> map4 = new HashMap<>();
		
		map4.put("Apple", "Fruit");
		map4.put("Lemon","Yellow");
		map4.put("lettuce", "Green");
		map4.put("Mango","Fruit");
		map4.put("Celery", "Vegetable");
		
		assertEquals(1,MapUtilities.commonKeyValuePairs(map1,map4));
		assertNotEquals(5,MapUtilities.commonKeyValuePairs(map1,map4));
	}
	
	@Test
	@DisplayName("Error test case 1")
	public void ErrorTest1() {
		HashMap<String, String> map1 = null;
		HashMap<String, String> map2 = new HashMap<>();
		
		map2.put("Apple", "Fruit");
		map2.put("Bannana","Yellow");
		map2.put("Cucumber", "Green");
		map2.put("Orange","Fruit");
		map2.put("Carrot", "Vegetable");
		
		Exception exception = assertThrows(RuntimeException.class,() -> {
			MapUtilities.commonKeyValuePairs(map1,map2);
		});
		
		String expectedMessage = "One or both maps are null!";
		String actualMessage = exception.getMessage();
		
		assertTrue(actualMessage.contains(expectedMessage));
		
		
	}
	
	@Test
	@DisplayName("Error test case 2")
	public void ErrorTest2() {
		HashMap<String, String> map1 = new HashMap<>();
		HashMap<String, String> map2 = null;
		
		map1.put("Apple", "Fruit");
		map1.put("Bannana","Yellow");
		map1.put("Cucumber", "Green");
		map1.put("Orange","Fruit");
		map1.put("Carrot", "Vegetable");
		
		Exception exception = assertThrows(RuntimeException.class,() -> {
			MapUtilities.commonKeyValuePairs(map1,map2);
		});
		
		String expectedMessage = "One or both maps are null!";
		String actualMessage = exception.getMessage();
		
		assertTrue(actualMessage.contains(expectedMessage));
		
		
	}
	
	@Test
	@DisplayName("Error test case 3")
	public void ErrorTest3() {
		HashMap<String, String> map1 = null;
		HashMap<String, String> map2 = null;
		
		Exception exception = assertThrows(RuntimeException.class,() -> {
			MapUtilities.commonKeyValuePairs(map1,map2);
		});
		
		String expectedMessage = "One or both maps are null!";
		String actualMessage = exception.getMessage();
		
		assertTrue(actualMessage.contains(expectedMessage));
		
		
	}
	
	@Test
	@DisplayName("Empty maps test cases")
	public void EmptyMaps() {
		HashMap<String, String> map1 = new HashMap<>();
		HashMap<String, String> map2 = new HashMap<>();
		
		assertEquals(0,MapUtilities.commonKeyValuePairs(map1,map2));
		
		map1.put("Apple", "Fruit");
		map1.put("Bannana","Yellow");
		map1.put("Cucumber", "Green");
		map1.put("Orange","Fruit");
		map1.put("Carrot", "Vegetable");
		
		assertEquals(0,MapUtilities.commonKeyValuePairs(map1,map2));
		assertEquals(0,MapUtilities.commonKeyValuePairs(map2,map1));
		
	}
	

}
