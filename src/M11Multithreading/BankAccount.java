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

// TODO: comment the code

/**
 * 
 *
 */
public class BankAccount
{
	/**
	 * 
	 */
	private double balance = 0;
	
	/**
	 * 
	 * @param amount
	 */
	public void deposit(double amount)
	{
		balance += amount;
	}
	
	/**
	 * 
	 * @param amount
	 */
	public void withdraw(double amount)
	{
		balance -= amount;
	}
	
	/**
	 * 
	 * @return
	 */
	public double getBalance()
	{
		return balance;
	}
}
