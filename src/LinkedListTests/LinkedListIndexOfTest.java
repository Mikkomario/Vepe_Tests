package LinkedListTests;
/**
 * This class test the indexOf() -method in LinkedList
 *
 * @author Unto
 *         Created 1.4.2013.
 */
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
