//Create a class "BasePair" that include setter, getter and getPairSequence methods.

//It is string match problem. A and T is a pair, G and C is a pair. 
//If sequence is not a substring of "ATGC", get input sequence while it is correct sequence.

//Use String.charAt(int) method.

import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
		BasePair dna = new BasePair();
		String sequence;
		boolean wow =true;
		
		// Your code here
		while(wow){
		  System.out.print("Input the sequence: ");
			sequence = keyboard.nextLine();
			  
			  for(int i=0; i<sequence.length() ; i++){
				  if(sequence.charAt(i) =='A' || sequence.charAt(i) =='T' || sequence.charAt(i) =='G' || sequence.charAt(i) =='C')
					  wow = true;
				  else{
					  wow = false;
					  break;
				  }
			  }
			  
			  if(wow == true){
			      dna.setdata(sequence);
			      break;
			  }
			  else if(wow==false) {
			    System.out.println("Input sequence isn't substring of ATGC");
			    wow=true;
			  }
	   }
		
		System.out.println("Sequence " + dna.getSequence() +
			" paired with " + dna.getPairSequence() + ".");
		keyboard.close();
  }
}
