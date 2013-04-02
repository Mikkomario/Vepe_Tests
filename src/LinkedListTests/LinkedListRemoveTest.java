package LinkedListTests;
/**
 * This class test the remove() -method in LinkedList
 *
 * @author Unto
 *         Created 1.4.2013.
 */
public class LinkedListRemoveTest extends LinkedListTest
{
	// ATTRIBUTES	------------------------------------------------------
	
	private int lastaddindex;
	
	
	// CONSTRUCTOR	------------------------------------------------------
	
	/**
	 * Creates a new ArrayListRemoveTest
	 */
	public LinkedListRemoveTest()
	{
		// Initializes the attribute(s)
		this.lastaddindex = 0;
	}
	
	
	// IMPLEMENTED METHODS	----------------------------------------------
	
	@Override
	public void prepareTest() {
		// Adds an additional instance to be removed
		getLinkedList().add(-100);
		this.lastaddindex = getLinkedList().size() - 1;
	}

	@Override
	public void runMethod() {
		getLinkedList().remove(this.lastaddindex);
		
	}

	@Override
	public String getTestName() {
		return "LinkedList: Remove";
	}

}
