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
 *         Version/date: 05/21/2022 V3.0
 * 
 *         Responsibilities of class:
 *         - Creates a user question selection listener that implements
 *         ActionListener to perform actions when a user selects an question in
 *         the userQuestionSelection JComboBox
 */
/**
 */

public class UserQuestionSelectionListener implements ItemListener
{

	// UserQuestionSelectionListener HAS-A mainProgramView
	private MainProgramView mainProgramView;

	// UserQuestionSelectionListener HAS-A userQuesitonSelection
	private JComboBox userQuestionSelection;

	/**
	 * Constructor that creates a new UserQuestionSelectionListener object
	 * 
	 * @param userQuestionSelection2
	 * @param mainProgramView
	 */
	public UserQuestionSelectionListener(JComboBox userQuestionSelection,
			MainProgramView mainProgramView)
	{
		this.userQuestionSelection = userQuestionSelection;
		this.mainProgramView = mainProgramView;
	}

	/**
	 * ItemStateChated method for if an item is selected in the
	 * userQuestionSelection JComboBox
	 */
	public void itemStateChanged(ItemEvent e)
	{
		if (e.getStateChange() == ItemEvent.SELECTED)
		{
			/**
			 * If the question selected by the user contains the word community
			 * then enable the user userCommunitySelection JComboBox.
			 * 
			 * Else disable it. We are disabling so that if the user changes
			 * question and this field is not related to the question
			 * it is disabled
			 */
			if (userQuestionSelection.getSelectedItem().toString()
					.contains("community"))
			{
				mainProgramView.getUserCommunitySelection().setEnabled(true);
			}

			else
			{
				mainProgramView.getUserCommunitySelection().setEnabled(false);
			}

			/**
			 * Set the userCommuntySelection to index 0 back to index 0 which
			 * would be the instruction for JComboBox each JComboBox.
			 * 
			 * We are doing this because if the user enters a community and then
			 * changes a question we do not want the community field to be
			 * filled or see it because the new question may not be related to a
			 * community
			 */
			mainProgramView.getUserCommunitySelection().setSelectedIndex(0);

			/**
			 * If the question selected by the user contains the word call
			 * category then enable the user userCallCategorySelection JComboBox.
			 * 
			 * Else disable it. We are disabling so that if the user changes
			 * question and this field is not related to the question
			 * it is disabled
			 */
			if (userQuestionSelection.getSelectedItem().toString()
					.contains("call category"))
			{
				mainProgramView.getUserCallCategorySelection().setEnabled(true);
			}

			else
			{
				mainProgramView.getUserCallCategorySelection().setEnabled(false);
			}

			/**
			 * Set the userCallCategorySelection to index 0 back to index 0
			 * which would be the instruction for JComboBox each JComboBox.
			 * 
			 * We are doing this because if the user enters a call category and
			 * then changes a question we do not want the call category field to
			 * be filled or see it because the new question may not be related
			 * to a call category
			 */
			mainProgramView.getUserCallCategorySelection().setSelectedIndex(0);

			
			/**
			 * If the question selected by the user contains the word month
			 * then enable the user userMonthSelection JComboBox.
			 * 
			 * Else disable it. We are disabling so that if the user changes
			 * question and this field is not related to the question
			 * it is disabled
			 */
			if (userQuestionSelection.getSelectedItem().toString()
					.contains("month"))
			{
				mainProgramView.getUserMonthSelection().setEnabled(true);
			}
			
			else
			{
				mainProgramView.getUserMonthSelection().setEnabled(false);
			}
			
			/**
			 * Set the userMonthSelection to index 0 back to index 0
			 * which would be the instruction for JComboBox each JComboBox.
			 * 
			 * We are doing this because if the user enters a month and
			 * then changes a question we do not want the month field to
			 * be filled or see it because the new question may not be related
			 * to a month
			 */
			mainProgramView.getUserMonthSelection().setSelectedIndex(0);

			
			/**
			 * If the question selected by the user contains the word year
			 * then enable the user userYearSelection JComboBox.
			 * 
			 * Else disable it. We are disabling so that if the user changes
			 * question and this field is not related to the question
			 * it is disabled
			 */
			if (userQuestionSelection.getSelectedItem().toString()
					.contains("year"))
			{
				mainProgramView.getUserYearSelection().setEnabled(true);
			}
			else
			{
				mainProgramView.getUserYearSelection().setEnabled(false);
			}

			/**
			 * Set the userYearSelection to index 0 back to index 0
			 * which would be the instruction for JComboBox each JComboBox.
			 * 
			 * We are doing this because if the user enters a year and
			 * then changes a question we do not want the year field to
			 * be filled or see it because the new question may not be related
			 * to a year
			 */
			mainProgramView.getUserYearSelection().setSelectedIndex(0);
		}
	}
}
