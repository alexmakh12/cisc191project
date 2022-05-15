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
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class MainProgramView extends JFrame
{
	JLabel firstProgramInstructions;
	JLabel secondProgramInstructions;
	JLabel thirdProgramInstructions;
	JLabel creatorSignature;
	JComboBox userStateSelection;
	JComboBox userCitySelection;
	JComboBox userQuestionSelection;
	JComboBox userCommunitySelection;
	JComboBox userCallCategorySelection;
	JComboBox userYearSelection;
	JComboBox userMonthSelection;
	JPanel panelContainer;
	JPanel firstPanel;
	JPanel secondPanel;
	JPanel thirdPanel;
	JPanel fourthPanel;
	JPanel fifthPanel;
	JPanel sixthPanel;
	JPanel seventhPanel;
	JPanel eigthPanel;
	JRadioButton fireIncidetTypeRadioButton;
	JRadioButton policeIncidentRadioTypeButton;
	JRadioButton policeAndFireIncidenTypeRadioButton;
	JButton getResultsButton;
	JButton resetButton;

	String[] states = { "Select a State", "California", };
	String[] cities = { "Select a City", "San Diego" };
	String[] defaultUserQuesiton = { "Select Incident Type" };
	String[] month = { "Select a Date" };
	String[] year = { "Select a Year" };
	String[] callCategory = { "Select a Call Category" };
	String[] community = { "Select a Community" };

	public MainProgramView()
	{

		setTitle("Police and Fire Data Parser");

		setSize(700, 500);

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

		userStateSelection = new JComboBox(states);
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

		fireIncidetTypeRadioButton = new JRadioButton("Fire");
		fireIncidetTypeRadioButton.setEnabled(false);
		fireIncidetTypeRadioButton.addActionListener(
				new FireRadioButtonListener(fireIncidetTypeRadioButton, this));
		policeIncidentRadioTypeButton = new JRadioButton("Police");
		policeIncidentRadioTypeButton.setEnabled(false);
		policeIncidentRadioTypeButton.addActionListener(
				new PoliceRadioButtonListener(policeIncidentRadioTypeButton, this));
		policeAndFireIncidenTypeRadioButton = new JRadioButton("Police And Fire");
		policeAndFireIncidenTypeRadioButton.setEnabled(false);
		ButtonGroup group = new ButtonGroup();
		group.add(policeAndFireIncidenTypeRadioButton);
		group.add(fireIncidetTypeRadioButton);
		group.add(policeIncidentRadioTypeButton);

		fourthPanel = new JPanel();
		fourthPanel.add(fireIncidetTypeRadioButton);
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
		userCommunitySelection.setEnabled(false);
		userCallCategorySelection = new JComboBox(callCategory);
		userCallCategorySelection.setEnabled(false);
		userMonthSelection = new JComboBox(month);
		userMonthSelection.setEnabled(false);
		userYearSelection = new JComboBox(year);
		userYearSelection.setEnabled(false);
		sixthPanel.add(userCommunitySelection);
		sixthPanel.add(userCallCategorySelection);
		sixthPanel.add(userMonthSelection);
		sixthPanel.add(userYearSelection);

		seventhPanel = new JPanel();
		getResultsButton = new JButton();
		getResultsButton.setText("Get Results");
		resetButton = new JButton();
		resetButton.setText("Reset");
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

	public static void main(String[] args)
	{
		new MainProgramView();
	}

}
