package ArrayListTests;
/**
 * This class test the indexOf() -method in ArrayList
 *
 * @author Unto
 *         Created 1.4.2013.
 */
public class ArrayListIndexOfTest extends ArrayListTest{

	@Override
	public void prepareTest() {
		// Not needed
		
	}

	@Override
	public void runMethod() {
		getArrayList().indexOf(-1);
		
	}

	@Override
	public String getTestName() {
		return "ArrayList: IndexOf";
	}

}
