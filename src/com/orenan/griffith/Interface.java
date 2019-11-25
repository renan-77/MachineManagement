package com.orenan.griffith;
import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import java.awt.FlowLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Time;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.JSplitPane;
import javax.swing.BoxLayout;
import java.awt.GridLayout;
import java.awt.CardLayout;
import javax.swing.JTextArea;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.JList;
import javax.swing.ListSelectionModel;
import javax.swing.AbstractListModel;
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
		frame = new JFrame();
		frame.setBounds(100, 100, 365, 498);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new BorderLayout(0, 0));
		
		JPanel parentCard = new JPanel();
		frame.getContentPane().add(parentCard, BorderLayout.CENTER);
		parentCard.setLayout(new CardLayout(0, 0));
		
		CardLayout cardLayout = (CardLayout)(parentCard.getLayout());
		
		JPanel mainScreenCard = new JPanel();
		parentCard.add(mainScreenCard, "mainScreenCard");
		mainScreenCard.setLayout(new CardLayout(0, 0));
		
		JPanel mainScreen = new JPanel();
		mainScreenCard.add(mainScreen, "name_302327220846316");
		mainScreen.setBackground(new Color(49, 49, 49));
		mainScreen.setLayout(null);
		
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
		
		JButton button = new JButton("Register New Engineer");
		button.setBounds(0, 346, 179, 127);
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		button.setBackground(new Color(255, 69, 0));
		mainScreen.add(button);
		
		JButton btnAddAService = new JButton("Add a service record");
		btnAddAService.setBounds(0, 208, 179, 139);
		btnAddAService.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cardLayout.show(parentCard, "newServiceScreenCard");
				
			}
		});
		btnAddAService.setBackground(new Color(255, 69, 0));
		mainScreen.add(btnAddAService);
		
		JButton btnCheckRecords = new JButton("Check Records");
		btnCheckRecords.setBounds(178, 346, 187, 127);
		btnCheckRecords.setBackground(new Color(255, 69, 0));
		mainScreen.add(btnCheckRecords);
		
		JButton button_1 = new JButton("Register New Machine");
		button_1.setBounds(178, 208, 187, 139);
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		button_1.setBackground(new Color(255, 69, 0));
		mainScreen.add(button_1);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBounds(0, 0, 365, 41);
		panel_3.setBackground(new Color(178, 34, 34));
		mainScreen.add(panel_3);
		panel_3.setLayout(null);
		
		JLabel lblMachineMainteinenceControl = new JLabel("MACHINE MAINTANENCE CONTROL");
		lblMachineMainteinenceControl.setBounds(13, 6, 346, 23);
		panel_3.add(lblMachineMainteinenceControl);
		lblMachineMainteinenceControl.setForeground(new Color(49, 49, 49));
		lblMachineMainteinenceControl.setFont(new Font("Arial", Font.PLAIN, 19));
		
		JPanel newServiceScreenCard = new JPanel();
		parentCard.add(newServiceScreenCard, "newServiceScreenCard");
		newServiceScreenCard.setLayout(new CardLayout(0, 0));
		
		JPanel newServiceScreen = new JPanel();
		newServiceScreenCard.add(newServiceScreen, "name_302366922709631");
		newServiceScreen.setBackground(new Color(49, 49, 49));
		newServiceScreen.setLayout(null);
		
		machineID = new JTextField();
		machineID.setForeground(new Color(0, 0, 128));
		machineID.setBackground(new Color(192, 192, 192));
		machineID.setBounds(125, 68, 198, 34);
		newServiceScreen.add(machineID);
		machineID.setColumns(10);
		
		JPanel panel_4 = new JPanel();
		panel_4.setLayout(null);
		panel_4.setBackground(new Color(178, 34, 34));
		panel_4.setBounds(0, 0, 365, 41);
		newServiceScreen.add(panel_4);
		
		JLabel lblAddAService = new JLabel("ADD A SERVICE RECORD");
		lblAddAService.setForeground(new Color(49, 49, 49));
		lblAddAService.setFont(new Font("Arial", Font.PLAIN, 19));
		lblAddAService.setBounds(83, 6, 238, 23);
		panel_4.add(lblAddAService);
		
		engineerID = new JTextField();
		engineerID.setForeground(new Color(0, 0, 128));
		engineerID.setColumns(10);
		engineerID.setBackground(Color.LIGHT_GRAY);
		engineerID.setBounds(125, 102, 198, 34);
		newServiceScreen.add(engineerID);
		
		date = new JTextField();
		date.setForeground(new Color(0, 0, 128));
		date.setColumns(10);
		date.setBackground(Color.LIGHT_GRAY);
		date.setBounds(125, 138, 198, 34);
		newServiceScreen.add(date);
		
		comments = new JTextField();
		comments.setForeground(new Color(0, 0, 128));
		comments.setColumns(10);
		comments.setBackground(Color.LIGHT_GRAY);
		comments.setBounds(125, 174, 198, 34);
		newServiceScreen.add(comments);
		
		itemsUsed = new JTextField();
		itemsUsed.setForeground(new Color(0, 0, 128));
		itemsUsed.setColumns(10);
		itemsUsed.setBackground(Color.LIGHT_GRAY);
		itemsUsed.setBounds(125, 313, 198, 34);
		newServiceScreen.add(itemsUsed);
		
		timeSpent = new JTextField();
		timeSpent.setForeground(new Color(0, 0, 128));
		timeSpent.setColumns(10);
		timeSpent.setBackground(Color.LIGHT_GRAY);
		timeSpent.setBounds(125, 277, 198, 34);
		newServiceScreen.add(timeSpent);
		
		due = new JTextField();
		due.setForeground(new Color(0, 0, 128));
		due.setColumns(10);
		due.setBackground(Color.LIGHT_GRAY);
		due.setBounds(125, 241, 198, 34);
		newServiceScreen.add(due);
		
		JLabel lblMachineid = new JLabel("Machine ID");
		lblMachineid.setHorizontalAlignment(SwingConstants.RIGHT);
		lblMachineid.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		lblMachineid.setForeground(new Color(178, 34, 34));
		lblMachineid.setBounds(6, 77, 107, 16);
		newServiceScreen.add(lblMachineid);
		
		JLabel lblEngineerid = new JLabel("Engineer ID");
		lblEngineerid.setHorizontalAlignment(SwingConstants.RIGHT);
		lblEngineerid.setForeground(new Color(178, 34, 34));
		lblEngineerid.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		lblEngineerid.setBounds(6, 111, 107, 16);
		newServiceScreen.add(lblEngineerid);
		
		JLabel lblServicedate = new JLabel("Date");
		lblServicedate.setHorizontalAlignment(SwingConstants.RIGHT);
		lblServicedate.setForeground(new Color(178, 34, 34));
		lblServicedate.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		lblServicedate.setBounds(6, 147, 107, 16);
		newServiceScreen.add(lblServicedate);
		
		JLabel lblComments = new JLabel("Comments");
		lblComments.setHorizontalAlignment(SwingConstants.RIGHT);
		lblComments.setForeground(new Color(178, 34, 34));
		lblComments.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		lblComments.setBounds(6, 183, 107, 16);
		newServiceScreen.add(lblComments);
		
		JLabel lblWeekDay = new JLabel("Week Day");
		lblWeekDay.setHorizontalAlignment(SwingConstants.RIGHT);
		lblWeekDay.setForeground(new Color(178, 34, 34));
		lblWeekDay.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		lblWeekDay.setBounds(6, 216, 107, 16);
		newServiceScreen.add(lblWeekDay);
		
		JComboBox weekDay = new JComboBox();
		weekDay.setForeground(new Color(178, 34, 34));
		weekDay.setBackground(new Color(192, 192, 192));
		weekDay.setModel(new DefaultComboBoxModel(new String[] {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"}));
		weekDay.setBounds(125, 211, 198, 27);
		newServiceScreen.add(weekDay);
		
		JLabel lblDue = new JLabel("Due");
		lblDue.setHorizontalAlignment(SwingConstants.RIGHT);
		lblDue.setForeground(new Color(178, 34, 34));
		lblDue.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		lblDue.setBounds(6, 250, 107, 16);
		newServiceScreen.add(lblDue);
		
		JLabel lblTimeSpent = new JLabel("Time Spent");
		lblTimeSpent.setHorizontalAlignment(SwingConstants.RIGHT);
		lblTimeSpent.setForeground(new Color(178, 34, 34));
		lblTimeSpent.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		lblTimeSpent.setBounds(6, 286, 107, 16);
		newServiceScreen.add(lblTimeSpent);
		
		JLabel lblItemsUsed = new JLabel("Items Used");
		lblItemsUsed.setHorizontalAlignment(SwingConstants.RIGHT);
		lblItemsUsed.setForeground(new Color(178, 34, 34));
		lblItemsUsed.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		lblItemsUsed.setBounds(6, 322, 107, 16);
		newServiceScreen.add(lblItemsUsed);
		
		JLabel lblWasCritical = new JLabel("Was Critical");
		lblWasCritical.setHorizontalAlignment(SwingConstants.RIGHT);
		lblWasCritical.setForeground(new Color(178, 34, 34));
		lblWasCritical.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		lblWasCritical.setBounds(6, 359, 107, 16);
		newServiceScreen.add(lblWasCritical);
		
		JComboBox wasCritical = new JComboBox();
		wasCritical.setModel(new DefaultComboBoxModel(new String[] {"", "YES", "NO"}));
		wasCritical.setForeground(new Color(178, 34, 34));
		wasCritical.setBackground(Color.LIGHT_GRAY);
		wasCritical.setBounds(125, 356, 198, 27);
		newServiceScreen.add(wasCritical);
		
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cardLayout.show(parentCard, "mainScreenCard");
			}
		});
		btnBack.setBounds(64, 399, 119, 59);
		newServiceScreen.add(btnBack);
		
		JButton btnAddService = new JButton("Add Service");
		btnAddService.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
				int mchID = Integer.parseInt(machineID.getText());
				int engID = Integer.parseInt(engineerID.getText());
				String svcDateStr = date.getText();
				DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd, MM, yyyy", Locale.ENGLISH);
				LocalDate svcDate = LocalDate.parse(svcDateStr, formatter);
				String cmts = comments.getText();
				String dayService = (String)weekDay.getSelectedItem();
				String dueDateStr = due.getText();
				LocalDate dueDate = LocalDate.parse(svcDateStr, formatter);
				String timeSpentOnStr = timeSpent.getText();
				Time timeSpentOn = java.sql.Time.valueOf(timeSpentOnStr);
				String usedItems = itemsUsed.getText();
				boolean critical = Boolean.parseBoolean((String)wasCritical.getSelectedItem());
				
				Service Register = new Service(mchID, engID, svcDate, cmts, dayService, dueDate, timeSpentOn, usedItems, critical);
				}catch(Exception E) {
					System.out.println("Sorry, an error has ocurred.");
					cardLayout.show(parentCard, "mainScreenCard");
				}
			}
		});
		btnAddService.setBounds(183, 399, 119, 59);
		newServiceScreen.add(btnAddService);
		
		
		boolean toMaintain = false;
		if(toMaintain == false) {
			warningArea.setForeground(new Color(0, 255, 0));	
		}else {
			warningArea.setForeground(new Color(255, 0, 0));
		}
	}
}
