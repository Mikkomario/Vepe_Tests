package HashMapTests;

/**
 * This class tests the hashmap's method size()
 *
 * @author Gandalf.
 *         Created 31.3.2013.
 */
public class HashMapSizeTest extends HashMapTest
{
	@Override
	public void prepareTest()
	{
		// Doesn't need any preparation
	}

	@Override
	public void runMethod()
	{
		getMap().size();
	}

	@Override
	public String getTestName()
	{
		return "HashMap: Size";
	}
}
