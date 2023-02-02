package simeon;
import java.util.*;
public class Simeon {
	
	Scanner sc = new Scanner(System.in);
	int pin = 2727;

	public static void main(String[] args)
	{
	   Simeon sm = new Simeon(); // created object for main class
	   int units;
	   double billToPay=0;
	   
	   System.out.println("*** ELECTRIC BILL ***");
	   System.out.print("Enter the Number of UNITS : ");
	   units = sm.sc.nextInt(); // scanner object is invoked using the main class object
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
		   billToPay= 100*1.20+200*2+(units-300)*3;  // error in this line is solved wrong calculation
	   }
	   System.out.println("Your Electricity Payment is \n"+billToPay);
	   sm.payment();
   }
	
	void payment() {
		 System.out.print(" Enter Amount to pay : ");
		 sc.nextInt();
		 System.out.print(" Enter Pin: ");
		 int passcode = sc.nextInt();
		 
		 if (passcode == pin) {
			 System.out.print(" PAYMENT SUCCESSFUL"); 
		 }
		 else {
			 System.out.print(" PAYMENT FAILED !! Wrong Pin ");
		 }
		 
		 
	}
	
}