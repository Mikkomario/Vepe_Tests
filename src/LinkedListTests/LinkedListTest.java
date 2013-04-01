package LinkedListTests;

import java.util.LinkedList;

import MainClasses.AbstractTest;

/**
 * This is an abstract superclass for all the tests that use the LinkedList
 * data structure. This class handles the initialization of the data structure 
 * and adding new instances to the structure.
 * 
 * The LinkedList contains instances that are integers. They start from 1 and 
 * increase by one with each new instance in the structure.
 *
 * @author Unto
 *         Created 1.4.2013.
 */
public abstract class LinkedListTest extends AbstractTest{
	
	private LinkedList<Integer> datastructure;
	private int instanceaccount;
	
	public LinkedListTest(){
		this.datastructure = new LinkedList<Integer>();
		this.instanceaccount = 0;
	}
	
	//Abstract methods
		@Override
		public void addInstance()
		{
			this.instanceaccount++;
			getLinkedList().add(this.instanceaccount);	
		}

		//Getters & setters
		/**
		 * @return The data structure used in the test
		 */
		public LinkedList<Integer> getLinkedList()
		{
			return this.datastructure;
		}
		
	

}
