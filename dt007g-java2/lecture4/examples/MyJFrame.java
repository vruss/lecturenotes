import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.*;


import javax.swing.*;

public class MyJFrame extends JFrame {

	private final int NUMBER_ROWS = 4;

	public MyJFrame() {
		
		JTextField textField = new JTextField();
		JButton button1 = new JButton("1");

		setLayout(new BorderLayout(5, 5));

		JPanel topPanel = new JPanel(new BorderLayout());
		
		topPanel.add(textField);

		JPanel botPanel = new JPanel(new GridLayout(NUMBER_ROWS, 0));
		String[] buttonTexts = {"7","8","9","/","4","5","6","*","1","2","3","-"};
		for(String buttonText: buttonTexts) {
			botPanel.add(new JButton(buttonText));
		}
		



		add(topPanel, BorderLayout.CENTER);
		add(botPanel, BorderLayout.SOUTH);	

		setVisible(true);
		setSize(700, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
}