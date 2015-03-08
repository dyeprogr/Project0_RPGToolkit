package rpgToolKit;

import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


@SuppressWarnings("serial")
public class GUI extends JFrame {

	JButton diceButton = new JButton("aaaRoll dice");
	JButton characterButton = new JButton("Random character");	
	JButton weaponButton = new JButton("Random weapon");	

	JLabel diceMainLabel = new JLabel("Dice");
	JLabel characterMainLabel = new JLabel("Character");
	JLabel weaponMainLabel = new JLabel("Weapon");
	
	JLabel die1Label = new JLabel("Die1:");
	JLabel die2Label = new JLabel("Die2:");
	JLabel die3Label = new JLabel("Die3:");
	JLabel diceSumLabel = new JLabel("Dice sum:");
	JLabel characterLabel = new JLabel("Character's name, gender and class:");
	JLabel characterStrengthLabel = new JLabel("Strength:");
	JLabel characterHealthLabel = new JLabel("Health Points:");
	JLabel characterDexterityLabel = new JLabel("Dexterity:");
	JLabel weaponLabel = new JLabel("Weapon's name and type:");
	JLabel weaponDamageLabel = new JLabel("Damage:");
	JLabel weaponEquipableLabel = new JLabel("Equipable:");
	JLabel weaponDescriptionLabel = new JLabel("Description:");
	
	String imageName = "";
	String characterImageName = "";
	JLabel characterImage = new JLabel();
	JTextField imageeeName = new JTextField(10);
	
	String weaponImageName = "";
	JLabel weaponImage = new JLabel();
	
	String die1ImageName = "";
	String die2ImageName = "";
	String die3ImageName = "";
	JLabel die1Image = new JLabel();
	JLabel die2Image = new JLabel();
	JLabel die3Image = new JLabel();
	
