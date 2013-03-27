
/**
 * This is the main testing class that each test extends. The test runs a 
 * single method, increases the the number of instances in the data structure 
 * and records its effect on processing speed.
 *
 * @author Gandalf.
 *         Created 27.3.2013.
 */
public abstract class AbstractTest
{	
	// ABSTRACT METHODS	---------------------------------------------------
	
	/**
	 * This method adds a single new instance to the data structure
	 */
	public abstract void addInstance();
	
	/**
	 * In this method, the subclass can prepare the system so it's ready for 
	 * the testing of the metho.
	 * 
	 * For example, the class can update its attributes.
	 */
	public abstract void prepareTest();
	
	/**
	 * This method simply runs the methdod which the subclass is testing. 
	 * It must not do anything else that would affect the processing speed.
	 */
	public abstract void runMethod();
	
	/**
	 * @return What method in which datastructure is studied in this test?
	 */
	public abstract String getTestName();
	
	
	// OTHER METHODS	---------------------------------------------------
	
	// This method increases the number of instances in the data structure 
	// by a certain amount
	private void addInstances(int instancesadded)
	{
		int i = 0;
		
		while (i < instancesadded)
		{
			addInstance();
			i++;
		}
	}
	
	// Prints the collected data to the system console
	private void printData(int instancecount, long nanoseconds)
	{
		System.out.println(instancecount + "#" + nanoseconds);
	}
	
	/**
	 * This method will handle the whole testing process and will print the 
	 * collected data to the system output.
	 * 
	 * @param startinstancecount How many instances should the data structure 
	 * hold in the beginning of the test?
	 * @param maxiterates How many times the method will be run?
	 * 
	 */
	public void runTest(int startinstancecount, int maxiterates)
	{
		// Prepares the variables
		int currentinstances = startinstancecount;
		int iterates = 0;
		
		// I initialize the variables here already so that the memory 
		// allocation doesn't affect the recorded time
		long startnanos;
		long runtime;
		
		// Increases the number of instances in the structure 
		// to the start amount
		addInstances(currentinstances);
		
		// Informs the user with a message
		System.out.println("Starting the test\n" + getTestName() + " with " + 
				maxiterates + " iterations\n");
		
		// Also collecs suplemental data about the total time used in the test
		long starttime = System.currentTimeMillis();
		long totaltime;
		long totaltestingtime = 0;
		
		// Iterates and prints the collected data
		while (iterates < maxiterates)
		{
			// Prepares for testing
			prepareTest();
			
			// Runs the method and checks the used processing time
			startnanos = System.nanoTime();
			runMethod();
			runtime = System.nanoTime() - startnanos;
			totaltestingtime += runtime;
			
			// Prints the collected data
			printData(currentinstances, runtime);
			
			// Prepares fo the next iteration
			iterates ++;
			
			// Doubles the number of instances in the structure
			addInstances(currentinstances);
			currentinstances *= 2;
		}
		
		totaltime = System.currentTimeMillis() - starttime;
		
		// Prints a final summary about the test
		System.out.println("\nThe test was successfully finished!");
		System.out.println("The process took " + totaltime + " milliseconds.");
		System.out.println("The tests took " + 
				totaltestingtime + " nanoseconds in total.");
	}
	
	// What to do?
	/*
	 * Prepare -methdod (Abs)
	 * Add instance -method (Abs)
	 * Add instances -method
	 * Run method -method (Abs)
	 * Run test -method
	 * Print data method
	 * 
	 * Show current nanoseconds
	 * Record the number of instances
	 */
}
