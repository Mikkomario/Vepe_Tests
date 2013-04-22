package MainClasses;

import java.util.ArrayList;
import java.util.HashMap;

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
	 * This mehod clears the whole datastructure, releasing memory for other 
	 * processes
	 */
	public abstract void clearStructure();
	
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
	private static void printData(int instancecount, long nanoseconds)
	{
		System.out.println(instancecount + "#" + nanoseconds);
	}
	
	/**
	 * This method will handle the whole testing process and will print the 
	 * collected data to the system output.
	 * 
	 * @param startinstancecount How many instances should the data structure 
	 * hold in the beginning of the test?
	 * @param maxiterations How many times the instances are doubled?
	 * @param extraruns How many extra iterations are made at once without adding 
	 * additional instances?
	 * 
	 */
	public void runTest(int startinstancecount, int maxiterations, int extraruns)
	{
		// Checks the parameters
		if (startinstancecount < 0 || maxiterations <= 0 || extraruns < 0)
		{
			System.out.println("The test parameters must be 0 or above");
			return;
		}
		
		// Prepares the variables
		int currentinstances = startinstancecount;
		int iterations = 0;
		boolean testrun = true;
		int extrarunsleft = extraruns;
		ArrayList<Integer> values = new ArrayList<Integer>();
		
		// I initialize the variables here already so that the memory 
		// allocation doesn't affect the recorded time
		long startnanos;
		int runtime;
		
		// Increases the number of instances in the structure 
		// to the start amount
		addInstances(currentinstances);
		
		// Informs the user with a message
		System.out.println("Starting the test\n" + getTestName() + "\nWith " + 
				maxiterations + " iterations and " + extraruns + " extra checks\n");
		
		// Also collecs suplemental data about the total time used in the test
		long starttime = System.currentTimeMillis();
		long totaltime;
		long totaltestingtime = 0;
		
		// Iterates and prints the collected data.
		// The first iteration is a test 
		// run that isn't recorded (it seems that Java needs to run the method 
		// once before it starts to work fast enough)
		while (iterations < maxiterations)
		{
			// Prepares for testing
			prepareTest();
			
			// Runs the method and checks the used processing time
			startnanos = System.nanoTime();
			runMethod();
			runtime = (int) (System.nanoTime() - startnanos);
			
			// The following parts are not made during the test run
			if (testrun)
			{
				testrun = false;
				continue;
			}
			
			totaltestingtime += runtime;
			
			// If there were no extra runs,
			// Simply prints the collected data
			if (extraruns == 0)
				printData(currentinstances, runtime);
			// Otherwise simply collects the data
			else
				values.add(runtime);
			
			// Prepares fo the next iteration
			iterations ++;
			
			// If no extra runs are left,
			// Doubles the number of instances in the structure
			// (adds one if there are currently 0 instances)
			if (currentinstances == 0)
			{
				addInstances(1);
				currentinstances = 1;
			}
			else if (extrarunsleft <= 0)
			{
				// If extraruns are used, produces the best value and prints it
				if (extraruns > 0)
				{
					printData(currentinstances, produceValue(values));
					// Also removes all collected data
					values.clear();
				}
				
				addInstances(currentinstances);
				currentinstances *= 2;
				extrarunsleft = extraruns;
			}
			else
			{
				extrarunsleft --;
				// Extrarun does not count as an iteration
				iterations --;
			}
		}
		
		totaltime = System.currentTimeMillis() - starttime;
		
		// Prints a final summary about the test
		System.out.println("\nThe test was successfully finished!");
		System.out.println("The process took " + totaltime + " milliseconds.");
		System.out.println("The tests took " + 
				totaltestingtime + " nanoseconds in total.");
		
		// Finally releases the memory used in the test's data structure
		clearStructure();
	}
	
	private static int produceValue(ArrayList<Integer> values)
	{
		// Calculates the average value
		int average = getAverageValue(values);
		//System.out.println("Average: " + average);
		
		// Finds and removes additional 0:s
		// And recalculates the average value (if needed)
		if (removeZeros(values, average))
			average = getAverageValue(values);
		
		// Finds and removes too large values
		// And recalculates the average value (if needed)
		if (removeTooLargeValues(values, average))
			average = getAverageValue(values);
		
		// Finds the most usual value
		int mostusual = getMostUsualValue(values);
		//System.out.println("Most usual: " + mostusual);
		
		// Returns the most usual value, if applicable
		// Also, if average is within the mistake margin, returns the 
		// Average since it's more accurate
		if (mostusual != -1 && Math.abs(mostusual - average) > 5)
			return mostusual;
		
		// Recalculates the average value and returns it
		return average;
	}
	
	private static int getAverageValue(ArrayList<Integer> values)
	{
		int total = 0;
		
		for (int i = 0; i < values.size(); i++)
		{
			total += values.get(i);
		}
		
		return total / values.size();
	}
	
	// Removes the zero's from the list that would bug the system
	private static boolean removeZeros(ArrayList<Integer> values, int averagevalue)
	{
		// Checks if there are any mistakes and removes them
		// A zero in a list that has non-zero values is considered a mistake
		
		int instancesbeginning = values.size();
		
		if (averagevalue == 0)
			return false;
		
		int i = 0;
		while (i < values.size())
		{
			if (values.get(i) == 0)
				values.remove(i);
			else
				i ++;
		}
		
		return (values.size() != instancesbeginning);
	}
	
	// Removes too large values from the list
	// Returns if changes were made
	private static boolean removeTooLargeValues(ArrayList<Integer> 
			values, int averagevalue)
	{
		int instancesbeginning = values.size();
		
		// Checks if there are any mistakes and removes them
		// Mistake is concidered to be more than 90% larger than the average value
		int i = 0;
		while (i < values.size())
		{
			if (values.get(i) > 1.9*averagevalue)
				values.remove(i);
			else
				i ++;
		}
		
		return (values.size() != instancesbeginning);
	}
	
	// Returns the most usual value, -1 if one could not be found
	// Creates 0-5 mistake because it rounds the values down to the nearest %5
	private static int getMostUsualValue(ArrayList<Integer> values)
	{
		HashMap<Integer, Integer> valuenumbers = new HashMap<Integer, Integer>();
		
		// Calculates, how many of each value there are in the list (rounds down)
		for (int value: values)
		{
			int roundvalue = value - value % 5;
			
			if (valuenumbers.containsKey(roundvalue))
				valuenumbers.put(roundvalue, valuenumbers.get(roundvalue) +1);
			else
				valuenumbers.put(roundvalue, 1);
		}
		
		int bestvalue = -1;
		int bestfrekvens = 1;
		
		// Picks the rounded value that had the highest frekvens
		for (int key: valuenumbers.keySet())
		{
			if (valuenumbers.get(key) > bestfrekvens)
			{
				bestvalue = key;
				bestfrekvens = valuenumbers.get(key);
			}
		}
		
		return bestvalue;
	}
}
