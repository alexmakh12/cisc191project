import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JRadioButton;

public class PoliceRadioButtonListener implements ActionListener
{
	MainProgramView mainProgramView;
	JRadioButton policeRadioButton;

	public PoliceRadioButtonListener(JRadioButton policeRadioButton,
			MainProgramView mainProgramView)
	{
		this.policeRadioButton = policeRadioButton;
		this.mainProgramView = mainProgramView;
	}

	public void actionPerformed(ActionEvent e)
	{
		if (e.getSource() == policeRadioButton)
		{
			String[] policeQuesitons = {
					"Select an Question", "The Number Of Crime Incidents in a specified community on a given month and year",
					"quesiton 2", "question 3" };
			
			mainProgramView.userQuestionSelection.removeAllItems();
			mainProgramView.userQuestionSelection.setEnabled(true);
			
			for (int index = 0; index < policeQuesitons.length; index++)
			{
				mainProgramView.userQuestionSelection
						.addItem(policeQuesitons[index]);
			}
	
			
		}
	}
}
