package m1ChallengeJosephRathbun;

import static m1ChallengeJosephRathbun.M1ChallengeJosephRathbun.*;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class M1Test
{
	@Test // This indicates that the next method is a test method
	void testAdd()
	{
		// add(..., ...) adds two numbers
		// This checks that add(2, 2) returns 4.
		assertEquals(4, add(2, 2));
		// This checks that add(2, -2) returns 0.
		assertEquals(0, add(2, -2));
	}
	
	@Test // @Test must not in a comment
	void testMultiply()
	{
		// multiply(..., ...) multiplies two numbers
		// This checks that add(2, 2) returns 4.
		assertEquals(4, multiply(2, 2));
		// This checks that add(2, -2) returns 0.
		assertEquals(-4, multiply(2, -2));
	}
	
	@Test
	void testGetFirst()
	{
		int[] array1 = { 1 };
		assertEquals(1, getFirst(array1));
		int[] array2 = { 0, 1, 2 };
		assertEquals(0, getFirst(array2));
	}
	
	@Test
	void testGetLast()
	{
		int[] array1 = { 1 };
		assertEquals(1, getLast(array1));
		int[] array2 = { 0, 1, 2 };
		assertEquals(2, getLast(array2));
	}
	
	@Test
	void testGetMiddle()
	{
		// Only solve for the examples given here
		int[] array1 = { 1 };
		assertEquals(1, getMiddle(array1));
		int[] array2 = { 0, 4, 8 };
		assertEquals(4, getMiddle(array2));
        int[] array3 = { 0, 1, 2, 3, 4 };
	    assertEquals(2, getMiddle(array3));
	}
	@Test
	void testMax()
	{
		int[] array1 = { 1 };
		// This checks that max returns 1 (the only element)
		assertEquals(1, max(array1));
		
		array1[0] = -2147483648;
		assertEquals(-2147483648, max(array1));

		int[] array2 = { 1, 2, 2147483647 };
		// This checks that max returns 2147483647, the largest element
		assertEquals(2147483647, max(array2));

		int[] array3 = { -1, 2, -2147483648 };
		// This checks that max returns 2, which is the largest element
		assertEquals(2, max(array3));

		int[] array4 = { -42, -2, -3 };
		// This checks that max returns -2, which is the largest element
		assertEquals(-2, max(array4));
		
		int[] array5 = { 3, 1, 2 };
		assertEquals(3, max(array5));
				
		int[] array6 = { 2, 1, 3 };
		assertEquals(3, max(array6));
		
		int[] array7 = { 2, 3, 1 };
		assertEquals(3, max(array7));
	}
	
	@Test
	void testMin()
	{
		int[] array1 = {1};
		assertEquals(1, min(array1));
		
		array1[0] = 2147483647;
		assertEquals(2147483647, min(array1));
		
		int[] array2 = {2, 1, 3};
		assertEquals(1, min(array2));

		int[] array3 = {-1, -2, 2147483647};
		assertEquals(-2, min(array3));

		int[] array4 = {-1, -2, -2147483648};
		assertEquals(-2147483648, min(array4));
		
		int[] array5 = {1, 2, 3};
		assertEquals(1, min(array5));	
		
		int[] array6 = {3, 2, 1};
		assertEquals(1, min(array6));
	}
	
	@Test
	void testSum()
	{
		int[] array0 = {};
		assertEquals(0, sum(array0));
		
		int[] array1 = {1};
		assertEquals(1, sum(array1));
		
		int[] array2 = {1, 2, 3};
		assertEquals(1+2+3, sum(array2));

		int[] array3 = {-1, -2, 3};
		assertEquals(-1+(-2)+3, sum(array3));

		int[] array4 = {-1, -2, -3};
		assertEquals(-1+(-2)+(-3), sum(array4));
	}
	
	@Test
	void testAverage()
	{
		int[] array1 = {17};
		assertEquals(17.0, average(array1));
		
              // hint: can you use sum?
		int[] array2 = {2, 3};
		assertEquals((2+3)/2.0, average(array2));

		int[] array3 = {-1, -2, 3};
		assertEquals((-1+(-2)+3)/3.0, average(array3));

		int[] array4 = {-1, -2, -3};
		assertEquals((-1+(-2)+(-3))/3.0, average(array4));
	}
}
