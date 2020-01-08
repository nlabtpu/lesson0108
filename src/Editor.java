import java.io.*;

class Editor {
	private Figure[] flist = new Figure[0];

	public String toString() {
		String str = "";
		for (int i = 0; i < flist.length; i++) {
			str = str + i + ": " + flist[i] + "\n";
		}
		return str;
	}

	Figure[] getFlist() {
		return flist;
	}

	void addFigure(Figure fig) {
		if (fig == null)
			return;
		Figure[] newflist = new Figure[flist.length + 1];
		for (int i = 0; i < flist.length; i++) {
			newflist[i] = flist[i];
		}
		newflist[flist.length] = fig;
		flist = newflist;
	}

	Figure createFigure(String[] strs) {
		Figure fig = null;
		if (strs[1].equals("Rect")) {
			int x = Integer.parseInt(strs[2]);
			int y = Integer.parseInt(strs[3]);
			int w = Integer.parseInt(strs[4]);
			int h = Integer.parseInt(strs[5]);
			fig = new Rectangle(x, y, w, h);
		} else if (strs[1].equals("Circ")) {
			int x = Integer.parseInt(strs[2]);
			int y = Integer.parseInt(strs[3]);
			int r = Integer.parseInt(strs[4]);
			fig = new Circle(x, y, r);
		} else {
			System.out.println(strs[1] + ": not a figure");
		}
		return fig;
	}

	boolean execute(BufferedReader input) {
		System.out.print(">> ");
		String str;

		try {
			str = input.readLine();
		} catch (IOException e) {
			System.out.println(e);
			return false;
		}

		String strs[] = str.split(" ");

		if (strs[0].equals("add")) {
			addFigure(createFigure(strs));
			System.out.println(this);
			return true;
		} else if (strs[0].equals("move")) {
			int num = 0, dx = 0, dy = 0;
			try {
				num = Integer.parseInt(strs[1]);
				dx = Integer.parseInt(strs[2]);
				dy = Integer.parseInt(strs[3]);
				try {
					flist[num].move(dx, dy);
				} catch (ArrayIndexOutOfBoundsException e) {

				}
			} catch (ArrayIndexOutOfBoundsException e) {

			} catch (NumberFormatException e) {

			}
			System.out.println(this);
			return true;
		} else if (strs[0].equals("exit")) {
			System.out.println(this);
			System.out.println("bye");
			return false;
		} else {
			System.out.println(strs[0] + ": not a command");
			return true;
		}
	}
}
