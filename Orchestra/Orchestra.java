class Orchestra {
	Instrument[] instruments;
	int count;
	
	public Orchestra() {
		count = 0;
		instruments = new Instrument[10];
	}
	
	public void setInst(Instrument ins) {
	  this.instruments[count] =ins;
		count++;
		// Your code here
	}
	
	public void play() {
	  for(int i=0; i<count; i++)
			instruments[i].play();
		// Your code here
	}
}
