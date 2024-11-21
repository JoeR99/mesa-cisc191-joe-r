package M23ChallJosephRathbun;

import edu.gatech.cc.DigitalPicture;
import edu.gatech.cc.Pixel;

public class M23challJoeR
{
	/**
	 * Alters the picture so that each pixel's blue channel has been zeroed out. All
	 * other channels remain the same
	 * 
	 * @param picture the image to be altered
	 */
	
	public static void zeroBlue(DigitalPicture picture)
	{

		Pixel[][] pixel2D = picture.getPixels2D();
		for (int r = 0; r < pixel2D.length; r++)
		{
			for (int c = 0; c < pixel2D[r].length; c++)
			{
				pixel2D[r][c].setBlue(0);
			}
		}
	}	
	
	/**
	 * Alters the picture so that each pixel's RGB channel has been set to the average of each pixel.
	 * Should turn the image Black and White
	 * 
	 * @param picture the image to be altered
	 */
	
	public static void blackAndWhite(DigitalPicture picture)
	{
		
		// Get the 2D pixel array of the picture
		Pixel[][] pixel2D = picture.getPixels2D();
		
		// Initialize values for RGB and average for use in for loop
		int red;
		int green;
		int blue;
		
		// Initialize variable for average of RGB channels (added up and divided by 3)
		int average;
		
		// Initialize variables for the width and height of the image (x,y)
		int height = pixel2D.length;
		int width =  pixel2D[0].length;
		
		// for loop that iterates through each x-index in the image
		for (int x = 0; x < height ; x++)
		{	
			// for loop that iterates through each y-index in the image
			for (int y = 0; y < width ; y++)
			{
				// Get rgb values and put them in memory
				red = pixel2D[x][y].getRed();
				green = pixel2D[x][y].getGreen();
				blue = pixel2D[x][y].getBlue();
				
				// Calculate the average of RGB to setup gray scale
				average = (red + green + blue) / 3 ;
				
				// Set the rgb to the average
				pixel2D[x][y].setRed(average);
				pixel2D[x][y].setGreen(average);
				pixel2D[x][y].setBlue(average);
			}
		}
		
	}
	
	
	/**
	 * Alters the picture so that each pixel's RGB value is subtracted from 255 and set to that value.
	 * Makes the image a negative of itself.
	 * 
	 * @param picture the image to be altered
	 */
	
	public static void negative(DigitalPicture picture)
	{
		// Get the 2D pixel array of the picture
		Pixel[][] pixel2D = picture.getPixels2D();
		
		// Initialize values for RGB and average for use in for loop
		int red;
		int green;
		int blue;
		
		// Initialize variables for the width and height of the image (x,y)
		int height = pixel2D.length;
		int width =  pixel2D[0].length;
				
		// for loop that iterates through each x-index in the image
		for (int x = 0; x < height ; x++)
		{	
			// for loop that iterates through each y-index in the image
			for (int y = 0; y < width ; y++)
			{
				// Get RGB values and put them in memory
				red = pixel2D[x][y].getRed();
				green = pixel2D[x][y].getGreen();
				blue = pixel2D[x][y].getBlue();	
				
				// Set the RGB to 255 minus the current RGB values
				pixel2D[x][y].setRed(255 - red);
				pixel2D[x][y].setGreen(255 - green);
				pixel2D[x][y].setBlue(255 - blue);
			}
		}		
	
	}

	
	/**
	 * Alters the picture so that each pixel's red channel is enhanced and reducing each green and blue channel.
	 * Modifies the image to appear like a sunset.
	 * 
	 * @param picture the image to be altered
	 * @param a double that enhances the red channel by 1.1 to 1.5
	 * @param a double that reduces green and blue channels by 0.5 to 0.9
	 */
	
	public static void makeSunset(DigitalPicture picture, double redIntensity, double greenBlueReduction)
	{
		// Get the 2D pixel array of the picture
		Pixel[][] pixel2D = picture.getPixels2D();
				
		// Initialize values for RGB and average for use in for loop
		// Need to create specific double and integer varieties to convert double to integer
		double red;
		double green;
		double blue;
		
		int r;
		int g;
		int b;
		
		// Initialize variables for the width and height of the image (x,y)
		int height = pixel2D.length;
		int width =  pixel2D[0].length;
		
		// for loop that iterates through each x-index in the image
		for (int x = 0; x < height ; x++)
		{	
			// for loop that iterates through each y-index in the image
			for (int y = 0; y < width; y++)
			{
				// Get RGB values and put them in memory
				red = redIntensity*pixel2D[x][y].getRed();
				green = greenBlueReduction*pixel2D[x][y].getGreen();
				blue = greenBlueReduction*pixel2D[x][y].getBlue();
				
				// This step converts the double values into integer so it can be parsed without error.
				r = (int) (red);
				g = (int) (green);
				b = (int) (blue);
				
				
				// Set the red channel to red multiplied by the redIntensity parameter
				pixel2D[x][y].setRed(r);
				
				// Set the green and blue channel to be multiplied by the greenBlueReduction parameter
				pixel2D[x][y].setGreen(g);
				pixel2D[x][y].setBlue(b);
				
				
			}
		}
	}
	
