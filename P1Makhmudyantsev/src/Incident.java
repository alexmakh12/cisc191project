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
 *         - 4.0
 *         - 04/08/2022
 * 
 *         Responsibilities of class:
 *         - Abstract class that creates an Incident
 */

public abstract class Incident
{
	// A Incident HAS-A zipCode
	private String zipCode;

	/**
	 * Constrcutor that creates a Incident with date and zipCode
	 * 
	 * @param zipCode
	 */
	public Incident(String zipCode)
	{
		this.zipCode = zipCode;
	}

	/**
	 * Getter method returns zipCode of an incident
	 * 
	 * @return zipCode
	 */
	public String getZipCode()
	{
		return zipCode;
	}
}