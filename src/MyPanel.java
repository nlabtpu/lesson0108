
import javax.swing.*;
import java.awt.*;

public class MyPanel extends JPanel {
	private static final long serialVersionUID = 1L;
	private Editor editor;

	public MyPanel(Editor editor) {
		super();
		this.editor = editor;
	}

	public void paint(Graphics g) {
		super.paint(g);

		Figure[] flist = editor.getFlist();
		for (int i = 0; i < flist.length; i++) {
			flist[i].draw(g);
		}
	}
}