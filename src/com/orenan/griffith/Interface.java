package com.orenan.griffith;
import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Date;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.CardLayout;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class Interface {

	private JFrame frame;
	private JTextField machineID;
	private JTextField engineerID;
	private JTextField date;
	private JTextField comments;
	private JTextField itemsUsed;
	private JTextField timeSpent;
	private JTextField due;
	private JTextField machineDescriptionTxt;
	private JTextField purchaseDateTxt;
	private JTextField yearFrequencyTxt;
	private JTextField machineNameTxt;
	private JTextField engineerNameTxt;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Interface window = new Interface();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Interface() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		//Creating frame.
		frame = new JFrame();
		frame.setBounds(100, 100, 365, 498);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new BorderLayout(0, 0));
		
		//Creating cardLayout parent panel.
		JPanel parentCard = new JPanel();
		frame.getContentPane().add(parentCard, BorderLayout.CENTER);
		parentCard.setLayout(new CardLayout(0, 0));
		
		//Creating new instance of cardlayout taking the parentCard as argument.
		CardLayout cardLayout = (CardLayout)(parentCard.getLayout());
		
		//Creating cardPanel.
		JPanel mainScreenCard = new JPanel();
		parentCard.add(mainScreenCard, "mainScreenCard");
		mainScreenCard.setLayout(new CardLayout(0, 0));
		
		//Panel to hold the elements freeflow.
		JPanel mainScreen = new JPanel();
		mainScreenCard.add(mainScreen, "name_302327220846316");
		mainScreen.setBackground(new Color(49, 49, 49));
		mainScreen.setLayout(null);
		
		//ScrollPane and textField to roll through the notifications (if any).
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(0, 41, 365, 167);
		scrollPane.setViewportBorder(null);
		scrollPane.setBackground(new Color(49,49,49,0));
		mainScreen.add(scrollPane);
		JTextArea warningArea = new JTextArea();
		warningArea.setText(" Lorem ipsum dolor sit amet, consectetur adipiscing elit. Proin dignissim, dui quis molestie posuere, erat tellus varius felis, non pellentesque turpis sapien non odio. Aenean a ligula convallis, aliquet mi placerat, hendrerit odio. Ut eu lectus purus. Suspendisse at libero commodo, condimentum elit in, rutrum lectus. Vivamus vehicula lectus nec justo commodo porta. Praesent rhoncus ex metus. Curabitur sit amet accumsan quam, in ultrices erat. Quisque blandit pharetra sem, nec feugiat augue ultricies ut. Aliquam erat volutpat.\n\nMauris risus nisi, convallis dapibus aliquam sit amet, cursus non purus. Donec auctor sapien sit amet nibh pretium, vulputate interdum turpis posuere. Nullam aliquam fringilla urna laoreet tempus. Nulla sed est non enim eleifend luctus. Duis non dignissim quam. Quisque id mattis tellus, non vulputate velit. Donec tincidunt vulputate est, a fermentum magna gravida ac. Curabitur mauris ligula, dignissim sit amet suscipit sit amet, porttitor et nunc.\n\nSed sit amet magna ex. Nunc cursus purus in interdum eleifend. Proin laoreet tortor neque, pharetra fermentum purus ultrices id. Curabitur dolor metus, lacinia sit amet elementum vel, interdum eget erat. Curabitur lobortis, tortor sed faucibus lacinia, purus nisi feugiat elit, ac sodales ante justo eget nunc. Integer dapibus quis nibh nec hendrerit. Sed sit amet felis nec tortor pretium vulputate. Fusce luctus egestas orci, id suscipit erat porta id. Nunc nisi nibh, fermentum eu dapibus non, sagittis sed urna.\n\nCurabitur ultricies augue in sagittis fringilla. Curabitur euismod sem nec lectus rhoncus euismod. Aenean tristique consequat massa, sit amet pulvinar arcu mollis a. Morbi sollicitudin at dolor a dictum. Nullam quis ipsum eu ligula aliquam fermentum. Fusce ut sagittis magna. Curabitur fringilla ipsum at nunc luctus, ut congue elit interdum. Donec ac felis eu nunc maximus porttitor. Duis tincidunt tellus in tincidunt pellentesque. Sed consectetur aliquam massa, ut fringilla tortor tempor vitae. Mauris nisi augue, sagittis sed sem sit amet, faucibus ullamcorper nisi. Vestibulum egestas velit id ultricies posuere. Nunc a mi augue. Nunc ante est, commodo ut mollis sit amet, auctor eget lectus. Maecenas vel urna eu tellus venenatis porta. ");
		warningArea.setEditable(false);
		warningArea.setBackground(new Color(49, 49, 49, 0));
		warningArea.setLineWrap(true);
		scrollPane.setViewportView(warningArea);
		
		//Button to register new engineer.
		JButton button = new JButton("Register New Engineer");
		button.setBounds(0, 346, 179, 127);
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cardLayout.show(parentCard, "newEngineerScreenCard");
			}
		});
		button.setBackground(new Color(255, 69, 0));
		mainScreen.add(button);
		
		//Button to add new service record.
		JButton btnAddAService = new JButton("Add a service record");
		btnAddAService.setBounds(0, 208, 179, 139);
		btnAddAService.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cardLayout.show(parentCard, "newServiceScreenCard");
				
			}
		});
		btnAddAService.setBackground(new Color(255, 69, 0));
		mainScreen.add(btnAddAService);
		
		//Button to check previously added records.
		JButton btnCheckRecords = new JButton("Check Records");
		btnCheckRecords.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnCheckRecords.setBounds(178, 346, 187, 127);
		btnCheckRecords.setBackground(new Color(255, 69, 0));
		mainScreen.add(btnCheckRecords);
		
		//Button to add new machine.
		JButton newMachine = new JButton("Register New Machine");
		newMachine.setBounds(178, 208, 187, 139);
		newMachine.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cardLayout.show(parentCard, "newMachineScreenCard");
			}
		});
		newMachine.setBackground(new Color(255, 69, 0));
		mainScreen.add(newMachine);
		
		//Panel to a different color in the header.
		JPanel panel_3 = new JPanel();
		panel_3.setBounds(0, 0, 365, 41);
		panel_3.setBackground(new Color(178, 34, 34));
		mainScreen.add(panel_3);
		panel_3.setLayout(null);
		
		//Label for header.
		JLabel lblMachineMainteinenceControl = new JLabel("MACHINE MAINTANENCE CONTROL");
		lblMachineMainteinenceControl.setBounds(13, 6, 346, 23);
		panel_3.add(lblMachineMainteinenceControl);
		lblMachineMainteinenceControl.setForeground(new Color(49, 49, 49));
		lblMachineMainteinenceControl.setFont(new Font("Arial", Font.PLAIN, 19));
		
		//Creating cardPanel.
		JPanel newServiceScreenCard = new JPanel();
		parentCard.add(newServiceScreenCard, "newServiceScreenCard");
		newServiceScreenCard.setLayout(new CardLayout(0, 0));
		
		//Creating freeflow panel.
		JPanel newServiceScreen = new JPanel();
		newServiceScreenCard.add(newServiceScreen, "name_302366922709631");
		newServiceScreen.setBackground(new Color(49, 49, 49));
		newServiceScreen.setLayout(null);
		
		//Textfield for data input.
		machineID = new JTextField();
		machineID.setForeground(new Color(0, 0, 128));
		machineID.setBackground(new Color(192, 192, 192));
		machineID.setBounds(125, 68, 198, 34);
		newServiceScreen.add(machineID);
		machineID.setColumns(10);
		
		//Panel to a different header color.
		JPanel panel_4 = new JPanel();
		panel_4.setLayout(null);
		panel_4.setBackground(new Color(178, 34, 34));
		panel_4.setBounds(0, 0, 365, 41);
		newServiceScreen.add(panel_4);
		
		//Header label.
		JLabel lblAddAService = new JLabel("ADD A SERVICE RECORD");
		lblAddAService.setForeground(new Color(49, 49, 49));
		lblAddAService.setFont(new Font("Arial", Font.PLAIN, 19));
		lblAddAService.setBounds(83, 6, 238, 23);
		panel_4.add(lblAddAService);
		
		//Textfield for data input.
		engineerID = new JTextField();
		engineerID.setForeground(new Color(0, 0, 128));
		engineerID.setColumns(10);
		engineerID.setBackground(Color.LIGHT_GRAY);
		engineerID.setBounds(125, 102, 198, 34);
		newServiceScreen.add(engineerID);
		
		//Textfield for data input.
		date = new JTextField();
		date.setForeground(new Color(0, 0, 128));
		date.setColumns(10);
		date.setBackground(Color.LIGHT_GRAY);
		date.setBounds(125, 138, 198, 34);
		newServiceScreen.add(date);
		
		//Textfield for data input.
		comments = new JTextField();
		comments.setForeground(new Color(0, 0, 128));
		comments.setColumns(10);
		comments.setBackground(Color.LIGHT_GRAY);
		comments.setBounds(125, 174, 198, 34);
		newServiceScreen.add(comments);
		
		//Textfield for data input.
		itemsUsed = new JTextField();
		itemsUsed.setForeground(new Color(0, 0, 128));
		itemsUsed.setColumns(10);
		itemsUsed.setBackground(Color.LIGHT_GRAY);
		itemsUsed.setBounds(125, 313, 198, 34);
		newServiceScreen.add(itemsUsed);
		
		//Textfield for data input.
		timeSpent = new JTextField();
		timeSpent.setForeground(new Color(0, 0, 128));
		timeSpent.setColumns(10);
		timeSpent.setBackground(Color.LIGHT_GRAY);
		timeSpent.setBounds(125, 277, 198, 34);
		newServiceScreen.add(timeSpent);
		
		//Textfield for data input.
		due = new JTextField();
		due.setForeground(new Color(0, 0, 128));
		due.setColumns(10);
		due.setBackground(Color.LIGHT_GRAY);
		due.setBounds(125, 241, 198, 34);
		newServiceScreen.add(due);
		
		//Label of data input.
		JLabel lblMachineid = new JLabel("Machine ID");
		lblMachineid.setHorizontalAlignment(SwingConstants.RIGHT);
		lblMachineid.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		lblMachineid.setForeground(new Color(178, 34, 34));
		lblMachineid.setBounds(6, 77, 107, 16);
		newServiceScreen.add(lblMachineid);
		
		//Label of data input.
		JLabel lblEngineerid = new JLabel("Engineer ID");
		lblEngineerid.setHorizontalAlignment(SwingConstants.RIGHT);
		lblEngineerid.setForeground(new Color(178, 34, 34));
		lblEngineerid.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		lblEngineerid.setBounds(6, 111, 107, 16);
		newServiceScreen.add(lblEngineerid);
		
		//Label of data input.
		JLabel lblServicedate = new JLabel("Date");
		lblServicedate.setHorizontalAlignment(SwingConstants.RIGHT);
		lblServicedate.setForeground(new Color(178, 34, 34));
		lblServicedate.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		lblServicedate.setBounds(6, 147, 107, 16);
		newServiceScreen.add(lblServicedate);
		
		//Label of data input.
		JLabel lblComments = new JLabel("Comments");
		lblComments.setHorizontalAlignment(SwingConstants.RIGHT);
		lblComments.setForeground(new Color(178, 34, 34));
		lblComments.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		lblComments.setBounds(6, 183, 107, 16);
		newServiceScreen.add(lblComments);
		
		//Label of data input.
		JLabel lblWeekDay = new JLabel("Week Day");
		lblWeekDay.setHorizontalAlignment(SwingConstants.RIGHT);
		lblWeekDay.setForeground(new Color(178, 34, 34));
		lblWeekDay.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		lblWeekDay.setBounds(6, 216, 107, 16);
		newServiceScreen.add(lblWeekDay);
		
		//Data input dropdown.
		JComboBox weekDay = new JComboBox();
		weekDay.setForeground(new Color(178, 34, 34));
		weekDay.setBackground(new Color(192, 192, 192));
		weekDay.setModel(new DefaultComboBoxModel(new String[] {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"}));
		weekDay.setBounds(125, 211, 198, 27);
		newServiceScreen.add(weekDay);
		
		//Label of data input.
		JLabel lblDue = new JLabel("Due");
		lblDue.setHorizontalAlignment(SwingConstants.RIGHT);
		lblDue.setForeground(new Color(178, 34, 34));
		lblDue.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		lblDue.setBounds(6, 250, 107, 16);
		newServiceScreen.add(lblDue);
		
		//Label of data input.
		JLabel lblTimeSpent = new JLabel("Time Spent");
		lblTimeSpent.setHorizontalAlignment(SwingConstants.RIGHT);
		lblTimeSpent.setForeground(new Color(178, 34, 34));
		lblTimeSpent.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		lblTimeSpent.setBounds(6, 286, 107, 16);
		newServiceScreen.add(lblTimeSpent);
		
		//Label of data input.
		JLabel lblItemsUsed = new JLabel("Items Used");
		lblItemsUsed.setHorizontalAlignment(SwingConstants.RIGHT);
		lblItemsUsed.setForeground(new Color(178, 34, 34));
		lblItemsUsed.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		lblItemsUsed.setBounds(6, 322, 107, 16);
		newServiceScreen.add(lblItemsUsed);
		
		//Label of data input.
		JLabel lblWasCritical = new JLabel("Was Critical");
		lblWasCritical.setHorizontalAlignment(SwingConstants.RIGHT);
		lblWasCritical.setForeground(new Color(178, 34, 34));
		lblWasCritical.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		lblWasCritical.setBounds(6, 359, 107, 16);
		newServiceScreen.add(lblWasCritical);
		
		//Data input dropdown.
		JComboBox wasCritical = new JComboBox();
		wasCritical.setModel(new DefaultComboBoxModel(new String[] {"", "YES", "NO"}));
		wasCritical.setForeground(new Color(178, 34, 34));
		wasCritical.setBackground(Color.LIGHT_GRAY);
		wasCritical.setBounds(125, 356, 198, 27);
		newServiceScreen.add(wasCritical);
		
		//Back to home page button.
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cardLayout.show(parentCard, "mainScreenCard");
			}
		});
		btnBack.setBounds(64, 399, 119, 59);
		newServiceScreen.add(btnBack);
		
		//Button to submit the service.
		JButton btnAddService = new JButton("Add Service");
		btnAddService.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
