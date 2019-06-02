class Main {
  public static void main(String[] args) {
    Violin v1 = new Violin("Violin 1", "vivivi");
		Violin v2 = new Violin("Violin 2", "v2v2v2");
		Cello c1 = new Cello("Cello 1", "chchch");
		Contrabase cb1 = new Contrabase("Contrabase 1", "contcont");
		Contrabase cb2 = new Contrabase("Contrabase 2", "c2c2");
		
		Orchestra orch = new Orchestra();
		orch.setInst(v1);
		orch.setInst(v2);
		orch.setInst(c1);
		orch.setInst(cb1);
		orch.setInst(cb2);
		
		orch.play();
  }
}
