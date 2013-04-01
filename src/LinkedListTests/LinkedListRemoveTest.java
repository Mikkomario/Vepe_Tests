package LinkedListTests;

public class LinkedListRemoveTest extends LinkedListTest{

	@Override
	public void prepareTest() {
		// Adds an additional instance to be removed
		getLinkedList().add(-100, 100);
		
	}

	@Override
	public void runMethod() {
		getLinkedList().remove(-100);
		
	}

	@Override
	public String getTestName() {
		return "LinkedList: Remove";
	}

}
