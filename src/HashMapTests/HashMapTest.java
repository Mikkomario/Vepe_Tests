package HashMapTests;


import java.util.HashMap;

import MainClasses.AbstractTest;

/**
 * This is an abstract superclass for all the tests that use the HashMap 
 * data structure. This class handles the initialization of the data structure 
 * and adding new instances to the structure.
 * 
 * The hashMap contains instances and keys that are type integer. they start from 1 and 
 * increase by one with each new instance in the structure.
 *
 * @author Gandalf.
 *         Created 31.3.2013.
 */
public abstract class HashMapTest extends AbstractTest
{
	// ATTRIBUTES	------------------------------------------------------
	
	private HashMap<Integer, Integer> datastructure;
	private int instancecount;
	
	
	// CONSTRUCTOR	------------------------------------------------------
	
	/**
	 * Creates a new HashMapTest and initializes the data structure used
	 */
	public HashMapTest()
	{
		// Initializes the attribute(s)
		this.datastructure = new HashMap<Integer, Integer>();
		this.instancecount = 0;
	}
	
	
	// ABSTRACT METHODS	--------------------------------------------------
	
	@Override
	public void addInstance()
	{
		this.instancecount++;
		getMap().put(this.instancecount, this.instancecount);
	}
	
	@Override
	public void clearStructure()
	{
		getMap().clear();
	}
	
	// GETTERS & SETTERS	----------------------------------------------
	
	/**
	 * @return The data structure used in the test
	 */
	public HashMap<Integer, Integer> getMap()
	{
		return this.datastructure;
	}
}
