package StackTests;

public class StackGetTest extends StackTest{
	@Override
	public void prepareTest(){
		// Not needed.
	}

	@Override
	public void runMethod(){
		getStack().get(-1);
	}

	@Override
	public String getTestName(){
		return "Stack: Get";
	}
}
