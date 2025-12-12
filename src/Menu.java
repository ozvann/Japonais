import javax.swing.*;
import java.awt.*;

public class Menu extends Fenetre{
	public Menu(){
		super();
		window.setLayout(new BorderLayout());

		// Title label
		JLabel title = new JLabel("Apprentissage du Japonais", JLabel.CENTER);
		Style.styleLabel(title);
		window.add(title, BorderLayout.NORTH);

		// Panel for buttons
		JPanel buttonPanel = new JPanel();
		buttonPanel.setLayout(new GridLayout(3, 1, 10, 10));
		buttonPanel.setBackground(new Color(20, 20, 30));
		buttonPanel.setBorder(BorderFactory.createEmptyBorder(20, 50, 20, 50));

		JButton quiz = new JButton("Quiz");
		JButton flashCard = new JButton("FlashCard");
		JButton exercice = new JButton("Exercice");

		for (JButton button : new JButton[]{quiz, flashCard, exercice}) {
			Style.styleButton(button);
			buttonPanel.add(button);
		}

		// Add action listeners
		quiz.addActionListener(ButtonListeners.getQuizListener(window));
		flashCard.addActionListener(ButtonListeners.getFlashCardListener(window));
		exercice.addActionListener(ButtonListeners.getExerciceListener(window));

		window.add(buttonPanel, BorderLayout.CENTER);
		window.setVisible(true);
	}
}
