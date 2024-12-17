package M11Multithreading;

/**
 * @author Allan Schougaard
 * @otherContributors: None
 * @version 1
 * @see Morelli, R., & Walde, R. (2016). Java, Java, Java: Object-Oriented
 *      Problem Solving.
 *      https://open.umn.edu/opentextbooks/textbooks/java-java-java-object-oriented-problem-solving
 * @see Bechtold, S., Brannen, S., Link, J., Merdes, M., Philipp, M., Rancourt,
 *      J. D., & Stein, C. (n.d.). JUnit 5 user guide. JUnit 5.
 *      https://junit.org/junit5/docs/current/user-guide/
 */

//TODO: comment the code

public class BankWithdrawer extends Thread
{
	private BankAccount account; // BankWithdrawer HAS-A BankAccount
	private double totalAmountToWithdraw; // BankWithdrawer HAS-A totalAmountToWithdraw

	
	/**
	 * // Constructor that takes in two parameters and sets the account and totalAmountToWithdraw to the parameter values
	 * 
	 * @param givenAccount
	 * @param givenAmountToWithdraw
	 */
	public BankWithdrawer(BankAccount givenAccount, double givenAmountToWithdraw)
	{
		account = givenAccount;
		totalAmountToWithdraw = givenAmountToWithdraw;
	}

	// When this function is called the thread runs until the counter in the for loop reaches the totalAmountToWithdraw
	@Override
	public void run()
	{
		System.out.println(Thread.currentThread().getName() + " running...");
		
		for (int counter = 0; counter < totalAmountToWithdraw; counter++)
		{
			// Withdraw $1 at a time
			account.withdraw(1);
		}
		
		System.out.println(Thread.currentThread().getName() + " end.");
	}
}
