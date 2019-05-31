import java.util.Scanner;

class Translator {
    public static String decimalToBinary (int number){
    int count =0, a;
    String x="";
    while(number > 0)
        {
            a = number % 2;
            if(a == 1)
            {
                count++;
            }
            x = a + "" + x;
            number = number / 2;
        }
    return x;
  }
}
