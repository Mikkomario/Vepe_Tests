package HashSetTests;

/**
 * This class tests the HashSet's method remove
 *
 * @author Gandalf.
 *         Created 28.3.2013.
 */
public class HashSetRemoveTest extends HashSetTest
{

	@Override
	public void prepareTest()
	{
		// Adds an additional instance for removal
		getSet().add(-100);
	}

	@Override
	public void runMethod()
	{
		getSet().remove(-100);
	}

	@Override
	public String getTestName()
	{
		return "HashSet: Remove";
	}

}
