import java.io.*;
import javax.swing.*;

class Kadai12 {
	public static void main(String[] args) {
		Editor editor = new Editor();
		
		// GUI版の追加部分：はじまり 
		JFrame myWindow = new JFrame(); // フレーム（ウィンドウ）のインスタンスを生成
		myWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // フレームを閉じたらプログラム終了
		myWindow.setSize(800,600); // フレームのサイズを指定
		myWindow.setTitle("Nakamura's Figure Editor"); //タイトルバーに好きな（他人と違う）名前をつける
		MyPanel myPanel = new MyPanel(editor); // 自作のJPanel拡張クラスMyPanelのインスタンスを生成
		myWindow.add(myPanel);  //フレームに自作パネルを追加
		myWindow.setVisible(true); // 見えるようにする
		// GUI版の追加部分：おわり
		
		BufferedReader input =	new BufferedReader (new InputStreamReader (System.in));
		boolean goOn = true;
		while(goOn){
			goOn = editor.execute(input);
			myWindow.repaint();	// コマンドを入力するたびにフレームの中身を再描画させる
		}
		myWindow.dispose(); // 終わったらフレームを閉じる
	}
}