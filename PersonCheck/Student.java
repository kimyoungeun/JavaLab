class Student extends Person {
  	private String second;
	  public Student(String s_name, String s_second){
	    super(s_name);
	    second = s_second;
	  }
	  public void explain(){
	    System.out.println(getName()+" is student");
	 }
	  public String getSNumber(){
	    return second;
	  }
  // Recommend to copy and paste on lab 04_01
  // Your code here
}
