import javax.swing.*;
import java.awt.*;

public class Style {
    public static void applyFuturisticTheme() {
        try {
            UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
        } catch (Exception e) {
            // Fallback to default
        }

        // Custom colors for futuristic look
        UIManager.put("Panel.background", new Color(20, 20, 30));
        UIManager.put("Button.background", new Color(0, 150, 255));
        UIManager.put("Button.foreground", Color.WHITE);
        UIManager.put("Label.foreground", new Color(0, 255, 255));
        UIManager.put("Label.font", new Font("SansSerif", Font.BOLD, 16));
        UIManager.put("Button.font", new Font("SansSerif", Font.BOLD, 14));
    }

    public static void styleWindow(JFrame window) {
        window.getContentPane().setBackground(new Color(20, 20, 30)); // Dark blue-black
    }

    public static void styleButton(JButton button) {
        button.setBackground(new Color(0, 150, 255)); // Bright blue
        button.setForeground(Color.WHITE);
        button.setFont(new Font("SansSerif", Font.BOLD, 14));
        button.setFocusPainted(false);
        button.setBorder(BorderFactory.createCompoundBorder(
            BorderFactory.createLineBorder(new Color(0, 255, 255), 2),
            BorderFactory.createEmptyBorder(10, 20, 10, 20)
        ));
    }

    public static void styleLabel(JLabel label) {
        label.setForeground(new Color(0, 255, 255)); // Cyan
        label.setFont(new Font("SansSerif", Font.BOLD, 24));
    }
}