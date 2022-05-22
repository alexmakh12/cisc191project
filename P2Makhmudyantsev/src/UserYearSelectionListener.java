import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JComboBox;

public class UserYearSelectionListener implements ItemListener
{
	// UserStateSlectionListener HAS-A mainProgramView
	MainProgramView mainProgramView;

	// UserStateSlectionListener HAS-A userStateSlection
	JComboBox userYearSelection;
	
	public UserYearSelectionListener(JComboBox userYearSelection,
			MainProgramView mainProgramView)
	{
		this.userYearSelection = userYearSelection;
		this.mainProgramView = mainProgramView;
	}


	@Override
	public void itemStateChanged(ItemEvent e)
	{
		if (e.getStateChange() == ItemEvent.SELECTED)
		{
			System.out.println(userYearSelection.getSelectedItem());
			
			mainProgramView.checkToUpdateGetResultsButton();

		}

	}
}
