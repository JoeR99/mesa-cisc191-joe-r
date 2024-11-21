package M8Exceptions;

/**
 * Lead Author(s):
 * @author Jospeh Rathbun
 * 
 * Other contributors:
 * <<add additional contributors (mentors, tutors, friends) here, with contact information>>
 * 
 * References:
 * Morelli, R., & Walde, R. (2016). Java, Java, Java: Object-Oriented Problem Solving.
 * Retrieved from https://open.umn.edu/opentextbooks/textbooks/java-java-java-object-oriented-problem-solving
 * 
 * https://docs.oracle.com/en/java/javase/19/docs/api/java.base/java/lang/Throwable.html
 * Exception.class and Throwable.class
 *  
 * Version/date: 11/09/2024
 * 
 * Responsibilities of class:
 * 	Keeps track of the cash amount for the bill and the tip percentage. Methods for setting the bill and tip.
 *  Another method for multiplying the cash amount by the tip amount.
 */
/**
 */
public class CheckoutBill
{
	// A bill has an amount
	private double amount = 0;
	// A bill has a tip percent
	private double tipPercent = -1;

	/**
	 * Set the amount from which to calculate the total bill
	 * 
	 * @param billAmount amount on the bill
	 * @throws IllegalArgumentException is thrown if amount is not positive
	 */
	public void setBillAmount(double billAmount) throws IllegalArgumentException
	{
		// If Parameter is zero or less then throw an exception
		if ( billAmount <= 0 )
		{
			System.out.println("Bill Amount Cannot Be Less Than or Equal to Zero");
			throw new IllegalArgumentException("Bill Amount Cannot Be Less Than or Equal to Zero");
		}
		this.amount = billAmount; // Otherwise set amount equal to parameter value
	}

	/**
	 * Set the tip percent from which to calculate the total bill
	 * 
	 * @param percent tip given
	 * @throws IllegalArgumentException is thrown if percent is negative
	 */
	public void setTipPercent(double percent) throws IllegalArgumentException
	{
		// TODO
		// If Parameter is zero or less then throw an exception
		if ( percent < 0 )
		{
			System.out.println("Tip Percentage Cannot Be Negative");
			throw new IllegalArgumentException("Tip Percentage Cannot Be Negative");
		}
		this.tipPercent = percent; // Otherwise set tipPercent to the parameter value
	}

	/**
	 * Calculate the total bill from the bill amount and tip percentage
	 * @return total bill amount
	 * @throws IllegalStateException if bill amount is not positive or tip percent is negative
	 */
	public double calculateTotalBill() throws IllegalStateException
	{
		// TODO
		
		if ( amount == 0 || tipPercent == -1 )
		{
			System.out.println("Cannot Calculate Bill Amount If Either Amount or Tip Percentage is Empty");
			throw new IllegalStateException("Cannot Calculate Bill Amount If Either Amount or Tip Percentage is Empty");
			
		}
		
		return amount * (1 + tipPercent / 100);
	}

	public static void main(String[] args)
	{
		// TODO: prevent the program from crashing from (almost) any exception
		
		CheckoutBill bill = new CheckoutBill();
		
		try {
			bill.setTipPercent(-1); 
			bill.calculateTotalBill();
		}
		
		catch (Exception e) {
			System.out.println("Check Bill For AMOUNT");
		}
	}
}

