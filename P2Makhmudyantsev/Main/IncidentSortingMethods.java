
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
 *         Morelli, R., & Walde, R. (2016). Java, Java, Java: Object-Oriented
 *         Problem Solving.
 *         Retrieved from
 *         https://open.umn.edu/opentextbooks/textbooks/java-java-java-object-oriented-problem-solving
 * 
 *         https://stackoverflow.com/questions/1757065/java-splitting-a-comma-separated-string-but-ignoring-commas-in-quotes
 * 
 *         <<add more references here>>
 * 
 *         Version/date: 05/21/2022 V6.0
 * 
 *         Responsibilities of class:
 *         -Read files and create objects of the Crime Incideant tyoe and Fire
 *         Incident Type in an array
 *         - Iterate though arrays and incident objects for desired result based
 *         on method and parameter
 *         - Test created methods (in the main)
 */

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class IncidentSortingMethods
{
	// Create a new arrayList called fireIncident of the FireIncident type
	private static ArrayList<FireIncident> fireIncidents = new ArrayList<FireIncident>();

	// Create a new arrayList called CrimeIncident of the CrimeIncident type
	private static ArrayList<CrimeIncident> crimeIncidents = new ArrayList<CrimeIncident>();

	/**
	 * Read Fire Incident Data and load needed information into an array list
	 * 
	 * @param fileName
	 * @return fireIncidents
	 */
	public static ArrayList<FireIncident> readAndLoadFireIncidentData(
			String fileName)
	{

		/**
		 * Initialize a bufferedReader outside of the try block so its visible
		 * to the whole method
		 */
		BufferedReader bufferedReader = null;
		// Try...
		try
		{

			/**
			 * Create buffered reader which is wrapped around a FileReader that
			 * takes the fileName (passed in as a parameter) to read the file
			 * line by line efficiently by buffering characters
			 */
			bufferedReader = new BufferedReader(new FileReader(fileName));

			/**
			 * Initialize result as an empty array to hold data read from the
			 * file
			 */
			String result = "";

			// While the buffered reader has a line to read (is not null)
			while ((result = bufferedReader.readLine()) != null)
			{
				/**
				 * Create an empty array (string type) called data and split
				 * each element at the comma
				 */
				String[] data = result.split(",");

				// day is the data of index 6 of the current line
				String day = data[9];

				// month is the data of index 10 of the current line
				String month = data[10];

				// year is the data for index 11 of the current line
				String year = data[11];

				// zipCode is the data for index 8 of the current line
				String zipCode = data[8];

				// callCategory is the data of index 1 of the current line
				String callCategory = data[1];

				/**
				 * In the incidents array create a new fire incident object
				 * using
				 * FireIncident constructor
				 */
				fireIncidents.add(new FireIncident(day, month, year, zipCode,
						callCategory));

			}
		}

		// Catch any exceptions that are thrown
		catch (Exception e)
		{
			// Print and trace the Error
			e.printStackTrace();
		}

		// Always close the bufferedReader
		finally
		{
			// Try this block of code
			try
			{
				// If the bufferedReader is not null try to close it
				if (bufferedReader != null)
				{
					bufferedReader.close();
				}
			}

			/**
			 * If an exception is thrown while trying to close the
			 * bufferedReader catch the error
			 */
			catch (Exception e)
			{
				e.printStackTrace();
			}
		}
		// Return fireIncidents array's
		return fireIncidents;

	}

	/**
	 * Read Crime Incident Data and load needed information into an array list
	 * 
	 * @param fileName
	 * @return array
	 */
	public static ArrayList<CrimeIncident> readAndLoadCrimeIncidentData(
			String fileName)
	{

		/**
		 * Initialize a bufferedReader outside of the try block so its visible
		 * to the whole method
		 */
		BufferedReader bufferedReader = null;
		try
		{
			/**
			 * Create buffered reader which is wrapped around a FileReader that
			 * takes the fileName (passed in as a parameter) to read the file
			 * line by line efficiently by buffering characters
			 */
			bufferedReader = new BufferedReader(new FileReader(fileName));

			/**
			 * Initialize result as an empty array to hold data read from the
			 * file
			 */
			String result = "";

			while ((result = bufferedReader.readLine()) != null)
			{
				/**
				 * Create an empty array (string type) called data and split
				 * each element at the comma
				 */

				/**
				 * Create an empty array (string type) called data and split
				 * each element using a regular expression function (Cited)
				 * 
				 * Note : If splitting by "," the call category element has
				 * comma's in it which need to be skipped which is why a regular
				 * expression function us used.
				 */

				String[] data = result
						.split(",(?=(?:[^\\\"]*\\\"[^\\\"]*\\\")*[^\\\"]*$)");

				// date is the data of index 3 of the current line
				String date = data[3];

				// zipCode is the data of index 5 of the current line
				String zipCode = data[5];

				// community is the data of index 6 of the current line
				String community = data[6];

				// callCategory is the data of index 0 of the current line
				String callCategory = data[0];

				/**
				 * In the incidents array create a new incident object using
				 * CrimeIncident constructor
				 */
				crimeIncidents.add(new CrimeIncident(date, zipCode, community,
						callCategory));
			}
			bufferedReader.close();
		}

		// Catch any exceptions that are thrown
		catch (Exception e)
		{
			// Print and trace error if it is thrown
			e.printStackTrace();
		}

		// Always close the bufferedReader
		finally
		{
			// Try this block of code
			try
			{
				// If the bufferedReader is not null try to close it
				if (bufferedReader != null)
				{
					bufferedReader.close();
				}
			}

			/**
			 * If an exception is thrown while trying to close the
			 * bufferedReader catch the error
			 */
			catch (Exception e)
			{
				e.printStackTrace();
			}
		}

		// return CrimeIncident array
		return crimeIncidents;
	}

	/**
	 * Count the number of fire incidents based off of the input year and
	 * incident type
	 * 
	 * @param yearInput
	 * @param incidentType
	 * @return count (number of incidents)
	 */
	public static int countNumberOfFireIncidentTypeForAGivenYear(
			String yearInput, String incidentType)
	{
		// Initialize count to use as a counter
		int count = 0;

		// Try...
		try
		{
			/*
			 * Beginning at index 1 iterate through each fireIncident (index)
			 * until the last one is reached
			 * Note : begin at index 1 since its a description line in the csv
			 * file
			 */
			for (int index = 1; index < fireIncidents.size(); index++)
			{
				/**
				 * For the current fireIncident index get the call category and
				 * assign it to fileCallCategory
				 */
				String fileCallCategory = fireIncidents.get(index)
						.getCallCategory();

				/**
				 * For the current fireIncident index get the year and
				 * assign it to fileYear
				 */
				String fileYear = fireIncidents.get(index).getYear();

				/**
				 * Check if the callCategory retrieved matches the incidentType
				 * passed as a parameter
				 */
				if (fileCallCategory.contains(incidentType)
						&& fileYear.contains(yearInput))
				{
					// If it does increment by one
					count++;
				}
			}

		}

		/**
		 * Catch any exceptions that are thrown
		 */
		catch (Exception e)
		{
			// Print and trace the error if it is thrown
			e.printStackTrace();
		}

		return count;
	}

	/**
	 * Count the number of fire incidents based on a input zipCode, month and
	 * year
	 * 
	 * @param fileName
	 * @param zipCodeInput
	 * @param MonthInput
	 * @param yearInput
	 * @return count
	 */
	public static int countNumberOfFireIncidentsBasedOfZipMonthYear(
			String zipCodeInput, String monthInput, String yearInput)
	{
		// Initialize count to use as a counter
		int count = 0;

		// try..
		try
		{
			/*
			 * Beginning at index 1 iterate through each fireIncident (index)
			 * until the last one is reached
			 * Note : begin at index 1 since its a description line in the csv
			 * file
			 */
			for (int index = 1; index < fireIncidents.size(); index++)
			{

				/**
				 * For the current fireIncident index get the zipCode and assign
				 * it to fileZipCode
				 */
				String fileZipCode = fireIncidents.get(index).getZipCode();

				/**
				 * For the current fireIncident index get the month and assign
				 * it to fileMonth
				 */
				String fileMonth = fireIncidents.get(index).getMonth();

				/**
				 * For the current fireIncident index get the year and assign
				 * it to fileYear
				 */
				String fileYear = fireIncidents.get(index).getYear();

				/**
				 * Compare that the zipCode, Month, Year passed into the
				 * constructor as parameters all match the current incident
				 * 
				 * If it does increment by one
				 */
				if (fileZipCode.contains(zipCodeInput)
						&& fileYear.contains(yearInput)
						&& fileMonth.contains(monthInput))
				{
					count++;
				}
			}
		}

		/**
		 * Catch any exceptions that are thrown
		 */
		catch (Exception e)
		{
			// Print and trace error if it is thrown
			e.printStackTrace();
		}

		// return count
		return count;

	}

	/**
	 * Count the number Of crime Incidents based on a input zipCode, month and
	 * year
	 * 
	 * @param fileName
	 * @param zipCodeInput
	 * @param monthInput
	 * @param yearInput
	 * @return count
	 */
	public static int countNumberOfCrimeIncidentsBasedOfZipCodeMonthYear(
			String zipCodeInput, String monthInput, String yearInput)
	{
		// Initialize count to use as a counter
		int count = 0;

		// Try...
		try
		{
			/*
			 * Beginning at index 1 iterate through each crimeIncident (index)
			 * until the last one is reached
			 * Note : begin at index 1 since its a description line in the csv
			 * file
			 */
			for (int index = 1; index < crimeIncidents.size(); index++)
			{
				/**
				 * For the current crimeIncident index get the zipCode and
				 * assign it to fileZipCode
				 */
				String fileZipCode = crimeIncidents.get(index).getZipCode();

				/**
				 * For the current crimeIncident index get the fullDate and
				 * assign it to fullDate
				 */
				String fullDate = crimeIncidents.get(index).getDate();

				/**
				 * Create a fileDateParts array to only use the date and month
				 * 
				 * This is done so we can use the day and month individually for
				 * comparison
				 * 
				 * First split the date by space which will leave index 0 as the
				 * date and index 1 as the time
				 * 
				 * Take the 0th index furthermore split it by the back slash
				 * results in 3 index's
				 * 
				 */
				String[] fileDateParts = fullDate.split(" ")[0].split("/");

				/**
				 * For the current fileDateParts get the second index of it and
				 * set it equal to fileMonth
				 */
				String fileMonth = fileDateParts[0];

				/**
				 * For the current fileDateParts get the second index of it and
				 * set it equal to fileYear
				 */
				String fileYear = fileDateParts[2];

				/**
				 * Compare that the zipCode, month and year passed into the
				 * constructor as parameters all match the current incidents
				 * zipCode month and year
				 */
				if (fileZipCode.contains(zipCodeInput)
						&& fileMonth.contains(monthInput)
						&& fileYear.contains(yearInput))
				{
					// If it does increment by one
					count++;
				}
			}

		}

		/**
		 * Catch any exceptions that are thrown
		 */
		catch (Exception e)
		{
			// Print and trace error if it is thrown
			e.printStackTrace();
		}

		// return count
		return count;
	}

}