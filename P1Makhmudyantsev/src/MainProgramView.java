import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

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
 *         Version/date: 05/16/2022 V3.0
 * 
 *         Responsibilities of class:
 *         - Creates a MainProgramView that is a JFrame
 */
/**
 */

// MainProgramView IS-A JFrame
public class MainProgramView extends JFrame
{
	// MainProgramView HAS-A firstProgramInstrucitons
	JLabel firstProgramInstructions;

	// MainProgramView HAS-A secondProgramInstructions
	JLabel secondProgramInstructions;

	// MainProgramView HAS-A thirdProgramInstructions
	JLabel thirdProgramInstructions;

	// MainProgramView HAS-A creatorSignature
	JLabel creatorSignature;

	// MainProgramView HAS-A userStateSelection
	JComboBox userStateSelection;

	// MainProgramView HAS-A userCitySelection
	JComboBox userCitySelection;

	// MainProgramView HAS-A userQuestionSeleciton
	JComboBox userQuestionSelection;

	// MainProgramView HAS-A userCommunitySelection
	JComboBox userCommunitySelection;

	// MainProgramView HAS-A userCallCategorySelection
	JComboBox userCallCategorySelection;

	// MainProgramView HAS-A userYearSeleciton
	JComboBox userYearSelection;

	// MainProgramView HAS-A userMonthSelection
	JComboBox userMonthSelection;

	// MainProgramView HAS-A group
	ButtonGroup groupOfIncidentTypeRadioButtons;

	// MainProgramView HAS-A panelContainer
	JPanel panelContainer;

	// MainProgramView HAS-A firstPanel
	JPanel firstPanel;

	// MainProgramView HAS-A secondPanel
	JPanel secondPanel;

	// MainProgramView HAS-A thirdPanel
	JPanel thirdPanel;

	// MainProgramView HAS-A fourthPanel
	JPanel fourthPanel;

	// MainProgramView HAS-A fifthPanel
	JPanel fifthPanel;

	// MainProgramView HAS-A sixthPanel
	JPanel sixthPanel;

	// MainProgramView HAS-A seventhPanel
	JPanel seventhPanel;

	// MainProgramView HAS-A eightPanel
	JPanel eigthPanel;

	JPanel messegePanel;

	// MainProgramView fireIncidetTypeRadioButton
	JRadioButton fireIncidentTypeRadioButton;

	// MainProgramView policeIncidentRadioTypeButton
	JRadioButton policeIncidentRadioTypeButton;

	// MainProgramView policeAndFireIncidenTypeRadioButton
	JRadioButton policeAndFireIncidenTypeRadioButton;

	// MainProgramView getResultsButton
	JButton getResultsButton;

	// MainProgramView resetButton
	JButton resetButton;

	// MainProgramView states
	String[] states = { "Select a State", "California", };

	// MainProgramView cities
	String[] cities = { "Select a City", "San Diego" };

	// MainProgramView defaultUserQuestion
	String[] defaultUserQuesiton = { "Select Incident Type" };

	// MainProgramView month
	String[] months = { "Select a month", "1", "2", "01" };

	// MainProgramView year
	String[] years = { "Select a year", "2022", "2021" };

	// MainProgramView callCategory
	String[] callCategory = { "Select a Call Category", "Non-Urgent" };

	// MainProgramView community
	String[] community = { "Select a Community", "92126", "92101" };

	int caseBasedOffOfSelection;

