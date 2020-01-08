// GUI版で追加された描画用パネルのクラス
import javax.swing.*;
import java.awt.*;

public class MyPanel extends JPanel{
	private static final long serialVersionUID = 1L; 
	private Editor editor; // フィールドにEditorインスタンスを持っている
	public MyPanel(Editor editor) {
		super();
		this.editor = editor;
	}
	public void paint(Graphics g){ // フレームのrepaintから呼ばれる
		super.paint(g);
		// editorの各図形のdrawを呼び出す
		Figure[] flist = editor.getFlist();
		for(int i = 0; i < flist.length; i++) {
			flist[i].draw(g);
		}
	}
}