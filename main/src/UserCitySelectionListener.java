import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.JComboBox;

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
 *         Version/date: 05/21/2022 V4.0
 * 
 *         Responsibilities of class:
 *         - Creates a user city selection listener that implements
 *         ActionListener to perform actions when a user selects an city in the
 *         userCitySelection JComboBox
 */
/**
 */
public class UserCitySelectionListener implements ItemListener
{
	// UserCitySelectionListener HAS-A mainProgramView
	private MainProgramView mainProgramView;

	// userCitySelection HAS-A userCitySeleciton
	private JComboBox userCitySelection;

	/**
	 * Constructor that creates a new UserCitySelectionListener object
	 * 
	 * @param userCitySelection
	 * @param mainProgramView
	 */
	public UserCitySelectionListener(JComboBox userCitySelection,
			MainProgramView mainProgramView)
	{
		this.mainProgramView = mainProgramView;
		this.userCitySelection = userCitySelection;
	}

	/**
	 * ItemStateChated method for if an item is selected in the
	 * userCitySelection JComboBox
	 */
	public void itemStateChanged(ItemEvent e)
	{
		if (e.getStateChange() == ItemEvent.SELECTED)
		{
			/**
			 * If a user selects a city enable the fireIncidentTypeRadioButton,
			 * policeIncidentRadioTypeButton and
			 * policeAndFireIncidenTypeRadioButton
			 * 
			 * We are doing this so that the user can continue
			 * in the program and select a question related to the incident type
			 * the user picked
			 */
			mainProgramView.getFireIncidentTypeRadioButton().setEnabled(true);
			mainProgramView.getPoliceIncidentRadioTypeButton().setEnabled(true);

			/**
			 * Currently commented out since the listener for this button is not
			 * created
			 */

			// mainProgramView.policeAndFireIncidenTypeRadioButton.setEnabled(true);

		}
	}
}
