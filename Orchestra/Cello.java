class Cello extends Instrument {
	public Cello(String name, String sound) {
		super(name, sound);
	}
	
	public void play() {
	   System.out.println("(Cello)" +name + " sound: " + sound);
		// Your code here
	}
}

