import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class FlashCardMouseListener extends MouseAdapter {
    private JLabel label;
    private String first, second;
    private boolean showingFirst;

    public FlashCardMouseListener(JLabel label, String first, String second) {
        this.label = label;
        this.first = first;
        this.second = second;
        this.showingFirst = true;
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if (showingFirst) {
            label.setText(second);
        } else {
            label.setText(first);
        }
        showingFirst = !showingFirst;
    }
}