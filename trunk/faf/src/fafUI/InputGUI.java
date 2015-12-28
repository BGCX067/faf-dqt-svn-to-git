package fafUI;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

public class InputGUI extends JFrame {
	public static final int GAP = 2;

	
	private JLabel lbURI;
	private JLabel lbName;
	private JLabel lbTitle;
	private JLabel lbGender;
	private JLabel lbKnows;
	private JLabel lbInterest;
	private JLabel lbAccount;
	private JLabel lbWorkplace;
	private JLabel lbDepiction;
	private JLabel lbSchool;
	
	private JTextField texURI;
	private JTextField texName;
	private JComboBox<String> cbTitle;
	private JComboBox<String> cbGender;
	private JList knowList;
	private JTextField texInterest_1;
	private JTextField texInterest_2;
	private JTextField texInterest_3;
	
	private JTextField texAccount_1;
	private JTextField texAccount_2;
	private JTextField texAccount_3;
	
	private JTextField texWorkplace;
	private JTextField texDepiction;
	private JTextField texSchool;
	
	private GridBagConstraints gb = new GridBagConstraints();

	public static void addPanelToPane(JPanel panel, Container pane, int x, int y, int ncols,
			int nrows, int filled, GridBagConstraints g) {
		g.gridx = x;
		g.gridy = y;
		g.gridwidth = ncols;
		g.gridheight = nrows;
		g.anchor = GridBagConstraints.NORTHWEST;
		g.fill = filled;
		pane.add(panel, g);
	}
	public InputGUI(){
		setTitle("Create FOAF file");
		setPreferredSize(new Dimension(600, 600));
		initComponents(getContentPane());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		pack();
	}
	public void initComponents(Container pane){
		
		lbURI = new JLabel("URI");
		lbName = new JLabel("Name");
		lbTitle = new JLabel("Title");
		lbGender = new JLabel("Gender");

		lbKnows = new JLabel("Knows");
		lbInterest = new JLabel("Interest");
		lbAccount = new JLabel("Account");
		lbWorkplace = new JLabel("WorkPlace");
		lbDepiction = new JLabel("Depiction");
		lbSchool = new JLabel("School");
		
		texURI = new JTextField();
		texName = new JTextField();
		cbTitle = new JComboBox<String>();
		cbGender = new JComboBox<String>();
		knowList = new JList();
		texInterest_1 = new JTextField();
		texInterest_2 = new JTextField();
		texInterest_3 = new JTextField();
		
		texAccount_1 = new JTextField();
		texAccount_2 = new JTextField();
		texAccount_3 = new JTextField();
		texWorkplace = new JTextField();
		texDepiction = new JTextField();
		texSchool = new JTextField();
		
		//add components to Frame
		pane.setLayout(new GridBagLayout());
		
		//Pane Single Info
		JPanel namePane = new JPanel();
		namePane.setLayout(new FlowLayout(FlowLayout.LEFT));
		namePane.add(lbName);
		namePane.add(texName);
//		texName.setPreferredSize(new Dimension(520,30));
		
		JPanel URIPane = new JPanel();
		URIPane.setLayout(new FlowLayout(FlowLayout.LEFT));
		URIPane.add(lbURI);
		URIPane.add(texURI);
//		texURI.setPreferredSize(new Dimension(520,30));
		
		JPanel titlePane = new JPanel();
		titlePane.setLayout(new FlowLayout(FlowLayout.LEFT));
		titlePane.add(lbTitle);
		titlePane.add(cbTitle);
		cbTitle.addItem("Mr");
		cbTitle.addItem("Ms");
//		cbTitle.setPreferredSize(new Dimension(520,30));
		
		JPanel genderPane = new JPanel();
		genderPane.setLayout(new FlowLayout(FlowLayout.LEFT));
		genderPane.add(lbGender);
		genderPane.add(cbGender);
		cbGender.addItem("Male");
		cbGender.addItem("Female");
//		cbGender.setPreferredSize(new Dimension(520,30));
		
		JPanel workPane = new JPanel();
		workPane.setLayout(new FlowLayout(FlowLayout.LEFT));
		workPane.add(lbWorkplace);
		workPane.add(texWorkplace);
//		texWorkplace.setPreferredSize(new Dimension(480,30));
		
		JPanel schoolPane = new JPanel();
		schoolPane.setLayout(new FlowLayout(FlowLayout.LEFT));
		schoolPane.add(lbSchool);
		schoolPane.add(texSchool);
//		texSchool.setPreferredSize(new Dimension(520,30));
		
		JPanel singlePane = new JPanel();
		singlePane.setLayout(new GridLayout(6,2,GAP,GAP));
		singlePane.setBorder(new TitledBorder("Single Info"));
		singlePane.add(URIPane);
		singlePane.add(namePane);
		singlePane.add(titlePane);
		singlePane.add(genderPane);
		singlePane.add(workPane);
		singlePane.add(schoolPane);
		//Interest pane
		JPanel interestPane1 = new JPanel();
		interestPane1.setLayout(new FlowLayout(FlowLayout.LEFT));
		interestPane1.add(lbInterest);
		interestPane1.add(texInterest_1);
		
		JPanel interestPane2 = new JPanel();
		interestPane2.setLayout(new FlowLayout(FlowLayout.LEFT));
		interestPane2.add(lbInterest);
		interestPane2.add(texInterest_2);
		
		JPanel interestPane3 = new JPanel();
		interestPane3.setLayout(new FlowLayout(FlowLayout.LEFT));
		interestPane3.add(lbInterest);
		interestPane3.add(texInterest_3);
		
		JPanel interestPane = new JPanel();
		interestPane.setLayout(new GridLayout(3, 1, GAP, GAP));
		interestPane.setBorder(new TitledBorder("Interest"));
		//Account pane
		JPanel accountPane1 = new JPanel();
		accountPane1.setLayout(new FlowLayout(FlowLayout.LEFT));
		accountPane1.add(lbAccount);
		accountPane1.add(texAccount_1);
		
		JPanel accountPane2 = new JPanel();
		accountPane2.setLayout(new FlowLayout(FlowLayout.LEFT));
		accountPane2.add(lbAccount);
		accountPane2.add(texAccount_2);
		
		JPanel accountPane3 = new JPanel();
		accountPane3.setLayout(new FlowLayout(FlowLayout.LEFT));
		accountPane3.add(lbAccount);
		accountPane3.add(texAccount_3);
		
		JPanel accountPane = new JPanel();
		accountPane.setLayout(new GridLayout(3,1,GAP,GAP));
		accountPane.setBorder(new TitledBorder("Account"));
		
		//Know Pane
		JPanel knowPane = new JPanel();
		knowPane.setLayout(new FlowLayout(FlowLayout.LEFT));
		knowPane.add(lbKnows);
		knowPane.add(knowList);
		//Add to main pane
		
		gb.weightx = 1.0;
		gb.weighty = 0;
		addPanelToPane(singlePane, pane, 0, 0, 0 ,0, GridBagConstraints.BOTH, gb);
		
		gb.weightx = 1.0;
		gb.weighty = 0.0;
		addPanelToPane(interestPane, pane, 0, 8, 0, 0, GridBagConstraints.BOTH, gb);
	}
	
	public static void main(String args[]){
		EventQueue.invokeLater(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				new InputGUI().setVisible(true);
			}
		});
	}
}
