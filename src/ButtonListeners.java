import javax.swing.*;
import java.awt.event.ActionListener;

public class ButtonListeners {
    public static ActionListener getFlashCardListener(JFrame window) {
        return new FlashCardActionListener(window);
    }

    public static ActionListener getQuizListener(JFrame window) {
        return new QuizActionListener(window);
    }

    public static ActionListener getExerciceListener(JFrame window) {
        return new ExerciceActionListener(window);
    }

    public static ActionListener getBackToMenuListener(JFrame window) {
        return new BackToMenuActionListener(window);
    }

    public static ActionListener getNextCardListener(FlashCardWindow window) {
        return new NextCardActionListener(window);
    }

    public static ActionListener getPrevCardListener(FlashCardWindow window) {
        return new PrevCardActionListener(window);
    }
}