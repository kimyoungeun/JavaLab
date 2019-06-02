class Department {
  protected String name;
  Department(String s_name){
    name=s_name;
  }
  public boolean equals(Object object){
    boolean x= false;
    Department d = (Department)object;
    x =(this.name ==d.name);
    return x;
  }
  // Your code here
}
