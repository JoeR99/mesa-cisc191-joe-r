package M2SeniorJosephRathbun;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SeniorTest
{

	@Test
	void testCopyArray()
	{
		
		Senior bill = new Senior();
		
		Senior willy = new Senior(3,3);
		
		willy.copyArray(bill);
		
		assertEquals(new int[][]{{1,2,3},{1,2,3},{1,2,3}}, bill);
//		assertEquals(new int[][]{{1,2,3},{1,2,3},{1,2,3}}, willy);
	}

}
