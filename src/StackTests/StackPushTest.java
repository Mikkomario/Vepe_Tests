package StackTests;

/**
 * This class tests the stack push method
 * 
 * @author Anna 
 * 	Created 2.4.2013
 */

public class StackPushTest extends StackTest{

	@Override
	public void prepareTest() {
		getStack().pop();	
	}

	@Override
	public void runMethod() {
		getStack().push(-100);
	}

	@Override
	public String getTestName() {
		return "Stack: Push";
	}

}
