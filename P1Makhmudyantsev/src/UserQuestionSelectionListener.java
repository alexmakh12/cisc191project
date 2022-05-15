import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.JComboBox;

public class UserQuestionSelectionListener implements ItemListener
{

	MainProgramView mainProgramView;
	JComboBox userQuestionSelection;

	public UserQuestionSelectionListener(JComboBox userQuestionSelection2,
			MainProgramView mainProgramView)
	{
		this.userQuestionSelection = userQuestionSelection2;
		this.mainProgramView = mainProgramView;
	}

	@Override
	public void itemStateChanged(ItemEvent e)
	{
		if (e.getStateChange() == ItemEvent.SELECTED)
		{
			if (userQuestionSelection.getSelectedItem().toString()
					.contains("community"))
			{
				mainProgramView.userCommunitySelection.setEnabled(true);
			}
			
			else
			{
				mainProgramView.userCommunitySelection.setEnabled(false);
			}

			if (userQuestionSelection.getSelectedItem().toString()
					.contains("call category"))
			{
				mainProgramView.userCallCategorySelection.setEnabled(true);
			}

			else
			{
				mainProgramView.userCallCategorySelection.setEnabled(false);
			}

			if (userQuestionSelection.getSelectedItem().toString()
					.contains("month"))
			{
				mainProgramView.userMonthSelection.setEnabled(true);
			}
			else
			{
				mainProgramView.userMonthSelection.setEnabled(false);
			}

			if (userQuestionSelection.getSelectedItem().toString()
					.contains("year"))
			{
				mainProgramView.userYearSelection.setEnabled(true);
			}
			else
			{
				mainProgramView.userYearSelection.setEnabled(false);
			}
		}
	}
}
