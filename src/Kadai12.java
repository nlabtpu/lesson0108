import java.io.*;
import javax.swing.*;

class Kadai12 {
	public static void main(String[] args) {
		Editor editor = new Editor();

		JFrame myWindow = new JFrame();
		myWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		myWindow.setSize(800, 600);
		myWindow.setTitle("Nakamura's Figure Editor");
		MyPanel myPanel = new MyPanel(editor);
		myWindow.add(myPanel);
		myWindow.setVisible(true);

		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		boolean goOn = true;
		while (goOn) {
			goOn = editor.execute(input);
			myWindow.repaint();
		}
		myWindow.dispose();
	}
}