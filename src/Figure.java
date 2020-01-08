abstract class Figure extends Point implements DrawableObject, MovableObject {
	Figure(int x, int y) {
		super(x, y);
	}

	public String toString() {
		return "(" + getX() + "," + getY() + ")";
	}

	public void move(int mx, int my) {
		int x = getX() + mx;
		int y = getY() + my;
		setX(x);
		setY(y);
	}
}