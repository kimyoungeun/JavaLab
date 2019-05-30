//Create a class "Seller that include setters and sell methods.

//At first, there are 5 apples and price is 3,000 won per one apple.

import java.util.Scanner;

class Seller {
    private int app;
	  private int app_pri;
	  private int num;
	  public int a=0;
	  
	  public void setApple(int s_app)
	  {
	    app=s_app;
	  }

	  public void setApplePrice(int s_app_pri)
	  {
	    app_pri = s_app_pri;
	  }
	  
	  public void sell(int s_number)
	  {
	    num=s_number;
	    
	    if(app > num && num !=0){
	      app = app-num;
	      a = app_pri * num;
	      System.out.println(app +" apples left and balance is " + a + " won." );
	    }
	    
	    else if (num == 0){
	      app = app-num;
	      System.out.print(app +" apples left and balance is ");
	      System.out.print(a);
	      System.out.println(" won.");
	    }
	    
	    else if (app < num){
	      System.out.println("There's not enough apples.");
	    }
	    
	    else if(app == num){
	      app = app-num;
	      a = a + (3000* num);
	      System.out.println(app +" apples left and balance is " + a + " won." );
	    }
	    
	  }
}
