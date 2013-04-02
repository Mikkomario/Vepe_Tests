package StackTests;

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
