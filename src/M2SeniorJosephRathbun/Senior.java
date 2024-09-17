package M2SeniorJosephRathbun;

public class Senior
{
	private int[][] seniorArray;

	
	public Senior()
	{
		seniorArray = new int[][]
		{
			{1,2,3},
			{1,2,3},
			{1,2,3}
		};
	}
	
	// Constructor to make a quick n x n matrix array
	public Senior(int rows, int columns)
	{
		seniorArray = new int[rows][columns] ;
	}
	
	
	public int[][] copyArray(Senior mainSenior)
	{		
		int [][] mainArray = mainSenior.seniorArray;
		
		// Initialize integer variables for the length of 
		int width = mainArray[0].length;
		int height = mainArray.length;
		
		// Initialize integer array for separate place in memory, 
		// name it copy and set size equal to the one being copied
		int[][] copy = new int[width][height] ;
		
		// For loop to iterate though each element in each array
		for (int x = 0 ; width < x ; x++)
		{
			for ( int y = 0 ; height < y ; y++)
			{
				// Set the (x,y) of copy to be equal to the (x,y) of seniorArray
				copy[x][y] = seniorArray[x][y];	
			}
		}	
		return copy;
	}
	
	
	
	// toString for Senior class
	public String toString()
	{
		String seniorReport = "Width: " + seniorArray.length + " | Height: " + seniorArray[0].length ;
		System.out.println(seniorReport);
		return seniorReport;
	}
}
