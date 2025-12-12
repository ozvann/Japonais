import javax.swing.*;
import java.awt.*;

public class FlashCardWindow extends Fenetre {
    private String[] currentData;
    private String[] previousData;
    private JLabel typeLabel;
    private JLabel charLabel;

    public FlashCardWindow() {
        super();
        currentData = DataLoader.getRandomData();
        previousData = null;

        window.setLayout(new BorderLayout());

        // Type label
        typeLabel = new JLabel(currentData[2], JLabel.CENTER);
        Style.styleLabel(typeLabel);
        typeLabel.setFont(new Font("SansSerif", Font.BOLD, 18));
        window.add(typeLabel, BorderLayout.NORTH);

        // Label for the flashcard
        charLabel = new JLabel(currentData[0], JLabel.CENTER);
        charLabel.setFont(new Font("SansSerif", Font.BOLD, 72)); // Large font for Japanese characters
        charLabel.setForeground(new Color(0, 255, 255)); // Cyan color
        charLabel.setCursor(new Cursor(Cursor.HAND_CURSOR)); // Hand cursor to indicate clickable

        // Add mouse listener
        charLabel.addMouseListener(MouseListeners.getFlashCardMouseListener(charLabel, currentData[0], currentData[1]));

        window.add(charLabel, BorderLayout.CENTER);

        // Bottom panel for buttons
        JPanel buttonPanel = new JPanel(new BorderLayout());
        buttonPanel.setBackground(new Color(20, 20, 30));

        JButton prevButton = new JButton("Precedent");
        Style.styleButton(prevButton);
        prevButton.addActionListener(ButtonListeners.getPrevCardListener(this));

        JButton nextButton = new JButton("Suivant");
        Style.styleButton(nextButton);
        nextButton.addActionListener(ButtonListeners.getNextCardListener(this));

        JButton backButton = new JButton("Retour au Menu");
        Style.styleButton(backButton);
        backButton.addActionListener(ButtonListeners.getBackToMenuListener(window));

        buttonPanel.add(prevButton, BorderLayout.WEST);
        buttonPanel.add(backButton, BorderLayout.CENTER);
        buttonPanel.add(nextButton, BorderLayout.EAST);

        window.add(buttonPanel, BorderLayout.SOUTH);

        window.setVisible(true);
    }

    public void goToNext() {
        previousData = currentData;
        currentData = DataLoader.getRandomData();
        updateDisplay();
    }

    public void goToPrev() {
        if (previousData != null) {
            String[] temp = currentData;
            currentData = previousData;
            previousData = temp;
            updateDisplay();
        }
    }

    private void updateDisplay() {
        typeLabel.setText(currentData[2]);
        charLabel.setText(currentData[0]);
        // Update mouse listener with new data
        charLabel.removeMouseListener(charLabel.getMouseListeners()[0]); // Remove old
        charLabel.addMouseListener(MouseListeners.getFlashCardMouseListener(charLabel, currentData[0], currentData[1]));
    }
}