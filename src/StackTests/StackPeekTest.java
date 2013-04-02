package StackTests;

/**
 * This method tests stack's peek method
 * 
 * @author Anna
 *		Created 2.4.2013
 */
public class StackPeekTest extends StackTest{

	@Override
	public void prepareTest() {
		// Not needed
	}

	@Override
	public void runMethod() {
		getStack().peek();
		
	}

	@Override
	public String getTestName() {
		return "Stack: Peek";
	}

}
