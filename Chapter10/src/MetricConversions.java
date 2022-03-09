import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.SystemColor;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

import javax.swing.JTextField;
import javax.swing.JComboBox;
import java.awt.Font;
import javax.swing.DefaultComboBoxModel;

public class MetricConversions {

	private JFrame frame;
	private JTextField UN;
	private JTextField OConv;
	private JTextField ONum;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MetricConversions window = new MetricConversions();
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
	public MetricConversions() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.LIGHT_GRAY);
		frame.setBounds(100, 100, 450, 233);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(SystemColor.activeCaption);
		panel.setBounds(10, 11, 414, 172);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		UN = new JTextField();
		UN.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 11));
		UN.setText("Enter a number.");
		UN.setBounds(123, 11, 150, 20);
		panel.add(UN);
		UN.setColumns(10);
		
		JComboBox UC = new JComboBox();
		UC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				
				String un = UN.getText();
				double num = Double.parseDouble(un);
				double nconv;
				 
				
				if(UC.getSelectedItem().equals("Inches to centimeters")) 
				{
					OConv.setText("1 inch = 2.54 centimeters");
					
					nconv = Math.round((num * 2.54) * 100.0) / 100.0;
					
					ONum.setText("Your new number is: " + nconv + " centimeters");
				}
				
				else if(UC.getSelectedItem().equals("Feet to meters")) 
				{
					OConv.setText("1 foot = 0.3048 meters");
					
					nconv = Math.round((num * 0.3048) * 100.0) / 100.0;
					
					ONum.setText("Your new number is: " + nconv + " meters");
				}
				
				else if(UC.getSelectedItem().equals("Gallons to liters")) 
				{
					OConv.setText("1 gallon = 4.5461 liters");
					
					nconv = Math.round((num * 4.5461) * 100.0) / 100.0;
					
					ONum.setText("Your new number is: " + nconv + " liters");
				}
				
				else if(UC.getSelectedItem().equals("Pounds to kilograms")) 
				{
					OConv.setText("1 pound = 0.4536 kilograms");
					
					nconv = Math.round((num * 0.4536) * 100.0) / 100.0;
					
					ONum.setText("Your new number is: " + nconv + " kilograms");
				}
			}
		});
		
		
	
		
		
		
		
		
		UC.setModel(new DefaultComboBoxModel(new String[] {"", "Inches to centimeters", "Feet to meters", "Gallons to liters", "Pounds to kilograms"}));
		UC.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 11));
		UC.setBounds(123, 56, 150, 22);
		panel.add(UC);
		
		
		OConv = new JTextField();
		OConv.setBounds(90, 141, 220, 20);
		panel.add(OConv);
		OConv.setColumns(10);
		
		ONum = new JTextField();
		ONum.setColumns(10);
		ONum.setBounds(90, 110, 220, 20);
		panel.add(ONum);
	}
}
