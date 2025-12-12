import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BackToMenuActionListener implements ActionListener {
    private JFrame window;

    public BackToMenuActionListener(JFrame window) {
        this.window = window;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        window.dispose();
        new Menu();
    }
}