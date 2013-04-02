package StackTests;

/**
 * This class tests the stack's contains method
 *
 * @author Anna.
 *         Created 2.4.2013.
 */
public class StackContainsTest extends StackTest {
	@Override 
	public void prepareTest(){
		// Not needed
	}

	@Override
	public void runMethod(){
		getStack().contains(-1);
	}

	@Override
	public String getTestName(){
		return "Stack: Contains";	
	}
}
