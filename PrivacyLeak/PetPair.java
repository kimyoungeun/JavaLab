class PetPair implements Cloneable{
	private Pet first, second;
	
	public PetPair(Pet firstPet, Pet secondPet) {
		first = firstPet;
		second = secondPet;
	}
	
	public Pet getFirst(){
		try {
			return (Pet)first.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return first;
	}
	
	public Pet getSecond() { return second; }
	
	public void writeOutput() {
		System.out.println("First pet in the pair: ");
		first.writeOutput();
		System.out.println("\nSecond pet in the pair: ");
		second.writeOutput();
	}
}
