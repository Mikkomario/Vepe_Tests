package HashMapTests;

/**
 * Tests HashMap's method get()
 *
 * @author Gandalf.
 *         Created 31.3.2013.
 */
public class HashMapGetTest extends HashMapTest
{
	@Override
	public void prepareTest()
	{
		// Doesn't need preparation
	}

	@Override
	public void runMethod()
	{
		// Tries to get an nonexistant instance
		getMap().get(-1);
	}

	@Override
	public String getTestName()
	{
		return "HashMap: Get";
	}

}
