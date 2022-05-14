import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
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
	JLabel creatorSignature;
	JComboBox userStateSelection;
	JComboBox CirtSelection;
	
	JPanel panelContainer;
	JPanel firstPanel;
	JPanel secondPanel;
	JPanel thirdPanel;
	JPanel fourthPanel;
	JPanel fifthPanel;
	JPanel sixthPanel;
	JPanel seventhPanel;
	JPanel eigthPanel;
	JRadioButton fireButton;
	JRadioButton policeButton;
	JRadioButton fireAndPoliceButton;
	JButton getResultsButton;
	
	String[] States = {"California", "Nevada", "Utah", "Washington"};
	String[] Cities = {"San Diego", "Sacramento"};
	String[] Questions = {"@","!","?"};
	
	
	
	
	public MainProgramView() {
		
		setTitle("Police and Fire Data Parser");
		
		setSize(700,500);
		
		firstProgramInstructions = new JLabel();
		firstProgramInstructions.setText("<First Instruction ; fill later>");
		firstProgramInstructions.setFont(new Font("Tahoma", Font.BOLD, 15));
		firstProgramInstructions.setAlignmentX(Component.CENTER_ALIGNMENT);
		firstProgramInstructions.setAlignmentY(Component.CENTER_ALIGNMENT);
		
		secondProgramInstructions = new JLabel();
		secondProgramInstructions.setText("<Second Instruction ; fill later>");
		secondProgramInstructions.setFont(new Font("Tahoma", Font.BOLD, 15));
		secondProgramInstructions.setAlignmentX(Component.CENTER_ALIGNMENT);
		secondProgramInstructions.setAlignmentY(Component.CENTER_ALIGNMENT);
		
		creatorSignature = new JLabel();
		creatorSignature.setText("Created by Alexandre Makhmudyantsev");
		creatorSignature.setFont(new Font("Tahoma", Font.BOLD, 15));
		creatorSignature.setAlignmentX(Component.CENTER_ALIGNMENT);
		creatorSignature.setAlignmentY(Component.CENTER_ALIGNMENT);
		
		
		firstPanel = new JPanel();
		firstPanel.add(firstProgramInstructions);
		
		JComboBox userStateSelection = new JComboBox(States);
		userStateSelection.setSize(1,10);
		
		JComboBox userCitySelection = new JComboBox(Cities);
		userCitySelection.setSize(1,5);
		
		secondPanel = new JPanel();
		secondPanel.add(userStateSelection);
		secondPanel.add(userCitySelection);
		
		
		thirdPanel = new JPanel();
		thirdPanel.add(secondProgramInstructions);
		
		JComboBox userQuestionSelection = new JComboBox(Questions);
		
		fourthPanel = new JPanel();
		fourthPanel.add(userQuestionSelection);	

		
		fireButton = new JRadioButton("Fire");
		policeButton = new JRadioButton("Police");
		fireAndPoliceButton = new JRadioButton("Police And Fire");
		ButtonGroup group = new ButtonGroup();
		group.add(fireAndPoliceButton);
		group.add(fireButton);
		group.add(policeButton);
		
		fifthPanel = new JPanel();
			fifthPanel.add(fireButton);
			fifthPanel.add(policeButton);
			fifthPanel.add(fireAndPoliceButton);

		
		sixthPanel = new JPanel();
		JComboBox userCommunitySelection = new JComboBox(Cities);
		JComboBox userCallCategorySelection = new JComboBox(Cities);
		JComboBox userMonthSelection = new JComboBox(Cities);
		JComboBox userYearSelection = new JComboBox(Cities);
		sixthPanel.add(userCommunitySelection);
		sixthPanel.add(userCallCategorySelection);
		sixthPanel.add(userMonthSelection);
		sixthPanel.add(userYearSelection);
		
		seventhPanel = new JPanel();	
		getResultsButton = new JButton();
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

		// Makes the window visible
		setVisible(true);
		
	}
	
	public static void main(String[] args)
	{
		new MainProgramView();
	}
	

}
