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
		g.setColor(Color.black);
		g.fillRect(getX(), getY(), width, height);
		g.setColor(Color.red);
		g.drawRect(getX(), getY(), width, height);

		g.setColor(Color.black);
		g.fillOval(getX()+width/4, getY()+height/4, width/10, height/10);
		g.fillOval(getX()+width/4*3, getY()+height/4, width/10, height/10);
		g.setColor(Color.red);
		g.fillOval(getX()+width/2, getY()+height/4*3, width/5, height/10);

		g.drawString(super.toString(), getX() + getW() - 50, getY() - 15);
		g.drawString(super.toString(), getX(), getY());

	}

}
