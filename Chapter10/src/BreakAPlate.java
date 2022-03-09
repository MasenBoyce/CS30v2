import java.awt.EventQueue;
import javax.swing.*;
import javax.swing.JFrame;
import java.awt.BorderLayout;
import java.awt.SystemColor;
import java.util.Random;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class BreakAPlate {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BreakAPlate window = new BreakAPlate();
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
	public BreakAPlate() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		ImageIcon plates = new ImageIcon ("..\\Chapter10\\src\\plates.gif");
		ImageIcon platestwobroken = new ImageIcon ("..\\Chapter10\\src\\plates_two_broken.gif");
		ImageIcon platesallbroken = new ImageIcon ("..\\Chapter10\\src\\plates_all_broken.gif");
		ImageIcon tigerplush = new ImageIcon ("..\\Chapter10\\src\\tiger_plush.gif");
		ImageIcon sticker = new ImageIcon ("..\\Chapter10\\src\\sticker.gif");
		ImageIcon placeholder = new ImageIcon ("..\\Chapter10\\src\\placeholder.gif");
		
		frame = new JFrame();
		frame.setBounds(100, 100, 520, 509);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(SystemColor.activeCaption);
		panel.setBounds(10, 11, 484, 448);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel Display = new JLabel();
		Display.setBounds(97, 141, 270, 71);
		panel.add(Display);
		Display.setIcon(plates);
		
		JLabel Prize = new JLabel();
		Prize.setBounds(177, 326, 111, 111);
		panel.add(Prize);
		Prize.setIcon(placeholder);
		
		JButton Play = new JButton("Play");
		Play.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			Random RN = new Random();
			int score = RN.nextInt(2);
			
			if(score == 1) 
			{
				Display.setIcon(platesallbroken);
				Prize.setIcon(tigerplush);
				Play.setText("Play again");
				
			}
			
			if(score == 0) 
			{
				Display.setIcon(platestwobroken);
				Prize.setIcon(sticker);
				Play.setText("Play again");
				
			}
			}
		});
		Play.setBounds(144, 269, 170, 23);
		panel.add(Play);	
		
		JLabel lblNewLabel = new JLabel("Welcome to Break a Plate");
		lblNewLabel.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 20));
		lblNewLabel.setBounds(115, 48, 246, 23);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Break all 3 plates to win the grand prize!");
		lblNewLabel_1.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 11));
		lblNewLabel_1.setBounds(126, 96, 228, 34);
		panel.add(lblNewLabel_1);
		
	}
}
