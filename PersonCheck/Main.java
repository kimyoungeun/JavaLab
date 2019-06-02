class Main {
  public static void main(String[] args) {
    Person p = new Person("Per");
		Student s = new Student("Stu", "21800001");
		Undergraduate u = new Undergraduate("Under", "21800001", 2);
		
		PersonCheck.whatPerson(u);
		PersonCheck.whatPerson(s);
		PersonCheck.whatPerson(p);
  }
}
