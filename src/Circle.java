import java.awt.*;
class Circle extends Figure {
	private int radius;
	
	public Circle(int x, int y, int r) {
		super(x,y);
		radius = r;
	}
	int getR() { return radius;}
	void setR(int r) {
		this.radius = Math.max(1, r);
	}
	public void draw(Graphics g) {
		g.setColor(Color.white); 
		g.fillOval(getX()-radius, getY()-radius, radius*2, radius*2);
		g.setColor(Color.black);
		g.drawOval(getX()-radius, getY()-radius, radius*2, radius*2);
	}
	public String toString() {
		return "C"+super.toString()+"["+radius+"]";
	}
}
