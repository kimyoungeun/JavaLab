//Create a class "Person".
//Each person has lover and lover can get person's phone number through itself.

public class Main {
	public static void main(String[] args) {
		Person girl = new Person("Amy", "010-1234-5678");
		Person boy = new Person("Jackson", "010-9876-5432");
		
		girl.makeLover(boy);

		System.out.println(girl.name + "'s boyfriend is " + 
			girl.getLover().name + " and phone number is " + 
			girl.getLover().getPhoneNumber());
		System.out.println(boy.name + "'s girlfriend is " + 
			boy.getLover().name + " and phone number is " + 
			boy.getLover().getPhoneNumber());
	}
}
