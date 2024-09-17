package M2SeniorJosephRathbun;

public class SeniorMain
{
	public static void main(String[] args)
	{
		
		Senior box = new Senior();
		
		Senior tenor = new Senior(3,3);
		
		tenor.copyArray(box);
		
		box.toString();
		tenor.toString();
	}
}
