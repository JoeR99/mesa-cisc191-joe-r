package M9IO;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.net.URL;
import java.util.Scanner;

/**
* 
 * Lead Author(s):
 * @author Joseph Rathbun
 * 
 * Other contributors:
 * <<add additional contributors (mentors, tutors, friends) here, with contact information>>
 * 
 * References:
 * Morelli, R., & Walde, R. (2016). Java, Java, Java: Object-Oriented Problem Solving.
 * Retrieved from https://open.umn.edu/opentextbooks/textbooks/java-java-java-object-oriented-problem-solving
 * 
 * Gaddis, T. (2015). Starting out with Java: From control structures through objects. Addison-Wesley. 
 * 
 * FileWriter.class
 *  
 * Version/date: 11/20/2024
 * 
 * Responsibilities of class:
 * 	Contains multiple methods that take in a string that is then used for opening either a file, printwriter or url.
 *  The respective methods scan through the content of the file/website then returns the data as a string.
 *  Contains exception handling for file existence and to finally close the scanner after finishing the task.
 * 
 */
/**
 */
public class IO
{
	// Hint: close operations must happen in a finally clause.
	
	// Method scans through a file and returns the data as a string
	public static String readTestResults(String fileName)
	{
		File myFile = new File(fileName); // fileName is the name of the file
		
		Scanner scan = null;
		
		String content = "";
		
		try 
		{
			scan = new Scanner(myFile);
		
			//Obtain content from the file as long as there is content to be obtained 
			while(scan.hasNext())
			{
				content += scan.next();
				System.out.println("" + content);
			}
			return content;
		}
		catch (FileNotFoundException e)
		{
			System.out.println("" + content);
		}
		finally 
		{
			if(scan!=null)
			{

				scan.close();
			}
		}
		return content;
	}
	
	// Method that creates a file and adds data to it
	public static String startTestResults(String fileName, String lineData)
	{		
		String content = "";
		
		try 
		{
		     //Create a PrintWriter object for a given filename
		     PrintWriter outputFileWriter = new PrintWriter(fileName);

		     //Anytime you want to "write" to the writer, use the println command
		     outputFileWriter.println(lineData);

		     //Once you are done "writing", close the file.
		     outputFileWriter.close();
		}
		catch(FileNotFoundException e)
		{
			System.out.println("File not found. File will not write.");
		}
		
		return content;
	}
	
	// Method that changes the data found in a file
	public static String appendTestResult(String fileName, String lineData)
	{		
		String content = "";

		try 
		{
		     //Create a PrintWriter object for a given filename
		     PrintWriter outputFileWriter = new PrintWriter(new FileWriter(new File(fileName), true));

		     //Anytime you want to "write" to the writer, use the println command
		     outputFileWriter.println(lineData);

		     //Once you are done "writing", close the file.
		     outputFileWriter.close();
		}
		catch(Exception e)
		{
			System.out.println("File not found. File will not write.");
		}
		return content;
	}
	
	// Method that returns the current Date and Time seciton of any url
	public static String readDateTime(String fileName)
	{
		Scanner scan = null;
		
		String content = "";
		
		String dateKey = "\"datetime\":\"";
						
		try 
		{
			URL url = new URL(fileName);
			
			scan = new Scanner(url.openStream());
			
			
			while(scan.hasNext())
			{
				content += scan.next();
			}
			
			int startIndex = content.indexOf(dateKey);
			startIndex += dateKey.length(); // Moves to the start of the time	 value
			
			int endIndex = content.indexOf("\"", startIndex);
			
			System.out.println("" + content.substring(startIndex, endIndex));
			
			return content.substring(startIndex, endIndex);
		}
		catch(Exception e)
		{
			System.out.println("ERROR!");
			return "";
		}
		finally 
		{
			if ( scan != null )
			{
				scan.close();
			}
		}
	}
	
	public IO()
	{

	}
}
