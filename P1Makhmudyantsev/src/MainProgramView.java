import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class MainProgramView extends JFrame
{
	JLabel programInstructions;
	JComboBox userStateSelection;
	JComboBox CirtSelection;
	
	JPanel firstPanel;
	JPanel secondPanel;
	JPanel thirdPanel;
	JPanel fourthPanel;
	JPanel fifthPanel;
	JPanel sixthPanel;
	JRadioButton fireButton;
	JRadioButton policeButton;
	JRadioButton fireAndPoliceButton;
	
	String[] States = {"California", "Nevada", "Utah", "Washington"};
	String[] Cities = {"San Diego", "Sacramento"};
	String[] Questions = {"@","!","?"};
	
	
	
	
	public MainProgramView() {
		
		setTitle("Police and Fire Data Parser");
		
		setSize(700,500);
		
		programInstructions = new JLabel();
		programInstructions.setText("<First Instruction ; fill later>");
		programInstructions.setFont(new Font("Tahoma", Font.BOLD, 15));
		programInstructions.setAlignmentX(Component.CENTER_ALIGNMENT);
		programInstructions.setAlignmentY(Component.CENTER_ALIGNMENT);
		
		JLabel secondProgramInstructions = new JLabel();
		secondProgramInstructions.setText("<Second Instruction ; fill later>");
		secondProgramInstructions.setFont(new Font("Tahoma", Font.BOLD, 15));
		secondProgramInstructions.setAlignmentX(Component.CENTER_ALIGNMENT);
		secondProgramInstructions.setAlignmentY(Component.CENTER_ALIGNMENT);
		
		
		JComboBox userStateSelection = new JComboBox(States);
		userStateSelection.setSize(1,10);
		
		JComboBox userCitySelection = new JComboBox(Cities);
		userCitySelection.setSize(1,5);
		
		secondPanel = new JPanel();
		secondPanel.add(userStateSelection);
		secondPanel.add(userCitySelection);
		secondPanel.setBackground(Color.GREEN);
		
		firstPanel = new JPanel();
		firstPanel.setLayout(new BoxLayout(firstPanel, BoxLayout.PAGE_AXIS));
		firstPanel.add(programInstructions);
		firstPanel.add(secondPanel);
		firstPanel.setBackground(Color.GRAY);
		
		fourthPanel = new JPanel();
		fourthPanel.add(secondProgramInstructions);	
		fourthPanel.setBackground(Color.CYAN);
		
		fireButton = new JRadioButton("Fire");
		policeButton = new JRadioButton("Police");
		fireAndPoliceButton = new JRadioButton("Police And Fire");
		ButtonGroup group = new ButtonGroup();
		group.add(fireAndPoliceButton);
		group.add(fireButton);
		group.add(policeButton);
		
		fifthPanel = new JPanel();
		fifthPanel.setBackground(Color.PINK);
		fifthPanel.add(fireButton);
		fifthPanel.add(policeButton);
		fifthPanel.add(fireAndPoliceButton);
		
		
		thirdPanel = new JPanel();
		thirdPanel.setLayout(new BoxLayout(thirdPanel, BoxLayout.PAGE_AXIS));
		JComboBox userQuestionSelection = new JComboBox(Questions);
		thirdPanel.add(userQuestionSelection);
		thirdPanel.add(fourthPanel);
		thirdPanel.add(fifthPanel);
		thirdPanel.setBackground(Color.RED);
		
		
		
		
		
		
		setLayout(new BorderLayout());
		add(firstPanel, BorderLayout.NORTH);
		add(thirdPanel, BorderLayout.CENTER);
//		add(bottomPanel, BorderLayout.SOUTH);
//		add(leftPanel, BorderLayout.WEST);
		// Closes the window
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// Makes the window visible
		setVisible(true);
		
	}
	
	public static void main(String[] args)
	{
		new MainProgramView();
	}
	

}
