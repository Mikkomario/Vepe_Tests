import java.util.HashSet;


/**
 * This is an abstract superclass for all the tests that use the HashSet 
 * data structure. This class handles the initialization of the data structure 
 * and adding new instances to the structure.
 * 
 * The hashset contains instances that are type integer. they start from 1 and 
 * encrease by one with each new instance in the structure.
 *
 * @author Gandalf.
 *         Created 27.3.2013.
 */
public abstract class HashSetTest extends AbstractTest
{
	// ATTRIBUTES	------------------------------------------------------
	
	private HashSet<Integer> datastructure;
	private int instancecount;
	
	
	// CONSTRUCTOR	------------------------------------------------------
	
	/**
	 * Creates a new HashSetTest and initializes the data structure used
	 */
	public HashSetTest()
	{
		// Initializes the attribute(s)
		this.datastructure = new HashSet<Integer>();
		this.instancecount = 0;
	}
	
	
	// ABSTRACT METHODS	--------------------------------------------------
	
	@Override
	public void addInstance()
	{
		this.instancecount++;
		getSet().add(this.instancecount);
	}
	
	
	// GETTERS & SETTERS	----------------------------------------------
	
	/**
	 * @return The data structure used in the test
	 */
	public HashSet<Integer> getSet()
	{
		return this.datastructure;
	}
}
