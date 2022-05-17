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
 *         Version/date: 05/16/2022 V3.0
 * 
 *         Responsibilities of class:
 *         - Creates a user state selection listener that implements
 *         ActionListener to perform actions when a user selects an state in the
 *         userStateSelection JComboBox
 */
/**
 */

public class UserStateSlectionListener implements ItemListener
{
	// UserStateSlectionListener HAS-A mainProgramView
	MainProgramView mainProgramView;

	// UserStateSlectionListener HAS-A userStateSlection
	JComboBox userStateSelection;

	/**
	 * Constructor that creates a new userStateSelectionListener
	 * 
	 * @param userStateSelection
	 * @param mainProgramView
	 */
	public UserStateSlectionListener(JComboBox userStateSelection,
			MainProgramView mainProgramView)
	{
		this.userStateSelection = userStateSelection;
		this.mainProgramView = mainProgramView;
	}

	/**
	 * ItemStateChated method for if an item is selected in the
	 * userStateSelection JComboBox
	 */
	public void itemStateChanged(ItemEvent e)
	{
		if (e.getStateChange() == ItemEvent.SELECTED)
		{

			/**
			 * If a user selects a state enable the userCitySelection JComboBox
			 * 
			 * We are doing this so that the user can continue
			 * in the program and select a city.
			 */
			mainProgramView.userCitySelection.setEnabled(true);
			System.out.println(userStateSelection.getSelectedItem());

			/**
			 * If the user changes the state later in the program reset the
			 * whole program
			 * 
			 * We are doing this since if the user changes a state they will
			 * need to select a coresponing city to that state and the program
			 * is now parsing data from a new state (NOTE : hoping to implement
			 * so that its not only just California and San Diego)
			 */
			mainProgramView.resetProgram();
		}
	}

}
