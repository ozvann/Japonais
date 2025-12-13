import javax.swing.*;

public class Fenetre{
	protected JFrame window;
	public Fenetre(){
		window = new JFrame("Japonais");
		window.setSize(500, 500);
		window.setResizable(false);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setLocationRelativeTo(null);
	}
}
