public class Main {
	public static void main(String[] args) {
		Pet goodDog = new Pet("Dog", 5);
		Pet goodCat = new Pet("Cat", 4);
		PetPair pair = new PetPair(goodDog, goodCat);
		System.out.println("Our pair: ");
		pair.writeOutput();
		
		Pet badGuy = pair.getFirst();
		badGuy.setPet("Hacked", 1200);
		System.out.println("\n\nOur pair now: ");
		pair.writeOutput();
	}
}
