package org.howard.edu.lsp.assignment5.implementation;

/**
 * @author Najah Greene
 *
 */
public class IntegerSetException extends RuntimeException {
	
	private static final long serialVersionUID = 1L;
	
	/**
	 * @param errorMsg is thrown for the specified conditions in the IntegerSet file
	 */
	public IntegerSetException(String errorMsg) { //Given by Professor Woolfolk during lecture.
		super(errorMsg);
	}

}
