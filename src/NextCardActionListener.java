import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class NextCardActionListener implements ActionListener {
    private FlashCardWindow window;

    public NextCardActionListener(FlashCardWindow window) {
        this.window = window;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        window.goToNext();
    }
}