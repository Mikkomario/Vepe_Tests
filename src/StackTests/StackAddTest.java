package StackTests;

public class StackAddTest extends StackTest{
	// IMPLEMENTED METHODS --------------------------------

	@Override
	public void prepareTest(){
		getStack().remove(-100);	
	}

	@Override
	public void runMethod(){
		getStack().add(-100);
	}

	@Override 
	public String getTestName(){
		return "Stack: Add";
	}
}
