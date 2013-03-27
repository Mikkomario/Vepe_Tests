
/**
 * This class tests the speed of HashSet's contains -method.
 *
 * @author Gandalf.
 *         Created 27.3.2013.
 */
public class HashSetContainsTest extends HashSetTest
{
	// ATTRIBUTES	-------------------------------------------------------
	
	// A value that needs to be found from the set
	private long valuetofind;
	
	
	// CONSTRUCTOR	-------------------------------------------------------
	
	/**
	 * Creates a new HashSetContainsTest with an empty data structure
	 */
	public HashSetContainsTest()
	{
		super();
		
		// Initializes the attribute(s)
		this.valuetofind = 0;
	}
	
	
	// IMPLEMENTED METHODS	-----------------------------------------------
	
	@Override
	public void prepareTest()
	{
		// Sets the value that must be found so that it's the latest value 
		// added to the structure
		this.valuetofind = getSet().size();
	}

	@Override
	public void runMethod()
	{
		// Runs the contains -method for the set
		getSet().contains(this.valuetofind);
	}


	@Override
	public String getTestName()
	{
		return "HashSet: Contains";
	}

}
