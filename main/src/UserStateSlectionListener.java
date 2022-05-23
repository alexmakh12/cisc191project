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
 *         - Creates a user state selection listener that implements
 *         ActionListener to perform actions when a user selects an state in the
 *         userStateSelection JComboBox
 */
/**
 */

public class UserStateSlectionListener implements ItemListener
{
	// UserStateSlectionListener HAS-A mainProgramView
	private MainProgramView mainProgramView;

	// UserStateSlectionListener HAS-A userStateSlection
	private JComboBox userStateSelection;

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
			mainProgramView.getUserCitySelection().setEnabled(true);
			System.out.println(userStateSelection.getSelectedItem());

			/**
			 * If the user changes the state later in the program reset the
			 * whole program
			 * 
			 * We are doing this since if the user changes a state they will
			 * need to select a corresponding city to that state and the program
			 * is now parsing data from a new state (NOTE : hoping to implement
			 * so that its not only just California and San Diego)
			 */
			mainProgramView.setResetCaseBasedOffScenario(2);

			/**
			 * Call the resetProgram method from the mainProgram view using the
			 * second switch statement case
			 */
			mainProgramView.resetProgram();

			/**
			 * Check if selected California is selected
			 */
			if (mainProgramView.getUserStateSelection().getSelectedItem().toString()
					.contains("California"))
			{

				/**
				 * if it is remove all of the items from the
				 * user CitySeleciton and add the correlated cities of
				 * California
				 */
				mainProgramView.getUserCitySelection().removeAllItems();

				String[] sanDiegoCities = { "Select a city", "San Diego", };

				for (int index = 0; index < sanDiegoCities.length; index++)
				{
					mainProgramView.getUserCitySelection()
							.addItem(sanDiegoCities[index]);
				}

				/**
				 * Set the group of radioButtons to be disabled (not sure why
				 * they are enabling)
				 */
				mainProgramView.getFireIncidentTypeRadioButton().setEnabled(false);
				mainProgramView.getPoliceIncidentRadioTypeButton().setEnabled(false);
			}

			/**
			 * Else California is not selected so remove all the items from the
			 * California box and add "Select a city" (which will not let the
			 * user continue).
			 * 
			 * Set the group of radioButtons to be disabled (not sure why they
			 * are enabling)
			 */
			else
			{
				mainProgramView.getUserCitySelection().removeAllItems();
				mainProgramView.getUserCitySelection().addItem("Select a city");
				mainProgramView.getGroupOfIncidentTypeRadioButtons()
						.clearSelection();
				mainProgramView.getFireIncidentTypeRadioButton().setEnabled(false);
				mainProgramView.getPoliceIncidentRadioTypeButton().setEnabled(false);
			}

		}
	}

}
