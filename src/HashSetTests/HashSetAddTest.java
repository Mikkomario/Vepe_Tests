package HashSetTests;

/**
 * This class test the add -method in hashset
 *
 * @author Gandalf.
 *         Created 28.3.2013.
 */
public class HashSetAddTest extends HashSetTest
{
	// IMPLEMENTED METHODS	-----------------------------------------------
	
	@Override
	public void prepareTest()
	{
		// Removes the last added integer
		getSet().remove(-100);
	}

	@Override
	public void runMethod()
	{
		getSet().add(-100);
	}

	@Override
	public String getTestName()
	{
		return "HashSet: Add";
	}

}
