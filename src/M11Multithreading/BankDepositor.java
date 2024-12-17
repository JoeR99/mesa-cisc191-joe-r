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

public class BankDepositor extends Thread
{
	private BankAccount account; // BankDepositor HAS-A BankAccount
	private double totalAmountToDeposit; // BankDepositor HAS-A totalAmountToDeposit

	/**
	 * // Constructor that takes in two parameters and sets the account and totalAmountToDeposit to the parameter values
	 * 
	 * @param givenAccount
	 * @param givenAmountToDeposit
	 */
	public BankDepositor(BankAccount givenAccount, double givenAmountToDeposit)
	{
		account = givenAccount;
		totalAmountToDeposit = givenAmountToDeposit;
	}

	// When this function is called the thread runs until the counter in the for loop reaches the totalAmountToDeposit
	@Override
	public void run()
	{
		System.out.println(Thread.currentThread().getName() + " running...");
		
		for (int counter = 0; counter < totalAmountToDeposit; counter++)
		{
			// Deposit $1 at a time
			account.deposit(1);
		}
		
		System.out.println(Thread.currentThread().getName() + " end.");
	}
}
