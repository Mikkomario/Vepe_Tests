package StackTests;

/**
 * 
 * This class tests the stack's method size
 *
 * @author Gandalf.
 *         Created 2.4.2013.
 */
public class StackSizeTest extends StackTest{
	@Override
	public void prepareTest(){
		//Not needed
	}

	@Override 
	public void runMethod(){
		getStack().size();
	}

	@Override 
	public String getTestName(){
		return "Stack: Size";
	}
}
