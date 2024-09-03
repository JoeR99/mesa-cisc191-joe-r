package m22ChallengeJosephRathbun;

public class M22ChallengeJosephRathbun
{
	/**
	 * Purpose: Find a given value in the array given
	 * 
	 * @param array to search
	 * @param value or character to compare to array
	 * @return true if the value is in the array, otherwise false
	 */
	public static boolean contains(char[] array, char value)
	{
		// TODO: return the correct value
		
		// Initialize variable i to iterate through in the later for loop and 
		// Set n to the length of array being tested so we can loop that amount of times.
		// Initialize a count variable that ticks up by 1 each time there is a character in the array
		// that is equal to the value in the method parameter.
		
		int i;
		int n = array.length;
		int count = 0;
		
		// For loop to iterate through array[i] for n amount of times
		
		for ( i = 0; i < n ; i++ ) {	
			
		// If statement to check if the there is a single element in the array that is equal to the value 
		// Increase count by 1 each time 	
			
			if (array[i] == value) 
				count++;
			
		}		
		
		// Conditional to check if count has increased at all, if it has then return true, return false if not.
		if (count > 0) {
			// Printing out line to indicate true and what value for debugging.
			System.out.println("The value " + value +" is in the array.");
			return true;
		}
		else {
			// Printing out line to indicate false and what value for debugging.
			System.out.println("The value " + value +" is not in the array.");
			return false;
		}
	}
	
	
	/**
	 * Purpose: find and return the first index of a value in an array
	 * 			or -1 if the value is not inside the array.
	 * 
	 * @param array to search
	 * @param value to check with array
	 * @return first index of array or -1 if value is not inside the array.
	 */
	
	public static int find(char[] array, char value)
	{
		// Initialize values for iterating through an array, the amount of times needed to iterate, a count to indicate first time,
		// and a value to store the index number for the first time the value is checked.
		// Set indexNumber and firstIndexNumber to -1 because it will return as -1 if the value is not in the array.
		int i;
		int n = array.length;
		int count = 0;
		int indexNumber= -1;
		int firstIndexNumber = -1;
		
		// For loop to iterate through each index in the array parameter, marks the indexNumber when the value is equal to array[i]
		for ( i = 0; i < n ; i++) {
			
			// Conditional to check if array[i] is equal to value. If it is then set indexNumber to i.
			if (array[i] == value) {
				
				indexNumber = i;
				count++;
			}
			if (count == 1) {
				firstIndexNumber = indexNumber;
			}
			
		}
		
		// Print line to indicate what number is the first index for debugging.
		System.out.println("This is the first index: " + firstIndexNumber);
		if ( indexNumber >= 0)
			return firstIndexNumber; 
		else
			return firstIndexNumber;
	}
	
	
	/**
	 * Purpose: count the amount of times a value appears in the array
	 * 			and return that amount.
	 * 
	 * @param array to search
	 * @param value to check with array
	 * @return the amount of times a value appears in an array
	 */
	
	public static int countValues(char[] array, char value)
	{
		// Initialize values to iterate through array with for loop, the length of the array,
		// and a count to increase by 1 each time a value appears in the array.
		
		int i;
		int n = array.length;
		int count = 0;
		
		// For loop to check array for any value that is equal to the current index of the array.
		
		for ( i = 0; i < n; i++ ) {
			
			// If current index of array is equal to value, then increment count by 1.
			if (array[i] == value)
				count++;
			
		}
		
		// Print line to check the amount of times a value shows up in the array, for debugging.
		System.out.println("This the count: " + count);
		return count;
	}
	
	
	/**
	 * Purpose: search through an array and determine if the array is in alphabetic order.
	 * @param array to search
	 * @return true or false depending on whether the array is in order or not
	 */
	
	public static boolean inOrder(char[] array)
	{
		// Initialize variables for looping through the array
		
		int i;
		int n = array.length;
		
		// For loop that starts at the first index and stops at the length of the array - 1.
		// Compares the current index with the one ahead of it so we need to correct the for it.
		
		for ( i = 0 ; i < n - 1 ; i++) {
			
			// If the current index value is bigger than the next index value then the array is not in order and returns false
			if ( array[i] > array[i+1]) {
				System.out.println("This is not in order");
				return false;				
			}
		}
		
		// The array makes it past the conditional and for loop, meaning the array is in order and we return true.
		System.out.println("This is in order");
		return true;	
	}
	
	
	/**
	 * Purpose: swap two values in an array at a specific index
	 * 
	 * @param array to swap certain values
	 * @param integer value to determine which index to start swap at
	 * @return array with swapped values depending on parameter value
	 */
	
