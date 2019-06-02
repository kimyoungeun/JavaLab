class Student extends Department {
  protected int studentId;
  Student(Department d , int id){
    super(d.name);
    studentId = id;
  }
  public boolean equals(Object object){
    boolean y = false;
    if((object != null) && (object instanceof Student)){
      Student otherStudent =(Student)object;
      y=(this.studentId == otherStudent.studentId);
    }
    return y;
  }
  // Your code here
}

