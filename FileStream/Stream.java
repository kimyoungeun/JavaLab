class Stream {
  private String buffer;
  protected void setBuffer(String s_string) {
	  buffer = s_string;
  }
  protected String getBuffer() {
	  return buffer;
  }
  protected void send(Object s_object) {
	  ((File)s_object).content = buffer;
  }
  protected void recv(Object s_object) {
	   buffer = ((File)s_object).content;
  }
  // Your code here
}
