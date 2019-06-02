class Triangle extends Polygon {
  public Triangle(Point p, double r) {
   super(p, r);
    // Your code here
  }
  
  public void explain() {
    System.out.println("This is triangle.");
		System.out.println("Center : [" + center.getX() + ", " + center.getY() + "]");
		System.out.println("Radius : " + radius);
    // Your code here
  }
}
