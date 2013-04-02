package StackTests;

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
