
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileWriter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.awt.event.ActionEvent;
import javax.swing.JTextPane;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JPasswordField;
import javax.swing.JList;
import javax.swing.JSlider;
import javax.swing.JSpinner;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.border.LineBorder;
import java.awt.Color;
import com.toedter.calendar.JDateChooser;
import java.awt.Toolkit;



public class Travel extends JFrame {

	private JPanel contentPane;
	private JTextField NAME;
	private JTextField how;
	private JTextField sitnumber;
	private JTextField mail1;
	private JLabel lblMail;
	private JTextField Phone;
	private JLabel lblPhone;
	private JComboBox comboBox;
	private JComboBox comboBox_1;
	private JComboBox comboBox_2;
	private JComboBox comboBox_3;
	private JDateChooser dateChooser;
	private JButton btnPrint;
	private JButton btnContactUs;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Travel frame = new Travel();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Travel() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Shekhor\\Desktop\\1f994f4e9906cc511a5ea72e083e97c1--material-design-revolution.jpg"));
		setBackground(new Color(255, 51, 255));
		setTitle("Metro Bus");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 961, 600);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 0, 51));
		contentPane.setForeground(new Color(51, 51, 0));
		contentPane.setBorder(new LineBorder(new Color(0, 0, 0)));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblSetYourDestination = new JLabel("Name");
		lblSetYourDestination.setBounds(62, 123, 160, 16);
		lblSetYourDestination.setForeground(new Color(255, 255, 255));
		contentPane.add(lblSetYourDestination);
		
		JLabel lblTo = new JLabel("To");
		lblTo.setBounds(248, 273, 56, 16);
		lblTo.setForeground(new Color(255, 255, 255));
		contentPane.add(lblTo);
		
		JLabel lblForm = new JLabel("Form");
		lblForm.setBounds(99, 273, 56, 16);
		lblForm.setForeground(new Color(255, 255, 255));
		contentPane.add(lblForm);
		
		JButton btnProceed = new JButton("Check");
		btnProceed.setBounds(270, 515, 97, 25);
		btnProceed.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					String name,Print,seatnumber,mail,phone,time=null,date=null;
					int num,price;
					
					name=NAME.getText();
					
					seatnumber=sitnumber.getText();
				
					num=Integer.parseInt(how.getText());
					mail=mail1.getText();
					phone=Phone.getText();
					//time
					if(comboBox_3.getSelectedItem().equals("6:00 am")) {
						time="Arrival Time-5:45 am \nDeprature time-6:00 am";
						
					}
					else if(comboBox_3.getSelectedItem().equals("7:00 am")) {
						time="Arrival Time-6:45 am \nDeprature time-7:00 am";
						
					}
					else if(comboBox_3.getSelectedItem().equals("8:00 am")) {
						time="Arrival Time-7:45 am \nDeprature time-8:00 am";
						
					}
					else if(comboBox_3.getSelectedItem().equals("9:00 am")) {
						time="Arrival Time-8:45 am \nDeprature time-9:00 am";
						
					}
					else if(comboBox_3.getSelectedItem().equals("1:00 pm")) {
						time="Arrival Time-12:45 pm \nDeprature time-1:00 pm";
						
					}
					else if(comboBox_3.getSelectedItem().equals("8:00 pm")) {
						time="Arrival Time-7.45 pm \nDeprature time-8:00 pm";
						
					}
					else if(comboBox_3.getSelectedItem().equals("9:00 pm")) {
						time="Arrival Time-8:45 pm \nDeprature time-9:00 pm";
						
					}
					else if(comboBox_3.getSelectedItem().equals("10:00 pm")) {
						time="Arrival Time-9:45 pm \nDeprature time-10:00 pm";
						
					}
					else if(comboBox_3.getSelectedItem().equals("11:00 pm")) {
						time="Arrival Time-10:45 pm \nDeprature time-11:00 pm";
					
						
					}
					//Dhaka and Rajshahi
					if(comboBox_1.getSelectedItem().equals("Dhaka")&&comboBox_2.getSelectedItem().equals("Rajshahi")) {
					if(comboBox.getSelectedItem().equals("AC")) {
							DateFormat df=new SimpleDateFormat("yyyy-MM-dd");
							date=df.format(dateChooser.getDate());
							price=num*800;
					 	   	Print="                              Supervisor Slip:\n"+"Name:"+name+"\n"+"Mail:"+mail+"\nPhone"+phone+"\n\nFrom:Dhaka       To:Rajshahi"+"\nJarney Date:"+date+"\n"+time+"\nNumber of passenger:"+num+"       The Seat number is:"+seatnumber+"\nPrice:"+price+"\n"+"---------------------------------------------------------------------------------------------------\n\n                              Customer Slip\n\n"+"Name:"+name+"\n"+"Mail:"+mail+"\nPhone"+phone+"\n\nFrom:Dhaka       To:Rajshahi"+"\nJarney Date:"+date+"\n"+time+"\nNumber of passenger:"+num+"       The Seat number is:"+seatnumber+"\nPrice:"+price;
					 	   	
					 	   JOptionPane.showMessageDialog(null,Print);
					}
					else if(comboBox.getSelectedItem().equals("NON-AC")) {
							DateFormat df=new SimpleDateFormat("yyyy-MM-dd");
							date=df.format(dateChooser.getDate());
							price=num*450;
					 	   	Print="                              Supervisor Slip:\n"+"Name:"+name+"\n"+"Mail:"+mail+"\nPhone"+phone+"\n\nFrom:Dhaka       To:Rajshahi"+"\nJarney Date:"+date+"\n"+time+"\nNumber of passenger:"+num+"       The Seat number is:"+seatnumber+"\nPrice:"+price+"\n"+"---------------------------------------------------------------------------------------------------\n\n                              Customer Slip\n\n"+"Name:"+name+"\n"+"Mail:"+mail+"\nPhone"+phone+"\n\nFrom:Dhaka       To:Rajshahi"+"\nJarney Date:"+date+"\n"+time+"\nNumber of passenger:"+num+"       The Seat number is:"+seatnumber+"\nPrice:"+price;
					 	   	
					 	   JOptionPane.showMessageDialog(null,Print);
					}
					  
					}
					
					//rajshahi dhaka
					
					if(comboBox_1.getSelectedItem().equals("Rajshahi")&&comboBox_2.getSelectedItem().equals("Dhaka")) {
						if(comboBox.getSelectedItem().equals("AC")) {
								DateFormat df=new SimpleDateFormat("yyyy-MM-dd");
							    date=df.format(dateChooser.getDate());
								price=num*800;
						 	   	Print="                              Supervisor Slip:\n"+"Name:"+name+"\n"+"Mail:"+mail+"\nPhone"+phone+"\n\nFrom:Rajshahi       To:Dhaka"+"\nJarney Date:"+date+"\n"+time+"\nNumber of passenger:"+num+"       The Seat number is:"+seatnumber+"\nPrice:"+price+"\n"+"---------------------------------------------------------------------------------------------------\n\n                              Customer Slip\n\n"+"Name:"+name+"\n"+"Mail:"+mail+"\nPhone"+phone+"\n\nFrom:Rajshahi       To:Dhaka"+"\nJarney Date:"+date+"\n"+time+"\nNumber of passenger:"+num+"       The Seat number is:"+seatnumber+"\nPrice:"+price;
						 	   	
						 	   JOptionPane.showMessageDialog(null,Print);
						}
						else if(comboBox.getSelectedItem().equals("NON-AC")) {
								DateFormat df=new SimpleDateFormat("yyyy-MM-dd");
								date=df.format(dateChooser.getDate());
								price=num*450;
						 	   	Print="                              Supervisor Slip:\n"+"Name:"+name+"\n"+"Mail:"+mail+"\nPhone"+phone+"\n\nFrom:Rajshahi      To:Dhaka"+"\nJarney Date:"+date+"\n"+time+"\nNumber of passenger:"+num+"       The Seat number is:"+seatnumber+"\nPrice:"+price+"\n"+"---------------------------------------------------------------------------------------------------\n\n                              Customer Slip\n\n"+"Name:"+name+"\n"+"Mail:"+mail+"\nPhone"+phone+"\n\nFrom:Rajshahi       To:Dhaka"+"\nJarney Date:"+date+"\n"+time+"\nNumber of passenger:"+num+"       The Seat number is:"+seatnumber+"\nPrice:"+price;
						 	   	
						 	   JOptionPane.showMessageDialog(null,Print);	   JOptionPane.showMessageDialog(null,Print);
						}
						  
						}
					
					
					
					//dhaka sylhet
					if(comboBox_1.getSelectedItem().equals("Dhaka")&&comboBox_2.getSelectedItem().equals("Sylhet")) {
						if(comboBox.getSelectedItem().equals("AC")) {
								DateFormat df=new SimpleDateFormat("yyyy-MM-dd");
								date=df.format(dateChooser.getDate());
								price=num*800;
						 	   	Print="                              Supervisor Slip:\n"+"Name:"+name+"\n"+"Mail:"+mail+"\nPhone"+phone+"\n\nFrom:Dhaka       To:Sylhet"+"\nJarney Date:"+date+"\n"+time+"\nNumber of passenger:"+num+"       The Seat number is:"+seatnumber+"\nPrice:"+price+"\n"+"---------------------------------------------------------------------------------------------------\n\n                              Customer Slip\n\n"+"Name:"+name+"\n"+"Mail:"+mail+"\nPhone"+phone+"\n\nFrom:Dhaka       To:Sylhet"+"\nJarney Date:"+date+"\n"+time+"\nNumber of passenger:"+num+"       The Seat number is:"+seatnumber+"\nPrice:"+price;
						 	   
						 	   JOptionPane.showMessageDialog(null,Print);
						}
						else if(comboBox.getSelectedItem().equals("NON-AC")) {
								DateFormat df=new SimpleDateFormat("yyyy-MM-dd");
								date=df.format(dateChooser.getDate());
								price=num*450;
						 	   	Print="                              Supervisor Slip:\n"+"Name:"+name+"\n"+"Mail:"+mail+"\nPhone"+phone+"\n\nFrom:Dhaka       To:Sylhet"+"\nJarney Date:"+date+"\n"+time+"\nNumber of passenger:"+num+"       The Seat number is:"+seatnumber+"\nPrice:"+price+"\n"+"---------------------------------------------------------------------------------------------------\n\n                              Customer Slip\n\n"+"Name:"+name+"\n"+"Mail:"+mail+"\nPhone"+phone+"\n\nFrom:Dhaka       To:Sylhet"+"\nJarney Date:"+date+"\n"+time+"\nNumber of passenger:"+num+"       The Seat number is:"+seatnumber+"\nPrice:"+price;
						 	   	
						 	   JOptionPane.showMessageDialog(null,Print);
						}
						  
						}
					
					//sylhet dhaka
					if(comboBox_1.getSelectedItem().equals("Sylhet")&&comboBox_2.getSelectedItem().equals("Dhaka")) {
						if(comboBox.getSelectedItem().equals("AC")) {
								DateFormat df=new SimpleDateFormat("yyyy-MM-dd");
								date=df.format(dateChooser.getDate());
								price=num*800;
						 	   	Print="                              Supervisor Slip:\n"+"Name:"+name+"\n"+"Mail:"+mail+"\nPhone"+phone+"\n\nFrom:Sylhet       To:Dhaka"+"\nJarney Date:"+date+"\n"+time+"\nNumber of passenger:"+num+"       The Seat number is:"+seatnumber+"\nPrice:"+price+"\n"+"---------------------------------------------------------------------------------------------------\n\n                              Customer Slip\n\n"+"Name:"+name+"\n"+"Mail:"+mail+"\nPhone"+phone+"\n\nFrom:Sylhet       To:Dhaka"+"\nJarney Date:"+date+"\n"+time+"\nNumber of passenger:"+num+"       The Seat number is:"+seatnumber+"\nPrice:"+price;
						 	   
						 	   JOptionPane.showMessageDialog(null,Print);
						}
						else if(comboBox.getSelectedItem().equals("NON-AC")) {
								DateFormat df=new SimpleDateFormat("yyyy-MM-dd");
								date=df.format(dateChooser.getDate());
								price=num*450;
						 	   	Print="                              Supervisor Slip:\n"+"Name:"+name+"\n"+"Mail:"+mail+"\nPhone"+phone+"\n\nFrom:Sylhet      To:Dhaka"+"\nJarney Date:"+date+"\n"+time+"\nNumber of passenger:"+num+"       The Seat number is:"+seatnumber+"\nPrice:"+price+"\n"+"---------------------------------------------------------------------------------------------------\n\n                              Customer Slip\n\n"+"Name:"+name+"\n"+"Mail:"+mail+"\nPhone"+phone+"\n\nFrom:Sylhet       To:Dhaka"+"\nJarney Date:"+date+"\n"+time+"\nNumber of passenger:"+num+"       The Seat number is:"+seatnumber+"\nPrice:"+price;
						 	   	
						 	   JOptionPane.showMessageDialog(null,Print);
						}
						  
						}
					
					
					
					//dhaka to kushtia
					
						if(comboBox_1.getSelectedItem().equals("Dhaka")&&comboBox_2.getSelectedItem().equals("Kushtia")) {
							if(comboBox.getSelectedItem().equals("AC")) {
								DateFormat df=new SimpleDateFormat("yyyy-MM-dd");
								date=df.format(dateChooser.getDate());
								price=num*800;
						 	   	Print="                              Supervisor Slip:\n"+"Name:"+name+"\n"+"Mail:"+mail+"\nPhone"+phone+"\n\nFrom:Dhaka       To:Kushtia"+"\nJarney Date:"+date+"\n"+time+"\nNumber of passenger:"+num+"       The Seat number is:"+seatnumber+"\nPrice:"+price+"\n"+"---------------------------------------------------------------------------------------------------\n\n                              Customer Slip\n\n"+"Name:"+name+"\n"+"Mail:"+mail+"\nPhone"+phone+"\n\nFrom:Dhaka       To:Kushtia"+"\nJarney Date:"+date+"\n"+time+"\nNumber of passenger:"+num+"       The Seat number is:"+seatnumber+"\nPrice:"+price;
						 	   	
						 	   JOptionPane.showMessageDialog(null,Print);
						}
						else if(comboBox.getSelectedItem().equals("NON-AC")) {
								DateFormat df=new SimpleDateFormat("yyyy-MM-dd");
								date=df.format(dateChooser.getDate());
								price=num*450;
						 	   	Print="                              Supervisor Slip:\n"+"Name:"+name+"\n"+"Mail:"+mail+"\nPhone"+phone+"\n\nFrom:Dhaka       To:Kushtia"+"\nJarney Date:"+date+"\n"+time+"\nNumber of passenger:"+num+"       The Seat number is:"+seatnumber+"\nPrice:"+price+"\n"+"---------------------------------------------------------------------------------------------------\n\n                              Customer Slip\n\n"+"Name:"+name+"\n"+"Mail:"+mail+"\nPhone"+phone+"\n\nFrom:Dhaka       To:Kushtia"+"\nJarney Date:"+date+"\n"+time+"\nNumber of passenger:"+num+"       The Seat number is:"+seatnumber+"\nPrice:"+price;
						 	   	
						 	   JOptionPane.showMessageDialog(null,Print);
						}
						  
						}
						
						//kustia dhaka
						if(comboBox_1.getSelectedItem().equals("Kushtia")&&comboBox_2.getSelectedItem().equals("Dhaka")) {
							if(comboBox.getSelectedItem().equals("AC")) {
								DateFormat df=new SimpleDateFormat("yyyy-MM-dd");
								date=df.format(dateChooser.getDate());
								price=num*800;
						 	   	Print="                              Supervisor Slip:\n"+"Name:"+name+"\n"+"Mail:"+mail+"\nPhone"+phone+"\n\nFrom:Kushtia      To:Dhaka"+"\nJarney Date:"+date+"\n"+time+"\nNumber of passenger:"+num+"       The Seat number is:"+seatnumber+"\nPrice:"+price+"\n"+"---------------------------------------------------------------------------------------------------\n\n                              Customer Slip\n\n"+"Name:"+name+"\n"+"Mail:"+mail+"\nPhone"+phone+"\n\nFrom:Kushtia       To:Dhaka"+"\nJarney Date:"+date+"\n"+time+"\nNumber of passenger:"+num+"       The Seat number is:"+seatnumber+"\nPrice:"+price;
						 	   	
						 	   JOptionPane.showMessageDialog(null,Print);
						}
						else if(comboBox.getSelectedItem().equals("NON-AC")) {
								DateFormat df=new SimpleDateFormat("yyyy-MM-dd");
								date=df.format(dateChooser.getDate());
								price=num*450;
						 	   	Print="                              Supervisor Slip:\n"+"Name:"+name+"\n"+"Mail:"+mail+"\nPhone"+phone+"\n\nFrom:Kushtia      To:Dhaka"+"\nJarney Date:"+date+"\n"+time+"\nNumber of passenger:"+num+"       The Seat number is:"+seatnumber+"\nPrice:"+price+"\n"+"---------------------------------------------------------------------------------------------------\n\n                              Customer Slip\n\n"+"Name:"+name+"\n"+"Mail:"+mail+"\nPhone"+phone+"\n\nFrom:Kushtia       To:Dhaka"+"\nJarney Date:"+date+"\n"+time+"\nNumber of passenger:"+num+"       The Seat number is:"+seatnumber+"\nPrice:"+price;
						 	   	
						 	   JOptionPane.showMessageDialog(null,Print);
						}
						  
						}
						
						
                        //dhaka khulna
						if(comboBox_1.getSelectedItem().equals("Dhaka")&&comboBox_2.getSelectedItem().equals("Khulna")) {
							if(comboBox.getSelectedItem().equals("AC")) {
								DateFormat df=new SimpleDateFormat("yyyy-MM-dd");
								date=df.format(dateChooser.getDate());
								price=num*1200;
						 	   	Print="                              Supervisor Slip:\n"+"Name:"+name+"\n"+"Mail:"+mail+"\nPhone"+phone+"\n\nFrom:Dhaka       To:Khulna"+"\nJarney Date:"+date+"\n"+time+"\nNumber of passenger:"+num+"       The Seat number is:"+seatnumber+"\nPrice:"+price+"\n"+"---------------------------------------------------------------------------------------------------\n\n                              Customer Slip\n\n"+"Name:"+name+"\n"+"Mail:"+mail+"\nPhone"+phone+"\n\nFrom:Dhaka       To:Khulna"+"\nJarney Date:"+date+"\n"+time+"\nNumber of passenger:"+num+"       The Seat number is:"+seatnumber+"\nPrice:"+price;
						 	   	
						 	   JOptionPane.showMessageDialog(null,Print);
						}
						else if(comboBox.getSelectedItem().equals("NON-AC")) {
								DateFormat df=new SimpleDateFormat("yyyy-MM-dd");
								date=df.format(dateChooser.getDate());
								price=num*650;
						 	   	Print="                              Supervisor Slip:\n"+"Name:"+name+"\n"+"Mail:"+mail+"\nPhone"+phone+"\n\nFrom:Dhaka       To:Khulna"+"\nJarney Date:"+date+"\n"+time+"\nNumber of passenger:"+num+"       The Seat number is:"+seatnumber+"\nPrice:"+price+"\n"+"---------------------------------------------------------------------------------------------------\n\n                              Customer Slip\n\n"+"Name:"+name+"\n"+"Mail:"+mail+"\nPhone"+phone+"\n\nFrom:Dhaka       To:Khulna"+"\nJarney Date:"+date+"\n"+time+"\nNumber of passenger:"+num+"       The Seat number is:"+seatnumber+"\nPrice:"+price;
						 	   	
						 	   JOptionPane.showMessageDialog(null,Print);
						}
						  
						}
						//khulna dhaka
						if(comboBox_1.getSelectedItem().equals("Khulna")&&comboBox_2.getSelectedItem().equals("Dhaka")) {
							if(comboBox.getSelectedItem().equals("AC")) {
								DateFormat df=new SimpleDateFormat("yyyy-MM-dd");
								date=df.format(dateChooser.getDate());
								price=num*1200;
						 	   	Print="                              Supervisor Slip:\n"+"Name:"+name+"\n"+"Mail:"+mail+"\nPhone"+phone+"\n\nFrom:Khulna      To:Dhaka"+"\nJarney Date:"+date+"\n"+time+"\nNumber of passenger:"+num+"       The Seat number is:"+seatnumber+"\nPrice:"+price+"\n"+"---------------------------------------------------------------------------------------------------\n\n                              Customer Slip\n\n"+"Name:"+name+"\n"+"Mail:"+mail+"\nPhone"+phone+"\n\nFrom:Khulna       To:Dhaka"+"\nJarney Date:"+date+"\n"+time+"\nNumber of passenger:"+num+"       The Seat number is:"+seatnumber+"\nPrice:"+price;
						 	   	
						 	   JOptionPane.showMessageDialog(null,Print);
						}
						else if(comboBox.getSelectedItem().equals("NON-AC")) {
								DateFormat df=new SimpleDateFormat("yyyy-MM-dd");
								date=df.format(dateChooser.getDate());
								price=num*650;
						 	   	Print="                              Supervisor Slip:\n"+"Name:"+name+"\n"+"Mail:"+mail+"\nPhone"+phone+"\n\nFrom:Khulna       To:Dhaka"+"\nJarney Date:"+date+"\n"+time+"\nNumber of passenger:"+num+"       The Seat number is:"+seatnumber+"\nPrice:"+price+"\n"+"---------------------------------------------------------------------------------------------------\n\n                              Customer Slip\n\n"+"Name:"+name+"\n"+"Mail:"+mail+"\nPhone"+phone+"\n\nFrom:Khulna       To:Dhaka"+"\nJarney Date:"+date+"\n"+time+"\nNumber of passenger:"+num+"       The Seat number is:"+seatnumber+"\nPrice:"+price;
						 	   	
						 	   JOptionPane.showMessageDialog(null,Print);
						}
						  
						}
						//dhaka chittagong
						if(comboBox_1.getSelectedItem().equals("Dhaka")&&comboBox_2.getSelectedItem().equals("Chittagong")) {
							if(comboBox.getSelectedItem().equals("AC")) {
								DateFormat df=new SimpleDateFormat("yyyy-MM-dd");
								date=df.format(dateChooser.getDate());
								price=num*1000;
						 	   	Print="                              Supervisor Slip:\n"+"Name:"+name+"\n"+"Mail:"+mail+"\nPhone"+phone+"\n\nFrom:Dhaka       To:Chittagong"+"\nJarney Date:"+date+"\n"+time+"\nNumber of passenger:"+num+"       The Seat number is:"+seatnumber+"\nPrice:"+price+"\n"+"---------------------------------------------------------------------------------------------------\n\n                              Customer Slip\n\n"+"Name:"+name+"\n"+"Mail:"+mail+"\nPhone"+phone+"\n\nFrom:Dhaka       To:Chittagong"+"\nJarney Date:"+date+"\n"+time+"\nNumber of passenger:"+num+"       The Seat number is:"+seatnumber+"\nPrice:"+price;
						 	   	
						 	   JOptionPane.showMessageDialog(null,Print);
						}
						else if(comboBox.getSelectedItem().equals("NON-AC")) {
								DateFormat df=new SimpleDateFormat("yyyy-MM-dd");
								date=df.format(dateChooser.getDate());
								price=num*550;
						 	   	Print="                              Supervisor Slip:\n"+"Name:"+name+"\n"+"Mail:"+mail+"\nPhone"+phone+"\n\nFrom:Dhaka       To:Chittagong"+"\nJarney Date:"+date+"\n"+time+"\nNumber of passenger:"+num+"       The Seat number is:"+seatnumber+"\nPrice:"+price+"\n"+"---------------------------------------------------------------------------------------------------\n\n                              Customer Slip\n\n"+"Name:"+name+"\n"+"Mail:"+mail+"\nPhone"+phone+"\n\nFrom:Dhaka       To:Chittagong"+"\nJarney Date:"+date+"\n"+time+"\nNumber of passenger:"+num+"       The Seat number is:"+seatnumber+"\nPrice:"+price;
						 	   	
						 	   JOptionPane.showMessageDialog(null,Print);
						}
						  
						}
						//chittagong dhaka
						if(comboBox_1.getSelectedItem().equals("Chittagong")&&comboBox_2.getSelectedItem().equals("Dhaka")) {
							if(comboBox.getSelectedItem().equals("AC")) {
								DateFormat df=new SimpleDateFormat("yyyy-MM-dd");
								date=df.format(dateChooser.getDate());
								price=num*1000;
						 	   	Print="                              Supervisor Slip:\n"+"Name:"+name+"\n"+"Mail:"+mail+"\nPhone"+phone+"\n\nFrom:Chittagong       To:Dhaka"+"\nJarney Date:"+date+"\n"+time+"\nNumber of passenger:"+num+"       The Seat number is:"+seatnumber+"\nPrice:"+price+"\n"+"---------------------------------------------------------------------------------------------------\n\n                              Customer Slip\n\n"+"Name:"+name+"\n"+"Mail:"+mail+"\nPhone"+phone+"\n\nFrom:Chittagong       To:Dhaka"+"\nJarney Date:"+date+"\n"+time+"\nNumber of passenger:"+num+"       The Seat number is:"+seatnumber+"\nPrice:"+price;
						 	   	
						 	   JOptionPane.showMessageDialog(null,Print);
						}
						else if(comboBox.getSelectedItem().equals("NON-AC")) {
								DateFormat df=new SimpleDateFormat("yyyy-MM-dd");
								date=df.format(dateChooser.getDate());
								price=num*550;
						 	   	Print="                              Supervisor Slip:\n"+"Name:"+name+"\n"+"Mail:"+mail+"\nPhone"+phone+"\n\nFrom:Chittagong       To:Dhaka"+"\nJarney Date:"+date+"\n"+time+"\nNumber of passenger:"+num+"       The Seat number is:"+seatnumber+"\nPrice:"+price+"\n"+"---------------------------------------------------------------------------------------------------\n\n                              Customer Slip\n\n"+"Name:"+name+"\n"+"Mail:"+mail+"\nPhone"+phone+"\n\nFrom:Chittagong       To:Dhaka"+"\nJarney Date:"+date+"\n"+time+"\nNumber of passenger:"+num+"       The Seat number is:"+seatnumber+"\nPrice:"+price;
						 	   	
						 	   JOptionPane.showMessageDialog(null,Print);
						}
						  
						}
						//other error
						if((comboBox_1.getSelectedItem().equals("Dhaka")&&comboBox_2.getSelectedItem().equals("Dhaka"))||
								(comboBox_1.getSelectedItem().equals("Kushtia")&&comboBox_2.getSelectedItem().equals("Kushtia"))||
								(comboBox_1.getSelectedItem().equals("Kushtia")&&comboBox_2.getSelectedItem().equals("Rajshahi"))||
								(comboBox_1.getSelectedItem().equals("Kushtia")&&comboBox_2.getSelectedItem().equals("Khulna"))||
								(comboBox_1.getSelectedItem().equals("Kushtia")&&comboBox_2.getSelectedItem().equals("Sylhet"))||
								(comboBox_1.getSelectedItem().equals("Kushtia")&&comboBox_2.getSelectedItem().equals("Chittagong"))||
								(comboBox_1.getSelectedItem().equals("Rajshahi")&&comboBox_2.getSelectedItem().equals("Rajshahi"))||
								(comboBox_1.getSelectedItem().equals("Rajshahi")&&comboBox_2.getSelectedItem().equals("Kushtia"))||
								(comboBox_1.getSelectedItem().equals("Rajshahi")&&comboBox_2.getSelectedItem().equals("Khulna"))||
								(comboBox_1.getSelectedItem().equals("Rajshahi")&&comboBox_2.getSelectedItem().equals("Sylhet"))||
								(comboBox_1.getSelectedItem().equals("Rajshahi")&&comboBox_2.getSelectedItem().equals("Chittagong"))||
								(comboBox_1.getSelectedItem().equals("Khulna")&&comboBox_2.getSelectedItem().equals("Khulna"))||
								(comboBox_1.getSelectedItem().equals("Khulna")&&comboBox_2.getSelectedItem().equals("Kushtia"))||
								(comboBox_1.getSelectedItem().equals("Khulna")&&comboBox_2.getSelectedItem().equals("Rajshahi"))||
								(comboBox_1.getSelectedItem().equals("Khulna")&&comboBox_2.getSelectedItem().equals("Sylhet"))||
								(comboBox_1.getSelectedItem().equals("Khulna")&&comboBox_2.getSelectedItem().equals("Chittagong"))||
								(comboBox_1.getSelectedItem().equals("Sylhet")&&comboBox_2.getSelectedItem().equals("Sylhet"))||
								(comboBox_1.getSelectedItem().equals("Sylhet")&&comboBox_2.getSelectedItem().equals("Kushtia"))||
								(comboBox_1.getSelectedItem().equals("Sylhet")&&comboBox_2.getSelectedItem().equals("Khulna"))||
								(comboBox_1.getSelectedItem().equals("Sylhet")&&comboBox_2.getSelectedItem().equals("Rajshahi"))||
								(comboBox_1.getSelectedItem().equals("Sylhet")&&comboBox_2.getSelectedItem().equals("Chittagong"))||
								(comboBox_1.getSelectedItem().equals("Chittagong")&&comboBox_2.getSelectedItem().equals("Chittagong"))||
								(comboBox_1.getSelectedItem().equals("Chittagong")&&comboBox_2.getSelectedItem().equals("Kushtia"))||
								(comboBox_1.getSelectedItem().equals("Chittagong")&&comboBox_2.getSelectedItem().equals("Khulna"))||
								(comboBox_1.getSelectedItem().equals("Chittagong")&&comboBox_2.getSelectedItem().equals("Rajshahi"))||
								(comboBox_1.getSelectedItem().equals("Chittagong")&&comboBox_2.getSelectedItem().equals("Sylhet"))) {
							JOptionPane.showMessageDialog(null, "Sorry no Bus Available in this Rout .");
						}
						
					
					
				}
				catch(Exception e){
					
				}
				
			}
		});
		contentPane.add(btnProceed);
		
		JLabel lblClassOfBus = new JLabel("Class of Bus");
		lblClassOfBus.setBounds(99, 314, 97, 16);
		lblClassOfBus.setForeground(new Color(255, 255, 255));
		contentPane.add(lblClassOfBus);
		
		NAME = new JTextField();
		NAME.setBounds(99, 116, 310, 31);
		NAME.setBackground(new Color(255, 255, 255));
		contentPane.add(NAME);
		NAME.setColumns(10);
		
		how = new JTextField();
		how.setBounds(97, 431, 88, 16);
		contentPane.add(how);
		how.setColumns(10);
		
		JLabel lblHwManySets = new JLabel("How many sets");
		lblHwManySets.setBounds(96, 413, 126, 16);
		lblHwManySets.setForeground(new Color(255, 255, 255));
		contentPane.add(lblHwManySets);
		
		sitnumber = new JTextField();
		sitnumber.setBounds(254, 431, 88, 16);
		contentPane.add(sitnumber);
		sitnumber.setColumns(10);
		
		JLabel lblSe = new JLabel("Seat Number ");
		lblSe.setBounds(254, 413, 99, 16);
		lblSe.setForeground(new Color(255, 255, 255));
		contentPane.add(lblSe);
		
		
		
		mail1 = new JTextField();
		mail1.setBounds(99, 174, 310, 31);
		mail1.setColumns(10);
		contentPane.add(mail1);
		
		lblMail = new JLabel("Mail");
		lblMail.setBounds(62, 181, 56, 16);
		lblMail.setForeground(new Color(255, 255, 255));
		contentPane.add(lblMail);
		
		Phone = new JTextField();
		Phone.setBounds(99, 229, 310, 31);
		Phone.setColumns(10);
		contentPane.add(Phone);
		
		lblPhone = new JLabel("Phone");
		lblPhone.setBounds(62, 236, 56, 16);
		lblPhone.setForeground(new Color(255, 255, 255));
		contentPane.add(lblPhone);
		
		comboBox = new JComboBox();
		comboBox.setBounds(98, 329, 73, 22);
		contentPane.add(comboBox);
		comboBox.addItem("AC");
		comboBox.addItem("NON-AC");
		comboBox.setSelectedItem(null);
		
		comboBox_1 = new JComboBox();
		comboBox_1.setBounds(98, 294, 73, 22);
		contentPane.add(comboBox_1);
		comboBox_1.addItem("Dhaka");
		comboBox_1.addItem("Rajshahi");
		comboBox_1.addItem("Kushtia");
		comboBox_1.addItem("Khulna");
		comboBox_1.addItem("Sylhet");
		comboBox_1.addItem("Chittagong");
		
		comboBox_2 = new JComboBox();
		comboBox_2.setBounds(248, 294, 66, 22);
		
		contentPane.add(comboBox_2);
		comboBox_2.addItem("Dhaka");
		comboBox_2.addItem("Rajshahi");
		comboBox_2.addItem("Kushtia");
		comboBox_2.addItem("Khulna");
		comboBox_2.addItem("Sylhet");
		comboBox_2.addItem("Chittagong");
		
		JLabel lblExamplegmailcom = new JLabel("Example@gmail.com");
		lblExamplegmailcom.setBounds(99, 152, 136, 16);
		lblExamplegmailcom.setForeground(new Color(255, 51, 51));
		lblExamplegmailcom.setBackground(Color.LIGHT_GRAY);
		contentPane.add(lblExamplegmailcom);
		
		JLabel label = new JLabel("+880");
		label.setBounds(99, 207, 136, 16);
		label.setForeground(new Color(255, 51, 51));
		label.setBackground(Color.LIGHT_GRAY);
		contentPane.add(label);
		
		JButton btnPrice = new JButton("Price");
		btnPrice.setBounds(248, 328, 126, 25);
		btnPrice.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//dhaka rajshahi
				if((comboBox_1.getSelectedItem().equals("Dhaka")&&comboBox_2.getSelectedItem().equals("Rajshahi"))||(comboBox_1.getSelectedItem().equals("Rajshahi")&&comboBox_2.getSelectedItem().equals("Dhaka"))) {
				if(comboBox.getSelectedItem().equals("AC")){
					JOptionPane.showMessageDialog(null, "One Ticket price is 800.");
				}
				if(comboBox.getSelectedItem().equals("NON-AC")){
					JOptionPane.showMessageDialog(null, "One Ticket price is 450.");
				}
				}
				//dhaka kushtia
				if((comboBox_1.getSelectedItem().equals("Dhaka")&&comboBox_2.getSelectedItem().equals("Kushtia"))||(comboBox_1.getSelectedItem().equals("Kushtia")&&comboBox_2.getSelectedItem().equals("Dhaka"))) {
					if(comboBox.getSelectedItem().equals("AC")){
						JOptionPane.showMessageDialog(null, "One Ticket price is 800.");
					}
					if(comboBox.getSelectedItem().equals("NON-AC")){
						JOptionPane.showMessageDialog(null, "One Ticket price is 450.");
					}
					}
				//dhaka khulna
				if((comboBox_1.getSelectedItem().equals("Dhaka")&&comboBox_2.getSelectedItem().equals("Khulna"))||(comboBox_1.getSelectedItem().equals("Khulna")&&comboBox_2.getSelectedItem().equals("Dhaka"))) {
					if(comboBox.getSelectedItem().equals("AC")){
						JOptionPane.showMessageDialog(null, "One Ticket price is 1200.");
					}
					if(comboBox.getSelectedItem().equals("NON-AC")){
						JOptionPane.showMessageDialog(null, "One Ticket price is 650.");
					}
					}
				if((comboBox_1.getSelectedItem().equals("Dhaka")&&comboBox_2.getSelectedItem().equals("Sylhet"))||(comboBox_1.getSelectedItem().equals("Sylhet")&&comboBox_2.getSelectedItem().equals("Dhaka"))) {
					if(comboBox.getSelectedItem().equals("AC")){
						JOptionPane.showMessageDialog(null, "One Ticket price is 800.");
					}
					if(comboBox.getSelectedItem().equals("NON-AC")){
						JOptionPane.showMessageDialog(null, "One Ticket price is 450.");
					}
					}
				if((comboBox_1.getSelectedItem().equals("Dhaka")&&comboBox_2.getSelectedItem().equals("Chittagong"))||(comboBox_1.getSelectedItem().equals("Chittagong")&&comboBox_2.getSelectedItem().equals("Dhaka"))) {
					if(comboBox.getSelectedItem().equals("AC")){
						JOptionPane.showMessageDialog(null, "One Ticket price is 1000.");
					}
					if(comboBox.getSelectedItem().equals("NON-AC")){
						JOptionPane.showMessageDialog(null, "One Ticket price is 550.");
					}
					}
				//Other error
				if((comboBox_1.getSelectedItem().equals("Dhaka")&&comboBox_2.getSelectedItem().equals("Dhaka"))||
						(comboBox_1.getSelectedItem().equals("Kushtia")&&comboBox_2.getSelectedItem().equals("Kushtia"))||
						(comboBox_1.getSelectedItem().equals("Kushtia")&&comboBox_2.getSelectedItem().equals("Rajshahi"))||
						(comboBox_1.getSelectedItem().equals("Kushtia")&&comboBox_2.getSelectedItem().equals("Khulna"))||
						(comboBox_1.getSelectedItem().equals("Kushtia")&&comboBox_2.getSelectedItem().equals("Sylhet"))||
						(comboBox_1.getSelectedItem().equals("Kushtia")&&comboBox_2.getSelectedItem().equals("Chittagong"))||
						(comboBox_1.getSelectedItem().equals("Rajshahi")&&comboBox_2.getSelectedItem().equals("Rajshahi"))||
						(comboBox_1.getSelectedItem().equals("Rajshahi")&&comboBox_2.getSelectedItem().equals("Kushtia"))||
						(comboBox_1.getSelectedItem().equals("Rajshahi")&&comboBox_2.getSelectedItem().equals("Khulna"))||
						(comboBox_1.getSelectedItem().equals("Rajshahi")&&comboBox_2.getSelectedItem().equals("Sylhet"))||
						(comboBox_1.getSelectedItem().equals("Rajshahi")&&comboBox_2.getSelectedItem().equals("Chittagong"))||
						(comboBox_1.getSelectedItem().equals("Khulna")&&comboBox_2.getSelectedItem().equals("Khulna"))||
						(comboBox_1.getSelectedItem().equals("Khulna")&&comboBox_2.getSelectedItem().equals("Kushtia"))||
						(comboBox_1.getSelectedItem().equals("Khulna")&&comboBox_2.getSelectedItem().equals("Rajshahi"))||
						(comboBox_1.getSelectedItem().equals("Khulna")&&comboBox_2.getSelectedItem().equals("Sylhet"))||
						(comboBox_1.getSelectedItem().equals("Khulna")&&comboBox_2.getSelectedItem().equals("Chittagong"))||
						(comboBox_1.getSelectedItem().equals("Sylhet")&&comboBox_2.getSelectedItem().equals("Sylhet"))||
						(comboBox_1.getSelectedItem().equals("Sylhet")&&comboBox_2.getSelectedItem().equals("Kushtia"))||
						(comboBox_1.getSelectedItem().equals("Sylhet")&&comboBox_2.getSelectedItem().equals("Khulna"))||
						(comboBox_1.getSelectedItem().equals("Sylhet")&&comboBox_2.getSelectedItem().equals("Rajshahi"))||
						(comboBox_1.getSelectedItem().equals("Sylhet")&&comboBox_2.getSelectedItem().equals("Chittagong"))||
						(comboBox_1.getSelectedItem().equals("Chittagong")&&comboBox_2.getSelectedItem().equals("Chittagong"))||
						(comboBox_1.getSelectedItem().equals("Chittagong")&&comboBox_2.getSelectedItem().equals("Kushtia"))||
						(comboBox_1.getSelectedItem().equals("Chittagong")&&comboBox_2.getSelectedItem().equals("Khulna"))||
						(comboBox_1.getSelectedItem().equals("Chittagong")&&comboBox_2.getSelectedItem().equals("Rajshahi"))||
						(comboBox_1.getSelectedItem().equals("Chittagong")&&comboBox_2.getSelectedItem().equals("Sylhet"))) {
					JOptionPane.showMessageDialog(null, "Sorry no Bus Available in this Rout .");
				}
				
			}
		});
		contentPane.add(btnPrice);
		
		JLabel lblToShowTicket = new JLabel("To Show Ticket Price");
		lblToShowTicket.setBounds(251, 314, 136, 16);
		lblToShowTicket.setForeground(new Color(255, 255, 255));
		contentPane.add(lblToShowTicket);
		
		dateChooser = new JDateChooser();
		dateChooser.setBounds(96, 378, 126, 22);
		contentPane.add(dateChooser);
		
		comboBox_3 = new JComboBox();
		comboBox_3.setBounds(248, 378, 85, 22);
		contentPane.add(comboBox_3);
		comboBox_3.addItem("6:00 am");
		comboBox_3.addItem("7:00 am");
		comboBox_3.addItem("8:00 am");
		comboBox_3.addItem("9:00 am");
		comboBox_3.addItem("1:00 pm");
		comboBox_3.addItem("8:00 pm");
		comboBox_3.addItem("9:00 pm");
		comboBox_3.addItem("10:00 pm");
		comboBox_3.addItem("11:00pm");
		
		JLabel lblJourneyDate = new JLabel("Journey Date");
		lblJourneyDate.setForeground(Color.WHITE);
		lblJourneyDate.setBounds(99, 359, 97, 16);
		contentPane.add(lblJourneyDate);
		
		JLabel lblTimeOfArrival = new JLabel("Time of Arrival");
		lblTimeOfArrival.setForeground(Color.WHITE);
		lblTimeOfArrival.setBounds(248, 359, 90, 16);
		contentPane.add(lblTimeOfArrival);
		
		btnPrint = new JButton("Print");
		btnPrint.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name,Print=null,seatnumber,mail,phone,time=null,date=null;
				int num,price;
				
				name=NAME.getText();
				
				seatnumber=sitnumber.getText();
			
				num=Integer.parseInt(how.getText());
				mail=mail1.getText();
				phone=Phone.getText();
				//Dhaka and Rajshahi
				if(comboBox_1.getSelectedItem().equals("Dhaka")&&comboBox_2.getSelectedItem().equals("Rajshahi")) {
				if(comboBox.getSelectedItem().equals("AC")) {
						DateFormat df=new SimpleDateFormat("yyyy-MM-dd");
						date=df.format(dateChooser.getDate());
						price=num*800;
				 	   	Print="                              Supervisor Slip:\n"+"Name:"+name+"\n"+"Mail:"+mail+"\nPhone"+phone+"\n\nFrom:Dhaka       To:Rajshahi"+"\nJarney Date:"+date+"\n"+time+"\nNumber of passenger:"+num+"       The Seat number is:"+seatnumber+"\nPrice:"+price+"\n"+"---------------------------------------------------------------------------------------------------\n\n                              Customer Slip\n\n"+"Name:"+name+"\n"+"Mail:"+mail+"\nPhone"+phone+"\n\nFrom:Dhaka       To:Rajshahi"+"\nJarney Date:"+date+"\n"+time+"\nNumber of passenger:"+num+"       The Seat number is:"+seatnumber+"\nPrice:"+price;
				 	   	
				 	   
				}
				else if(comboBox.getSelectedItem().equals("NON-AC")) {
						DateFormat df=new SimpleDateFormat("yyyy-MM-dd");
						date=df.format(dateChooser.getDate());
						price=num*450;
				 	   	Print="                              Supervisor Slip:\n"+"Name:"+name+"\n"+"Mail:"+mail+"\nPhone"+phone+"\n\nFrom:Dhaka       To:Rajshahi"+"\nJarney Date:"+date+"\n"+time+"\nNumber of passenger:"+num+"       The Seat number is:"+seatnumber+"\nPrice:"+price+"\n"+"---------------------------------------------------------------------------------------------------\n\n                              Customer Slip\n\n"+"Name:"+name+"\n"+"Mail:"+mail+"\nPhone"+phone+"\n\nFrom:Dhaka       To:Rajshahi"+"\nJarney Date:"+date+"\n"+time+"\nNumber of passenger:"+num+"       The Seat number is:"+seatnumber+"\nPrice:"+price;
				 	   	
				 	   
				}
				  
				}
				
				//rajshahi dhaka
				
				if(comboBox_1.getSelectedItem().equals("Rajshahi")&&comboBox_2.getSelectedItem().equals("Dhaka")) {
					if(comboBox.getSelectedItem().equals("AC")) {
							DateFormat df=new SimpleDateFormat("yyyy-MM-dd");
						    date=df.format(dateChooser.getDate());
							price=num*800;
					 	   	Print="                              Supervisor Slip:\n"+"Name:"+name+"\n"+"Mail:"+mail+"\nPhone"+phone+"\n\nFrom:Rajshahi       To:Dhaka"+"\nJarney Date:"+date+"\n"+time+"\nNumber of passenger:"+num+"       The Seat number is:"+seatnumber+"\nPrice:"+price+"\n"+"---------------------------------------------------------------------------------------------------\n\n                              Customer Slip\n\n"+"Name:"+name+"\n"+"Mail:"+mail+"\nPhone"+phone+"\n\nFrom:Rajshahi       To:Dhaka"+"\nJarney Date:"+date+"\n"+time+"\nNumber of passenger:"+num+"       The Seat number is:"+seatnumber+"\nPrice:"+price;
					 	   	
					 	   
					}
					else if(comboBox.getSelectedItem().equals("NON-AC")) {
							DateFormat df=new SimpleDateFormat("yyyy-MM-dd");
							date=df.format(dateChooser.getDate());
							price=num*450;
					 	   	Print="                              Supervisor Slip:\n"+"Name:"+name+"\n"+"Mail:"+mail+"\nPhone"+phone+"\n\nFrom:Rajshahi      To:Dhaka"+"\nJarney Date:"+date+"\n"+time+"\nNumber of passenger:"+num+"       The Seat number is:"+seatnumber+"\nPrice:"+price+"\n"+"---------------------------------------------------------------------------------------------------\n\n                              Customer Slip\n\n"+"Name:"+name+"\n"+"Mail:"+mail+"\nPhone"+phone+"\n\nFrom:Rajshahi       To:Dhaka"+"\nJarney Date:"+date+"\n"+time+"\nNumber of passenger:"+num+"       The Seat number is:"+seatnumber+"\nPrice:"+price;
					 	   	
					 	   
					}
					  
					}
				
				
				
				//dhaka sylhet
				if(comboBox_1.getSelectedItem().equals("Dhaka")&&comboBox_2.getSelectedItem().equals("Sylhet")) {
					if(comboBox.getSelectedItem().equals("AC")) {
							DateFormat df=new SimpleDateFormat("yyyy-MM-dd");
							date=df.format(dateChooser.getDate());
							price=num*800;
					 	   	Print="                              Supervisor Slip:\n"+"Name:"+name+"\n"+"Mail:"+mail+"\nPhone"+phone+"\n\nFrom:Dhaka       To:Sylhet"+"\nJarney Date:"+date+"\n"+time+"\nNumber of passenger:"+num+"       The Seat number is:"+seatnumber+"\nPrice:"+price+"\n"+"---------------------------------------------------------------------------------------------------\n\n                              Customer Slip\n\n"+"Name:"+name+"\n"+"Mail:"+mail+"\nPhone"+phone+"\n\nFrom:Dhaka       To:Sylhet"+"\nJarney Date:"+date+"\n"+time+"\nNumber of passenger:"+num+"       The Seat number is:"+seatnumber+"\nPrice:"+price;
					 	   
					 	   JOptionPane.showMessageDialog(null,Print);
					}
					else if(comboBox.getSelectedItem().equals("NON-AC")) {
							DateFormat df=new SimpleDateFormat("yyyy-MM-dd");
							date=df.format(dateChooser.getDate());
							price=num*450;
					 	   	Print="                              Supervisor Slip:\n"+"Name:"+name+"\n"+"Mail:"+mail+"\nPhone"+phone+"\n\nFrom:Dhaka       To:Sylhet"+"\nJarney Date:"+date+"\n"+time+"\nNumber of passenger:"+num+"       The Seat number is:"+seatnumber+"\nPrice:"+price+"\n"+"---------------------------------------------------------------------------------------------------\n\n                              Customer Slip\n\n"+"Name:"+name+"\n"+"Mail:"+mail+"\nPhone"+phone+"\n\nFrom:Dhaka       To:Sylhet"+"\nJarney Date:"+date+"\n"+time+"\nNumber of passenger:"+num+"       The Seat number is:"+seatnumber+"\nPrice:"+price;
					 	   	
					 	  
					}
					  
					}
				
				//sylhet dhaka
				if(comboBox_1.getSelectedItem().equals("Sylhet")&&comboBox_2.getSelectedItem().equals("Dhaka")) {
					if(comboBox.getSelectedItem().equals("AC")) {
							DateFormat df=new SimpleDateFormat("yyyy-MM-dd");
							date=df.format(dateChooser.getDate());
							price=num*800;
					 	   	Print="                              Supervisor Slip:\n"+"Name:"+name+"\n"+"Mail:"+mail+"\nPhone"+phone+"\n\nFrom:Sylhet       To:Dhaka"+"\nJarney Date:"+date+"\n"+time+"\nNumber of passenger:"+num+"       The Seat number is:"+seatnumber+"\nPrice:"+price+"\n"+"---------------------------------------------------------------------------------------------------\n\n                              Customer Slip\n\n"+"Name:"+name+"\n"+"Mail:"+mail+"\nPhone"+phone+"\n\nFrom:Sylhet       To:Dhaka"+"\nJarney Date:"+date+"\n"+time+"\nNumber of passenger:"+num+"       The Seat number is:"+seatnumber+"\nPrice:"+price;
					 	   
					 	   
					}
					else if(comboBox.getSelectedItem().equals("NON-AC")) {
							DateFormat df=new SimpleDateFormat("yyyy-MM-dd");
							date=df.format(dateChooser.getDate());
							price=num*450;
					 	   	Print="                              Supervisor Slip:\n"+"Name:"+name+"\n"+"Mail:"+mail+"\nPhone"+phone+"\n\nFrom:Sylhet      To:Dhaka"+"\nJarney Date:"+date+"\n"+time+"\nNumber of passenger:"+num+"       The Seat number is:"+seatnumber+"\nPrice:"+price+"\n"+"---------------------------------------------------------------------------------------------------\n\n                              Customer Slip\n\n"+"Name:"+name+"\n"+"Mail:"+mail+"\nPhone"+phone+"\n\nFrom:Sylhet       To:Dhaka"+"\nJarney Date:"+date+"\n"+time+"\nNumber of passenger:"+num+"       The Seat number is:"+seatnumber+"\nPrice:"+price;
					 	   	
					 	   
					}
					  
					}
				
				
				
				//dhaka to kushtia
				
					if(comboBox_1.getSelectedItem().equals("Dhaka")&&comboBox_2.getSelectedItem().equals("Kushtia")) {
						if(comboBox.getSelectedItem().equals("AC")) {
							DateFormat df=new SimpleDateFormat("yyyy-MM-dd");
							date=df.format(dateChooser.getDate());
							price=num*800;
					 	   	Print="                              Supervisor Slip:\n"+"Name:"+name+"\n"+"Mail:"+mail+"\nPhone"+phone+"\n\nFrom:Dhaka       To:Kushtia"+"\nJarney Date:"+date+"\n"+time+"\nNumber of passenger:"+num+"       The Seat number is:"+seatnumber+"\nPrice:"+price+"\n"+"---------------------------------------------------------------------------------------------------\n\n                              Customer Slip\n\n"+"Name:"+name+"\n"+"Mail:"+mail+"\nPhone"+phone+"\n\nFrom:Dhaka       To:Kushtia"+"\nJarney Date:"+date+"\n"+time+"\nNumber of passenger:"+num+"       The Seat number is:"+seatnumber+"\nPrice:"+price;
					 	   	
					 	   
					}
					else if(comboBox.getSelectedItem().equals("NON-AC")) {
							DateFormat df=new SimpleDateFormat("yyyy-MM-dd");
							date=df.format(dateChooser.getDate());
							price=num*450;
					 	   	Print="                              Supervisor Slip:\n"+"Name:"+name+"\n"+"Mail:"+mail+"\nPhone"+phone+"\n\nFrom:Dhaka       To:Kushtia"+"\nJarney Date:"+date+"\n"+time+"\nNumber of passenger:"+num+"       The Seat number is:"+seatnumber+"\nPrice:"+price+"\n"+"---------------------------------------------------------------------------------------------------\n\n                              Customer Slip\n\n"+"Name:"+name+"\n"+"Mail:"+mail+"\nPhone"+phone+"\n\nFrom:Dhaka       To:Kushtia"+"\nJarney Date:"+date+"\n"+time+"\nNumber of passenger:"+num+"       The Seat number is:"+seatnumber+"\nPrice:"+price;
					 	   	
					 	   
					}
					  
					}
					
					//kustia dhaka
					if(comboBox_1.getSelectedItem().equals("Kushtia")&&comboBox_2.getSelectedItem().equals("Dhaka")) {
						if(comboBox.getSelectedItem().equals("AC")) {
							DateFormat df=new SimpleDateFormat("yyyy-MM-dd");
							date=df.format(dateChooser.getDate());
							price=num*800;
					 	   	Print="                              Supervisor Slip:\n"+"Name:"+name+"\n"+"Mail:"+mail+"\nPhone"+phone+"\n\nFrom:Kushtia      To:Dhaka"+"\nJarney Date:"+date+"\n"+time+"\nNumber of passenger:"+num+"       The Seat number is:"+seatnumber+"\nPrice:"+price+"\n"+"---------------------------------------------------------------------------------------------------\n\n                              Customer Slip\n\n"+"Name:"+name+"\n"+"Mail:"+mail+"\nPhone"+phone+"\n\nFrom:Kushtia       To:Dhaka"+"\nJarney Date:"+date+"\n"+time+"\nNumber of passenger:"+num+"       The Seat number is:"+seatnumber+"\nPrice:"+price;
					 	   	
					 	   
					}
					else if(comboBox.getSelectedItem().equals("NON-AC")) {
							DateFormat df=new SimpleDateFormat("yyyy-MM-dd");
							date=df.format(dateChooser.getDate());
							price=num*450;
					 	   	Print="                              Supervisor Slip:\n"+"Name:"+name+"\n"+"Mail:"+mail+"\nPhone"+phone+"\n\nFrom:Kushtia      To:Dhaka"+"\nJarney Date:"+date+"\n"+time+"\nNumber of passenger:"+num+"       The Seat number is:"+seatnumber+"\nPrice:"+price+"\n"+"---------------------------------------------------------------------------------------------------\n\n                              Customer Slip\n\n"+"Name:"+name+"\n"+"Mail:"+mail+"\nPhone"+phone+"\n\nFrom:Kushtia       To:Dhaka"+"\nJarney Date:"+date+"\n"+time+"\nNumber of passenger:"+num+"       The Seat number is:"+seatnumber+"\nPrice:"+price;
					 	   	
					 	   
					}
					  
					}
					
					
                    //dhaka khulna
					if(comboBox_1.getSelectedItem().equals("Dhaka")&&comboBox_2.getSelectedItem().equals("Khulna")) {
						if(comboBox.getSelectedItem().equals("AC")) {
							DateFormat df=new SimpleDateFormat("yyyy-MM-dd");
							date=df.format(dateChooser.getDate());
							price=num*1200;
					 	   	Print="                              Supervisor Slip:\n"+"Name:"+name+"\n"+"Mail:"+mail+"\nPhone"+phone+"\n\nFrom:Dhaka       To:Khulna"+"\nJarney Date:"+date+"\n"+time+"\nNumber of passenger:"+num+"       The Seat number is:"+seatnumber+"\nPrice:"+price+"\n"+"---------------------------------------------------------------------------------------------------\n\n                              Customer Slip\n\n"+"Name:"+name+"\n"+"Mail:"+mail+"\nPhone"+phone+"\n\nFrom:Dhaka       To:Khulna"+"\nJarney Date:"+date+"\n"+time+"\nNumber of passenger:"+num+"       The Seat number is:"+seatnumber+"\nPrice:"+price;
					 	   	
					 	   
					}
					else if(comboBox.getSelectedItem().equals("NON-AC")) {
							DateFormat df=new SimpleDateFormat("yyyy-MM-dd");
							date=df.format(dateChooser.getDate());
							price=num*650;
					 	   	Print="                              Supervisor Slip:\n"+"Name:"+name+"\n"+"Mail:"+mail+"\nPhone"+phone+"\n\nFrom:Dhaka       To:Khulna"+"\nJarney Date:"+date+"\n"+time+"\nNumber of passenger:"+num+"       The Seat number is:"+seatnumber+"\nPrice:"+price+"\n"+"---------------------------------------------------------------------------------------------------\n\n                              Customer Slip\n\n"+"Name:"+name+"\n"+"Mail:"+mail+"\nPhone"+phone+"\n\nFrom:Dhaka       To:Khulna"+"\nJarney Date:"+date+"\n"+time+"\nNumber of passenger:"+num+"       The Seat number is:"+seatnumber+"\nPrice:"+price;
					 	   	
					 	   
					}
					  
					}
					//khulna dhaka
					if(comboBox_1.getSelectedItem().equals("Khulna")&&comboBox_2.getSelectedItem().equals("Dhaka")) {
						if(comboBox.getSelectedItem().equals("AC")) {
							DateFormat df=new SimpleDateFormat("yyyy-MM-dd");
							date=df.format(dateChooser.getDate());
							price=num*1200;
					 	   	Print="                              Supervisor Slip:\n"+"Name:"+name+"\n"+"Mail:"+mail+"\nPhone"+phone+"\n\nFrom:Khulna      To:Dhaka"+"\nJarney Date:"+date+"\n"+time+"\nNumber of passenger:"+num+"       The Seat number is:"+seatnumber+"\nPrice:"+price+"\n"+"---------------------------------------------------------------------------------------------------\n\n                              Customer Slip\n\n"+"Name:"+name+"\n"+"Mail:"+mail+"\nPhone"+phone+"\n\nFrom:Khulna       To:Dhaka"+"\nJarney Date:"+date+"\n"+time+"\nNumber of passenger:"+num+"       The Seat number is:"+seatnumber+"\nPrice:"+price;
					 	   	
					 	   
					}
					else if(comboBox.getSelectedItem().equals("NON-AC")) {
							DateFormat df=new SimpleDateFormat("yyyy-MM-dd");
							date=df.format(dateChooser.getDate());
							price=num*650;
					 	   	Print="                              Supervisor Slip:\n"+"Name:"+name+"\n"+"Mail:"+mail+"\nPhone"+phone+"\n\nFrom:Khulna       To:Dhaka"+"\nJarney Date:"+date+"\n"+time+"\nNumber of passenger:"+num+"       The Seat number is:"+seatnumber+"\nPrice:"+price+"\n"+"---------------------------------------------------------------------------------------------------\n\n                              Customer Slip\n\n"+"Name:"+name+"\n"+"Mail:"+mail+"\nPhone"+phone+"\n\nFrom:Khulna       To:Dhaka"+"\nJarney Date:"+date+"\n"+time+"\nNumber of passenger:"+num+"       The Seat number is:"+seatnumber+"\nPrice:"+price;
					 	   	
					 	   
					}
					  
					}
					//dhaka chittagong
					if(comboBox_1.getSelectedItem().equals("Dhaka")&&comboBox_2.getSelectedItem().equals("Chittagong")) {
						if(comboBox.getSelectedItem().equals("AC")) {
							DateFormat df=new SimpleDateFormat("yyyy-MM-dd");
							date=df.format(dateChooser.getDate());
							price=num*1000;
					 	   	Print="                              Supervisor Slip:\n"+"Name:"+name+"\n"+"Mail:"+mail+"\nPhone"+phone+"\n\nFrom:Dhaka       To:Chittagong"+"\nJarney Date:"+date+"\n"+time+"\nNumber of passenger:"+num+"       The Seat number is:"+seatnumber+"\nPrice:"+price+"\n"+"---------------------------------------------------------------------------------------------------\n\n                              Customer Slip\n\n"+"Name:"+name+"\n"+"Mail:"+mail+"\nPhone"+phone+"\n\nFrom:Dhaka       To:Chittagong"+"\nJarney Date:"+date+"\n"+time+"\nNumber of passenger:"+num+"       The Seat number is:"+seatnumber+"\nPrice:"+price;
					 	   	
					 	   
					}
					else if(comboBox.getSelectedItem().equals("NON-AC")) {
							DateFormat df=new SimpleDateFormat("yyyy-MM-dd");
							date=df.format(dateChooser.getDate());
							price=num*550;
					 	   	Print="                              Supervisor Slip:\n"+"Name:"+name+"\n"+"Mail:"+mail+"\nPhone"+phone+"\n\nFrom:Dhaka       To:Chittagong"+"\nJarney Date:"+date+"\n"+time+"\nNumber of passenger:"+num+"       The Seat number is:"+seatnumber+"\nPrice:"+price+"\n"+"---------------------------------------------------------------------------------------------------\n\n                              Customer Slip\n\n"+"Name:"+name+"\n"+"Mail:"+mail+"\nPhone"+phone+"\n\nFrom:Dhaka       To:Chittagong"+"\nJarney Date:"+date+"\n"+time+"\nNumber of passenger:"+num+"       The Seat number is:"+seatnumber+"\nPrice:"+price;
					 	   	
					 	   
					}
					  
					}
					//chittagong dhaka
					if(comboBox_1.getSelectedItem().equals("Chittagong")&&comboBox_2.getSelectedItem().equals("Dhaka")) {
						if(comboBox.getSelectedItem().equals("AC")) {
							DateFormat df=new SimpleDateFormat("yyyy-MM-dd");
							date=df.format(dateChooser.getDate());
							price=num*1000;
					 	   	Print="                              Supervisor Slip:\n"+"Name:"+name+"\n"+"Mail:"+mail+"\nPhone"+phone+"\n\nFrom:Chittagong       To:Dhaka"+"\nJarney Date:"+date+"\n"+time+"\nNumber of passenger:"+num+"       The Seat number is:"+seatnumber+"\nPrice:"+price+"\n"+"---------------------------------------------------------------------------------------------------\n\n                              Customer Slip\n\n"+"Name:"+name+"\n"+"Mail:"+mail+"\nPhone"+phone+"\n\nFrom:Chittagong       To:Dhaka"+"\nJarney Date:"+date+"\n"+time+"\nNumber of passenger:"+num+"       The Seat number is:"+seatnumber+"\nPrice:"+price;
					 	   	
					 	   
					}
					else if(comboBox.getSelectedItem().equals("NON-AC")) {
							DateFormat df=new SimpleDateFormat("yyyy-MM-dd");
							date=df.format(dateChooser.getDate());
							price=num*550;
					 	   	Print="                              Supervisor Slip:\n"+"Name:"+name+"\n"+"Mail:"+mail+"\nPhone"+phone+"\n\nFrom:Chittagong       To:Dhaka"+"\nJarney Date:"+date+"\n"+time+"\nNumber of passenger:"+num+"       The Seat number is:"+seatnumber+"\nPrice:"+price+"\n"+"---------------------------------------------------------------------------------------------------\n\n                              Customer Slip\n\n"+"Name:"+name+"\n"+"Mail:"+mail+"\nPhone"+phone+"\n\nFrom:Chittagong       To:Dhaka"+"\nJarney Date:"+date+"\n"+time+"\nNumber of passenger:"+num+"       The Seat number is:"+seatnumber+"\nPrice:"+price;
					 	   	
					 	   
					}
					  
					}
				JFileChooser fs =new JFileChooser(new File("c:\\"));
				fs.setDialogTitle("Save a File");
				fs.setFileFilter(new FileTypeFilter(".doc","Document File"));
				int result=fs.showSaveDialog(null);
				if(result == JFileChooser.APPROVE_OPTION) {
					
					File fi=fs.getSelectedFile();
					try {
						FileWriter fw=new FileWriter(fi.getPath());
						fw.write(Print);
						fw.flush();
						fw.close();
					}
					catch (Exception arg) {
						JOptionPane.showMessageDialog(null,"");
					}
				}
				
			}
		});
		btnPrint.setBounds(419, 515, 97, 25);
		contentPane.add(btnPrint);
		
		btnContactUs = new JButton("Contact us");
		btnContactUs.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null,"+8801764-623-155\n+8801830-737-616");
			}
		});
		btnContactUs.setBounds(795, 515, 97, 25);
		contentPane.add(btnContactUs);
		
		
	}
}
