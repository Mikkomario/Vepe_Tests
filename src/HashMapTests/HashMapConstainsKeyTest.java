package HashMapTests;

/**
 * This class tests the HashMap's containskey method
 *
 * @author Gandalf.
 *         Created 31.3.2013.
 */
public class HashMapConstainsKeyTest extends HashMapTest
{
	@Override
	public void prepareTest()
	{
		// Doesn't need any preparation
	}

	@Override
	public void runMethod()
	{
		// Tries to find a non-existant key
		getMap().containsKey(-1);
	}

	@Override
	public String getTestName()
	{
		return "HashMap: ContainsKey";
	}
}
