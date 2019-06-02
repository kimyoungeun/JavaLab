class Undergraduate extends Student {
  private int level =0;
  public Undergraduate(String s_name, String s_second, int num){
    super(s_name, s_second);
    level= num;
  }
  public int getLevel(){
    return level;
  }
  public void explain(){
    System.out.println(getName() + " is Undergraduate");
  }
  // Your code here
}

