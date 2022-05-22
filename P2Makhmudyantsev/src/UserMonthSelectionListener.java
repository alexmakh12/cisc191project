import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JComboBox;

public class UserMonthSelectionListener implements ItemListener
{
	// UserStateSlectionListener HAS-A mainProgramView
	MainProgramView mainProgramView;

	// UserStateSlectionListener HAS-A userStateSlection
	JComboBox userMonthSelection;
	
	public UserMonthSelectionListener(JComboBox userMonthSelection,
			MainProgramView mainProgramView)
	{
		this.userMonthSelection = userMonthSelection;
		this.mainProgramView = mainProgramView;
	}


	@Override
	public void itemStateChanged(ItemEvent e)
	{
		if (e.getStateChange() == ItemEvent.SELECTED)
		{
			System.out.println(userMonthSelection.getSelectedItem());
			
			mainProgramView.checkToUpdateGetResultsButton();

		}

	}
}
