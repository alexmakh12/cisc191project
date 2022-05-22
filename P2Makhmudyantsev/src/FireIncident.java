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
 * 
 *         <<add more references here>>
 * 
 *         Version/date:
 *         - 5.0
 *         - 04/08/2022
 * 
 *         Responsibilities of class:
 *         - Create a Fire that IS-A incident and implements the CallCategory
 *         interface
 */

public class FireIncident extends Incident implements CallCategory
{
	// FireIncident HAS-A day
	private String day;

	// FireIncident HAS-A month
	private String month;

	// FireIncident HAS-A year
	private String year;

	// FireIncident HAS-A callCategory
	private String callCategory;

	/**
	 * Constructor that creates a FireIncident with a date and zipCode
	 * 
	 * @param date
	 * @param zipCode
	 */
	public FireIncident(String day, String month, String year, String zipCode,
			String callCategory)
	{
		super(zipCode);
		this.day = day;
		this.month = month;
		this.year = year;
		this.callCategory = callCategory;

	}

	/**
	 * Getter method for the FireIncident day
	 * 
	 * @return day
	 */
	public String getDay()
	{
		return day;
	}

	/**
	 * Getter method for the FireIncident month
	 * 
	 * @return month
	 */
	public String getMonth()
	{
		return month;
	}

	/**
	 * Getter method for the FireIncident year
	 * 
	 * @return year
	 */
	public String getYear()
	{
		return year;
	}

	/**
	 * Getter method for the FireIncident CallCategory
	 * 
	 * @return callCategory
	 */
	public String getCallCategory()
	{
		return callCategory;
	}

}
