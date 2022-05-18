import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class GetResultButtonListener implements ActionListener
{

	MainProgramView mainProgramView;
	JButton getResultsButton;

	public GetResultButtonListener(JButton getResultsButton,
			MainProgramView mainProgramView)
	{
		this.mainProgramView = mainProgramView;
		this.getResultsButton = getResultsButton;
	}

	@Override
	public void actionPerformed(ActionEvent e)
	{
		mainProgramView.getResults();
	}

}
