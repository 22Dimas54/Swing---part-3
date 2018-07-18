package ru.dom;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.Choice;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

public class MainWindow extends JFrame {

	private JPanel jpanel1;
	private JPanel jpanel2;
	private JTabbedPane tabbedPane;
	private JTextArea txtrEnterUrlHere;
	private JButton btnGetimage;
	private JButton btnGetfile;
	private Choice choice;
	private JLabel lblFormat;
	private JMenuBar menuBar;
	private JMenu mnFile;
	private JMenuItem mntmSaveImage;
	private JMenu mnOptions;
	private JMenuItem mntmExit;

	public MainWindow(int windth,int height) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(640,480);
		setLocationRelativeTo(null);
		getContentPane().setLayout(null);
		
		jpanel1 = new JPanel(null);
		jpanel2 = new JPanel(null);
		
		tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(10, 81, 604, 350);
		getContentPane().add(tabbedPane);
		setResizable(false);
		tabbedPane.addTab("Tab 1", jpanel1);
		
		txtrEnterUrlHere = new JTextArea();
		txtrEnterUrlHere.setText("Enter URL here....");
		txtrEnterUrlHere.setBounds(10, 43, 579, 279);
		jpanel1.add(txtrEnterUrlHere);
		
		btnGetimage = new JButton("GetImage");
		btnGetimage.addActionListener(e -> System.out.println(1));
		btnGetimage.setBounds(10, 11, 89, 23);
		jpanel1.add(btnGetimage);
		
		btnGetfile = new JButton("GetFile");
		btnGetfile.setBounds(500, 9, 89, 23);
		jpanel1.add(btnGetfile);
		tabbedPane.addTab("Tab 2", jpanel2);
		
		choice = new Choice();
		choice.setBounds(537, 10, 62, 20);
		jpanel2.add(choice);
		choice.add("png");
		choice.add("jpg");
		
		lblFormat = new JLabel("Format");
		lblFormat.setBounds(485, 10, 46, 20);
		jpanel2.add(lblFormat);
		
		JButton btnViewe = new JButton("View");
		btnViewe.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnViewe.setBounds(10, 10, 89, 23);
		jpanel2.add(btnViewe);
		
		menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 634, 21);
		getContentPane().add(menuBar);
		
		mnFile = new JMenu("File");
		menuBar.add(mnFile);
		
		mntmSaveImage = new JMenuItem("Save image");
		mnFile.add(mntmSaveImage);
		
		mnOptions = new JMenu("Options");
		menuBar.add(mnOptions);
		
		mntmExit = new JMenuItem("Exit");
		mnOptions.add(mntmExit);
		
		//menuBar.repaint();
		//mnFile.updateUI();
		//mnOptions.updateUI();
		setVisible(true);
		
		
	}
}
