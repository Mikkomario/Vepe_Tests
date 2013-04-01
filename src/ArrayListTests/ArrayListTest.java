package ArrayListTests;

import java.util.ArrayList;

import MainClasses.AbstractTest;

/**
 * This is an abstract superclass for all the tests that use the ArrayList
 * data structure. This class handles the initialization of the data structure 
 * and adding new instances to the structure.
 * 
 * The ArrayList contains instances that are integers. They start from 1 and 
 * increase by one with each new instance in the structure.
 *
 * @author Unto
 *         Created 31.3.2013.
 */
public abstract class ArrayListTest extends AbstractTest{
	
	//Attributes
	private ArrayList<Integer> datastructure;
	private int instanceaccount;
	
	
	//Constructor
	/**
	 * Creates a new HashSetTest and initializes the data structure used
	 */
	public ArrayListTest(){
		this.datastructure = new ArrayList<Integer>();
		this.instanceaccount = 0;
	}

	//Abstract methods
	@Override
	public void addInstance()
	{
		this.instanceaccount++;
		getArrayList().add(this.instanceaccount);	
	}

	//Getters & setters
	/**
	 * @return The data structure used in the test
	 */
	public ArrayList<Integer> getArrayList()
	{
		return this.datastructure;
	}
	

}