	JTextField die1Text = new JTextField(1);
	JTextField die2Text = new JTextField(1);
	JTextField die3Text = new JTextField(1);
	JTextField diceSumText = new JTextField(2);
	JTextField characterText = new JTextField(15);
	JTextField characterStrengthText = new JTextField(2);
	JTextField characterHealthText = new JTextField(2);
	JTextField characterDexterityText = new JTextField(2);
	JTextField weaponText = new JTextField(15);
	JTextField weaponDamageText = new JTextField(2);
	JTextField weaponEquipableText = new JTextField(20);
	JTextField weaponDescriptionText = new JTextField(27);
	
	
	public GUI()
	{
	    //center window
	    Toolkit tk = Toolkit.getDefaultToolkit();
	    Dimension dim = tk.getScreenSize();
	    int xPos = ((dim.width / 2) - (this.getWidth() / 2) - 500);
	    int yPos = ((dim.height / 2) - (this.getHeight() / 2) - 300);
	    setLocation(xPos, yPos);
	    
	    //setLocationRelativeTo(null);
		
	    setTitle("RPG Toolkit");
	    //this.setSize(1000, 1000);
	    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
////////////////////////////////////////////////////////////////  
////////////////////////////////////////////////////////////////
	   
	    JPanel thePanel = new JPanel();
	    thePanel.setLayout(new GridLayout(0,3,10,10));
	    JPanel theDicePanel = new JPanel();
	    JPanel theCharacterPanel = new JPanel();
	    JPanel theWeaponPanel = new JPanel();
	    
	    //thePanel.setSize(1000, 1000);
	    
	    	//////////dice grid///////////
	    theDicePanel.setLayout(new GridBagLayout());
	   
	    addComp(theDicePanel, die1Label, 0, 0, 1, 1, GridBagConstraints.WEST, GridBagConstraints.NONE);
	    addComp(theDicePanel, die1Text, 1, 0, 1, 1, GridBagConstraints.EAST, GridBagConstraints.NONE);
	    addComp(theDicePanel, die2Label, 2, 0, 1, 1, GridBagConstraints.WEST, GridBagConstraints.NONE);
	    addComp(theDicePanel, die2Text, 3, 0, 1, 1, GridBagConstraints.EAST, GridBagConstraints.NONE);
	    addComp(theDicePanel, die3Label, 4, 0, 1, 1, GridBagConstraints.WEST, GridBagConstraints.NONE);
	    addComp(theDicePanel, die3Text, 5, 0, 1, 1, GridBagConstraints.EAST, GridBagConstraints.NONE);
	    
	    addComp(theDicePanel, die1Image, 0, 1, 2, 1, GridBagConstraints.CENTER, GridBagConstraints.CENTER);
	    addComp(theDicePanel, die2Image, 2, 1, 2, 1, GridBagConstraints.CENTER, GridBagConstraints.CENTER);
	    addComp(theDicePanel, die3Image, 4, 1, 2, 1, GridBagConstraints.CENTER, GridBagConstraints.CENTER);
	    
	    addComp(theDicePanel, diceSumLabel, 0, 2, 1, 1, GridBagConstraints.WEST, GridBagConstraints.NONE);
	    addComp(theDicePanel, diceSumText, 1, 2, 1, 1, GridBagConstraints.WEST, GridBagConstraints.NONE);
	    
	    addComp(theDicePanel, diceButton, 0, 3, 6, 1, GridBagConstraints.SOUTH, GridBagConstraints.CENTER);
	    
	    	//////////character grid///////////
	    theCharacterPanel.setLayout(new GridBagLayout());
	   
	    addComp(theCharacterPanel, characterLabel, 0, 0, 1, 1, GridBagConstraints.WEST, GridBagConstraints.NONE); 
	    addComp(theCharacterPanel, characterText, 0, 1, 1, 1, GridBagConstraints.WEST, GridBagConstraints.NONE);
	    
	    addComp(theCharacterPanel, characterImage, 0, 2, 5, 1, GridBagConstraints.CENTER, GridBagConstraints.CENTER); 
	    
	    addComp(theCharacterPanel, characterStrengthLabel, 0, 3, 1, 1, GridBagConstraints.WEST, GridBagConstraints.NONE); 
	    addComp(theCharacterPanel, characterStrengthText, 1, 3, 1, 1, GridBagConstraints.EAST, GridBagConstraints.NONE); 
	    addComp(theCharacterPanel, characterHealthLabel, 0, 4, 1, 1, GridBagConstraints.WEST, GridBagConstraints.NONE); 
	    addComp(theCharacterPanel, characterHealthText, 1, 4, 1, 1, GridBagConstraints.EAST, GridBagConstraints.NONE); 
	    addComp(theCharacterPanel, characterDexterityLabel, 0, 5, 1, 1, GridBagConstraints.WEST, GridBagConstraints.NONE); 
	    addComp(theCharacterPanel, characterDexterityText, 1, 5, 1, 1, GridBagConstraints.EAST, GridBagConstraints.NONE); 
	    
	    addComp(theCharacterPanel, characterButton, 0, 6, 5, 1, GridBagConstraints.SOUTH, GridBagConstraints.CENTER);
	    
	    	////////weapon grid/////////////
	    theWeaponPanel.setLayout(new GridBagLayout());
	    
	    addComp(theWeaponPanel, weaponLabel, 0, 0, 1, 1, GridBagConstraints.WEST, GridBagConstraints.NONE); 
	    addComp(theWeaponPanel, weaponText, 0, 1, 1, 1, GridBagConstraints.WEST, GridBagConstraints.NONE); 

	    addComp(theWeaponPanel, weaponImage, 0, 2, 5, 1, GridBagConstraints.CENTER, GridBagConstraints.CENTER);
	    
	    addComp(theWeaponPanel, weaponDamageLabel, 0, 3, 1, 1, GridBagConstraints.WEST, GridBagConstraints.NONE);
	    addComp(theWeaponPanel, weaponDamageText, 0, 3, 1, 1, GridBagConstraints.EAST, GridBagConstraints.NONE);
	    addComp(theWeaponPanel, weaponEquipableLabel, 0, 4, 1, 1, GridBagConstraints.WEST, GridBagConstraints.NONE);
	    addComp(theWeaponPanel, weaponEquipableText, 0, 4, 1, 1, GridBagConstraints.EAST, GridBagConstraints.NONE);
	    addComp(theWeaponPanel, weaponDescriptionLabel, 0, 5, 1, 1, GridBagConstraints.WEST, GridBagConstraints.NONE);
	    addComp(theWeaponPanel, weaponDescriptionText, 0, 6, 1, 1, GridBagConstraints.EAST, GridBagConstraints.NONE);
	   
	    addComp(theWeaponPanel, weaponButton, 0, 7, 5, 1, GridBagConstraints.SOUTH, GridBagConstraints.CENTER);
	    
	    	/////////////////////
	    
	    theDicePanel.setBorder(BorderFactory.createTitledBorder("Dice"));
	    theCharacterPanel.setBorder(BorderFactory.createTitledBorder("Character"));
	    theWeaponPanel.setBorder(BorderFactory.createTitledBorder("Weapon"));

	    thePanel.add(theDicePanel);
	    thePanel.add(theCharacterPanel);
	    thePanel.add(theWeaponPanel);
	    
	    die1Text.setEditable(false);
	    die2Text.setEditable(false);
	    die3Text.setEditable(false);
	    diceSumText.setEditable(false);
	    
	    this.add(thePanel);
	    this.pack();
	    this.setVisible(true);
	    
	    ListenForButtons lForButton1 = new ListenForButtons();
	    diceButton.addActionListener(lForButton1);
	    
	    ListenForButtons lForButton2 = new ListenForButtons();
	    characterButton.addActionListener(lForButton2);
	    
	    ListenForButtons lForButton3 = new ListenForButtons();
	    weaponButton.addActionListener(lForButton3);
	}
	
////////////////////////////////////////////////////////////////	
////////////////////////////////////////////////////////////////	
	
