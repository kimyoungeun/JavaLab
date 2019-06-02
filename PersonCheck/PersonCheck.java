class PersonCheck {
  public static void whatPerson(Person x){
    if( x instanceof Student){
      Student s = (Student)x;
      s.explain();
    }
    else if( x instanceof Undergraduate){
      Undergraduate u =(Undergraduate)x;
      u.explain();
    }
    else {
      Person p = (Person)x;
      p.explain();
    }
      
  }
  // Your code here
}
