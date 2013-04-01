package ArrayListTests;

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
