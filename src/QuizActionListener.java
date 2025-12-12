import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class QuizActionListener implements ActionListener {
    private JFrame window;

    public QuizActionListener(JFrame window) {
        this.window = window;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JOptionPane.showMessageDialog(window, "Quiz not implemented yet.");
    }
}