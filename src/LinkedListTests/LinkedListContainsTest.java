package LinkedListTests;

public class LinkedListContainsTest extends LinkedListTest{

	@Override
	public void prepareTest() {
		// Not needed
		
	}

	@Override
	public void runMethod() {
		getLinkedList().contains(-1);
		
	}

	@Override
	public String getTestName() {
		return "LinkedList: Contains";
	}

}
