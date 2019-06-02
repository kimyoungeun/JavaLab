class Circle extends Polygon {
  public Circle(Point p, double r) {
    super(p, r);
    // Your code here
  }
  
  public void explain() {
    System.out.println("This is circle.");
		System.out.println("Center : [" + center.getX() + ", " + center.getY() + "]");
		System.out.println("Radius : " + radius);
    // Your code here
  }
}
