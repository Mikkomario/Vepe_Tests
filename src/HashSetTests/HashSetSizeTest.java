package HashSetTests;

/**
 * This class tests the HashSet's method size()
 *
 * @author Gandalf.
 *         Created 31.3.2013.
 */
public class HashSetSizeTest extends HashSetTest
{
	@Override
	public void prepareTest()
	{
		// Doesn't need any preparation
	}

	@Override
	public void runMethod()
	{
		getSet().size();
	}

	@Override
	public String getTestName()
	{
		return "HashSet: Size";
	}

}
