import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JRadioButton;

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
 *         - Creates a police radio button listener that implements a
 *         ActionListener to perform actions when a police radio button is
 *         clicked
 */
/**
 */
public class PoliceRadioButtonListener implements ActionListener
{
	// PoliceRadioButtonListener HAS-A mainProgramView
	private MainProgramView mainProgramView;

	// PoliceRadioButtonListener HAS-A policeRadioButton
	private JRadioButton policeRadioButton;

	/**
	 * PoliceRadioButtonListener constructor that creates a new
	 * PoliceRadioButtonListener object
	 * 
	 * @param policeRadioButton
	 * @param mainProgramView
	 */
	public PoliceRadioButtonListener(JRadioButton policeRadioButton,
			MainProgramView mainProgramView)
	{
		this.policeRadioButton = policeRadioButton;
		this.mainProgramView = mainProgramView;
	}

	/**
	 * Action performed method for if the policerdioButton is clicked
	 */
	public void actionPerformed(ActionEvent e)
	{
		if (e.getSource() == policeRadioButton)
		{
			/**
			 * enabled the userQuestionSelection JComboBox (assuming you have
			 * not answered the cities JComboBox)
			 */
			mainProgramView.userQuestionSelection.setEnabled(true);

			/**
			 * Remove all items from the user question selection JComboBox. We
			 * are doing this because if a user switched incident type we do not
			 * want the previous incident type questions to be populated in the
			 * JComboBox
			 */
			mainProgramView.userQuestionSelection.removeAllItems();

			/**
			 * setSelectedIndex of userMonthSelection,userYearSelection and
			 * userCommunitySelection back to index 0 which
			 * would be the instruction for JComboBox each JComboBox.
			 * 
			 * We are doing this because if a user switched incident type after
			 * selecting additional question related fields, we do not want to
			 * see those selections. The user will have to pick a new question
			 * and that question may not need those selected fields. So we will
			 * have the answer the questions again.
			 */
			mainProgramView.userMonthSelection.setSelectedIndex(0);
			mainProgramView.userYearSelection.setSelectedIndex(0);
			mainProgramView.userCommunitySelection.setSelectedIndex(0);

			/**
			 * Create a array of the string type called policQuestions that has
			 * police Questions"
			 */
			String[] policeQuesitons = {
					"What would you like to know about this incident type",
					"The Number Of Crime Incidents in a specified community on a given month and year" };

			/**
			 * Using a for loop populate the userQuestionSelection JComboBox
			 * with the policeQuesitons
			 */
			for (int index = 0; index < policeQuesitons.length; index++)
			{
				mainProgramView.userQuestionSelection
						.addItem(policeQuesitons[index]);
			}

			/**
			 * Remove any call categories unrelated to police 
			 * from other incident types
			 */
			mainProgramView.userCallCategorySelection.removeAllItems();

			/**
			 * Create a array of the string type called
			 * policeRelatedCallCategorys that have police related call
			 * category's
			 */
			String[] policeRelatedCallCategoryCalls = {
					"Select an Call Category", "Felony" };

			/**
			 * Using a for loop populate the userCallCategorySelection JComobo
			 * with police related call category's
			 */
			for (int index = 0; index < policeRelatedCallCategoryCalls.length; index++)
			{
				mainProgramView.userCallCategorySelection
						.addItem(policeRelatedCallCategoryCalls[index]);
			}

		}
	}
}
