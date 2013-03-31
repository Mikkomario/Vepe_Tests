package HashMapTests;

/**
 * This class tests the HashMap's put method
 *
 * @author Gandalf.
 *         Created 31.3.2013.
 */
public class HashMapPutTest extends HashMapTest
{
	@Override
	public void prepareTest()
	{
		// Removes the last added instance
		getMap().remove(-100);
	}

	@Override
	public void runMethod()
	{
		getMap().put(-100, -100);
	}

	@Override
	public String getTestName()
	{
		return "HashMap: Put";
	}

}
