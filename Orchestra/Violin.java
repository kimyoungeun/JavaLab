class Violin extends Instrument {
	public Violin(String name, String sound) {
		super(name, sound);
	}
	
	public void play() {
	   System.out.println("(Violin)" +name + " sound: " + sound);
		// Your code here
	}
}
