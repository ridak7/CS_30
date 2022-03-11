									Header is missing

package chapter10;


// Break a Plate Implementation 
// Will Thompson 


import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
 


public class BreakAPlate implements ActionListener {
	String FIRST_PRIZE = "tiger plush";
	String CONSOLATION_PRIZE = "sticker";
	JFrame frame;
	JPanel contentPane;
	JButton play;
	JLabel plates, prizeWon;
	GameBooth breakAPlate;
	private JTextField winTf;
	
	public BreakAPlate(){
		//initializing the game booth 
		breakAPlate = new GameBooth(0, FIRST_PRIZE, CONSOLATION_PRIZE);
		
	
		frame = new JFrame("BreakAPlate");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(613, 424);
		

		
		contentPane = new JPanel();
		contentPane.setBorder(BorderFactory.createEmptyBorder(200, 200, 200, 200));
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setLayout(null);
		plates = new JLabel(new ImageIcon(BreakAPlate.class.getResource("/chapter10/plates.gif")));
		plates.setBounds(147, 43, 324, 101);
		plates.setAlignmentX(JLabel.CENTER_ALIGNMENT);
		plates.setBorder(BorderFactory.createEmptyBorder(10, 10, 20, 10));
		contentPane.add(plates);
		
		
		//button to play the game
		play = new JButton("Play");
		play.setBackground(new Color(255, 182, 193));
		play.setBounds(225, 155, 174, 34);
		play.setActionCommand("Play");
		play.setAlignmentX(JButton.CENTER_ALIGNMENT);
		play.addActionListener(this);
		contentPane.add(play);
		//label that will display the prize won 
		prizeWon = new JLabel(new ImageIcon(BreakAPlate.class.getResource("/chapter10/placeholder.gif")));
		prizeWon.setBounds(201, 204, 233, 115);
		prizeWon.setAlignmentX(JLabel.CENTER_ALIGNMENT);
		prizeWon.setBorder(BorderFactory.createEmptyBorder(20, 0, 0, 0));	//add space above
		contentPane.add(prizeWon);
		//add the content to the frame
		frame.setContentPane(contentPane);
		
		
		winTf = new JTextField();
		winTf.setForeground(Color.BLACK);
		winTf.setFont(new Font("Sigmar One", Font.PLAIN, 22));
		winTf.setHorizontalAlignment(SwingConstants.CENTER);
		winTf.setBackground(new Color(255, 255, 255));
		winTf.setEditable(false);
		winTf.setBounds(188, 304, 260, 52);
		contentPane.add(winTf);
		winTf.setColumns(10);
		winTf.setBorder(javax.swing.BorderFactory.createEmptyBorder());

		
		//displaying the frame
		frame.setVisible(true);
		
   }
    
    
	//handle the button click
    public void actionPerformed(ActionEvent event) {
    	String eventName = event.getActionCommand();
    	String prize;
    	
    	if (eventName == "Play") {
			prize = breakAPlate.start();
			//condition for user winning the tiger  
			if (prize.equals(FIRST_PRIZE)) {
				plates.setIcon(new ImageIcon(BreakAPlate.class.getResource("/chapter10/plates_all_broken.gif")));
				prizeWon.setIcon(new ImageIcon(BreakAPlate.class.getResource("/chapter10/tiger_plush.gif")));
				winTf.setText("You Win!");
				
				
			//condition for user winning the sticker 	
			} else if (prize.equals(CONSOLATION_PRIZE)) {
				plates.setIcon(new ImageIcon(BreakAPlate.class.getResource("/chapter10/plates_two_broken.gif")));
				prizeWon.setIcon(new ImageIcon(BreakAPlate.class.getResource("/chapter10/sticker.gif")));
				
			}
			
			play.setText("Play Again");
			play.setActionCommand("Play Again");
			
			//condition for the user starting a new round 
		} else if (eventName == "Play Again") {
			plates.setIcon(new ImageIcon(BreakAPlate.class.getResource("/chapter10/plates.gif")));
			winTf.setText("");
			play.setText("Play");
			play.setActionCommand("Play");
			prizeWon.setIcon(new ImageIcon(BreakAPlate.class.getResource("/chapter10/placeholder.gif")));
			contentPane.setBackground(new Color(255, 255, 255));
			winTf.setBackground(new Color(255, 255, 255));
		}
    }


    /**
     * Create and show the GUI.
     */
    private static void runGUI() {
        JFrame.setDefaultLookAndFeelDecorated(true);
        @SuppressWarnings("unused") //this is actually used
		BreakAPlate carnivalGame = new BreakAPlate();
    }
     

    public static void main(String[] args) {
        /* Methods that create and show a GUI should be 
           run from an event-dispatching thread */
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                runGUI();
            }
        });
    }
}
