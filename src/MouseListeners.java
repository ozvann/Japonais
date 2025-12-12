import javax.swing.*;
import java.awt.event.MouseAdapter;

public class MouseListeners {
    public static MouseAdapter getFlashCardMouseListener(JLabel label, String first, String second) {
        return new FlashCardMouseListener(label, first, second);
    }
}