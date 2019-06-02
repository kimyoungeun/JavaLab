class FileWriter extends Stream {
  private File file;
  
  public FileWriter(File f) {
    file = f;
  }
  
  public void write(String s) {
      setBuffer(s);
      send(file);
	  //file.content= s;
    // Your code here
  }
}
