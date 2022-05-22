import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Lead Author(s):
 * 
 * @author Alexandre Makhmudyantsev (3330002234)
 *         <<add additional lead authors here, with a full first and last name>>
 * 
 *         Other contributors:
 *         <<add additional contributors (mentors, tutors, friends) here, with
 *         contact information>>
 * 
 *         References:
 *         <<add more references here>>
 * 
 *         Version/date: 05/21/2022 V2.0
 * 
 *         Responsibilities of class:
 *         - Creates an array list of states in the united states
 */

public class UnitedStatesStates
{
	/**
	 * A method that reads a JSON file from the web as the parameter
	 * that is passed as a URL to that file
	 * 
	 * @param website
	 * @return allStatesInTheUnitedStates
	 */
	public static ArrayList<String> readWebsite(String website)
	{

		/**
		 * Create an arrayList of the string type called
		 * allStatesInTheUnitedStates
		 */
		ArrayList<String> allStatesInTheUnitedStates = new ArrayList<String>();

		/**
		 * To the allStatesInTheUnitedStates array list add the following
		 * string as the first element in the array list
		 */
		allStatesInTheUnitedStates.add("Please select a state");

		/**
		 * Initialize a scanner outside of the try block so its visible to the
		 * whole method
		 */
		Scanner scanner = null;

		// Try this block of code
		try
		{
			// Initialize state
			String state = null;

			// Create a new URL Object with the web site parameter passed
			URL url = new URL(website);

			// Create a scanner object and pass in a connection to the web site
			scanner = new Scanner(url.openStream());

			// While the scanner has a next line to read
			while (scanner.hasNextLine())
			{
				// Set the next line read to be state
				state = scanner.nextLine();

				/**
				 * Create a for loop to iterate through the
				 * allStatesInTheUnitedStates and add a state to the list
				 */
				for (int index = 0; index < allStatesInTheUnitedStates
						.size(); index++)
				{
					/**
					 * Set indexOfFirstQuote to be the index of the first quote
					 */
					int indexOfFirstQuote = state.indexOf("\"", 0);

					/**
					 * Set indexOfSecondQuote to be the index of the comma
					 */
					int indexOfSecondQuote = state.indexOf(",", 0);

					/**
					 * Using the substring method set state equal to the string
					 * between the index
					 */
					state = state.substring(indexOfFirstQuote,
							indexOfSecondQuote);

					/**
					 * Remove any quotes around the string
					 */
					state = state.replace("\"", "");

					/**
					 * Add the state to the array list and move onto the next
					 * line
					 */
					allStatesInTheUnitedStates.add(state);

				}

			}
		}

		// Catch any exceptions thrown
		catch (Exception e)
		{
			e.printStackTrace();
		}

		// Always close the scanner
		finally
		{
			//Try this block of code
			try
			{
				//If the scanner is not null try to close it
				if (scanner != null)
				{
					scanner.close();
				}
			}
			
			/**
			 * If an exception is thrown while trying to close the scanner
			 * catch the error
			 */
			catch (Exception e)
			{
				e.printStackTrace();
			}
		}

		// Return the array list of all the states in the united states
		return allStatesInTheUnitedStates;
	}
}
