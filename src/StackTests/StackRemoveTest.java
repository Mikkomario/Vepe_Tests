package StackTests;

/**
 * 
 * This class tests the stack's method remove
 *
 * @author Anna.
 *         Created 2.4.2013.
 */
public class StackRemoveTest extends StackTest{
	
	// ATTRIBUTES	------------------------------------------------------
	
	private int lastaddindex;
	
	
	// CONSTRUCTOR	------------------------------------------------------
	
	/**
	 * Creates a new ArrayListRemoveTest
	 */
	public StackRemoveTest()
	{
		// Initializes the attribute(s)
		this.lastaddindex = 0;
	}
	
	
	// IMPLEMENTED METHODS	----------------------------------------------
	
	@Override
	public void prepareTest(){
		getStack().add(-100);
		this.lastaddindex = getStack().size() - 1;
	}

	@Override 
	public void runMethod(){
		getStack().remove(this.lastaddindex);
	}

	@Override
	public String getTestName(){
		return "Stack: Remove";
	}
}
