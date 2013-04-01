package LinkedListTests;

public class LinkedListSizeTest extends LinkedListTest{

	@Override
	public void prepareTest() {
		// Not needed
		
	}

	@Override
	public void runMethod() {
		getLinkedList().size();
		
	}

	@Override
	public String getTestName() {
		return "LinkedList: Size";
	}

}
