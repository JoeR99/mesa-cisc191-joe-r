package m1ChallengeJosephRathbun;

/** 
Name: Joseph Rathbun
Date: 08 / 26 / 2024


*/

public class M1ChallengeJosephRathbun 
{
	/**
	 * Purpose: add two numbers
	 * @param a one number
	 * @param b another number
	 * @return the sum of a and b
	 */
	public static int add(int a, int b)
	{
		return a + b;
	}
	
	/**
	 * Purpose: multiply two numbers
	 * @param a one number
	 * @param b another number
	 * @return the product of a and b
	 */
	
	// Multiply a with b.
	
	public static int multiply(int a, int b)
	{
		// TODO: change this to make the tests pass
		return a * b;
	}
	
	/**
	 * Purpose: return the first element in the array given
	 * 
	 * @param array to search
	 * @return first element
	 */
	
	// Take first number in the array and return it.
	
	public static int getFirst(int[] array)
	{
		// TODO: change this method to make the tests pass
		int firstNumber = array[0];
		
		return firstNumber;
	}
	
	/**
	 * Purpose: return the last element in the array given
	 * 
	 * @param array to search
	 * @return last element
	 */
	
	// Get the length of the array and get the last number by using the length minus 1 (because of array iteration starting with 0) then return it.
	
	public static int getLast(int[] array)
	{
		// TODO: change this method to make the tests pass
		
		int arrayLength = array.length;
		
		int lastNumber = array[arrayLength-1];
		
		
		return lastNumber;
	}
	
	/**
	 * Purpose: return the middle element in an array with an odd number of elements
	 * 
	 * @param array to search
	 * @return middle element
	 */
	
	// Take the length of the array and halve it to get the mid-point of the array.
	
	public static int getMiddle(int[] array)
	{
		// TODO: change this method to make the tests pass

		int arrayLength = array.length;
		
		int halfLength = arrayLength/2;
		
		int middleNumber = array[halfLength];
		
		return middleNumber;
	}
	
	/**
	 * Purpose: return the largest element in an array
	 * @param array to search
	 * @return largest element
	 */
	
	// I take the last number in the array and compare the number's one by one and change the maxNumber variable to the current iteration of the array if the number is bigger.
	
	public static int max(int[] array)
	{
		
		int n = array.length - 1;
		int maxNumber = array[n];
		int i = n-1;
		while ( i >= 0 )
		{
			if (array[i] > maxNumber)
				maxNumber = array[i];
			i = i - 1;
		}
		
		return maxNumber;
	}
	
	/**
	 * Purpose: return the smallest element in an array
	 * @param array to search
	 * @return smallest element
	 */
	
	// I flip the inequality from the previous method of max to achieve minimum number in array (change found in if statement)
	
	public static int min(int[] array)
	{
		
		int n = array.length - 1;
		int minNumber = array[n];
		int i = n-1;
		while ( i >= 0 )
		{
			if (array[i] < minNumber)
				minNumber = array[i];
			i = i - 1;
		}
		
		return minNumber;
	}
	
	/**
	 * Purpose: return the sum of all elements in an array
	 * @param array to search and track
	 * @return sum total of all elements
	 */
	
	// I take the length of the array and iterate through it using a while loop with a less than conditional.
	// I add each iteration of the array and increment i by 1 each time until the end of the array.
	
	public static int sum(int[] array)
	{
		int sumTotal = 0;
		int n = array.length;
		int i = 0;
		while( i < n )
		{
			sumTotal += array[i];
			i += 1;
		}
	
		return sumTotal;
	}
	
	/**
	 * Purpose: return the average of all elements in an array
	 * @param array to search and track
	 * @return average of all elements
	 */
	
	// I first get the total sum of the array by looping through the length of the array and adding each iteration of the array to a sumTotal variable
	// after completing the sum total we get the average by dividing the sum by the length of the array.
	
	public static float average(int[] array)
	{
		float averageNumber = 0;
		float sumTotal = 0;
		float n = array.length;
		int i = 0;
		
		while ( i < n )
		{
			sumTotal += array[i];	
			i += 1;
		}

		averageNumber = sumTotal / n ;
		return averageNumber;	
		
	}
	
	// Use this template for the other methods
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
