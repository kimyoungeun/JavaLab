class Student extends Person{
  private String second;
  public Student(String name, String s_second){
    super(name);
    second = s_second;
  }
  public void explain(){
    System.out.println("My name is "+ getName());
    System.out.println("My student number is "+ second);
  }
}

