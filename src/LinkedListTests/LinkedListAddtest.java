package LinkedListTests;

/**
 * This class test the add() -method in LinkedList
 *
 * @author Unto
 *         Created 1.4.2013.
 */
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
