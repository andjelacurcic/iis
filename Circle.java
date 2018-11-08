package shapes;

public class Circle {
	
	private Point center;
	private int r;
	private boolean selected;
	
	public double area() {
		return r * r * Math.PI;
	}
	
	
	public Circle() {
	}


	public Circle(Point center, int r) {
		this.center = center;
		this.r = r;
	}


	public Circle(Point center, int r, boolean selected) {
		this(center,r);
		this.selected = selected;
	}

	public String toString() {
		return "x kordinara je: "+center.getX()+ " y kordinata je: "+center.getY() + "Radius je :" +r;
	}
	
	public boolean equals(Object obj) {
		Circle temp;
		if(obj instanceof Circle) {
			temp = (Circle)obj;
			if(r==temp.r)
				return true;
			else
				return false;}
		else 
			return false;
		}
	

	public Point getCenter() {
		return center;
	}
	public void setCenter(Point center) {
		this.center = center;
	}
	public int getR() {
		return r;
	}
	public void setR(int r) {
		this.r = r;
	}
	public boolean isSelected() {
		return selected;
	}
	public void setSelected(boolean selected) {
		this.selected = selected;
	}

}
