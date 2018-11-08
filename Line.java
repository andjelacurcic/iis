package shapes;

public class Line {

	private Point startPoint;
	private Point endPoint;
	private boolean selected;

	public double lenght() {
		double lenght = startPoint.distance(endPoint.getX(), endPoint.getY());
		return lenght;
	}

	public Line() {
	}

	public Line(Point startPoint, Point endPoint) {
		this.startPoint = startPoint;
		this.endPoint = endPoint;
	}

	public Line(Point startPoint, Point endPoint, boolean selected) {
		this (startPoint,endPoint);
		this.selected = selected;
	}

	public String toString() {
		return startPoint + "-->" + endPoint;
	}
	
	public boolean equals(Object obj) {
		Line temp;
		if(obj instanceof Line) {
			temp=(Line)obj;
			if(this.lenght()==temp.lenght())
			return true;
			else
				return false;
		} else
			return false;
			
		
	}
	
	public Point getStartPoint() {
		return startPoint;
	}

	public void setStartPoint(Point startPoint) {
		this.startPoint = startPoint;
	}

	public Point getEndPoint() {
		return endPoint;
	}

	public void setEndPoint(Point endPoint) {
		this.endPoint = endPoint;
	}

	public boolean isSelected() {
		return selected;
	}

	public void setSelected(boolean selected) {
		this.selected = selected;
	}

}
