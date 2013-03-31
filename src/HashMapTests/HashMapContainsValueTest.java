package HashMapTests;

/**
 * This class tests the method containsvalue in the hashmap class
 *
 * @author Gandalf.
 *         Created 31.3.2013.
 */
public class HashMapContainsValueTest extends HashMapTest
{
	@Override
	public void prepareTest()
	{
		// Doesn't need any preparation
	}

	@Override
	public void runMethod()
	{
		// Tries to find an nonexistant value
		getMap().containsValue(-1);
	}

	@Override
	public String getTestName()
	{
		return "HashMap: ContainsValue";
	}

}
