class FileReader extends Stream {
  private File file;
  
  public FileReader(File f) {
    file = f;
  }
  
  public String read() {
    //file.content = getBuffer();
    recv(file);
    return getBuffer();
	// Your code here
  }
}