	private class ListenForButtons implements ActionListener{
		public void actionPerformed(ActionEvent e){
			if(e.getSource() == diceButton){
				diceSumText.setText(Integer.toString(Dice.diceSum()));
				die1Text.setText(Integer.toString(Dice.die1Result()));
				die2Text.setText(Integer.toString(Dice.die2Result()));
				die3Text.setText(Integer.toString(Dice.die3Result()));
				loadDieImage(Dice.die1Result(), Dice.die2Result(), Dice.die3Result());
				pack();
			} else if (e.getSource() == characterButton){
				characterText.setText(Character.getNameGenderAndClass());
				characterStrengthText.setText(Integer.toString(Character.getStrength()));
				characterHealthText.setText(Integer.toString(Character.getHealthpoints()));
				characterDexterityText.setText(Integer.toString(Character.getDexterity()));
				characterImageName = Character.getImageName();
				loadCharacterImage(characterImageName);
				pack();
			} else if (e.getSource() == weaponButton){
				weaponText.setText(Weapon.getNameAndType());
				weaponDamageText.setText(Integer.toString(Weapon.getDamage()));
				weaponEquipableText.setText(Weapon.getEquipableInfo());
				weaponDescriptionText.setText(Weapon.getDescription());
				weaponImageName = Weapon.getImageName();
				loadWeaponImage(weaponImageName);
				pack();
			}
		}
	}
	
	//for GridBagConstraints
	private void addComp(JPanel thePanel, JComponent comp, int xPos, int yPos, int compWidth, int compHeight, int place, int stretch){
		
		GridBagConstraints gridConstraints = new GridBagConstraints();
		
	    //default constraints to overide
	    gridConstraints.gridx = xPos;
	    gridConstraints.gridy = yPos;
	    gridConstraints.gridwidth = compWidth;
	    gridConstraints.gridheight = compHeight;
	    gridConstraints.weightx = 100;
	    gridConstraints.weighty = 100;
	    gridConstraints.insets = new Insets(5,5,5,5);
	    gridConstraints.anchor = place;
	    gridConstraints.fill = stretch;
	    
	    thePanel.add(comp, gridConstraints);
	}
	
////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////	
	
    //well.. I tried to make the path dynamic - that's why this block comment with experiments here, but Java did not allow me to do such thing.. so.. I'll let the 'else if' tree grow ;)
    
////jl.setIcon(new ImageIcon("C:\\CODE\\eclipseworkspace\\Project0_RPG_toolkit\\images\\sword1.png"));
////jp.add(jl);
////
////add(jp);
////
////validate();
//
//String imagePath = "C:\\CODE\\eclipseworkspace\\Project0_RPG_toolkit\\images\\" + Character.getImageName();
//
////  characterImage.setIcon(new ImageIcon("C:\\CODE\\eclipseworkspace\\Project0_RPG_toolkit\\images\\" + Character.getImageName()));
//characterImage.setIcon(new ImageIcon(imagePath));
//
//
////String imagePath = "C:\\CODE\\eclipseworkspace\\Project0_RPG_toolkit\\images\\" + Character.getImageName();
////
////try {
////    //n  = ImageIO.read((this.getClass().getResource("/smiles/n.png")));
////	
////
////	BufferedImage charCharImage = ImageIO.read(getClass().getResource(imagePath));
////
////    //smile = new Easel(n);
////
////} catch (IOException e) {
////   System.out.println("error");
////}
	
