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
 *         - Creates a user year selection listener that implements
 *         ActionListener to perform actions when a user selects an year in
 *         the userYearSelection JComboBox
 */
/**
 */

public class UserYearSelectionListener implements ItemListener
{
	// UserStateSlectionListener HAS-A mainProgramView
	private MainProgramView mainProgramView;

	// UserStateSlectionListener HAS-A userStateSlection
	private JComboBox userYearSelection;

	/**
	 * Constructor that creates a new UserYearSelectionListener object
	 * 
	 * @param userYearSelection
	 * @param mainProgramView
	 */
	public UserYearSelectionListener(JComboBox userYearSelection,
			MainProgramView mainProgramView)
	{
		this.userYearSelection = userYearSelection;
		this.mainProgramView = mainProgramView;
	}

	/**
	 * ItemStateChated method for if an item is selected in the
	 * userYearSelection JComboBox
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
