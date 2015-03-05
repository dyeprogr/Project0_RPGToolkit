import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.Border;




public class graphictest extends JFrame {
	
	
	JTextField die1 = new JTextField(1);
	JTextField die2 = new JTextField(1);
	JTextField die3 = new JTextField(1);
	JTextField diceSum = new JTextField(2);
	JTextField character = new JTextField(15);
	JTextField characterStrength = new JTextField(2);
	JTextField characterHealth = new JTextField(2);
	JTextField characterDexterity = new JTextField(2);
	JTextField weapon = new JTextField(15);
	JTextField weaponDamage = new JTextField(4);
	JTextField weaponEquipable = new JTextField(20);
	JTextField weaponDescription = new JTextField(30);	
	
	JButton diceButton = new JButton("Roll dice");
	JButton characterButton = new JButton("Random character");	
	JButton weaponButton = new JButton("Random weapon");	
	
	
	
	public static void main(String[] args) {
		new graphictest();
	}
	
		
	public graphictest(){
		
	    //center window
	    Toolkit tk = Toolkit.getDefaultToolkit();
	    Dimension dim = tk.getScreenSize();
	    int xPos = ((dim.width / 2) - (this.getWidth() / 2) - 300);
	    int yPos = ((dim.height / 2) - (this.getHeight() / 2) - 300);
	    this.setLocation(xPos, yPos);
		
	    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    
	    this.setTitle("RPG Toolkit");
	    this.setSize(500, 500);
	    
		JPanel panel1 = new JPanel();
//	    panel1.setLayout(new GridBagLayout());
//	    addItem(panel1, new JLabel("Die1:"), 0, 0, 1, 1, GridBagConstraints.EAST);
//	    addItem(panel1, new JLabel("Die2:"), 2, 0, 1, 1, GridBagConstraints.EAST);
//	    addItem(panel1, new JLabel("Die3:"), 4, 0, 1, 1, GridBagConstraints.EAST);
//	    addItem(panel1, new JLabel("Sum:"), 2, 1, 1, 1, GridBagConstraints.EAST);
//	    
//	    addItem(panel1, die1, 1, 0, 1, 1, GridBagConstraints.WEST);
//	    addItem(panel1, die2, 3, 0, 1, 1, GridBagConstraints.WEST);
//	    addItem(panel1, die3, 5, 0, 1, 1, GridBagConstraints.WEST);
//	    addItem(panel1, diceSum, 3, 1, 1, 1, GridBagConstraints.WEST);
		
	    //addItem(panel1, diceButton, 3, 2, 1, 1, GridBagConstraints.WEST);
	
		
		
		
		
//	    Box diceBox = Box.createVerticalBox();
//	    diceBox.add(die1);
//	    diceBox.add(die2);
//	    diceBox.add(die3);
//	    diceBox.setBorder(BorderFactory.createTitledBorder("Dice"));
//	    addItem(panel1, diceBox, 0, 5, 1, 1, GridBagConstraints.NORTH);
		
		
		
		
	    
	    ListenForButtons lForButton1 = new ListenForButtons();
	    diceButton.addActionListener(lForButton1);
		panel1.add(diceButton);
	    
	    JPanel dicePanel = new JPanel();
	    Border diceBorder = BorderFactory.createTitledBorder("Dice");
	    
	    panel1.add(dicePanel);
	    
	    
	    
	    
	    
	    ListenForButtons lForButton2 = new ListenForButtons();
	    characterButton.addActionListener(lForButton2);
		panel1.add(characterButton);
	    
	    JPanel characterPanel = new JPanel();
	    Border characterBorder = BorderFactory.createTitledBorder("Character");
	    
	    panel1.add(characterPanel);
	    
	    
	    
	    
	    ListenForButtons lForButton3 = new ListenForButtons();
	    weaponButton.addActionListener(lForButton3);
		panel1.add(weaponButton);
	    
	    JPanel weaponPanel = new JPanel();
	    Border weaponBorder = BorderFactory.createTitledBorder("Weapon");
	    
	    panel1.add(weaponPanel);
	    
	
	    
	    
	    
	    
	    
	    die1.setEditable(false);
	    panel1.add(die1);
	    die2.setEditable(false);
	    panel1.add(die2);
	    die3.setEditable(false);
	    panel1.add(die3);
	    diceSum.setEditable(false);
	    panel1.add(diceSum);
	    
	    
	    panel1.add(character);
	    panel1.add(characterStrength);
	    panel1.add(characterHealth);
	    panel1.add(characterDexterity);
	    
	    
	    panel1.add(weapon);
	    panel1.add(weaponDamage);
	    panel1.add(weaponEquipable);
	    panel1.add(weaponDescription);
	    
	    
	    this.add(panel1);
	    //this.pack();
	    this.setVisible(true); 
	    
		
		
	}

	
//	die1.setEditable(false);
//	die2.setEditable(false);
//	die3.setEditable(false);
//	diceSum.setEditable(false);
//	character.setEditable(false);
//	characterStrength.setEditable(false);
//	characterHealth.setEditable(false);
//	characterDexterity.setEditable(false);
//	weapon.setEditable(false);
//	weaponDamage.setEditable(false);
//	weaponEquipable.setEditable(false);
//	weaponDescription.setEditable(false);
	


	
//	// create JTextField
//			JTextField field = new JTextField();
//			field.setText("Java Code Geeks");
//
//			// Sets the specified boolean to indicate whether or not
//		    // this textfield should be editable.
//			field.setEditable(false);
	  

	
	
	
	
//	BufferedImage myPicture = ImageIO.read(new File("path-to-file"));
//	JLabel picLabel = new JLabel(new ImageIcon(myPicture));
//	add(picLabel);
	
//	BufferedImage myPicture = ImageIO.read(new File("arg0"));
//	JLabel picLabel = new JLabel(new ImageIcon(myPicture));
//	add(picLabel);  
	
	
	
	
	
	private class ListenForButtons implements ActionListener{
		public void actionPerformed(ActionEvent e){
			if(e.getSource() == diceButton){
				diceSum.setText(Integer.toString(Dice.diceSum()));
				die1.setText(Integer.toString(Dice.die1Result()));
				die2.setText(Integer.toString(Dice.die2Result()));
				die3.setText(Integer.toString(Dice.die3Result()));
			} else if (e.getSource() == characterButton){
				character.setText(Character.getNameGenderAndClass());
				characterStrength.setText(Integer.toString(Character.getStrength()));
				characterHealth.setText(Integer.toString(Character.getHealthpoints()));
				characterDexterity.setText(Integer.toString(Character.getDexterity()));;
			} else if (e.getSource() == weaponButton){
				weapon.setText(Weapon.getNameAndType());
				weaponDamage.setText(Integer.toString(Weapon.getDamage()));
				weaponEquipable.setText(Weapon.getEquipableInfo());
				weaponDescription.setText(Weapon.getDescription());
			}
		}
	}
	
	
	
	
	
	
	private void addItem(JPanel p, JComponent c, int x, int y, int width, int height, int align) {
		GridBagConstraints gc = new GridBagConstraints();
		gc.gridx = x;
		gc.gridy = y;
		gc.gridwidth = width;
		gc.gridheight = height;
		gc.weightx = 100.0;
		gc.weighty = 100.0;
		gc.insets = new Insets(5, 5, 5, 5);
		gc.anchor = align;
		gc.fill = GridBagConstraints.NONE;
		p.add(c, gc);
	}
	  
}


