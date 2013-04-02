package StackTests;

/**
 * This method tests stack's pop method
 * 
 * @author Anna
 *		Created 2.4.2013
 */

public class StackPopTest extends StackTest{

	@Override
	public void prepareTest() {
		getStack().push(-100);
		
	}

	@Override
	public void runMethod() {
		getStack().pop();
		
	}

	@Override
	public String getTestName() {
		return "Stack: Pop";
	}

}
