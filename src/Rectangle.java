import java.awt.*;

class Rectangle extends Figure {
	private int width;
	private int height;

	public Rectangle(int x, int y, int w, int h) {
		super(x, y);
		setSize(w, h);
	}

	int getW() {
		return width;
	}

	int getH() {
		return height;
	}

	void setSize(int w, int h) {
		this.width = Math.max(w, 1);
		this.height = Math.max(h, 1);
	}

	public String toString() {
		return "R" + super.toString() + "[" + width + "," + height + "]";
	}

	public void draw(Graphics g) {
		g.setColor(Color.white);
		g.fillRect(getX(), getY(), width, height);
		g.setColor(Color.black);
		g.drawRect(getX(), getY(), width, height);
	}

}
