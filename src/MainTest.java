import java.util.ArrayList;


/**
 * This class runs all the tests it knows
 *
 * @author Gandalf.
 *         Created 27.3.2013.
 */
public class MainTest
{
	// ATTRIBUTES	-------------------------------------------------------
	
	private ArrayList<AbstractTest> tests;
	private long startinstancecount;
	private int maxiterates;
	
	
	// CONSTRUCTOR	-------------------------------------------------------
	
	/**
	 * Creates a new maintest
	 * 
	 * @param startinstancecount How many instances does a data structure have 
	 * in the beginning of the test?
	 * @param maxiterates How many a method is called in a single test?
	 */
	public MainTest(long startinstancecount, int maxiterates)
	{
		// Initializes the attributes
		this.tests = new ArrayList<AbstractTest>();
		this.startinstancecount = startinstancecount;
		this.maxiterates = maxiterates;
		
		// Adds necessary tests
		// TODO: Add your tests here!
		addTest(new HashSetContainsTest());
	}
	
	
	// OTHER METHODS	---------------------------------------------------
	
	// Adds a test to the list of tests ran
	private void addTest(AbstractTest test)
	{
		this.tests.add(test);
	}
	
	/**
	 * Goes through all the tests and runs them. This method should only 
	 * be called once for a single MainTest
	 */
	public void runTests()
	{
		for (AbstractTest test: this.tests)
		{
			test.runTest(this.startinstancecount, this.maxiterates);
			System.out.println("--------------------------------------------");
		}
	}
	
	
	// MAIN METHOD	-------------------------------------------------------
	
	/**
	 * Runs all the tests in this class with the given arguments
	 *
	 * @param args There are two ways to give arguments:<br>
	 * 1) Two arguments:<br>
	 * - 1: How many instances does a data structure have in the beginning of a 
	 * test<br>
	 * - 2: How many times a tested method is called in a single test<br>
	 * 2) One argument:<br>
	 * - 1: How many times a tested method is called in a single test<p>
	 * 
	 * These arguments should be given in the long and / or integer formats
	 */
	public static void main(String[] args)
	{
		long startinstancecount = 1;
		int maxiterates = 100;
		
		// Updates the values with the arguments given with the 
		// method call (if any)
		if (args.length > 1)
		{
			long arg1 = 0;
			
			try
			{
				arg1 = Long.parseLong(args[1]);
			}
			catch (NumberFormatException nfe)
			{
				System.err.println("Please give the first argument as a long");
				System.exit(-1);
			}
			
			// Normally the arguments are startcount and maxiterations
			if (args.length > 2)
			{
			int arg2 = 0;
				
				try
				{
					arg2 = Integer.parseInt(args[2]);
				}
				catch (NumberFormatException nfe)
				{
					System.err.println("Please give the second argument as " +
							"an integer");
					System.exit(-1);
				}
				
				// Updates the values
				startinstancecount = arg1;
				maxiterates = arg2;
			}
			// When only one argument is present, it is considered maxiterations
			else
			{
				maxiterates = (int) arg1;
			}
		}
		
		// Starts the actual test
		MainTest test = new MainTest(startinstancecount, maxiterates);
		test.runTests();
	}
}
