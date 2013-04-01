package LinkedListTests;
/**
 * This class test the remove() -method in LinkedList
 *
 * @author Unto
 *         Created 1.4.2013.
 */
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
