package ArrayListTests;

/**
 * This class test the add() -method in ArrayList
 *
 * @author Unto
 *         Created 31.3.2013.
 */
public class ArrayListContainsTest extends ArrayListTest{

	@Override
	public void prepareTest() {
		// Not needed
		
	}

	@Override
	public void runMethod() {
		getArrayList().contains(-1);
		
	}

	@Override
	public String getTestName() {
		return "ArrayList: Contains";
	}

}
