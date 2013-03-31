package ArrayListTests;

/**
 * This class test the add() -method in ArrayList
 *
 * @author Unto
 *         Created 31.3.2013.
 */
public class ArrayListAddTest extends ArrayListTest{
	
	// IMPLEMENTED METHODS	-----------------------------------------------
	
	@Override
	public void prepareTest() {
		getArrayList().remove(-100);
		
	}

	@Override
	public void runMethod() {
		getArrayList().add(-100);
	}
	
	@Override
	public String getTestName() {
		return "ArrayList: Add";
	}

}
