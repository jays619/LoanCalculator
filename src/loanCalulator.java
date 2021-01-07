
import java.util.Scanner; 
/**
 * Documentation
 * @author: SaidJHofiani
 * Date:2/8/16
 * Purpose: This is the homework, that is suppose to calculate periodic payments
 * 
 */
public class loanCalulator {

	public static void main(String[] args) {
	//declare the values 
	double p, i, t;
	double payment; 
	Scanner keyboard = new Scanner(System.in);
	
	//get users loan amount	
	System.out.println("Enter your loan amount please");
		p = keyboard.nextDouble(); 
	
		//get the periodic interest
	System.out.println("Enter the periodic interest");
	    i = keyboard.nextDouble()/1200;
	
	    //get the term of payment    
	System.out.println("Enter the Term");
	    t = keyboard.nextInt(); 
	
	   // final calculation 
	    payment = ((p * (i)) / (1 - Math.pow((1 + i),-t)));
       
	    //prints the payment 
	    System.out.println ("Your payment would be " + payment);
	}	

}
