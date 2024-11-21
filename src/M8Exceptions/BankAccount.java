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
 * 	Keeps track of the balance for a BankAccount and methods to change it. Deposit and Withdrawing methods with their exception handling 
 */
/**
 */
public class BankAccount
{
	// A bank account has a current balance starting at $0.00
	private double balance = 0;

	/**
	 * 
	 * @return the current balance
	 */
	public double getBalance()
	{
		System.out.println("Balance: " + balance);
		return balance;
	}

	/**
	 * Deposit amount into account
	 * 
	 * @param amount to deposit
	 * @throws InvalidAmountException is thrown if amount is not positive
	 */
	public void deposit(double amount) throws InvalidAmountException
	{
		// TODO
		
		if ( amount < 0 )
		{
			System.out.println("Negative amount: $" + amount + " is not allowed");
			throw new InvalidAmountException(amount);
		}
		balance += amount;
	}

	/**
	 * Withdraw amount from account
	 * 
	 * @param amount to withdraw
	 * @throws InvalidAmountException     is thrown if amount is not positive
	 * @throws InsufficientFundsException is thrown if there is not enough funds in
	 *                                    the account to make the withdrawal
	 */
	public void withdraw(double amount) throws Exception
	{
		// TODO
		
		if ( amount < 0 )
		{
			System.out.println("Negative amount: $" + amount + " is not allowed");
			throw new InvalidAmountException(amount);
		}
		
		if ( amount > balance )
		{
			System.out.println("Withdrawing amount: $" + amount + " that is larger than balance: $" + (int) balance + " is not allowed");
			throw new InsufficientFundsException(amount, balance);
		}
		
		balance -= amount;		
	}

	/**
	 * Withdraw amount requested or the biggest amount possible
	 * 
	 * @return the amount actually withdrawn
	 * @throws InvalidAmountException     is thrown if amount is not positive
	 */
	public double withdrawAsPossible(double requestAmount) throws Exception
	{
		// TODO:
		// Try to withdraw the requested amount
		try {
			withdraw(requestAmount);
			return requestAmount;
		}
		catch (InsufficientFundsException e)
		{
			double copyBalance = balance;
			withdraw(balance);
			return copyBalance;
		}
		// If it fails, get as much as possible	
	}
}
