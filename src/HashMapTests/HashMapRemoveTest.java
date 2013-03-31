package HashMapTests;

/**
 * This class tests the hashmap's method remove
 *
 * @author Gandalf.
 *         Created 31.3.2013.
 */
public class HashMapRemoveTest extends HashMapTest
{
	@Override
	public void prepareTest()
	{
		// Adds an additional instance to be removed
		getMap().put(-100, -100);
	}

	@Override
	public void runMethod()
	{
		getMap().remove(-100);
	}

	@Override
	public String getTestName()
	{
		return "HashMap: Remove";
	}

}
