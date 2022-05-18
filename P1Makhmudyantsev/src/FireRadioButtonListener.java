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
 *         Version/date: 05/16/2022 V3.0
 * 
 *         Responsibilities of class:
 *         - Creates a fire radio button listener implements an ActionListener
 *         to perform actions when a fire radio button is clicked
 */
/**
 */
public class FireRadioButtonListener implements ActionListener
{
	// FireRadioButtonListener HAS-A mainProgramView
	MainProgramView mainProgramView;

	// FireRadioButton HAS-A fireButton
	JRadioButton fireRadioButton;

	/**
	 * FireRadioButtonListener constructor that creates a new
	 * FireRadioButtonListener object
	 * 
	 * @param fireButton
	 * @param mainProgramView
	 */
	public FireRadioButtonListener(JRadioButton fireRadioButton,
			MainProgramView mainProgramView)
	{
		this.fireRadioButton = fireRadioButton;
		this.mainProgramView = mainProgramView;
	}

	/**
	 * Action performed method for if the fireRadioButton is clicked
	 */
	public void actionPerformed(ActionEvent e)
	{
		if (e.getSource() == fireRadioButton)
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
			 * Create a array of the string type called fireQuestions that has
			 * fire Questions"
			 */
			String[] fireQuestions = { "What would you like to know about this incident type",
					"The number of fire incidents for specific community on a given month and year",
					"The number of fire incidents for a specific call category on a given year",
					};

			/**
			 * Using a for loop populate the userQuestionSelection JComboBox
			 * with the fireQuesitons
			 */
			for (int index = 0; index < fireQuestions.length; index++)
			{
				mainProgramView.userQuestionSelection
						.addItem(fireQuestions[index]);
			}

			// ADD COMMENT
			mainProgramView.userCallCategorySelection.removeAllItems();

			/**
			 * Create a array of the string type called fireRelatedCallCategorys
			 * that have fire related call categorys
			 */
			String[] fireRelatedCallCategorys = { "Select a call category",
					"Life-Threatening Emergency Response" };

			/**
			 * Using a for loop populate the userCallCategorySelection JComobo
			 * with fire related call categorys
			 */
			for (int index = 0; index < fireRelatedCallCategorys.length; index++)
			{
				mainProgramView.userCallCategorySelection
						.addItem(fireRelatedCallCategorys[index]);
			}

		}
	}
}
