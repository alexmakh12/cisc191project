import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Font;
import java.awt.Frame;
import java.awt.GridLayout;
import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
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
 *         https://www.youtube.com/watch?v=O4KGYGQvHmw&ab_channel=AlexLee
 * 
 *         (regex function)
 *         https://stackoverflow.com/questions/1903252/extract-integer-part-in-string
 * 
 *         Version/date: 05/18/2022 V5.0
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
	String[] states = { "Select a State" };

	// MainProgramView cities
	String[] cities = { "Select a City", };

	// MainProgramView defaultUserQuestion
	String[] defaultUserQuesiton = { "Select Incident Type" };

	// MainProgramView month
	String[] months = { "Select a month", "1 January", "2 Feburary", "3 March",
			"4 April", "5 May", "6 June", "7 July", "8 August", "9 Septmeber",
			"10 October", "11 Novemeber", "12 Decmeber" };

	// MainProgramView year
	String[] years = { "Select a year", "2022", "2021" };

	// MainProgramView callCategory
	String[] callCategory = { "Select a Call Category" };

	// MainProgramView community
	String[] community = { "Select a Community", "92126 (Mira Mesa)",
			"92101 (Downtown)" };

	int caseBasedOffOfSelection;

	int resetCaseBasedOffScenario;

	/**
	 * Program view constructor that creates a program view
	 */
	public MainProgramView()
	{
		IncidentSortingMethods
				.readAndLoadCrimeIncidentData("ARJISPublicCrime030922.csv");
		IncidentSortingMethods
				.readAndLoadFireIncidentData("fdIncidents2021DataSD.csv");
		// Set the of the program
		setTitle("Police and Fire Data Parser");

		// Set the size of the program
		setSize(1000, 500);

		/**
		 * Create a JLabel called program instruction that gives the user
		 * beginning Instructions of the program
		 */
		firstProgramInstructions = new JLabel();
		firstProgramInstructions.setText("Select a state and a city to begin");
		firstProgramInstructions.setFont(new Font("Tahoma", Font.BOLD, 15));
		firstProgramInstructions.setAlignmentX(Component.CENTER_ALIGNMENT);
		firstProgramInstructions.setAlignmentY(Component.CENTER_ALIGNMENT);

		/**
		 * Create a J:abel called secondProgramInstruction that gives the user
		 * bit more Information about the program and how it runs
		 */
		secondProgramInstructions = new JLabel();
		secondProgramInstructions.setText(
				"As you input the following options will become avalible");
		secondProgramInstructions.setFont(new Font("Tahoma", Font.BOLD, 15));
		secondProgramInstructions.setAlignmentX(Component.CENTER_ALIGNMENT);
		secondProgramInstructions.setAlignmentY(Component.CENTER_ALIGNMENT);

		/**
		 * Create a J:abel called thirdProgramInstrucitons that gives the user
		 * instructions on what to do when you get to the radio button section
		 */
		thirdProgramInstructions = new JLabel();
		thirdProgramInstructions.setText("Select an Incident Type");
		thirdProgramInstructions.setFont(new Font("Tahoma", Font.BOLD, 15));
		thirdProgramInstructions.setAlignmentX(Component.CENTER_ALIGNMENT);
		thirdProgramInstructions.setAlignmentY(Component.CENTER_ALIGNMENT);

		/**
		 * Create a JLabel called creatorSignature that shows the user who
		 * the program is created by
		 */
		creatorSignature = new JLabel();
		creatorSignature.setText("Created by Alexandre Makhmudyantsev");
		creatorSignature.setFont(new Font("Tahoma", Font.BOLD, 15));
		creatorSignature.setAlignmentX(Component.CENTER_ALIGNMENT);
		creatorSignature.setAlignmentY(Component.CENTER_ALIGNMENT);

		/**
		 * Create a new JPanel called firstPanel
		 * 
		 * This is the first panel holds the first and second program
		 * instruction for the user to see
		 */
		firstPanel = new JPanel();
		firstPanel.setLayout(new BoxLayout(firstPanel, BoxLayout.Y_AXIS));
		firstPanel.add(firstProgramInstructions);
		firstPanel.add(secondProgramInstructions);

		/**
		 * Create a new JComboBox called userStateSelection by passing the
		 * readWebsite method from the UnitedStatesStates class as a parameter
		 * 
		 * To the userStateSeleciton add UserStateSlectionListener (an
		 * ItemListener) to perform action when user selects an item in the
		 * JComboBox
		 */
		userStateSelection = new JComboBox(UnitedStatesStates.readWebsite(
				"https://gist.githubusercontent.com/iamjason/8f8f4bc00c13de86bcad/raw/338c1c9faafde0cd274d531e657a262df1dd5963/us-states-array"));
		userStateSelection.addItemListener(
				new UserStateSlectionListener(userStateSelection, this));

		/**
		 * Create a new JComboBox called userCitySelection by passing the
		 * cities array of the string type constructed earlier in the class
		 * 
		 * To the userCitySelection add UserCitySelectionListener (an
		 * ItemListener) to perform action when user selects an item in the
		 * JComboBox
		 */
		userCitySelection = new JComboBox(cities);
		userCitySelection.addItemListener(
				new UserCitySelectionListener(userCitySelection, this));
		userCitySelection.setEnabled(false);

		/**
		 * Create a new JPanel called secondPanel
		 * 
		 * This is the second panel in the program view for the user to see and
		 * it holds the userCitySelectionComboBox and userStateSelectionComboBox
		 */
		secondPanel = new JPanel();
		secondPanel.add(userStateSelection);
		secondPanel.add(userCitySelection);

		/**
		 * Create a new JPanel called thirdPanel
		 * 
		 * This is the third panel in the program view for the user to see and
		 * it holds the thirdProgramInstructions about the radioButtons
		 */
		thirdPanel = new JPanel();
		thirdPanel.add(thirdProgramInstructions);

		/**
		 * Create a new JRadioButton named Fire
		 * 
		 * Add and FireRadioButtonListener (an action listener) to perform
		 * action when user selects the JRadioButton the action will be
		 * to display questions related to that incident type
		 * 
		 * Set it to be disabled since we don't want the user to select it until
		 * they choose a city
		 */
		fireIncidentTypeRadioButton = new JRadioButton("Fire");
		fireIncidentTypeRadioButton.addActionListener(
				new FireRadioButtonListener(fireIncidentTypeRadioButton, this));
		fireIncidentTypeRadioButton.setEnabled(false);

		/**
		 * Create a new JRadioButton named Police
		 * 
		 * Add and PoliceRadioButtonListener (an action listener) to perform
		 * action when user selects the JRadioButton the action will be
		 * to display questions related to that incident type
		 * 
		 * Set it to be disabled since we don't want the user to select it until
		 * they choose a city
		 */
		policeIncidentRadioTypeButton = new JRadioButton("Police");
		policeIncidentRadioTypeButton.addActionListener(
				new PoliceRadioButtonListener(policeIncidentRadioTypeButton,
						this));
		policeIncidentRadioTypeButton.setEnabled(false);

		/**
		 * Create a new JRadioButton named Police
		 * 
		 * Add and PoliceRadioButtonListener (an action listener) to perform
		 * action when user selects the JRadioButton the action will be
		 * to display questions related to that incident type
		 * 
		 * Set it to be disabled since we don't want the user to select it until
		 * they choose a city
		 */
		policeAndFireIncidenTypeRadioButton = new JRadioButton(
				"Police And Fire");
		// ADD BUTTON LISTENER HERE
		policeAndFireIncidenTypeRadioButton.setEnabled(false);

		/**
		 * Create a ButtonGroup called groupOfIncidentTypeRadioButtons
		 * 
		 * This is what allows only one radio button to be selected at time
		 */
		groupOfIncidentTypeRadioButtons = new ButtonGroup();
		groupOfIncidentTypeRadioButtons
				.add(policeAndFireIncidenTypeRadioButton);
		groupOfIncidentTypeRadioButtons.add(fireIncidentTypeRadioButton);
		groupOfIncidentTypeRadioButtons.add(policeIncidentRadioTypeButton);

		/**
		 * Create a new JPanel called fourthPanel
		 * 
		 * This is the fourth panel in the program view for the user to see and
		 * it holds the
		 * fireIncidentTypeRadioButton,policeIncidentTypeRadioButton and
		 * policeAndFireIncidentTypeRadioButton
		 */
		fourthPanel = new JPanel();
		fourthPanel.add(fireIncidentTypeRadioButton);
		fourthPanel.add(policeIncidentRadioTypeButton);
		fourthPanel.add(policeAndFireIncidenTypeRadioButton);

		/**
		 * Create a new JComboBox called userQuestionSelection that
		 * is initially passed the defualtUserQuestion array of the string type
		 * which just displays the for that comboBox
		 * 
		 * To this userQuestionSelection add UserCitySelectionListener (an
		 * ItemListener) to perform action when user selects an item in the
		 * JComboBox this action will be to display the appropriate JComboBox
		 * fields related to the question
		 * 
		 * Set the userQuestionSelection to be false because we do not want the
		 * user to click it until they select an incident type
		 */
		userQuestionSelection = new JComboBox(defaultUserQuesiton);
		userQuestionSelection.addItemListener(
				new UserQuestionSelectionListener(userQuestionSelection, this));
		userQuestionSelection.setEnabled(false);

		/**
		 * Create a newJPanel called fifthPanel
		 * 
		 * This is the fifth panel in the program for the user to see and it
		 * holds the userQuestionsSelection JComboBox
		 */
		fifthPanel = new JPanel();
		fifthPanel.add(userQuestionSelection);

		/**
		 * Create a JComboBox called userCommunitySeleciton that is passed
		 * a community array of the string type declared earlier in the class
		 * to display the communities in san diego.
		 * 
		 * To this userCommunitySeleciton add an UserCommunitySelectionListener
		 * (an ItemListener) to perform an action when user selects an item in
		 * the JComoboBox.
		 * 
		 * Set it enabled to false because we do not what the user to select
		 * anything within the JComboBox unless it is related the question
		 */
		userCommunitySelection = new JComboBox(community);
		userCommunitySelection.addItemListener(
				new UserCommunitySelectionListener(userCommunitySelection,
						this));
		userCommunitySelection.setEnabled(false);

		/**
		 * Create a JComboBox called userCallCategorySelection that is passed
		 * callCategory array of the string type declared earlier in the class
		 * to display the default instruction for this comboBox
		 * 
		 * To this userCallCategorySelection add an ------ (an ItemListener) to
		 * perform an action
		 * when user selects an item in the JComoboBox.
		 * 
		 * Set the userCallCategorySelection disabled because we do not
		 * want the user to select anything within the JComboBox unless
		 * it is related the question
		 */
		userCallCategorySelection = new JComboBox(callCategory);
		userCallCategorySelection.setEnabled(false);
		// ADD A CallCategorySelectionListener

		/**
		 * Create a JComboBox called userMonthSelection that is passed
		 * months array of the string type declared earlier in the class
		 * to display the instructions for the combo box and every month in a
		 * year
		 * 
		 * To this userMonthSelection add an UserMonthSelectionListener
		 * (an ItemListener) to perform an action when user selects an item in
		 * the JComoboBox.
		 * 
		 * Set the userMonthSelection disabled because we do not
		 * want the user to select anything within the JComboBox unless
		 * it is related the question
		 */
		userMonthSelection = new JComboBox(months);
		userMonthSelection.addItemListener(
				new UserMonthSelectionListener(userMonthSelection, this));
		userMonthSelection.setEnabled(false);

		/**
		 * Create a JComboBox called userYearSelection that is passed
		 * years array of the string type declared earlier in the class
		 * to display the instructions for the combo box and two years
		 * 
		 * To this userYearSelection add an UserYearSelectionListener
		 * (an ItemListener) to perform an action when user selects an item in
		 * the JComoboBox.
		 * 
		 * Set the userYearSelection disabled because we do not
		 * want the user to select anything within the JComboBox unless
		 * it is related the question
		 */
		userYearSelection = new JComboBox(years);
		userYearSelection.addItemListener(
				new UserYearSelectionListener(userYearSelection, this));
		userYearSelection.setEnabled(false);

		/**
		 * Create a newJPanel called sixthPanel
		 * 
		 * This is the sixth panel in the program for the user to see and it
		 * holds the userCommunitySelection, userYearSeleciton,
		 * userCallCategorySelection and userMonthSeleciton
		 */
		sixthPanel = new JPanel();
		sixthPanel.add(userCommunitySelection);
		sixthPanel.add(userCallCategorySelection);
		sixthPanel.add(userMonthSelection);
		sixthPanel.add(userYearSelection);

		/**
		 * Create a JButton called getResultsButton
		 * 
		 * To the getResultsButton add a GetResultButtonListener to perform an
		 * action when the user clicks the button
		 * 
		 * Set the results button to be disabled because we do not want the user
		 * to select it till all the fields are selected in the program that are
		 * needed
		 */
		getResultsButton = new JButton();
		getResultsButton.setText("Get Results");
		getResultsButton.addActionListener(
				new GetResultButtonListener(getResultsButton, this));
		getResultsButton.setEnabled(false);

		/**
		 * Create a JButton called resetButton
		 * 
		 * To the resetButton add a ResetButtonListener to perform an
		 * action when the user clicks the button
		 */
		resetButton = new JButton();
		resetButton.setText("Reset");
		resetButton
				.addActionListener(new ResetButtonListener(resetButton, this));

		/**
		 * Create a newJPanel called seventhPanel
		 * 
		 * This is the seventh panel in the program for the user to see and it
		 * holds the resetButton and getResultsButton.
		 */
		seventhPanel = new JPanel();
		seventhPanel.add(resetButton);
		seventhPanel.add(getResultsButton);

		/**
		 * Create a new JPanel called eigthPanel
		 * 
		 * This is the eigthPanel in the program for the user to see and it
		 * holds the creatorSignature
		 */
		eigthPanel = new JPanel();
		eigthPanel.add(creatorSignature);

		/**
		 * Create a panelContainer and set its layout to be a grid layout
		 * 
		 * In this panelContainer add everyPanel created previously in order
		 */
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

		/**
		 * Set the layout of the JFrame to be a borderLayout and add the
		 * panelContainer (that holds the rest of the panels)
		 * the the center panel of the BorderLayout
		 */
		setLayout(new BorderLayout());
		add(panelContainer, BorderLayout.CENTER);

		/**
		 * Close the program when the user clicks the close button in the top
		 * left corner of the program
		 */
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		/**
		 * Show the Jframe window
		 */
		setVisible(true);

	}

	/**
	 * ResetProgram method that resets the program based on two cases:
	 * 
	 * 1: User clicks the reset button
	 * 2: User selects a new state after answering other fields
	 */
	public void resetProgram()
	{
		switch (resetCaseBasedOffScenario)
		{
			// Case for if the reset button is click
			case 1:
				// Set the userStateSelciton to be 0th index
				userStateSelection.setSelectedIndex(0);
				/**
				 * Set the userCitySelection to be disabled and the 0th index
				 * which is the default city selection instructions
				 */
				userCitySelection.setEnabled(false);
				userCitySelection.setSelectedIndex(0);
				/**
				 * Clear the groupOfIncidentTypeRadioButtons so that none are
				 * selected
				 */
				groupOfIncidentTypeRadioButtons.clearSelection();
				fireIncidentTypeRadioButton.setEnabled(false);
				policeIncidentRadioTypeButton.setEnabled(false);
				/**
				 * Set the userQuestionSelection to be disabled and the 0th
				 * index which is the default question selection instructions
				 */
				userQuestionSelection.setEnabled(false);
				userQuestionSelection.setSelectedIndex(0);
				/**
				 * Set the userCommunitySelection to be disabled and the 0th
				 * index which is the default community selection instructions
				 */
				userCommunitySelection.setEnabled(false);
				userCommunitySelection.setSelectedIndex(0);
				/**
				 * Set the userYearSelection to be disabled and the 0th
				 * index which is the default year selection instructions
				 */
				userYearSelection.setEnabled(false);
				userYearSelection.setSelectedIndex(0);
				/**
				 * Set the userYearSelection to be disabled and the 0th
				 * index which is the default month selection instructions
				 */
				userMonthSelection.setEnabled(false);
				userMonthSelection.setSelectedIndex(0);
				/**
				 * Set the userCallCategorySelection to be disabled and the 0th
				 * index which is the default call category selection
				 * instructions
				 */
				userCallCategorySelection.setEnabled(false);
				userCallCategorySelection.setSelectedIndex(0);
				/**
				 * Disabled the getResultsButton
				 */
				getResultsButton.setEnabled(false);
				break;

			// Case for if the userstateSelection is clicked again
			case 2:
				/**
				 * Set the userCitySelection to be the 0th index
				 * which is the default city selection instructions
				 */
				userCitySelection.setSelectedIndex(0);
				/**
				 * Clear the groupOfIncidentTypeRadioButtons so that none are
				 * selected
				 */
				groupOfIncidentTypeRadioButtons.clearSelection();
				fireIncidentTypeRadioButton.setEnabled(false);
				policeIncidentRadioTypeButton.setEnabled(false);
				/**
				 * Set the userQuestionSelection to be disabled and the 0th
				 * index which is the default question selection instructions
				 */
				userQuestionSelection.setEnabled(false);
				userQuestionSelection.setSelectedIndex(0);
				/**
				 * Set the userCommunitySelection to be disabled and the 0th
				 * index which is the default community selection instructions
				 */
				userCommunitySelection.setEnabled(false);
				userCommunitySelection.setSelectedIndex(0);
				/**
				 * Set the userYearSelection to be disabled and the 0th
				 * index which is the default year selection instructions
				 */
				userYearSelection.setEnabled(false);
				userYearSelection.setSelectedIndex(0);
				/**
				 * Set the userYearSelection to be disabled and the 0th
				 * index which is the default month selection instructions
				 */
				userMonthSelection.setEnabled(false);
				userMonthSelection.setSelectedIndex(0);
				/**
				 * Set the userCallCategorySelection to be disabled and the 0th
				 * index which is the default call category selection
				 * instructions
				 */
				userCallCategorySelection.setEnabled(false);
				userCallCategorySelection.setSelectedIndex(0);
				/**
				 * Disabled the getResultsButton
				 */
				getResultsButton.setEnabled(false);
				break;

		}

	}

	/**
	 * Get results method to get result related to the question the user chooses
	 * after they select the getResultsButton
	 */
	public void getResults()
	{

		/**
		 * Create a string called inputCommunity and it assign the selected
		 * community by the user and format it to a string
		 */
		String inputCommunity = userCommunitySelection.getSelectedItem()
				.toString();
		/**
		 * Create a string called inputCommunityWithoutLetters which is the
		 * inputCommuntiy selected by the user though deletes all the letters so
		 * it can be used by a method
		 */
		String inputCommunityWithoutLetters = inputCommunity
				.replaceAll("[^0-9]", "");

		/**
		 * Create a string called inputCommunityWithoutNumebrs which is the
		 * inputCommuntiy selected by the user though deletes all the numbers so
		 * it can be used for display
		 */
		String inputCommunityWithoutNumbers = inputCommunity
				.replaceAll("[^A-Za-z]", "");

		/**
		 * Create a string called inputYear and it assign the selected year
		 * by the user and format it to a string
		 */
		String inputYear = userYearSelection.getSelectedItem().toString();

		/**
		 * Create a string called inputMonth and it assign the selected month
		 * by the user and format it to a string
		 */
		String inputMonth = userMonthSelection.getSelectedItem().toString();

		/**
		 * Create a string called inputMonthWithoutLetters which is the
		 * inputMonth selected by the user though deletes all the letters so
		 * it can be used by a method
		 */
		String inputMonthWithoutLetters = inputMonth.replaceAll("[^0-9]", "");

		/**
		 * Create a string called inputMonthWithoutLetters which is the
		 * inputMonth selected by the user though deletes all the numbers so
		 * it can be used by for display
		 */
		String inputMonthWithoutNumbers = inputMonth.replaceAll("[^A-Za-z]",
				"");

		/**
		 * Create a string called inputCallCategory and it assign the
		 * selected callCategory by the user and format it to a string
		 */
		String inputCallCategory = userCallCategorySelection.getSelectedItem()
				.toString();

		// Create a new messagePanel
		messegePanel = new JPanel();

		switch (caseBasedOffOfSelection)
		{
			/**
			 * 
			 * Case 1 returns the result for the following question:
			 * 
			 * The number of crime incidents in a specified community
			 * on a given month and year
			 */
			case 1:
				/**
				 * Get the number of incidents the calling the method from the
				 * main class and passing the parameters needed for that class
				 */
				int counter = IncidentSortingMethods
						.countNumberOfCrimeIncidentsBasedOfZipCodeMonthYear(
								inputCommunityWithoutLetters,
								inputMonthWithoutLetters, inputYear);

				/**
				 * If number of incidents is zero then there there is not enough
				 * data to answer the quesiton so display that
				 */
				if (counter == 0)
				{
					JOptionPane.showMessageDialog(messegePanel,
							"Sorry there isnt enough data to answer this, try something different");
				}

				/**
				 * Otherwise show a message dialog with the results as a string
				 */
				else
				{
					JOptionPane.showMessageDialog(messegePanel,
							"There were " + counter + " crime incidents in "
									+ inputCommunityWithoutNumbers
									+ " for the month "
									+ inputMonthWithoutNumbers + " and year "
									+ inputYear);
				}
				break;

			/**
			 * Case 2 answers the following questions:
			 * 
			 */
			case 2:
				counter = IncidentSortingMethods
						.countNumberOfFireIncidentsBasedOfZipMonthYear(

								inputCommunityWithoutLetters,
								inputMonthWithoutLetters, inputYear);
				/**
				 * If number of incidents is zero then there there is not enough
				 * data to answer the quesiton so display that
				 */
				if (counter == 0)
				{
					JOptionPane.showMessageDialog(messegePanel,
							"Sorry there isnt enough data to answer this, try something different");
				}
				/**
				 * Otherwise show a message dialog with the results as a string
				 */
				else
				{

					JOptionPane.showMessageDialog(messegePanel,
							"There are" + counter + "fire incidents in "
									+ inputCommunityWithoutNumbers + "in "
									+ inputMonthWithoutNumbers + inputYear);

				}
				break;

			/**
			 * Case 3 answers the following questions:
			 * 
			 */
			case 3:
				counter = IncidentSortingMethods
						.countNumberOfFireIncidentTypeForAGivenYear(inputYear,
								inputCallCategory);
				/**
				 * If number of incidents is zero then there there is not enough
				 * data to answer the quesiton so display that
				 */
				if (counter == 0)
				{
					JOptionPane.showMessageDialog(messegePanel,
							"Sorry there isnt enough data to answer this, try something different");
				}
				/**
				 * Otherwise show a message dialog with the results as a string
				 */
				else
				{
					JOptionPane.showMessageDialog(messegePanel,
							"There were " + counter + inputCallCategory
									+ " incidents in " + inputYear);
				}
				break;
		}

	}

	/**
	 * CheckToUpdateGetResultsButton method based on the question selected by
	 * the user and if the additional JComboBoxes for that questions are
	 * selected
	 */
	public void checkToUpdateGetResultsButton()
	{
		/**
		 * For the question : ""
		 * 
		 * Check if the needed JComboCoxes for the question are selected and
		 * are not the instructions
		 * 
		 * If so then set the case BasedOffOfSelection to be 1 (for when the
		 * getResults button method is called) and enable the getResults Button
		 */
		if (policeIncidentRadioTypeButton.isSelected() && userCommunitySelection
				.getSelectedItem() != userCommunitySelection.getItemAt(0)
				&& userMonthSelection.getSelectedItem() != userMonthSelection
						.getItemAt(0)
				&& userYearSelection.getSelectedItem() != userYearSelection
						.getItemAt(0))
		{
			/**
			 * Set the case BasedOffOfSelection to be 1 (for when the getResults
			 * button method is called)
			 */
			caseBasedOffOfSelection = 1;
			getResultsButton.setEnabled(true);
		}

		/**
		 * If its not for the first question then it may be for this question
		 * 
		 * Question : "The number of fire incidents for a specific community on
		 * a given month and year"
		 * 
		 * Check if the needed JComboCoxes for the question are selected and
		 * are not the instructions
		 * 
		 * If so then set the case BasedOffOfSelection to be 2 (for when the
		 * getResults button method is called) and enable the getResults Button
		 */
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

		/**
		 * If its not for the second question then it may be for this question
		 * 
		 * Question : "The number of fire incidents for a specific call category
		 * on a given year"
		 * 
		 * Check if the needed JComboCoxes for the question are selected and
		 * are not the instructions
		 * 
		 * If so then set the case BasedOffOfSelection to be 3 (for when the
		 * getResults button method is called) and enable the getResults Button
		 */
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
		// Try to create a new MainProgramView
		try
		{
			new MainProgramView();
		}
		/**
		 * Catch any exceptions that are thrown and display a message that
		 * something is wrong and the exception that was thrown
		 */
		catch (Exception e)
		{
			JOptionPane errorMessagePanel = new JOptionPane();
			JOptionPane.showMessageDialog(errorMessagePanel,
					"Woah there is seriously something wrong with your program"
							+ e.toString());
		}

	}
}
