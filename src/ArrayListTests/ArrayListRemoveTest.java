package ArrayListTests;

/**
 * This class test the remove() -method in ArrayList
 *
 * @author Unto
 *         Created 31.3.2013.
 */
public class ArrayListRemoveTest extends ArrayListTest{

	@Override
	public void prepareTest() {
		getArrayList().add(-100);
		
	}

	@Override
	public void runMethod() {
		getArrayList().remove(-100);
		
	}

	@Override
	public String getTestName() {
		return "ArrayList: Remove";
	}

}
