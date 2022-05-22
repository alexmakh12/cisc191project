import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

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
 *         Version/date: 05/21/2022 V2.0
 * 
 *         Responsibilities of class:
 *         - Creates a get results button listener that implements
 *         ActionListener to perform actions when a get results button
 *         is clicked
 */
/**
 */

public class GetResultButtonListener implements ActionListener
{

	// GetResultsButtonListener HAS-A mainProgramView
	private MainProgramView mainProgramView;

	// GetResultsButtonListener HAS-A getResultsButton
	private JButton getResultsButton;

	/**
	 * GetResultButtonListenerconstructor that create a new ResetButtonListener
	 * object
	 * 
	 * @param getResultsButton
	 * @param mainProgramView
	 */
	public GetResultButtonListener(JButton getResultsButton,
			MainProgramView mainProgramView)
	{
		this.mainProgramView = mainProgramView;
		this.getResultsButton = getResultsButton;
	}

	/**
	 * Action performed method for if a reset button is clicked
	 */
	public void actionPerformed(ActionEvent e)
	{
		// Call the getResults method in the mainProgramView.
		mainProgramView.getResults();
	}

}
