//Create a class "BasePair" that include setter, getter and getPairSequence methods.

//It is string match problem. A and T is a pair, G and C is a pair. 
//If sequence is not a substring of "ATGC", get input sequence while it is correct sequence.

//Use String.charAt(int) method.

import java.util.Scanner;

class BasePair {
    private String se;
    char[] newsequence = new char[30];
	  
	  public void setdata(String s_se){
	    se= s_se;
	  }
	  
	  public String getSequence(){
	    return se;
	  }
	  
	  public String getPairSequence() {
	    	for (int i =0; i< se.length(); i++){
			  if(se.charAt(i) =='A')
			    newsequence[i]='T';
			  else if(se.charAt(i) =='T')
				  newsequence[i]='A';
			  else if(se.charAt(i) =='G')
				  newsequence[i]='C';
			  else if(se.charAt(i) =='C')
				  newsequence[i]='G';
			}
			 se = String.valueOf(newsequence);
			return se;
	  }
	  // Your code here
}