	public static char[] swapElements(char[] array, int value) {
		
		// Character variable that serves as a placeholder in memory for the value being replaced 
		char temp = array[value];
		
		// If value is 0 then we change the index at 0 first by making it equal to the value at index 1,
		// then we make the value at index 1 equal to temp because the value at index 0 has been lost.
		// return array with swapped values
		if (value == 0) {
			array[0] = array[1];
			array[1] = temp;
			return array;
		}	
		
		// If value is 1 then we change the index at 1 first by making it equal to the value at index 2,
		// then we make the value at index 2 equal to temp because the value at index 1 has been lost.
		// return array with swapped values
		if (value == 1)
			array[1] = array[2];
			array[2] = temp;
			return array;
		
	}
	
	
	// Use this template for the methods
		/**
		 * Purpose: A method to sort character arrays by checking the current index with the next one
		 * 			and swapping them if the values are not in order.
		 * 
		 * @param array to search
		 * @return array with values swapped to be in order
		 */
	
	public static char[] bubbleUp(char[] array)
	{
		// Initialize variables for iteration and length of the array
		int i;
		int n = array.length;
		
		// For loop to iterate through array parameter, we limit the loop by n - 1 because we are correcting
		// for the loop checking ahead one index to compare with the previous index.
		for ( i = 0 ; i < n - 1 ; i++ ) {
			
			// if the current index is bigger than the next index then we swap elements at the current index
			if (array[i] > array[i+1]) {
				
			swapElements(array, i);
			}
		}	
		
		// return array with swapped values or same array if nothing changed.
		return array;
	}
	
	
//	public static char[] bubbleSort(char[] array)
//	{
//		char [] tempArray = array;
//		
//		while (inOrder(tempArray) == false) {
//			System.out.println("Bubbled");
//			bubbleUp(tempArray);
//			System.out.println("Bubs");
//		}
//		return tempArray;
//	}

	
	// Use this template for the methods
	/**
	 * Purpose: Copy all of the elements for any array
	 * 
	 * @param array to search and copy
	 * @return an exact copy of the input array
	 */
	
	public static char[] copy(char[] array)
	{
		// Initialize variables for iterating through the array for n amount of times.
		int i;
		int n = array.length;

		// Create a separate character array for 
		char[] copyArray = new char[n];
		
		// For loop to copy each index in the array to each index in the copyArray.
		for( i = 0 ; i < n ; i++) {
			
			copyArray[i] = array[i];	
		}
		
		// Print "Copy" for clarity on the amount of copied arrays
		System.out.println("Copy");
		return copyArray;
	}
	
	
	// Use this template for the methods
	/**
	 * Purpose: Checks to see if two arrays are equal.
	 * 
	 * @param array1 to search and compare with array2
	 * @param array2 to search and compare with array1
	 * @return true if the two parameter arrays are equal, otherwise return false
	 */
	
	public static boolean arrayElementsEqual(char[] array1, char[] array2) 
	{
		
		// Initialize variables for iterating through the arrays, because we are checking if the
		// lengths of the arrays are equal to each other we can simply set n to any arrays length, 
		// in this case array1.
		
		int i;
		int n = array1.length;
		int count = 0;
		
		// if the lengths of the arrays are not equal then return false early in the method
		if ( array1.length != array2.length) {
			return false;
		}
		
		else {
			
			// For loop to iterate through two arrays of the same size/length
			for ( i = 0 ; i < n ; i++) {
				
				// if the index in each array are equal, then increment count by 1
				if (array1[i] != array2[i])
					count++;	
			}
		
			// If count increases at all then return false
			if (count >= 1) {
				System.out.println("Arrays are not Equal");
				return false;
			}
			// If count is still equal to 0 then the arrays are equal	
			else {
				System.out.println("Arrays are Equal");
				return true;
			}
		}				
	}
	
	
	/**
	 * Purpose: flips the elements in an array from forwards to backwards
	 * 
	 * @param array to search 
	 * @return backwards version of parameter array
	 */
	
	public static char[] backwards(char[] array) 
	{
		// Initialize variables for iterating through the array for tracking 
		int i;
		int n = array.length;
		
		// Create a new character array and name it backwardsArray for obvious reasons
		char[] backwardsArray = new char[n];

			// For loop to make each index of backwardsArray equal to the length of the
			// array -1 and -i to work in reverse and correcting for length to index position
			for ( i = 0 ; i < n ; i++ ) {
				
				backwardsArray[i] = array[n-1-i];		
			}
			
			// Print line to check if array returned properly.
			System.out.println("Backed");
			return backwardsArray;	
	}
	
	
	/**
	 * Purpose: determine if a character array is the same forwards and backwards.
	 * 
	 * @param array to copy and use with another method
	 * @return true when the word is a palindrome, false when it is not.
	 */
	
