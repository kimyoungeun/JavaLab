class Main {
  public static void main(String[] args) {
    Person generalPerson = new Person("Jackson");
		Student me = new Student("Me", "21800001");
		
		System.out.println("General Person's explain :");
		generalPerson.explain();
		System.out.println();
		
		System.out.println("Student's explain: ");
		me.explain();
  }
}
