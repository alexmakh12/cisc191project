import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.JComboBox;

public class UserCitySelectionListener implements ItemListener
{
	MainProgramView mainProgramView;
	JComboBox userCitySelection;
	
	public UserCitySelectionListener(JComboBox userCitySelection, MainProgramView mainProgramView) {
		this.mainProgramView = mainProgramView;
		this.userCitySelection = userCitySelection;
	}

	@Override
	public void itemStateChanged(ItemEvent e)
	{
		if(e.getStateChange() == ItemEvent.SELECTED) {
			mainProgramView.fireIncidetTypeRadioButton.setEnabled(true);
			mainProgramView.policeIncidentRadioTypeButton.setEnabled(true);
			mainProgramView.policeAndFireIncidenTypeRadioButton.setEnabled(true);
			System.out.println(userCitySelection.getSelectedItem());
		}
	}
}
