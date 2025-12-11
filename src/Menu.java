import javax.swing.*;
import java.awt.*;

public class Menu extends Fenetre{
	public Menu(){
		super();

		JPanel panel = new JPanel();
		panel.setLayout(new GridBagLayout());
		GridBagConstraints gbc = new GridBagConstraints();
		gbc.insets = new Insets(10,10,10,10);
		gbc.fill = GridBagConstraints.HORIZONTAL;
		gbc.gridx = 0;
		gbc.gridy = 0;

		JButton btnFlash = new JButton("Flash Card");
		JButton btnTrad = new JButton("Traduction");
		JButton btnQuiz = new JButton("Quiz");

		panel.add(btnFlash, gbc);
		gbc.gridy++;
		panel.add(btnTrad, gbc);
		gbc.gridy++;
		panel.add(btnQuiz, gbc);

		btnFlash.addActionListener(e -> JOptionPane.showMessageDialog(window, "Ouvre Flash Card"));
		btnTrad.addActionListener(e -> JOptionPane.showMessageDialog(window, "Ouvre Traduction"));
		btnQuiz.addActionListener(e -> JOptionPane.showMessageDialog(window, "Ouvre Quiz"));

		window.getContentPane().add(panel);
		window.setLocationRelativeTo(null);
		window.setVisible(true);
	}
}
