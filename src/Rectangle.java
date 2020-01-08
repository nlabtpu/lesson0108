import java.awt.*;

class Rectangle extends Figure {
	private int width;
	private int height;
	
	public Rectangle(int x, int y, int w, int h) {
		super(x, y);		
		setSize(w,h);
	}
	int getW() { return width; }
	int getH() { return height; }
	void setSize(int w, int h) {
		this.width = Math.max(w, 1);
		this.height = Math.max(h, 1);
	}

	public String toString() {
		return "R"+super.toString()+"["+width+","+height+"]";
	}
	public void draw(Graphics g) { // パネルのpaintから呼ばれる
		g.setColor(Color.white); // 色を白に指定して
		g.fillRect(getX(), getY(), width, height); //塗りつぶしの四角を描く
		g.setColor(Color.black); // 色を黒に指定して
		g.drawRect(getX(), getY(), width, height); // 枠だけの四角を描く
	}

}
