package org.howard.edu.lsp.finalExam;

import java.util.ArrayList;
import java.util.HashMap;

import org.howard.edu.lsp.assignment5.implementation.IntegerSetException;


public class MapUtilities {
	
	public static int commonKeyValuePairs(
	        HashMap<String, String> map1,
	        HashMap<String, String> map2) {
		
		if(map1 == null) {
			throw new NullMapException("One or both maps are null!");	
		}
		
		if(map2 == null) {
			throw new NullMapException("One or both maps are null!");	
		}
		
		if (map1.isEmpty())
			return 0;
		
		if (map2.isEmpty())
			return 0;
		
		ArrayList<String> keys1 = new ArrayList<>();
		ArrayList<String> keys2 = new ArrayList<>();
		ArrayList<String> values1 = new ArrayList<>();
		ArrayList<String> values2 = new ArrayList<>();
		int num = 0;
		int common_pairs = 0;
		
		
				
		for (String key : map1.keySet())
			keys1.add(key);
		
		for (String key : map1.keySet())
			keys2.add(key);
		
		for (String value : map2.keySet())
			values1.add(value);
		
		for (String value : map2.keySet())
			values2.add(value);
		
		
		
		for (String item : keys1)
			if (item == keys2.get(num))
				if (values1.get(num) == values2.get(num))
					common_pairs++;
			num++;
		
		

		return common_pairs;
		
	    }

	

	

}




