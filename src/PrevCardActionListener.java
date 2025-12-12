import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PrevCardActionListener implements ActionListener {
    private FlashCardWindow window;

    public PrevCardActionListener(FlashCardWindow window) {
        this.window = window;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        window.goToPrev();
    }
}