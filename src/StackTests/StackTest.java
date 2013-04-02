package StackTests;
import java.util.Stack;
import MainClasses.AbstractTest;

/**
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
	public StackTest(){
		this.datastructure = new Stack<Integer>();
		this.instanceaccount = 0;
	}

	//Abstract methods
	@Override
	public void addInstance() {
		this.instanceaccount++;
		getStack().add(this.instanceaccount);
	}

	//Getters & setters
	public Stack<Integer> getStack(){
		return this.datastructure;
	}
}
