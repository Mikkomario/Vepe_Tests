package StackTests;

/**
 * This method tests stack's Peek method
 * @author camillaojapalo
 *
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
