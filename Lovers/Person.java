//Create a class "Person". 
//Each person has lover and lover can get person's phone number through itself.

class Person {
  String name;
  private String phoneNumber;
  private Person lover;

  public Person (String s_name, String s_number){
    name = s_name;
    phoneNumber = s_number;
  }
 
   public String getPhoneNumber()
   { 
     return phoneNumber;
   }
   
   public void makeLover(Person s_object)
   {
     this.lover = s_object;
     s_object.lover = this;
   }
   
   public Person getLover()
   {
     return lover;
   }
  // Your code here
}
