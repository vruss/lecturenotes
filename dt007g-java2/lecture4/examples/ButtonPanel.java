import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.*;

public class ButtonPanel extends JPanel {

	public ButtonPanel() {
		
		setLayout(new GridLayout(3, 0));

		JPanel topPanel = new JPanel();
		JPanel botPanel = new JPanel();

		add(topPanel, BorderLayout.CENTER);
		add(botPanel, BorderLayout.SOUTH);

		

		setVisible(true);
		setSize(700, 500);
	}
}