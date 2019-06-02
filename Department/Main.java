class Main {
  public static void main(String[] args) {
    Department csee = new Department("CSEE");
		Department life = new Department("LifeScience");
		
		Student s1 = new Student(csee, 21800001);
		Student s2 = new Student(life, 21800002);
		
		System.out.println("Student 1 is csee? : " + 
			(csee.equals(s1) ? "Yes!" : "No!"));
		System.out.println("Student 2 is csee? : " + 
			(csee.equals(s2) ? "Yes!" : "No!"));
		System.out.println("Student 2 is life science? : " + 
			(life.equals(s2) ? "Yes!" : "No!"));
		System.out.println("Student 1 is Student2? : " + 
		  (s1.equals(s2) ? "Yes!" : "No!"));
  }
}
