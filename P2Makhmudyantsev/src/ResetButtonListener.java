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
 *         - Creates a reset button listener that implements
 *         ActionListener to perform actions when a reset button
 *         is clicked
 */
/**
 */

public class ResetButtonListener implements ActionListener
{
	// ResetButtonListener HAS-A mainProgramView
	private MainProgramView mainProgramView;

	// ResetButtonListener HAS-A resetButton
	private JButton resetButton;

	/**
	 * ResetButtonListener constructor that create a new ResetButtonListener
	 * object
	 * 
	 * @param resetButton
	 * @param mainProgramView
	 */
	public ResetButtonListener(JButton resetButton,
			MainProgramView mainProgramView)
	{
		this.mainProgramView = mainProgramView;
		this.resetButton = resetButton;
	}

	/**
	 * Action performed method for if a reset button is clicked
	 */
	public void actionPerformed(ActionEvent e)
	{
		/**
		 * reset the mainprogramView using the resetProgram method in the
		 * MainProgramView class based off of the first switch statement
		 */
		mainProgramView.resetCaseBasedOffScenario = 1;
		mainProgramView.resetProgram();
	}

}
