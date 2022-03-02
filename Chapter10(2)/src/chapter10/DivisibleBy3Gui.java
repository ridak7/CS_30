package chapter10;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.SwingConstants;

public class DivisibleBy3Gui {

	private JFrame frame;
	private JTextField tF;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DivisibleBy3Gui window = new DivisibleBy3Gui();
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
	public DivisibleBy3Gui() {	
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(247, 255, 255));
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(115, 178, 180));
		panel.setBounds(0, 260, 434, -260);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		
		JTextPane tP = new JTextPane();
		tP.setFont(new Font("Yu Gothic", Font.PLAIN, 11));
		tP.setBackground(new Color(240, 255, 240));
		tP.setBounds(225, 131, 161, 20);
		frame.getContentPane().add(tP);
		
		
		tF = new JTextField();
		tF.setFont(new Font("Yu Gothic UI", Font.ITALIC, 11));
		tF.setBackground(new Color(255, 255, 255));
		tF.setEditable(false);
		tF.addMouseListener(new MouseAdapter() {
				@Override	
			public void mouseClicked(MouseEvent e) {
			tF.setText("");
			tF.setEditable(true);
			tP.setText("");
			}
		});
		tF.setForeground(Color.DARK_GRAY);
		tF.setText("enter here");
		tF.setBounds(225, 48, 161, 23);
		frame.getContentPane().add(tF);
		tF.setColumns(10);
		
		
		
		
		JButton jButton = new JButton("Check number");
		jButton.setBackground(new Color(240, 255, 240));
		jButton.setVerticalAlignment(SwingConstants.TOP);
		jButton.setFont(new Font("Yu Gothic", Font.PLAIN, 11));
		jButton.addActionListener(new ActionListener() {
			
			
			
			
			
	public void actionPerformed(ActionEvent e) {
			
			int remainder;
			int product;
			String number = tF.getText();	
			int num = Integer.parseInt(number);
			remainder = (num % 3);
			product = (num / 3);
				
			 if (remainder == 0) { 
				 tP.setText("Number is divisible by 3");
				 tF.setText(num + " % 3 = " + product);
				 
			 } else {
				 tP.setText("Number is not divisible by 3");
				 
				 
		
			
			 }
			}	
		});
		
		
		
		
		jButton.setBounds(36, 131, 133, 23);
		frame.getContentPane().add(jButton);
		
		JLabel jLabel = new JLabel("Enter an Integer.");
		jLabel.setFont(new Font("Yu Gothic Medium", Font.ITALIC, 12));
		jLabel.setBounds(36, 47, 133, 33);
		frame.getContentPane().add(jLabel);
		
		
	}
}
