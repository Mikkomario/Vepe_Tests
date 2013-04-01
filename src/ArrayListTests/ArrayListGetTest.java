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
		// I'm not sure it's ok to get 0:th instance but I'll do it anyway (Gandalf)
		getArrayList().get(0);
		
	}

	@Override
	public String getTestName() {
		return "ArrayList: Get";
	}

}