	/**
	 * Alters the picture so that each pixel's RGB channel has been swapped horizontally
	 * Turns the image left-right to right-left
	 * 
	 * @param picture the image to be altered
	 */
	
	public static void mirrorHorizontal(DigitalPicture picture)
	{
		
		// Get the 2D pixel array of the picture
		Pixel[][] pixel2D = picture.getPixels2D();
		
		// Initialize variables for RGB values at the starting pixel of an image
		int redStart;
		int greenStart;
		int blueStart;
		
		// Initialize variables for RGB values at the ending pixel of an image
		int redEnd;
		int greenEnd;
		int blueEnd;
		
		// Initialize variables for the height and width of the image
		int height = pixel2D.length;
		int width = pixel2D[0].length;

		//Initialize variable for being the end of the frame and ticks down every pixel
		int mirroredY;
			
		
		// for loop that iterates through each y-index in the image
		for ( int y = 0; y < width / 2 ; y++)
		{	
			// for loop that iterates through each x-index in the image
			for (int x = 0; x < height ; x++)
			{
				
				// Get the RGB values of current starting pixel
				redStart = pixel2D[x][y].getRed();
				greenStart = pixel2D[x][y].getGreen();
				blueStart = pixel2D[x][y].getBlue();	
				
				// Have ending pixel increment down with the for-loops y and minus 1 to correct for length.
				mirroredY = width - y - 1;
				
				// Get the RGB values of the current ending pixel
				redEnd = pixel2D[x][mirroredY].getRed();
				greenEnd = pixel2D[x][mirroredY].getGreen();
				blueEnd = pixel2D[x][mirroredY].getBlue();
				
				// Set the RGB values of the ending pixel with the starting pixel
				pixel2D[x][mirroredY].setRed(redStart);		
				pixel2D[x][mirroredY].setGreen(greenStart);
				pixel2D[x][mirroredY].setBlue(blueStart);
						
				// Set the RGB values of the starting pixel with the ending pixel
				pixel2D[x][y].setRed(redEnd);		
				pixel2D[x][y].setGreen(greenEnd);
				pixel2D[x][y].setBlue(blueEnd);
							
			}
		}
	}
	
	
	/**
	 * Alters the picture so that each pixel's RGB channel has been swapped vertically
	 * Turns the image top-down to down-top
	 * 
	 * @param picture the image to be altered
	 */
	
	public static void mirrorVertical(DigitalPicture picture)
	{
		
		// Get the 2D pixel array of the picture
		Pixel[][] pixel2D = picture.getPixels2D();
		
		// Initialize variables for RGB values at the starting pixel of an image
		int redStart;
		int greenStart;
		int blueStart;
		
		// Initialize variables for RGB values at the ending pixel of an image
		int redEnd;
		int greenEnd;
		int blueEnd;
		
		// Initialize variables for the width and height of the image (x,y)
		int height = pixel2D.length;
		int width =  pixel2D[0].length;
		
		//Initialize variable for being the end of the frame and ticks down every pixel
		int mirroredX;
		
		// for loop that iterates through each y-index in the image
		for ( int  y = 0; y < width ; y++)
		{	
			// for loop that iterates through each x-index in the image
			for (int x = 0; x < height / 2 ; x++)
			{
				// Get the RGB values of current starting pixel
				redStart = pixel2D[x][y].getRed();
				greenStart = pixel2D[x][y].getGreen();
				blueStart = pixel2D[x][y].getBlue();
				
				// Have ending pixel increment down with the for-loops y and minus 1 to correct for length.
				mirroredX = height - x - 1;
				
				// Get the RGB values of the current ending pixel
				redEnd = pixel2D[mirroredX][y].getRed();
				greenEnd = pixel2D[mirroredX][y].getGreen();
				blueEnd = pixel2D[mirroredX][y].getBlue();
							
				// Set the RGB values of the ending pixel with the starting pixel
				pixel2D[mirroredX][y].setRed(redStart);		
				pixel2D[mirroredX][y].setGreen(greenStart);
				pixel2D[mirroredX][y].setBlue(blueStart);
				
				// Set the RGB values of the starting pixel with the ending pixel
				pixel2D[x][y].setRed(redEnd);		
				pixel2D[x][y].setGreen(greenEnd);
				pixel2D[x][y].setBlue(blueEnd);
				
			}
		}
	}
	
	
	/**
	 * Alters the picture so that each pixel's RGB channel has been set to the average of four pixels 
	 * found in a 2x2 square 
	 * Makes the image blurry.
	 * 
	 * @param picture the image to be altered
	 */
	
