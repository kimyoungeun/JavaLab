class Main {
  public static void main(String[] args) {
    File file = new File();
		FileWriter writer = new FileWriter(file);
		FileReader reader = new FileReader(file);
		
		writer.write("Hello");
		String content = reader.read();
		
		System.out.println("File by direct : " + file.content);
		System.out.println("File by reader : " + content);
  }
}
