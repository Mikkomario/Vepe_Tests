package ArrayListTests;
/**
 * This class test the add() -method in ArrayList
 *
 * @author Unto
 *         Created 31.3.2013.
 */
public class ArrayListSizeTest extends ArrayListTest{

	@Override
	public void prepareTest() {
		// Not needed
		
	}

	@Override
	public void runMethod() {
		getArrayList().size();
		
	}

	@Override
	public String getTestName() {
		return "ArrayList: Size";
	}

}
