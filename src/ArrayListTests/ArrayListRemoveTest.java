package ArrayListTests;

/**
 * This class test the remove() -method in ArrayList
 *
 * @author Unto
 *         Created 31.3.2013.
 */
public class ArrayListRemoveTest extends ArrayListTest
{
	// ATTRIBUTES	------------------------------------------------------
	
	private int lastaddindex;
	
	
	// CONSTRUCTOR	------------------------------------------------------
	
	/**
	 * Creates a new ArrayListRemoveTest
	 */
	public ArrayListRemoveTest()
	{
		// Initializes the attribute(s)
		this.lastaddindex = 0;
	}
	
	
	// IMPLEMENTED METHODS	----------------------------------------------
	@Override
	public void prepareTest()
	{
		getArrayList().add(-100);	
		this.lastaddindex = getArrayList().size() - 1;
	}

	@Override
	public void runMethod()
	{
		// Throws an indexoutofboundsexception so I changed this (Gandalf)
		// getArrayList().remove(-100);	
		
		getArrayList().remove(this.lastaddindex);
	}

	@Override
	public String getTestName()
	{
		return "ArrayList: Remove";
	}

}
