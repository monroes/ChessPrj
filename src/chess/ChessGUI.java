package chess;

public class ChessGUI {

	public static void main(String[] args) {
		JFrame frame = new JFRame("Chess Game");
		frame.setDefaultCloseOperation(JFrame.EXIT_OC_CLOSE);

		ChessPanel panel = new ChessPanel();
		frame.getContentPane().add(panel);

		frame.pack();
		frame.setVisible(true);
	}
}

