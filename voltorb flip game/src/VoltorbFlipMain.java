import javax.swing.JFrame;

public class VoltorbFlipMain {
	public static void main (String[] args) {
		MainGUI frame = new MainGUI();

		frame.setTitle("Voltorb Flip");
		frame.pack();
		frame.setSize(440, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		
	}
}
