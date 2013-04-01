package ArrayListTests;

/**
 * This class test the add() -method in ArrayList
 *
 * @author Unto
 *         Created 31.3.2013.
 */
public class ArrayListAddTest extends ArrayListTest
{
	// IMPLEMENTED METHODS	-----------------------------------------------
	
	@Override
	public void prepareTest()
	{
		// Throws an indexoutofbounds exception when trying to remove the 
		// -100:th instance
		//getArrayList().remove(-100);
		
		// So I changed it a bit (Gandalf)
		if (getArrayList().size() > 0)
			getArrayList().remove(getArrayList().size() - 1);
	}

	@Override
	public void runMethod()
	{
		getArrayList().add(-100);
	}
	
	@Override
	public String getTestName()
	{
		return "ArrayList: Add";
	}

}
