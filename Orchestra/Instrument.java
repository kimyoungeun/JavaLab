class Instrument {
	protected String name;
	protected String sound;
	
	public Instrument() {
		this.name = "Instrument";
		this.sound = "";
	}
	
	public Instrument(String name) {
		this.name = name;
		this.sound = "";
	}

	public Instrument(String name, String sound) {
		this.name = name;
		this.sound = sound;
	}
	
	public void play() { }
}