	public static boolean isPalindrome(char[] array) 
	{
		
		// Initialize n variable to be equal to the length of the parameter array.
		int n = array.length;
		
		// Initialize a new character array as a copy of the parameter array.
		char[] copy = new char[n];
		
		// Call the backwards method on the array parameter and making copy equal to it.
		copy = backwards(array);
		
		// Use the arrayElementsEqual method I made earlier on the parameter array and the copy
		// to determine if they are equal, if they are return true.
		if (arrayElementsEqual(array, copy) == true) {	
			System.out.println("Is Palindrome!");
			return true;
		}
		
		// return false if arrayElementsEqual returns false
		else {
			System.out.println("Is  NOT Palindrome!");
			return false;	
		}
		
	}
	
	
	/**
	 * Purpose: return the numbers in a 2D matrix by row and column
	 * 
	 * @param 2-dimensional array to search
	 * @param integer value for desired row 
	 * @param integer value for desired column
	 * @return two integers within the data array by row and column
	 */
	
	public static int getElement(int[][] data, int row, int col) 
	{
		
		// Initialize variables for row and column, x and y are obvious choices respectively
		int x = row;
		int y = col;		
		
		// Print lines to see data output flow
		System.out.println("X = " + x + " Y = " + y);
		
		// returns data with row equal to x input and column equal to y input
		return data[x][y];
	}
	
	
	/**
	 * Purpose: add the elements of a single row together and return it
	 * 
	 * @param 2D array to search
	 * @param integer to determine what row we are adding up
	 * @return the added up total of elements in a row
	 */
	
	public static int addRow(int[][] data, int row) 
	{
		
		// Initialize variables to increment up,
		// find the length of the row for current 2D data,
		// and total which will add up each element in row.
		int i;
		int col = data[row].length;
		System.out.println(col);
		int total = 0;
		
		System.out.println("Number of columns: " + col);
		
		// for loop to iterate through each column of a desired row.
		for ( i = 0 ; i < col ; i++) {
			total += data[row][i];
		}
		
		// return the total number found from adding up the columns in desired row.
		return total;
	}
	
	
	/**
	 * Purpose: add the elements of a single column together and return it
	 * 
	 * @param 2D array to search
	 * @param integer to determine which column we are adding up
	 * @return the added up total of elements in a column
	 */
	
	public static int addColumn(int[][] data, int col) 
	{
		int i;
		int row = data.length;
		System.out.println(row);
		int total = 0;
		
		System.out.println("Number of rows: " + row);
		
		// for loop to iterate through each row of a desired column.
		for ( i = 0 ; i < row ; i++) {
			total += data[i][col];
		}
		
		// return the total number found from adding up the elements of each row in desired column.
		return total;
	}
	
	
	/**
	 * Purpose: Add the elements of a 2D array in a diagonal fashion
	 * 			from left to right
	 * 
	 * @param 2D array to search
	 * @return total amount found from adding up left to right diagonal of a 2D array
	 */
	
	public static int addLeftToRightDiagonal(int[][] data) 
	{
		// Initialize variables for iteration and total, find length of the 2D array being used.
		int i;
		int size = data.length;
		int total = 0;
			
		// For loop to iterate through each row and column at same index and adding them up
		for ( i = 0 ; i < size ; i++ ) {
			
			total += data[i][i];
			
		}	
		
		return total;
	}
	
	
	/**
	 * Purpose: Add the elements of a 2D array in a diagonal fashion
	 * 			from right to left
	 * 
	 * @param 2D array to search
	 * @return total amount found from adding up right to left diagonal of a 2D array
	 */
	
	public static int addRightToLeftDiagonal(int[][] data)
	{
		
		// Initialize variables for iteration, total of added up elements, and find the length of the 2D array being used.
		int i;
		int size = data.length;
		int total = 0;
		
		// For loop to iterate through each row and column, we being with the last column
		// going down with size-i-1 to start on the right side of the matrix ( -1 to offset size and index relation).
		// Adds up the element at said row and column
		for ( i = 0 ; i < size ; i++ ) {
			
			total += data[i][size-i-1];
			
		}	
			
		return total;
	}
	
	
	// Use this template for the methods
		/**
		 * Purpose: Add up the last element of each row within the 2D data array.
		 * 
		 * @param 2D array to search
		 * @return total number found from adding the last element in each row
		 */
	
	public static int addLastRowElement(int[][] data) 
	{
		
		// Initialize variables for iteration and total of last element in each row
		int i;
		int total = 0;
		
		// Initialize variables for the amount of rows iterating through and the amount of columns per row
		int x = data.length;
		int y;
		
		// for loop to iterate to amount of rows in 2D data array
		for ( i = 0 ; i < x ; i++) {
			
			y = data[i].length - 1;
			
			System.out.println("Number of y: " + y);
			
			// add total to itself at the element point of row = index and column = length of current row
			total += data[i][y];
				
			System.out.println("Number of total: " + total);
		}
				
		return total;
	}
	
	// Use this template for the methods
	/**
	 * Purpose:
	 * 
	 * @param array
	 * @return
	 */
//	public static ??? ???(???[] array)
//	{
//		return ???;
//	}

}
