import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class demo {

	private JFrame frame;
	private JTextField LN;
	private JTextField FN;
	private JTextField Display;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					demo window = new demo();
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
	public demo() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 434, 261);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		LN = new JTextField();
		LN.setForeground(Color.LIGHT_GRAY);
		LN.setText("Last Name");
		LN.setBounds(244, 11, 130, 20);
		panel.add(LN);
		LN.setColumns(10);
		
		FN = new JTextField();
		FN.setForeground(Color.LIGHT_GRAY);
		FN.setText("First Name");
		FN.setColumns(10);
		FN.setBounds(60, 11, 130, 20);
		panel.add(FN);
		
		JComboBox Grade = new JComboBox();
		Grade.setModel(new DefaultComboBoxModel(new String[] {"10", "11", "12"}));
		Grade.setBounds(99, 50, 40, 20);
		panel.add(Grade);
		
		JLabel lblNewLabel = new JLabel("Grade");
		lblNewLabel.setBounds(60, 53, 29, 14);
		panel.add(lblNewLabel);
		
		JComboBox School = new JComboBox();
		School.setModel(new DefaultComboBoxModel(new String[] {"Crescent", "Aberheart", "Nortre Dame"}));
		School.setBounds(99, 99, 80, 22);
		panel.add(School);
		
		JLabel lblNewLabel_1 = new JLabel("School");
		lblNewLabel_1.setBounds(60, 103, 40, 14);
		panel.add(lblNewLabel_1);
		
		Display = new JTextField();
		Display.setBounds(60, 156, 314, 94);
		panel.add(Display);
		Display.setColumns(10);
		
		JButton btnNewButton = new JButton("Submit");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				String grade = " ";
				String school = " ";
				String Fn = FN.getText();
				String Ln = LN.getText();
				
				if(Grade.getSelectedItem().equals("10"))
				{
					grade = "10";
				}
				
				else if(Grade.getSelectedItem().equals("11"))
				{
					grade = "11";
				}
				
				else if (Grade.getSelectedItem().equals("12"))
				{
					grade = "12";
				}
				
				
				if (School.getSelectedItem().equals("Crescent"))
				{
					school = "Crescent";
				}	
				
				else if (School.getSelectedItem().equals("Aberheart"))
				{
					school = "Aberheart";
				}
				
				else if (School.getSelectedItem().equals("Nortre Dame"))
				{
					school = "Nortre Dame";
				}
				
				
				Display.setText(Fn + " " + Ln + " " + "is in the Grade " + grade + " " + "And goes to " + school);
			}
		});
		btnNewButton.setBounds(285, 75, 89, 23);
		panel.add(btnNewButton);
	}
}
