package chapter10;


//Metric Conversion Application 
//Will Thompson


import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JComboBox;
import java.awt.Font;
import javax.swing.JTextPane;

public class MetricConversionGui implements ActionListener {

	
    JFrame frame;
    JPanel contentPane;
	JTextPane Pane;
	JLabel prompt;
	JLabel jlb;
    JComboBox<Object> comboBox;
	String SelUnits;
	private JLabel lblNewLabel;

	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {
			public void run() { 
			
				try {
					MetricConversionGui window = new MetricConversionGui();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}


		
		
	public MetricConversionGui() {
		
		
	frame = new JFrame("MetricConversion");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  	
	
	contentPane = new JPanel();
	contentPane.setLayout(new BoxLayout(contentPane, 
								BoxLayout.PAGE_AXIS));
	contentPane.setBorder(BorderFactory.createEmptyBorder
										(10, 10, 10, 10));
	
	
	prompt = new JLabel("Select a conversion type:");
	prompt.setFont(new Font("Source Code Pro", Font.PLAIN, 11));
	prompt.setHorizontalAlignment(SwingConstants.LEFT);
	prompt.setBounds(0, 11, 198, 27);	
		contentPane.add(prompt);
	
	
	
    /*  string that will be used to add variables to the combo box 	*/		
	String Units[] = {"feet to meters", "inches to centimeters", "gallons to liters", "pounds to kilograms"};

		
	/* adding the string 'Units' to the combo box  */	
	comboBox = new JComboBox<Object>(Units);
	comboBox.setBackground(new Color(245, 245, 245));
	comboBox.setFont(new Font("Yu Gothic UI", Font.PLAIN, 11));
	comboBox.setBounds(20, 38, 134, 22);
	comboBox.setSelectedIndex(0);
	comboBox.addActionListener(this);
		contentPane.add(comboBox);
	
		
	jlb = new JLabel("1 foot = 0.3048 meters");
	jlb.setFont(new Font("Source Code Pro", Font.PLAIN, 11));
	jlb.setBounds(209, 43, 46, 14);	
	jlb.setBorder(BorderFactory.createEmptyBorder
									(20, 0, 0, 0));	
	contentPane.add(jlb);	
	
	
	frame.setContentPane(contentPane);
	
	lblNewLabel = new JLabel("\t                                                                   ");
	contentPane.add(lblNewLabel);
	frame.pack();		
	frame.setVisible(true);	
		
	
	}
		
		
	
	public void actionPerformed(ActionEvent event)  {
		
	//NEED TO CREATE ANOTHER COMBO BOX 
		JComboBox<?> comboBox2 = (JComboBox<?>)event.getSource();
		SelUnits = (String)comboBox2.getSelectedItem();
		/*  String SellUnits is whatever unit conversion is currently selected with the combo box  */
		
		
		
			if (SelUnits == "feet to meters") {
			jlb.setText("1 foot = 0.3048 meters");
		} else if (SelUnits == "inches to centimeters") {
			jlb.setText("1 inch = 2.54 centimeters");
		} else if (SelUnits == "gallons to liters") {
			jlb.setText("1 gallon = 4.5461 liters");
		} else if (SelUnits == "pounds to kilograms") {
			jlb.setText("1 pound = 0.4536 kilograms");
		}
		
		
		
		
		
		
	}
}