//				try {
				//Getting the values from the fields and assigning them to variables (conversions made when necessary).
					int mchID = Integer.parseInt(machineID.getText());
					int engID = Integer.parseInt(engineerID.getText());
					String svcDateStr = date.getText();
					Date svcDate = Date.valueOf(svcDateStr);  //Converted from String to Date.
					String cmts = comments.getText();
					String dayService = (String)weekDay.getSelectedItem();
					String dueDateStr = due.getText();
					Date dueDate = Date.valueOf(dueDateStr); //Converted from String to Date.
					String timeSpentOn = timeSpent.getText();
					String usedItems = itemsUsed.getText();
					int critical = 0;
					if((String)wasCritical.getSelectedItem() == "YES"){
						critical = 1;
					}else{
						critical = 0;
					}
				
//					System.out.println(mchID + " " + engID+ " " + svcDate+ " " + cmts+ " " +dayService+ " " + dueDate+ " " + timeSpentOn+ " " + usedItems+ " " + critical);
					
					//Creating a new Service instance called 'Register'.
					Service Register = new Service(mchID, engID, svcDate, cmts, dayService, dueDate, timeSpentOn, usedItems, critical);
					
					//Calling method that returns a String of the object.
					System.out.println(Register.displayObj());
					
					Register.newRegister();
					