	public MainProgramView()
	{

		setTitle("Police and Fire Data Parser");

		setSize(1000, 500);

		firstProgramInstructions = new JLabel();
		firstProgramInstructions.setText("Select a state and a city to being");
		firstProgramInstructions.setFont(new Font("Tahoma", Font.BOLD, 15));
		firstProgramInstructions.setAlignmentX(Component.CENTER_ALIGNMENT);
		firstProgramInstructions.setAlignmentY(Component.CENTER_ALIGNMENT);

		secondProgramInstructions = new JLabel();
		secondProgramInstructions.setText(
				"As you input the following options will become avalible");
		secondProgramInstructions.setFont(new Font("Tahoma", Font.BOLD, 15));
		secondProgramInstructions.setAlignmentX(Component.CENTER_ALIGNMENT);
		secondProgramInstructions.setAlignmentY(Component.CENTER_ALIGNMENT);

		thirdProgramInstructions = new JLabel();
		thirdProgramInstructions.setText("Select an Incident Type");
		thirdProgramInstructions.setFont(new Font("Tahoma", Font.BOLD, 15));
		thirdProgramInstructions.setAlignmentX(Component.CENTER_ALIGNMENT);
		thirdProgramInstructions.setAlignmentY(Component.CENTER_ALIGNMENT);

		creatorSignature = new JLabel();
		creatorSignature.setText("Created by Alexandre Makhmudyantsev");
		creatorSignature.setFont(new Font("Tahoma", Font.BOLD, 15));
		creatorSignature.setAlignmentX(Component.CENTER_ALIGNMENT);
		creatorSignature.setAlignmentY(Component.CENTER_ALIGNMENT);

		firstPanel = new JPanel();
		firstPanel.setLayout(new BoxLayout(firstPanel, BoxLayout.Y_AXIS));
		firstPanel.add(firstProgramInstructions);
		firstPanel.add(secondProgramInstructions);

		userStateSelection = new JComboBox(UnitedStatesStates.readWebsite(
				"https://gist.githubusercontent.com/iamjason/8f8f4bc00c13de86bcad/raw/338c1c9faafde0cd274d531e657a262df1dd5963/us-states-array"));
		userStateSelection.addItemListener(
				new UserStateSlectionListener(userStateSelection, this));
		userStateSelection.setSize(1, 10);

		userCitySelection = new JComboBox(cities);
		userCitySelection.addItemListener(
				new UserCitySelectionListener(userCitySelection, this));
		userCitySelection.setSize(1, 5);
		userCitySelection.setEnabled(false);

		secondPanel = new JPanel();
		secondPanel.add(userStateSelection);
		secondPanel.add(userCitySelection);

		thirdPanel = new JPanel();
		thirdPanel.add(thirdProgramInstructions);

		fireIncidentTypeRadioButton = new JRadioButton("Fire");
		fireIncidentTypeRadioButton.setEnabled(false);
		fireIncidentTypeRadioButton.addActionListener(
				new FireRadioButtonListener(fireIncidentTypeRadioButton, this));
		policeIncidentRadioTypeButton = new JRadioButton("Police");
		policeIncidentRadioTypeButton.setEnabled(false);
		policeIncidentRadioTypeButton.addActionListener(
				new PoliceRadioButtonListener(policeIncidentRadioTypeButton,
						this));
		policeAndFireIncidenTypeRadioButton = new JRadioButton(
				"Police And Fire");
		policeAndFireIncidenTypeRadioButton.setEnabled(false);
		groupOfIncidentTypeRadioButtons = new ButtonGroup();
		groupOfIncidentTypeRadioButtons
				.add(policeAndFireIncidenTypeRadioButton);
		groupOfIncidentTypeRadioButtons.add(fireIncidentTypeRadioButton);
		groupOfIncidentTypeRadioButtons.add(policeIncidentRadioTypeButton);

		fourthPanel = new JPanel();
		fourthPanel.add(fireIncidentTypeRadioButton);
		fourthPanel.add(policeIncidentRadioTypeButton);
		fourthPanel.add(policeAndFireIncidenTypeRadioButton);

		fifthPanel = new JPanel();
		userQuestionSelection = new JComboBox(defaultUserQuesiton);
		userQuestionSelection.addItemListener(
				new UserQuestionSelectionListener(userQuestionSelection, this));
		userQuestionSelection.setEnabled(false);
		fifthPanel.add(userQuestionSelection);

		sixthPanel = new JPanel();
		userCommunitySelection = new JComboBox(community);
		userCommunitySelection.addItemListener(
				new UserCommunitySelectionListener(userCommunitySelection,
						this));
		userCommunitySelection.setEnabled(false);
		userCallCategorySelection = new JComboBox(callCategory);
		userCallCategorySelection.setEnabled(false);
		userMonthSelection = new JComboBox(months);
		userMonthSelection.addItemListener(
				new UserMonthSelectionListener(userMonthSelection, this));
		userMonthSelection.setEnabled(false);
		userYearSelection = new JComboBox(years);
		userYearSelection.addItemListener(
				new UserYearSelectionListener(userYearSelection, this));
		userYearSelection.setEnabled(false);
		sixthPanel.add(userCommunitySelection);
		sixthPanel.add(userCallCategorySelection);
		sixthPanel.add(userMonthSelection);
		sixthPanel.add(userYearSelection);

		seventhPanel = new JPanel();
		getResultsButton = new JButton();
		getResultsButton.setText("Get Results");
		getResultsButton.addActionListener(
				new GetResultButtonListener(getResultsButton, this));
		resetButton = new JButton();
		resetButton.setText("Reset");
		getResultsButton.setEnabled(false);
		resetButton
				.addActionListener(new ResetButtonListener(resetButton, this));
		seventhPanel.add(resetButton);
		seventhPanel.add(getResultsButton);

		eigthPanel = new JPanel();
		eigthPanel.add(creatorSignature);

		panelContainer = new JPanel();
		panelContainer.setLayout(new GridLayout(8, 1));
		panelContainer.add(firstPanel);
		panelContainer.add(secondPanel);
		panelContainer.add(thirdPanel);
		panelContainer.add(fourthPanel);
		panelContainer.add(fifthPanel);
		panelContainer.add(sixthPanel);
		panelContainer.add(seventhPanel);
		panelContainer.add(eigthPanel);

		setLayout(new BorderLayout());
		add(panelContainer, BorderLayout.CENTER);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		setVisible(true);

	}

