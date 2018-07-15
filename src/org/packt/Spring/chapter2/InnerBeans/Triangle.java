package org.packt.Spring.chapter2.InnerBeans;

public class Triangle {

	private Point pointA;
	private Point pointB;
	private Point pointC;
	public void setPointA(Point pointA) {
		this.pointA = pointA;
	}
	public void setPointB(Point pointB) {
		this.pointB = pointB;
	}
	public void setPointC(Point pointC) {
		this.pointC = pointC;
	}
	
	public void draw()
	{
		System.out.println("PointA is ("+pointA.getX()+","+pointA.getY()+")");
		System.out.println("PointB is ("+pointB.getX()+","+pointB.getY()+")");
		System.out.println("PointC is ("+pointC.getX()+","+pointC.getY()+")");
	}
	
}