	public void loadDieImage(int die1Result, int die2Result, int die3Result){
////		String die1path = "/images/die" + die1Text + ".png";
////		String die2path = "/images/die" + die2Text + ".png";
//		String die3path = "/images/die" + die3Text.toString() + ".png";
////		die1Image.setIcon(new ImageIcon(getClass().getResource(die1path)));
////		die2Image.setIcon(new ImageIcon(getClass().getResource(die2path)));
////		die3Image.setIcon(new ImageIcon(getClass().getResource(die3path)));
//		die1Image.setIcon(new ImageIcon(getClass().getResource("/images/die1.png")));
//		die2Image.setIcon(new ImageIcon(getClass().getResource("/images/die2.png")));
//		die3Image.setIcon(new ImageIcon(getClass().getResource(die3path)));
		
		int die1 = die1Result;
		int die2 = die2Result;
		int die3 = die3Result;
		
		if (die1 == 1){
			die1Image.setIcon(new ImageIcon(getClass().getResource("/images/die1.png")));
		} else if (die1 == 2) {
			die1Image.setIcon(new ImageIcon(getClass().getResource("/images/die2.png")));
		} else if (die1 == 3) {
			die1Image.setIcon(new ImageIcon(getClass().getResource("/images/die3.png")));
		} else if (die1 == 4) {
			die1Image.setIcon(new ImageIcon(getClass().getResource("/images/die4.png")));
		} else if (die1 == 5) {
			die1Image.setIcon(new ImageIcon(getClass().getResource("/images/die5.png")));
		} else if (die1 == 6) {
			die1Image.setIcon(new ImageIcon(getClass().getResource("/images/die6.png")));
		} 
		
		if (die2 == 1){
			die2Image.setIcon(new ImageIcon(getClass().getResource("/images/die1.png")));
		} else if (die2 == 2) {
			die2Image.setIcon(new ImageIcon(getClass().getResource("/images/die2.png")));
		} else if (die2 == 3) {
			die2Image.setIcon(new ImageIcon(getClass().getResource("/images/die3.png")));
		} else if (die2 == 4) {
			die2Image.setIcon(new ImageIcon(getClass().getResource("/images/die4.png")));
		} else if (die2 == 5) {
			die2Image.setIcon(new ImageIcon(getClass().getResource("/images/die5.png")));
		} else if (die2 == 6) {
			die2Image.setIcon(new ImageIcon(getClass().getResource("/images/die6.png")));
		} 
		
		if (die3 == 1) {
			die3Image.setIcon(new ImageIcon(getClass().getResource("/images/die1.png")));
		} else if (die3 == 2) {
			die3Image.setIcon(new ImageIcon(getClass().getResource("/images/die2.png")));
		} else if (die3 == 3) {
			die3Image.setIcon(new ImageIcon(getClass().getResource("/images/die3.png")));
		} else if (die3 == 4) {
			die3Image.setIcon(new ImageIcon(getClass().getResource("/images/die4.png")));
		} else if (die3 == 5) {
			die3Image.setIcon(new ImageIcon(getClass().getResource("/images/die5.png")));
		} else if (die3 == 6) {
			die3Image.setIcon(new ImageIcon(getClass().getResource("/images/die6.png")));
		} 
	}
	
