import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JComboBox;

public class UserCommunitySelectionListener implements ItemListener
{
	// UserStateSlectionListener HAS-A mainProgramView
	MainProgramView mainProgramView;

	// UserStateSlectionListener HAS-A userStateSlection
	JComboBox userCommunitySelection;
	
	public UserCommunitySelectionListener(JComboBox userCommunitySelection,
			MainProgramView mainProgramView)
	{
		this.userCommunitySelection = userCommunitySelection;
		this.mainProgramView = mainProgramView;
	}


	@Override
	public void itemStateChanged(ItemEvent e)
	{
		if (e.getStateChange() == ItemEvent.SELECTED)
		{
			System.out.println(userCommunitySelection.getSelectedItem());
			mainProgramView.checkToUpdateGetResultsButton();
		}

	}
}
