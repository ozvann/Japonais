import javax.swing.*;

public class Fenetre{
	protected JFrame window;
	public Fenetre(){
		Style.applyFuturisticTheme();
		window = new JFrame("Japonais");
		window.setSize(500, 500);
		window.setResizable(false);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setLocationRelativeTo(null);
		Style.styleWindow(window);
	}
}