	public void loadCharacterImage(String imgName){
		String imageName = imgName;
		if (imageName.equals("ch11.png")){
	    	characterImage.setIcon(new ImageIcon(getClass().getResource("/images/ch11.png")));
		} else if (imageName.equals("ch12.png")) {
	    	characterImage.setIcon(new ImageIcon(getClass().getResource("/images/ch12.png")));
		} else if (imageName.equals("ch13.png")) {
	    	characterImage.setIcon(new ImageIcon(getClass().getResource("/images/ch13.png")));
		} else if (imageName.equals("ch14.png")) {
	    	characterImage.setIcon(new ImageIcon(getClass().getResource("/images/ch14.png")));
		} else if (imageName.equals("ch15.png")) {
	    	characterImage.setIcon(new ImageIcon(getClass().getResource("/images/ch15.png")));
		} else if (imageName.equals("ch21.png")) {
	    	characterImage.setIcon(new ImageIcon(getClass().getResource("/images/ch21.png")));
		} else if (imageName.equals("ch22.png")) {
	    	characterImage.setIcon(new ImageIcon(getClass().getResource("/images/ch22.png")));
		} else if (imageName.equals("ch23.png")) {
	    	characterImage.setIcon(new ImageIcon(getClass().getResource("/images/ch23.png")));
		} else if (imageName.equals("ch24.png")) {
	    	characterImage.setIcon(new ImageIcon(getClass().getResource("/images/ch24.png")));
		} else if (imageName.equals("ch25.png")) {
	    	characterImage.setIcon(new ImageIcon(getClass().getResource("/images/ch25.png")));
		}
	}

	public void loadWeaponImage(String imgName){
		String imageName = imgName;
		if (imageName.equals("sword1.png")){
	    	weaponImage.setIcon(new ImageIcon(getClass().getResource("/images/sword1.png")));
		} else if (imageName.equals("sword2.png")) {
			weaponImage.setIcon(new ImageIcon(getClass().getResource("/images/sword2.png")));
		} else if (imageName.equals("sword3.png")) {
			weaponImage.setIcon(new ImageIcon(getClass().getResource("/images/sword3.png")));
		} else if (imageName.equals("mace1.png")) {
			weaponImage.setIcon(new ImageIcon(getClass().getResource("/images/mace1.png")));
		} else if (imageName.equals("mace2.png")) {
			weaponImage.setIcon(new ImageIcon(getClass().getResource("/images/mace2.png")));
		} else if (imageName.equals("mace3.png")) {
			weaponImage.setIcon(new ImageIcon(getClass().getResource("/images/mace3.png")));
		} else if (imageName.equals("gun1.png")) {
			weaponImage.setIcon(new ImageIcon(getClass().getResource("/images/gun1.png")));
		} else if (imageName.equals("gun2.png")) {
			weaponImage.setIcon(new ImageIcon(getClass().getResource("/images/gun2.png")));
		} else if (imageName.equals("gun3.png")) {
			weaponImage.setIcon(new ImageIcon(getClass().getResource("/images/gun3.png")));
		} else if (imageName.equals("spear1.png")) {
			weaponImage.setIcon(new ImageIcon(getClass().getResource("/images/spear1.png")));
		} else if (imageName.equals("spear2.png")) {
			weaponImage.setIcon(new ImageIcon(getClass().getResource("/images/spear2.png")));
		} else if (imageName.equals("spear3.png")) {
			weaponImage.setIcon(new ImageIcon(getClass().getResource("/images/spear3.png")));
		} else if (imageName.equals("wand1.png")) {
			weaponImage.setIcon(new ImageIcon(getClass().getResource("/images/wand1.png")));
		} else if (imageName.equals("wand2.png")) {
			weaponImage.setIcon(new ImageIcon(getClass().getResource("/images/wand2.png")));
		} else if (imageName.equals("wand3.png")) {
			weaponImage.setIcon(new ImageIcon(getClass().getResource("/images/wand3.png")));
		} else if (imageName.equals("bow1.png")) {
			weaponImage.setIcon(new ImageIcon(getClass().getResource("/images/bow1.png")));
		} else if (imageName.equals("bow2.png")) {
			weaponImage.setIcon(new ImageIcon(getClass().getResource("/images/bow2.png")));
		} else if (imageName.equals("bow3.png")) {
			weaponImage.setIcon(new ImageIcon(getClass().getResource("/images/bow3.png")));
		} else if (imageName.equals("axe1.png")) {
			weaponImage.setIcon(new ImageIcon(getClass().getResource("/images/axe1.png")));
		} else if (imageName.equals("axe2.png")) {
			weaponImage.setIcon(new ImageIcon(getClass().getResource("/images/axe2.png")));
		} else if (imageName.equals("axe3.png")) {
			weaponImage.setIcon(new ImageIcon(getClass().getResource("/images/axe3.png")));
		}
	}
	
////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////
	
	public static void main(String[] args){
		new GUI();
	}
}


