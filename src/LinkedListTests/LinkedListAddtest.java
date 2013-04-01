package LinkedListTests;

public class LinkedListAddtest extends LinkedListTest{

	@Override
	public void prepareTest() {
		// Not needed
		
	}

	@Override
	public void runMethod() {
		getLinkedList().add(-100);
		
	}

	@Override
	public String getTestName() {
		return "LinkedList: Add";
	}

}
