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
 *         Version/date: 05/21/2022 V2.0
 * 
 *         Responsibilities of class:
 *         - Creates a user community selection listener that implements
 *         ActionListener to perform actions when a user selects an community in
 *         the userCommunitySelection JComboBox
 */
/**
 */

public class UserCommunitySelectionListener implements ItemListener
{
	// UserStateSlectionListener HAS-A mainProgramView
	private MainProgramView mainProgramView;

	// UserStateSlectionListener HAS-A userCommunitySelection
	private JComboBox userCommunitySelection;

	/**
	 * Constructor that creates a new UserCommunitySelectionListener object
	 * 
	 * @param userCommunitySelection
	 * @param mainProgramView
	 */
	public UserCommunitySelectionListener(JComboBox userCommunitySelection,
			MainProgramView mainProgramView)
	{
		this.userCommunitySelection = userCommunitySelection;
		this.mainProgramView = mainProgramView;
	}

	/**
	 * ItemStateChated method for if an item is selected in the
	 * userCommunitySelection JComboBox
	 */
	public void itemStateChanged(ItemEvent e)
	{
		/**
		 * If an item is selected call the checkToUpdateGetResultsButton method
		 * in the main to see if the UI needs to be updated based off the
		 * current selected JComboBoxes
		 */
		if (e.getStateChange() == ItemEvent.SELECTED)
		{
			mainProgramView.checkToUpdateGetResultsButton();
		}

	}
}
