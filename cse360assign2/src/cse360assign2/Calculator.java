/**
 * Author:		John Sampanes
 * Class ID:	539
 * Assignment:	2
 * 
 * Description:	This file contains the class Calculator,
 * 		described below
 * 
 * github repository:
 * 		https://github.com/360example/360assignment2.git
 * username:
 * 		360example
 * password:
 * 		360password3
 */
package cse360assign2;

/*
 * Calculator class
 * 		The purpose of this class is to keep a running total
 * 		of a number as various operations are performed
 * 		while also maintaining a string of calculation history
 */
public class Calculator {

	private int total;
	private String historyString = "0";
	
	/*
	 * Constructor, initializes total for clarity
	 */
	public Calculator () {
		total = 0;  // not needed - included for clarity
	}
	
	/*
	 * getTotal
	 * @params: none
	 * @return: 0...?
	 * @description, returns private member "total"
	 */
	public int getTotal () {
		return total;
	}
	
	/*
	 * add
	 * @params: value
	 * @return: void
	 * @description: adds total and value, adds addition to string
	 */
	public void add (int value) {
		total += value;
		historyString += " + " + value;
	}
	
	/*
	 * subtract
	 * @params: value
	 * @return: void
	 * @description: subtracts value from total, adds subtraction to string
	 */
	public void subtract (int value) {
		total -= value;
		historyString += " - " + value;
	}
	
	/*
	 * multiply
	 * @params: value
	 * @return: void
	 * @description: multiplies total by value, adds multiplication to string
	 */
	public void multiply (int value) {
		total *= value;
		historyString += " * " + value;
	}
	
	/*
	 * divide
	 * @params: void
	 * @return: void
	 * @description: divides total by value, adds division to string
	 */
	public void divide (int value) {
		if (value != 0)
			total = total / value;
		else
			total = 0;
		historyString += " / " + value;
	}
	
	/*
	 * getHistory
	 * @params: none
	 * @return: string of history, generated via each calculation
	 */
	public String getHistory () {
		return historyString;
	}
}
