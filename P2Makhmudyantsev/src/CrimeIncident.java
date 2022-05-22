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
 *         Version/date: 05/21/2022 V6.0
 * 
 *         Responsibilities of class:
 *         - Create a CrimeIncident that IS-A incident and implements the
 *         CallCategory interface
 * 
 * 
 */

public class CrimeIncident extends Incident implements CallCategory
{
	// A CrimeIncident HAS-A date
	private String date;

	// A CrimeIncident HAS-A community
	private String community;

	// A CrimeIncident HAS-A callCategory
	private String callCategory;

	/**
	 * Constructor that creates a CrimeIncident with a date and zipCode
	 * 
	 * @param date
	 * @param zipCode
	 */
	public CrimeIncident(String date, String zipCode, String community,
			String callCategory)
	{
		super(zipCode);
		this.date = date;
		this.callCategory = callCategory;
		this.community = community;

	}

	/**
	 * Getter method to return the callCategory
	 * 
	 * @return date
	 */
	public String getCallCategory()
	{
		return callCategory;
	}

	/**
	 * Getter method to return the date
	 * 
	 * @return date
	 */
	public String getDate()
	{
		return date;
	}

	/**
	 * Getter method to return the community
	 * 
	 * @return community
	 */
	public String getCommunity()
	{
		return community;
	}
}
