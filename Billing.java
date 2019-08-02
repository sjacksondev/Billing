/* Page 224 Chapter Programming Exercise 2
   Filename: Billing.java
   Author: Sabrina
   Date: 8/1/19 

A class created that includes three overload computeBill() methods for a photo book store. */

public class Billing
{
	public static void main(String[] args) 
	{
		double bookCost;
		int quantity; 
		double couponValue; 
		double tax;

		bookCost = 15.00;
		quantity = 2;
		couponValue = 3.00;
		tax = 0.08;

		computeBill(bookCost, tax);
		computeBill(bookCost, quantity, tax);
		computeBill(bookCost, quantity, couponValue, tax);	
	} 
	// First version of computeBill with one argument
	public static void computeBill(double bookCost, double tax)
	{
		double taxSum = bookCost * tax;
		double total = bookCost + taxSum;

		System.out.println("The total for 1 photo book at $15.00 each plus 0.08% tax is: ");
		System.out.format("$" + "%.2f", total);

	}

	// Second version of computeBill with two arguments
	public static void computeBill(double bookCost, int quantity, double tax)
	{ 
		double taxSum = (bookCost * quantity) * tax;
		double total = (bookCost * quantity) + taxSum;
		System.out.println("\nThe total for 2 photo books at $15.00 each plus 0.08% tax is: ");
		System.out.format("$" + "%.2f", total);
	}

	// Third version of computeBill with three arguments
	public static void computeBill(double bookCost, int quantity, double couponValue, double tax)
	{   
		double taxSum = ((bookCost * quantity) - couponValue) * tax;
		double total = ((bookCost * quantity) - couponValue) + taxSum;
		System.out.println("\nThe total for 2 photo books at $15.00 each minus a $3.00 coupon plus 0.08% tax is: ");
		System.out.format("$" + "%.2f", total);

	}
} // end of class