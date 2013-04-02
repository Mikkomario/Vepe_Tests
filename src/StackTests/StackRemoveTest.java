package StackTests;

public class StackRemoveTest extends StackTest{
	@Override
	public void prepareTest(){
	getStack().add(-100);
	}

	@Override 
	public void runMethod(){
		getStack().remove(-100);
	}

	@Override
	public String getTestName(){
		return "Stack: Remove";
	}
}
