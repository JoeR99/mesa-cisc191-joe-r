package M10Recursion;

/**
 * Lead Author(s):
 * 
 * @author Joseph Rathbun
 * 
 * Other contributors:
 *         <<add additional contributors (mentors, tutors, friends) here, with
 *         contact information>>
 * 
 * References:
 *         Morelli, R., & Walde, R. (2016). Java, Java, Java: Object-Oriented Problem Solving.
 *         Retrieved from
 *         https://open.umn.edu/opentextbooks/textbooks/java-java-java-object-oriented-problem-solving
 * 
 *         <<add more references here>>
 * 
 * Version/date: 12/2/2024
 * 
 * Responsibilities of class:
 * 
 * 		Creates a Node that builds into a Binary Tree. Left and Right slots are nodes (IS-A) and can hold a string as well as another left and right node.
 * 		Has accessors and mutators for placing and searching through the tree. 
 * 
 */
public class NameNode
{
	// TODO: A NameNode has-a left node
	private NameNode left;
	
	// A NameNode has-a name
	private String name;
	
	// TODO: A NameNode has-a right node
	private NameNode right;

	/**
	 * 
	 * @param newName the String stored in the node
	 */
	public NameNode(String newName)
	{
		// TODO: store newName in node;
		this.name = newName;
		this.left = null;
		this.right = null;

	}
	
	/**
	 * 
	 * @return the String stored in the node
	 */
	public String getName()
	{
		// TODO:
		return name;
	}
	
	/**
	 * Set the left node of this node
	 * @param newLeft
	 */
	public void setLeft(NameNode newLeft)
	{
		// TODO:
		this.left = newLeft;
	}
	
	/**
	 * Set the right node of this node
	 * @param newRight
	 */
	public void setRight(NameNode newRight)
	{
		// TODO:
		this.right = newRight;
	}
	
	/**
	 * 
	 * @return the left node of this node
	 */
	public NameNode getLeft()
	{
		// TODO:
		return left;
	}
	
	/**
	 * 
	 * @return the right node of this node
	 */
	public NameNode getRight()
	{
		// TODO:
		return right;
	}
	
	/**
	 * Find the least name in the tree
	 * @return the first name of the names in the tree in lexicographical order
	 */
	public String getFirstName()
	{
		// TODO:
		if ( this.left == null )
		{
			System.out.println("First Name: " + name);
			return this.name;
		}
		else
		{
			return this.left.getFirstName();
		}
	}
	
	/**
	 * Find the largest name in the tree
	 * @return the last name of the names in the tree in lexicographical order
	 */
	public String getLastName()
	{
		// TODO:
		if ( this.right == null )
		{
			System.out.println("Last Name: " + name);
			return this.name;
		}
		else
		{
			return this.right.getLastName();
		}
	}

	/**
	 * Insert a new name into a tree
	 * 
	 * @param newName the name to be inserted
	 */
	public void insert(String newName)
	{
		// See
		// https://docs.oracle.com/javase/7/docs/api/java/lang/String.html#compareTo(java.lang.String)
		NameNode newNode = new NameNode(newName);
		
		if (newName.compareTo(name) < 0)
		{
			// TODO: insert newName on the left or right?
			// Insert in the left subtree
            if (this.left == null) {
                this.left = newNode;
            } else {
                this.left.insert(newName);  // Recurse into the left subtree
            }
			
		}
		else if (newName.compareTo(name) > 0)
		{
			// TODO: insert newName on the left or right?
            // Insert in the right subtree
            if (this.right == null) {
                this.right = newNode;
            } else {
                this.right.insert(newName);  // Recurse into the right subtree
            }
		}
	}

	/**
	 * @return the names in the tree in lexicographical order
	 */
	public String toString()
	{
		String returnValue = "";

		// TODO: in-order traverse tree recursively:
		// traverse and add left subtree, then add this, then traverse and add right subtree
		// Warning: Minds have been blown during the implementation of this method...
		
		if ( this.left != null )
		{
			returnValue += this.left.toString();
		}
		
		returnValue += this.name; // Add the current node's name
		
		if ( this.right != null )
		{
			returnValue += this.right.toString();
		}
		
		System.out.println(returnValue);
		
		return returnValue;
	}

}

