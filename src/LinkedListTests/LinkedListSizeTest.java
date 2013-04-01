package LinkedListTests;
/**
 * This class test the size() -method in LinkedList
 *
 * @author Unto
 *         Created 1.4.2013.
 */
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
