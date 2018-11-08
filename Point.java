package shapes;

public class Point {

	private int x;
	private int y;
	private boolean selected;

	public Point() {

	}

	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public Point(int x, int y, boolean selected) {
		this(x,y);
		this.selected = selected;
	}
	public String toString() {
		return "("+x+","+this.y+")";
	}

	public boolean equals(Object obj) {
		Point temp;
		if(obj instanceof Point) {
			temp=(Point)obj;
			if (x==temp.getX()&&y==temp.getY())
				return true;
			else
				return false;}
		else
			return false;

	}

	public double distance(int x, int y) {
		int dX = this.x - x;
		int dY = this.y - y;
		double d = Math.sqrt(dX * dX + dY * dY);
		return d;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public boolean isSelected() {
		return selected;
	}

	public void setSelected(boolean selected) {
		this.selected = selected;
	}

}
