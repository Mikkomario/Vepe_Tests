package LinkedListTests;
/**
 * This class test the get() -method in LinkedList
 *
 * @author Unto
 *         Created 1.4.2013.
 */
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
