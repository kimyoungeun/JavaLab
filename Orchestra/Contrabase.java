class Contrabase extends Instrument {
	public Contrabase(String name, String sound) {
		super(name, sound);
	}
	
	public void play() {
	   System.out.println("(Contrabase)" +name + " sound: " + sound);
		// Your code here
	}
}

