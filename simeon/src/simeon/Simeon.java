package simeon;
import java.util.*;
public class Simeon {

	public static void main(String[] args)
	{
	   Scanner sc = new Scanner(System.in);
	   
	   int units;
	   double billToPay=0;
	   
	   System.out.println("*** ELECTRIC BILL ***");
	   System.out.println("Enter the Number of UNITS ");
	   units = sc.nextInt();
	   if(units<100) 
	   {
            billToPay = units*1.20;
	    
	   }
	   else if(units < 300)
	   {
		  billToPay =100*1.20+(units-100)*2;   
	   }
	   else if (units >300)
	   {
		   billToPay= 100*1.20*+200*2+(units-300)*3;
	   }
	   System.out.println("Your Electricity Payment is \n"+billToPay);         
   }
}