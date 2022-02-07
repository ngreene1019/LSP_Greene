import java.util.Scanner;
import java.util.Arrays;
import java.util.*;
import java.util.stream.*;

import package org.howard.edu.lsp.assignment2;

public class Main {
	
	public static void main(String[] args) {
		boolean end = false;
		int num = 1;
		while (num >= 0){
			Scanner Input = new Scanner(System.in);
		    System.out.println("String?");
		    String[] tokens = Input.nextLine().split(" ");
		    Input.close();

		    List<String> strList = Arrays.asList(tokens);

		    boolean ending = strList.contains("Goodbye");

		    if (ending){
		      break;
		    } else{
		      System.out.println("Tokens:");
		      for (String element: tokens) {
		    
		        System.out.println(element);   

		      }

		      List<Integer> intList = strList.stream().map(Integer::parseInt).collect(Collectors.toList());

		      int Sum = 0;
		      int Product = 1;

		      for (int token: intList){
		        Sum += token;

		      }

		      for (int token: intList){
		        Product *= token;

		      }

		      System.out.println("Sum: " + Sum);
		      System.out.println("Product " + Product);
		    
		  }

		  }

	}

}