	public static void blur(DigitalPicture picture)
	{
		// Get the 2D pixel array of the picture
		Pixel[][] pixel2D = picture.getPixels2D();
		
		// Initialize variables for Red channels to be used as a 2 x 2 square
		int red0x0;
		int red0x1;
		int red1x0;
		int red1x1;
		
		// Initialize variables for Green channels to be used as a 2 x 2 square
		int green0x0;
		int green0x1;
		int green1x0;
		int green1x1;
		
		// Initialize variables for Blue channels to be used as a 2 x 2 square
		int blue0x0;
		int blue0x1;
		int blue1x0;
		int blue1x1;
		
		// Initialize variables for the averages of Red, Green, and Blue within the 2 x 2 square
		int redAverage;
		int greenAverage;
		int blueAverage;
		
		// for loop that iterates through each x-index in the image
		for ( int x = 0; x < pixel2D.length - 1 ; x++)
		{
			
			// for loop that iterates through each y-index in the image
			for ( int y = 0; y < pixel2D[0].length - 1 ; y++) 
			{
				
				// Get Red values found within the 2 x 2 square
				red0x0 = pixel2D[x][y].getRed();
				red0x1 = pixel2D[x][y + 1].getRed();
				red1x0 = pixel2D[x + 1][y].getRed();
				red1x1 = pixel2D[x + 1][y + 1].getRed();
				 
				// Get Green values found within the 2 x 2 square
				green0x0 = pixel2D[x][y].getGreen();
				green0x1 = pixel2D[x][y + 1].getGreen();
				green1x0 = pixel2D[x + 1][y].getGreen();
				green1x1 = pixel2D[x + 1][y + 1].getGreen();
				 
				// Get Blue values found within the 2 x 2 square
				blue0x0 = pixel2D[x][y].getBlue();
				blue0x1 = pixel2D[x][y + 1].getBlue();
				blue1x0 = pixel2D[x + 1][y].getBlue();
				blue1x1 = pixel2D[x + 1][y + 1].getBlue();
				 
				// Average the 4 Red values found in the 2 x 2 square
				redAverage = (red0x0 + red0x1 + red1x0 + red1x1) / 4 ;
				
				// Average the 4 Green values found in the 2 x 2 square
				greenAverage = (green0x0 + green0x1 + green1x0 + green1x1) / 4 ;
		
				// Average the 4 Blue values found in the 2 x 2 square
				blueAverage = (blue0x0 + blue0x1 + blue1x0 + blue1x1) / 4 ;
				
				// Set the RGB Values at the (x,y) or top-left of the 2 x 2 square
				pixel2D[x][y].setRed(redAverage);
		        pixel2D[x][y].setGreen(greenAverage);
		        pixel2D[x][y].setBlue(blueAverage);
		        
		        // Set the RGB Values at the (x,y+1) or top-right of the 2 x 2 square
		        pixel2D[x][y + 1].setRed(redAverage);
		        pixel2D[x][y + 1].setGreen(greenAverage);
		        pixel2D[x][y + 1].setBlue(blueAverage);

		        // Set the RGB Values at the (x+1,y) or bottom-left  of the 2 x 2 square
		        pixel2D[x + 1][y].setRed(redAverage);
		        pixel2D[x + 1][y].setGreen(greenAverage);
		        pixel2D[x + 1][y].setBlue(blueAverage);

		        // Set the RGB Values at the (x+1,y+1) or bottom-right  of the 2 x 2 square
		        pixel2D[x + 1][y + 1].setRed(redAverage);
		        pixel2D[x + 1][y + 1].setGreen(greenAverage);
		        pixel2D[x + 1][y + 1].setBlue(blueAverage);		
			}
		}
	}
}
