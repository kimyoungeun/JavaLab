//Create a class "Prime" that include nextPrime method.

//Use instance variable

import java.util.Scanner;
import java.lang.Math.*;

class Prime {
      int count, num=2, j, status=1;
	    
	    public int nextPrime(){
	       for (count = 2; count <=2;)
	      {
	         for (j = 2; j <= Math.sqrt(num); j++)
	         {
	            if (num%j == 0)
	            {
	               status = 0;
	               break;
	            }
	         }
	         if (status != 0)
	         {
	            count++;
	         }
	         status = 1;
	         num++;
	      }
	       return (num-1);
	    }
}