	public void resetProgram()
	{
		userStateSelection.setSelectedIndex(0);
		userCitySelection.setSelectedIndex(0);
		groupOfIncidentTypeRadioButtons.clearSelection();
		userQuestionSelection.setEnabled(false);
		userQuestionSelection.setSelectedIndex(0);
		userCommunitySelection.setEnabled(false);
		userCommunitySelection.setSelectedIndex(0);
		userYearSelection.setEnabled(false);
		userYearSelection.setSelectedIndex(0);
		userMonthSelection.setEnabled(false);
		userMonthSelection.setSelectedIndex(0);
		userCallCategorySelection.setEnabled(false);
		userCallCategorySelection.setSelectedIndex(0);
		getResultsButton.setEnabled(false);

		// //Reset the frame fully (testing)
		// this.dispose();
		// new MainProgramView();

	}

	public void getResults()
	{
		switch (caseBasedOffOfSelection)
		{
			case 1:
				int counter = Main
						.countNumberOfCrimeIncidentsBasedOfZipCodeMonthYear(
								"ARJISPublicCrime030922.csv",
								userCommunitySelection.getSelectedItem()
										.toString(),
								userMonthSelection.getSelectedItem().toString(),
								userYearSelection.getSelectedItem().toString());

				messegePanel = new JPanel();

				if (counter == 0)
				{
					JOptionPane.showMessageDialog(messegePanel,
							"Sorry there isnt enough data to answer this, try something different");
				}

				else
				{

					JOptionPane.showMessageDialog(messegePanel, "There are"
							+ counter + "crime incidents in "
							+ userCommunitySelection.getSelectedItem()
									.toString()
							+ userMonthSelection.getSelectedItem().toString()
							+ " and year "
							+ userYearSelection.getSelectedItem().toString());
				}
				break;

			case 2:
				counter = Main.countNumberOfFireIncidentsBasedOfZipMonthYear(
						"fdIncidents2021DataSD.csv",
						userCommunitySelection.getSelectedItem().toString(),
						userMonthSelection.getSelectedItem().toString(),
						userYearSelection.getSelectedItem().toString());

				messegePanel = new JPanel();

				if (counter == 0)
				{
					JOptionPane.showMessageDialog(messegePanel,
							"Sorry there isnt enough data to answer this, try something different");
				}

				else
				{

					JOptionPane.showMessageDialog(messegePanel, "There are"
							+ counter + "fire incidents in "
							+ userCommunitySelection.getSelectedItem()
									.toString()
							+ userMonthSelection.getSelectedItem().toString()
							+ " and year "
							+ userYearSelection.getSelectedItem().toString());
				}
				break;
			case 3:
				counter = Main.countNumberOfFireIncidentTypeForAGivenYear(
						"fdIncidents2021DataSD.csv",
						userYearSelection.getSelectedItem().toString(),
						userCallCategorySelection.getSelectedItem().toString());

				messegePanel = new JPanel();

				if (counter == 0)
				{
					JOptionPane.showMessageDialog(messegePanel,
							"Sorry there isnt enough data to answer this, try something different");
				}
				else
				{

				}
				JOptionPane.showMessageDialog(messegePanel,
						"There are"
								+ userYearSelection.getSelectedItem().toString()
								+ userCallCategorySelection.getSelectedItem()
										.toString());
				break;
		}

	}

	public void checkToUpdateGetResultsButton()
	{
		if (policeIncidentRadioTypeButton.isSelected() && userCommunitySelection
				.getSelectedItem() != userCommunitySelection.getItemAt(0)
				&& userMonthSelection.getSelectedItem() != userMonthSelection
						.getItemAt(0)
				&& userYearSelection.getSelectedItem() != userYearSelection
						.getItemAt(0))
		{
			caseBasedOffOfSelection = 1;
			getResultsButton.setEnabled(true);
		}

		else if (fireIncidentTypeRadioButton.isSelected()
				&& userCommunitySelection
						.getSelectedItem() != userCommunitySelection
								.getItemAt(0)
				&& userMonthSelection.getSelectedItem() != userMonthSelection
						.getItemAt(0)
				&& userYearSelection.getSelectedItem() != userYearSelection
						.getItemAt(0))
		{
			caseBasedOffOfSelection = 2;
			getResultsButton.setEnabled(true);
		}

		else if (fireIncidentTypeRadioButton.isSelected()
				&& userYearSelection.getSelectedItem() != userYearSelection
						.getItemAt(0)
				&& userCallCategorySelection
						.getSelectedItem() != userCallCategorySelection)
		{
			caseBasedOffOfSelection = 3;
			getResultsButton.setEnabled(true);
		}

	}

	public static void main(String[] args)
	{

		new MainProgramView();
	}
}
