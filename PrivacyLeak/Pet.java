class Pet implements Cloneable{
	private String name;
	private int age;
	
	public Pet(String initialName, int initialAge) {
		name = initialName;
		age = initialAge;
	}
	
	public void setPet(String initialName, int initialAge) {
		name = initialName;
    age = initialAge;
	}
	
	public String getName() { return name; }
	public int getAge() { return age; }
	
	protected Object clone() throws CloneNotSupportedException{
		Pet first =(Pet) super.clone();
		first.name=(String)name;
		first.age=(int)age;
		return first;
	}
	
	public void writeOutput() {
		System.out.print("Name: " + name);
		System.out.println("\tAge: " + age + " years");
	}
}
