/**
 * 
 */
package ayton;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * @author 324117274
 *ICS3U
 *Taejaun Ayton
 *10/31/16
 *Exercise 1
 *number testing 
 */
public class Eggs {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat ("0.00");
		
		double egg;
		
		System.out.println("Enter the number of eggs:");egg = scan.nextDouble() ;
		egg = egg/12;		
				
				
				
				
		if (egg >= 11){ 
			System.out.println("price per dozen eggs  is: $0.35");
		System.out.println("your total is: " +(df.format(0.35*egg)));
		}
		else if (egg >= 6){ 
			System.out.println("price per dozen eggs  is: $0.40");
		System.out.println("your total is: " +(df.format(0.40*egg)));
		}
		else if (egg >= 4){ 
			System.out.println("price per dozen eggs is: $0.45");
		System.out.println("your total is: " +(df.format(0.45*egg)));
		}
		else { 
			System.out.println("price per dozen eggs is: $0.50");
			System.out.println("your total is: " +(df.format(egg*0.50)));
		}
	}


}