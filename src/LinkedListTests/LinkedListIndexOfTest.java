package LinkedListTests;

public class LinkedListIndexOfTest extends LinkedListTest{

	@Override
	public void prepareTest() {
		// Not needed
		
	}

	@Override
	public void runMethod() {
		getLinkedList().indexOf(-1);
		
	}

	@Override
	public String getTestName() {
		return "LinkedList: IndexOf";
	}

}
