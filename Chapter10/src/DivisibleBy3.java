import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.SystemColor;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.border.LineBorder;



import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.util.regex.Pattern;
import java.awt.event.ActionEvent;

public class DivisibleBy3 {

	private JFrame frame;
	private JTextField TF1;
	private JTextField Output;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DivisibleBy3 window = new DivisibleBy3();
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
	public DivisibleBy3() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		panel.setBackground(SystemColor.activeCaption);
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		TF1 = new JTextField();
		TF1.setText("Enter an integer");
		TF1.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 11));
		TF1.setBounds(140, 50, 135, 20);
		panel.add(TF1);
		TF1.setColumns(10);
		
		JButton Submit = new JButton("Submit");
		Submit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
			
				String UI = TF1.getText();
				int UA = 0;
				
			
				if (Pattern.matches("[0-9]+", UI) == true || Pattern.matches("-[0-9]+", UI) == true) {
					UA = Integer.parseInt(UI); 
				
				
				
				if (UA % 3 >= 1 || UA % 3 <=-1) 
					{
						Output.setText("Your integer (" + UA + ") is not divisible by 3.");
					}
					
					else 
					{
						Output.setText("Your integer (" + UA + ") is divisible by 3.");
					}
				}
				
				else 
				{
					Output.setText("Please enter an integer.");
				}
			}
		});
		Submit.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 11));
		Submit.setBounds(140, 110, 135, 23);
		panel.add(Submit);
		
		Output = new JTextField();
		Output.setText("Output");
		Output.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 11));
		Output.setBounds(82, 175, 250, 20);
		panel.add(Output);
		Output.setColumns(10);
	}
}
