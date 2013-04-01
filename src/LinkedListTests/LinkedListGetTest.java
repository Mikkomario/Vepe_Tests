package LinkedListTests;

public class LinkedListGetTest extends LinkedListTest{

	@Override
	public void prepareTest() {
		// Not needed
		
	}

	@Override
	public void runMethod() {
		getLinkedList().get(0);
		
	}

	@Override
	public String getTestName() {
		return "LinkedList: Get";
	}

}
