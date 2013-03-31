package ArrayListTests;

/**
 * This class test the get() -method in ArrayList
 *
 * @author Unto
 *         Created 31.3.2013.
 */
public class ArrayListGetTest extends ArrayListTest{

	@Override
	public void prepareTest() {
		// Not needed.
		
	}

	@Override
	public void runMethod() {
		getArrayList().get(-1);
		
	}

	@Override
	public String getTestName() {
		return "ArrayList: Get";
	}

}