//				}catch (Exception a) {
//					System.out.println(a);
//				}
			}
		});
		btnAddService.setBounds(183, 399, 119, 59);
		newServiceScreen.add(btnAddService);
		
		//Creating cardPanel.
		JPanel newMachineScreenCard = new JPanel();
		parentCard.add(newMachineScreenCard, "newMachineScreenCard");
		newMachineScreenCard.setLayout(new CardLayout(0, 0));
		
		//Panel to hold the elements freeflow.
		JPanel newMachineScreen = new JPanel();
		newMachineScreen.setBackground(new Color(49, 49, 49));
		newMachineScreenCard.add(newMachineScreen, "name_344508641740224");
		newMachineScreen.setLayout(null);
		
		//Panel to have a different colour at the header.
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBackground(new Color(178, 34, 34));
		panel.setBounds(0, 0, 365, 41);
		newMachineScreen.add(panel);
		
		//Label for input.
		JLabel lblRegisterMachine = new JLabel("REGISTER NEW MACHINE");
		lblRegisterMachine.setHorizontalAlignment(SwingConstants.CENTER);
		lblRegisterMachine.setForeground(new Color(49, 49, 49));
		lblRegisterMachine.setFont(new Font("Arial", Font.PLAIN, 19));
		lblRegisterMachine.setBounds(13, 6, 346, 23);
		panel.add(lblRegisterMachine);
		
		//Label for input.
		JLabel lblMachineDescription = new JLabel("Machine Description");
		lblMachineDescription.setHorizontalAlignment(SwingConstants.RIGHT);
		lblMachineDescription.setForeground(new Color(178, 34, 34));
		lblMachineDescription.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		lblMachineDescription.setBounds(0, 99, 158, 16);
		newMachineScreen.add(lblMachineDescription);
		
		//Textfield for input. 
		machineDescriptionTxt = new JTextField();
		machineDescriptionTxt.setForeground(new Color(0, 0, 128));
		machineDescriptionTxt.setColumns(10);
		machineDescriptionTxt.setBackground(Color.LIGHT_GRAY);
		machineDescriptionTxt.setBounds(164, 93, 198, 34);
		newMachineScreen.add(machineDescriptionTxt);
		
		//Label for input.
		JLabel lblCurrentlyWorking = new JLabel("Currently Working");
		lblCurrentlyWorking.setHorizontalAlignment(SwingConstants.RIGHT);
		lblCurrentlyWorking.setForeground(new Color(178, 34, 34));
		lblCurrentlyWorking.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		lblCurrentlyWorking.setBounds(6, 182, 152, 16);
		newMachineScreen.add(lblCurrentlyWorking);
		
		//Dropdown for input.
		JComboBox isActiveTxt = new JComboBox();
		isActiveTxt.setModel(new DefaultComboBoxModel(new String[] {"", "YES", "NO"}));
		isActiveTxt.setForeground(new Color(178, 34, 34));
		isActiveTxt.setBackground(Color.LIGHT_GRAY);
		isActiveTxt.setBounds(167, 179, 198, 27);
		newMachineScreen.add(isActiveTxt);
		
		//Textfield for input.
		purchaseDateTxt = new JTextField();
		purchaseDateTxt.setForeground(new Color(0, 0, 128));
		purchaseDateTxt.setColumns(10);
		purchaseDateTxt.setBackground(Color.LIGHT_GRAY);
		purchaseDateTxt.setBounds(164, 136, 198, 34);
		newMachineScreen.add(purchaseDateTxt);
		
		//Label for input.
		JLabel lblPurchaseDate = new JLabel("Purchase Date");
		lblPurchaseDate.setHorizontalAlignment(SwingConstants.RIGHT);
		lblPurchaseDate.setForeground(new Color(178, 34, 34));
		lblPurchaseDate.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		lblPurchaseDate.setBounds(0, 142, 158, 16);
		newMachineScreen.add(lblPurchaseDate);
		
		//Textfield for input.
		yearFrequencyTxt = new JTextField();
		yearFrequencyTxt.setForeground(new Color(0, 0, 128));
		yearFrequencyTxt.setColumns(10);
		yearFrequencyTxt.setBackground(Color.LIGHT_GRAY);
		yearFrequencyTxt.setBounds(167, 211, 198, 34);
		newMachineScreen.add(yearFrequencyTxt);
		
		//Label for input.
		JLabel lblYearServiceFrequency = new JLabel("Year Service Frequency");
		lblYearServiceFrequency.setHorizontalAlignment(SwingConstants.LEFT);
		lblYearServiceFrequency.setForeground(new Color(178, 34, 34));
		lblYearServiceFrequency.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		lblYearServiceFrequency.setBounds(3, 219, 169, 16);
		newMachineScreen.add(lblYearServiceFrequency);
		
		JButton backBtn = new JButton("Back");
		backBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cardLayout.show(parentCard, "mainScreenCard");
			}
		});
		backBtn.setBounds(30, 284, 119, 59);
		newMachineScreen.add(backBtn);
		
		machineNameTxt = new JTextField();
		machineNameTxt.setForeground(new Color(0, 0, 128));
		machineNameTxt.setColumns(10);
		machineNameTxt.setBackground(Color.LIGHT_GRAY);
		machineNameTxt.setBounds(164, 53, 198, 34);
		newMachineScreen.add(machineNameTxt);
		
		JLabel lblMachineName = new JLabel("Machine Name");
		lblMachineName.setHorizontalAlignment(SwingConstants.RIGHT);
		lblMachineName.setForeground(new Color(178, 34, 34));
		lblMachineName.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		lblMachineName.setBounds(0, 59, 158, 16);
		newMachineScreen.add(lblMachineName);
	
		
		JComboBox essentialSelect = new JComboBox();
		essentialSelect.setModel(new DefaultComboBoxModel(new String[] {"", "YES", "NO"}));
		essentialSelect.setForeground(new Color(178, 34, 34));
		essentialSelect.setBackground(Color.LIGHT_GRAY);
		essentialSelect.setBounds(164, 245, 198, 27);
		newMachineScreen.add(essentialSelect);
		
		JLabel lblEssentialMachine = new JLabel("Essential Machine");
		lblEssentialMachine.setHorizontalAlignment(SwingConstants.RIGHT);
		lblEssentialMachine.setForeground(new Color(178, 34, 34));
		lblEssentialMachine.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		lblEssentialMachine.setBounds(13, 248, 152, 16);
		newMachineScreen.add(lblEssentialMachine);
		
		JButton btnAddMachine = new JButton("Add Machine");
		btnAddMachine.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Add Machine Button
				String mchName = machineNameTxt.getText(); 
				String mchDesc = machineDescriptionTxt.getText();
				Date buyDate = Date.valueOf(purchaseDateTxt.getText());
				int active = 0;
				if ((String)isActiveTxt.getSelectedItem() == "YES") {
					active = 1;
				}else {
					active = 0;
				}
				int svcFreq = Integer.parseInt(yearFrequencyTxt.getText());
				int flagSeveral = 0;
				if ((String)essentialSelect.getSelectedItem() == "YES") {
					flagSeveral = 1;
				}else {
					flagSeveral = 0;
				}
				
				Machine machine = new Machine(mchName, mchDesc, buyDate, active, svcFreq, flagSeveral);
				System.out.println(machine.displayObj());
				machine.newRegister();
			}
		});
		btnAddMachine.setBounds(203, 284, 119, 59);
		newMachineScreen.add(btnAddMachine);
		
		JPanel newEngineerScreenCard = new JPanel();
		newEngineerScreenCard.setForeground(new Color(0, 0, 0));
		parentCard.add(newEngineerScreenCard, "newEngineerScreenCard");
		newEngineerScreenCard.setLayout(new CardLayout(0, 0));
		
		JPanel newEngineerScreen = new JPanel();
		newEngineerScreen.setBackground(new Color(49, 49, 49));
		newEngineerScreen.setForeground(new Color(0, 0, 0));
		newEngineerScreenCard.add(newEngineerScreen, "name_396901634073211");
		newEngineerScreen.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBackground(new Color(178, 34, 34));
		panel_1.setBounds(0, 0, 365, 41);
		newEngineerScreen.add(panel_1);
		
		JLabel lblRegisterNewEngineer = new JLabel("REGISTER NEW ENGINEER");
		lblRegisterNewEngineer.setHorizontalAlignment(SwingConstants.CENTER);
		lblRegisterNewEngineer.setForeground(new Color(49, 49, 49));
		lblRegisterNewEngineer.setFont(new Font("Arial", Font.PLAIN, 19));
		lblRegisterNewEngineer.setBounds(13, 6, 346, 23);
		panel_1.add(lblRegisterNewEngineer);
		
		JLabel lblEngineerName = new JLabel("Engineer Name");
		lblEngineerName.setHorizontalAlignment(SwingConstants.RIGHT);
		lblEngineerName.setForeground(new Color(178, 34, 34));
		lblEngineerName.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		lblEngineerName.setBounds(-20, 55, 158, 28);
		newEngineerScreen.add(lblEngineerName);
		
		engineerNameTxt = new JTextField();
		engineerNameTxt.setForeground(new Color(0, 0, 128));
		engineerNameTxt.setColumns(10);
		engineerNameTxt.setBackground(Color.LIGHT_GRAY);
		engineerNameTxt.setBounds(150, 53, 198, 34);
		newEngineerScreen.add(engineerNameTxt);
		
		JButton button_1 = new JButton("Back");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cardLayout.show(parentCard, "mainScreenCard");
			}
		});
		button_1.setBounds(41, 117, 119, 59);
		newEngineerScreen.add(button_1);
		
		JButton btnAddNewEngineer = new JButton("Add New Engineer");
		btnAddNewEngineer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String engineerName = engineerNameTxt.getText();
				
				Engineer engineer = new Engineer(engineerName);
				
				System.out.println(engineer.displayObj());
				engineer.newRegister();
			}
		});
		btnAddNewEngineer.setBounds(192, 117, 137, 59);
		newEngineerScreen.add(btnAddNewEngineer);
		
		boolean toMaintain = false;
		if(toMaintain == false) {
			warningArea.setForeground(new Color(0, 255, 0));	
		}else {
			warningArea.setForeground(new Color(255, 0, 0));
		}
	}
}
