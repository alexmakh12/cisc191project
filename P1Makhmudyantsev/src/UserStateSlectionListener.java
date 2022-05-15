import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.JComboBox;

public class UserStateSlectionListener implements ItemListener
{
	MainProgramView mainProgramView;
	JComboBox userStateSelection;

	public UserStateSlectionListener(JComboBox userStateSelection,
			MainProgramView mainProgramView)
	{
		this.userStateSelection = userStateSelection;
		this.mainProgramView = mainProgramView;
	}
	
	public void itemStateChanged(ItemEvent e)
	{
		if (e.getStateChange() == ItemEvent.SELECTED) {
			mainProgramView.userCitySelection.setEnabled(true);
			System.out.println(userStateSelection.getSelectedItem());
		}
		
		
	}

}
