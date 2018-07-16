package ru.dom;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

public class MainWindow extends JFrame {

	public MainWindow(int windth,int height) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(640,480);
		setLocationRelativeTo(null);
		setVisible(true);
		getContentPane().setLayout(null);
		
		JPanel jpanel1 = new JPanel();
		JPanel jpanel2 = new JPanel();
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(10, 81, 604, 350);
		getContentPane().add(tabbedPane);
		tabbedPane.addTab("Tab 1", jpanel1);
		tabbedPane.addTab("Tab 2", jpanel2);
		
		
	}
}
