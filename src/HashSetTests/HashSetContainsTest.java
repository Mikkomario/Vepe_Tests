package HashSetTests;


/**
 * This class tests the speed of HashSet's contains -method.
 *
 * @author Gandalf.
 *         Created 27.3.2013.
 */
public class HashSetContainsTest extends HashSetTest
{
	// IMPLEMENTED METHODS	-----------------------------------------------
	
	@Override
	public void prepareTest()
	{
		// Needs no preparation
	}

	@Override
	public void runMethod()
	{
		// Tries to find a value -1 from the set (isn't included in the set)
		getSet().contains(-1);
	}


	@Override
	public String getTestName()
	{
		return "HashSet: Contains";
	}

}
