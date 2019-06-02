class Polygon {
  protected Point center;
	protected double radius;
	protected double area;
	
	public Polygon(Point cent, double r) {
		this.center = new Point(cent.getX(), cent.getY());
		this.radius = r;
		this.area = 0;
	}
	
	public Point getCenter() {
		return new Point(this.center.getX(),
			this.center.getY());
	}
	
	public double getRadius() {
		return this.radius;
	}
	
	public void explain() {
		System.out.println("This is polygon.");
		System.out.println("Center : [" + center.getX() + ", " + center.getY() + "]");
		System.out.println("Radius : " + radius);
	}
	
	public String toString() {
	  return "Polygon's area is " + this.area;
	}
}

