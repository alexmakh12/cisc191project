
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
 *         Version/date:
 *         - 6.0
 *         - 04/18/2022
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
	 * Read Fire Incident Data and load needed information into an array
	 * 
	 * @param fileName
	 * @return fireIncidents
	 */
	public static ArrayList<FireIncident> readAndLoadFireIncidentData(
			String fileName)
	{

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

		/**
		 * Catch NullPointerException when there is no more index's to use
		 * getters from (created a huge Array when reading file) or and
		 * IOExcpetions
		 */
		catch (Exception e)
		{
			// Print and trace the Error
			e.printStackTrace();
		}

		finally
		{
			try
			{
				if (bufferedReader != null)
				{
					bufferedReader.close();
				}
			}
			catch (IOException e)
			{
				e.printStackTrace();
			}
		}
		// Return fireIncidents array's
		return fireIncidents;

	}

	/**
	 * Read Crime Incident Data and load needed information into an array
	 * 
	 * @param fileName
	 * @return array
	 */
	public static ArrayList<CrimeIncident> readAndLoadCrimeIncidentData(
			String fileName)
	{
		try
		{
			/**
			 * Create buffered reader which is wrapped around a FileReader that
			 * takes the fileName (passed in as a parameter) to read the file
			 * line by line efficiently by buffering characters
			 */
			BufferedReader bufferedReader = new BufferedReader(
					new FileReader(fileName));

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

		/**
		 * Catch NullPointerException when there is no more index's to use
		 * getters from (created a huge Array when reading file) or and
		 * IOExcpetions
		 */
		catch (NullPointerException | IOException e)
		{
			// Print and trace error if it is thrown
			e.printStackTrace();
		}

		// return CrimeIncident array
		return crimeIncidents;
	}

	/**
	 * Count the number of FireIncident's in a file Based off the type of
	 * incident
	 * 
	 * Note: In use by mainProgramView
	 * 
	 * @param fileName
	 * @param incidentType
	 * @return count
	 * 
	 *         KEEP
	 */
	public static int countNumberOfFireIncidentTypeForAGivenYear(
			String yearInput, String incidentType)
	{
		// Initialize count to use as a counter
		int count = 0;

		// Try...
		try
		{
			// /**
			// * Call readAndLoadFireIncidentData on the file passed as a
			// * parameter
			// */
			// readAndLoadFireIncidentData(fileName);

			/*
			 * Beginning at index 1 iterate through each fireIncident (index)
			 * until the last one is reached
			 * Note : begin at index 1 since its a description line in the csv
			 * file
			 */
			for (int index = 1; index < fireIncidents.size(); index++)
			{
				/**
				 * Set fileCallCategory of the string type to equal the
				 * callCatgeory of the current incident which is retrieved using
				 * the getter method from the Fire Incident class
				 */
				String fileCallCategory = fireIncidents.get(index)
						.getCallCategory();

				/**
				 * "Extract the month of the incident from the date using the
				 * substring method
				 */
				String fileYear = fireIncidents.get(index).getYear();

				/**
				 * If the callCategory retrieved matches the incidentType passed
				 * as a parameter
				 * 
				 * Increment count by one
				 */
				if (fileCallCategory.contains(incidentType)
						&& fileYear.contains(yearInput))
				{
					count++;
				}
			}

		}

		/**
		 * Catch NullPointerException when there is no more index's to use
		 * getters from (created a huge Array when reading file)
		 */
		catch (NullPointerException e)
		{
			// Print and trace error if it is thrown
			e.printStackTrace();
		}

		return count;
	}

	/**
	 * Count the number of fire incidents in a file based on a specific date,
	 * month and year
	 * 
	 * Note: In use by mainProgramView
	 * 
	 * @param fileName
	 * @param zipCodeInput
	 * @param MonthInput
	 * @param yearInput
	 * @return count
	 * 
	 */
	public static int countNumberOfFireIncidentsBasedOfZipMonthYear(
			String zipCodeInput, String monthInput, String yearInput)
	{
		// Initialize count to use as a counter
		int count = 0;

		// try..
		try
		{

			// // Call readAndLoadFireIncidentData on the file name passed as a
			// // paramter
			// readAndLoadFireIncidentData(fireFileName);

			/*
			 * Beginning at index 1 iterate through each fireIncident (index)
			 * until the last one is reached
			 * Note : begin at index 1 since its a description line in the csv
			 * file
			 */
			for (int index = 1; index < fireIncidents.size(); index++)
			{

				/**
				 * For the current fireIncident get the zipCode and assign it to
				 * fileZipCode
				 */
				String fileZipCode = fireIncidents.get(index).getZipCode();

				/**
				 * "Extract" the year of the incident from the date using the
				 * substring method
				 */
				String fileMonth = fireIncidents.get(index).getMonth();

				/**
				 * "Extract the month of the incident from the date using the
				 * substring method
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
		 * Catch NullPointerException when there is no more index's to use
		 * getters from (created a huge Array when reading file)
		 */
		catch (NullPointerException e)
		{
			// Print and trace error if it is thrown
			e.printStackTrace();
		}

		// return count
		return count;

	}

	/**
	 * Count the Number Of Crime Incidents if the zipCode month based off of
	 * the zipCode, month and year
	 * passed into the method
	 * 
	 * Note: In use by mainProgramView
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

		// // Call read and Load Crime Incident Data to iterate through data
		// readAndLoadCrimeIncidentData(fileName);

		// Initialize count to use as a counter
		int count = 0;

		// Try...
		try
		{
			/**
			 * Iterate through each index of the crimeIncidents array until the
			 * last one is reached
			 * 
			 * Note: we being with index 1 since in the CSV file index 0 is the
			 * legend for the file
			 */
			for (int index = 1; index < crimeIncidents.size(); index++)
			{

				// Within the current index of the crimeIncidents array

				/**
				 * Get the crime incidents zipCode
				 */
				String fileZipCode = crimeIncidents.get(index).getZipCode();

				/**
				 * Get the crime incidents date
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
				 * Set fileMonth to equal index 0 of fileDateParts
				 */
				String fileMonth = fileDateParts[0];

				/**
				 * Set fileYear to equal index 2 of fileDateParts
				 */
				String fileYear = fileDateParts[2];

				/**
				 * Print line for testing
				 */

				/**
				 * Compare that the zipCode, month and year passed into the
				 * constructor as parameters all match the current incidents
				 * zipCode month and year
				 * 
				 * If it does increment by one
				 */
				if (fileZipCode.contains(zipCodeInput)
						&& fileMonth.contains(monthInput)
						&& fileYear.contains(yearInput))
				{
					count++;

				}
			}

		}

		/**
		 * Catch NullPointerException when there is no more index's to use
		 * getters from (created a huge Array when reading file)
		 */
		catch (NullPointerException e)
		{
			// Print and trace error if it is thrown
			e.printStackTrace();
		}

		// return count
		return count;
	}

	/**
	 * Count the number of Crime Incidents in a certain community within a
	 * certain month and year passed as parameters
	 * 
	 * @param fileName
	 * @param inputCommunity
	 * @param inputMonth
	 * @param inputYear
	 * @return count
	 */
	public static int countTypeOfCrimeInCommunityOnMonthAndYear(
			String inputCommunity, String inputMonth, String inputYear)
	{

		// Initialize count to use as a counter
		int count = 0;

		// Try...
		try
		{
			// // Call readAndLoadCrimeIncidentData to iterate through data
			// readAndLoadCrimeIncidentData(fileName);

			/**
			 * Iterate through each index of the crimeIncidents array until the
			 * last one is reached
			 * 
			 * Note: we being with index 1 since in the CSV file index 0 is the
			 * legend for the file
			 */
			for (int index = 1; index < crimeIncidents.size(); index++)
			{

				String fileCommunity = crimeIncidents.get(index).getCommunity();

				/**
				 * Get the crime incidents date
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
				 * Set fileMonth to equal index 0 of fileDateParts
				 */
				String fileMonth = fileDateParts[0];

				/**
				 * Set fileYear to equal index 2 of fileDateParts
				 */
				String fileYear = fileDateParts[2];

				/**
				 * Compare that the community, month and year passed into the
				 * constructor as parameters all match the current incidents
				 * community month and year
				 * 
				 * If it does increment by one
				 */
				if (fileCommunity.contains(inputCommunity)
						&& fileMonth.contains(inputMonth)
						&& fileYear.contains(inputYear))
				{
					count++;
				}
			}
		}

		/**
		 * Catch NullPointerException when there is no more index's to use
		 * getters from (created a huge Array when reading file)
		 */
		catch (NullPointerException e)
		{
			// Print and trace error if it is thrown
			e.printStackTrace();
		}

		// return count
		return count;
	}

}