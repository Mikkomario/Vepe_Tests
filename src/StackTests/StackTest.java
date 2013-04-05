package StackTests;
import java.util.Stack;
import MainClasses.AbstractTest;

/**
 * This class is the abstract superclass for all the classes that test the stack 
 * datastructure
 * 
 * @author Anna
 * Created 2.4.2013
 *
 */
public abstract class StackTest extends AbstractTest{
	//Attributes
	private Stack<Integer> datastructure;
	private int instanceaccount;
		
	//Constructor
	/**
	 * Creates a new stackTest
	 */
	public StackTest(){
		this.datastructure = new Stack<Integer>();
		this.instanceaccount = 0;
	}

	//Abstract methods
	
	@Override
	public void addInstance() {
		this.instanceaccount++;
		getStack().push(this.instanceaccount);
	}
	
	@Override
	public void clearStructure()
	{
		getStack().clear();
	}

	//Getters & setters
	/**
	 * @return The stack used in the tests
	 */
	public Stack<Integer> getStack(){
		return this.datastructure;
	}
}
