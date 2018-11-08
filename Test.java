package shapes;

public class Test {

	public static void main(String[] args) {
		Point p1=new Point();
		System.out.println(p1.getX());
		p1.setX(3);
		System.out.println(p1.getX());
		System.out.println(p1.isSelected());
		double udaljenost=p1.distance(10,15 );
		System.out.println(udaljenost);
		
		Line l1=new Line();
		System.out.println(l1.isSelected());
		l1.setStartPoint(p1);
        Point p2=new Point();
        p2.setX(5);
        p2.setY(10);
        l1.setEndPoint(p2);
        System.out.println("Start point l1 "+l1.getStartPoint().getX());
        System.out.println(l1.lenght());
        
        l1.getStartPoint().setX(5);
        System.out.println(l1.getStartPoint().getX());
        
        Rectangle r1=new Rectangle();
        r1.setUpperLeftPoint(p2);
        r1.setHeight(10);
        r1.setWidth(20);
        System.out.println(r1.area());
        
        Circle c1=new Circle();
        c1.setCenter(r1.getUpperLeftPoint());
        c1.setR(10);
        System.out.println(c1.area());
        
        l1.getStartPoint().setX(c1.getCenter().getY());;
        
        l1.getEndPoint().setY((c1.getCenter().getX() - c1.getCenter().getY())-(r1.getUpperLeftPoint().getX()+ r1.getUpperLeftPoint().getY()));
System.out.println(l1.getEndPoint().getY());
		
		Point p3 = new Point(7, 9);
		System.out.println("Xp3: "+p3.getX()+"\nYp3: "+p3.getY());
		
		Point p4 = new Point(10, 11, true);
		System.out.println("\nXp4: "+p4.getX()+"\nYp4: "+p4.getY()+"\nSelected p4: "+p4.isSelected());
		
		Line l2 = new Line(new Point(12, 13), new Point(22, 23, true));
		System.out.println("Duzina l2: "+l2.lenght());
		
		Rectangle r2 = new Rectangle(new Point(26, 33), 100, 200, true);
		System.out.println("Pr2: "+r2.area());
		
		Circle c2 = new Circle(r2.getUpperLeftPoint(), 20, true);
		
		System.out.println(p1);
		System.out.println(l2);
		
		Point p5 = new Point(3, 5);
		Point p6 = p5;
		Point p7 = new Point(3, 5);
		
		System.out.println("p5 i p6 su iste: "+ (p5 == p6));
		System.out.println("p5 i p7 su iste: "+ (p5 == p7));
		
		System.out.println("p5 i p6 su iste equals: "+ p5.equals(p6));
		System.out.println("p5 i p7 su iste equals: "+ p5.equals(p7));
        
        System.out.println(c1);
        System.out.println(r2);
        
        Line l4=new Line(new Point(4,3),new Point(5,4));
        Line l5=new Line(new Point(4,3),new Point(5,4));
        System.out.println("duzine linija su jednake - "+ l4.equals(l5));
        
        Rectangle r5=new Rectangle(new Point(5,5), 100, 200);
        Rectangle r6=new Rectangle(new Point(5,5), 100, 100);
        
        System.out.println("Trouglovi su jednaki- "+ r5.equals(r6));
        System.out.println("krugovi imaju jednak radius - "+ c1.equals(c2));
		

	}

}
