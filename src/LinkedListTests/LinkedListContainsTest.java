package LinkedListTests;
/**
 * This class test the contains() -method in LinkedList
 *
 * @author Unto
 *         Created 1.4.2013.
 */
public class LinkedListContainsTest extends LinkedListTest{

	@Override
	public void prepareTest() {
		// Not needed
		
	}

	@Override
	public void runMethod() {
		getLinkedList().contains(-1);
		
	}

	@Override
	public String getTestName() {
		return "LinkedList: Contains";
	}

}
