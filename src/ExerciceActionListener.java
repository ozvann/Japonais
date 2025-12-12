import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ExerciceActionListener implements ActionListener {
    private JFrame window;

    public ExerciceActionListener(JFrame window) {
        this.window = window;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JOptionPane.showMessageDialog(window, "Exercice not implemented yet.");
    }
}