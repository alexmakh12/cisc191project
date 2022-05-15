import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JRadioButton;

public class FireRadioButtonListener implements ActionListener
{
	MainProgramView mainProgramView;
	JRadioButton fireButton;

	public FireRadioButtonListener(JRadioButton fireButton,
			MainProgramView mainProgramView)
	{
		this.fireButton = fireButton;
		this.mainProgramView = mainProgramView;
	}

	public void actionPerformed(ActionEvent e)
	{
		if (e.getSource() == fireButton)
		{
			String[] fireQuestions = {
					"Select an Question", "What is the number of fire incidents on a specifc date month and year",
					"Fire Questions 2", "Fire Question 3","Fire 3" };
			
			mainProgramView.userQuestionSelection.removeAllItems();
			mainProgramView.userQuestionSelection.setEnabled(true);

			for (int index = 0; index < fireQuestions.length; index++)
			{
				mainProgramView.userQuestionSelection
						.addItem(fireQuestions[index]);
			}
		}
	}
}
