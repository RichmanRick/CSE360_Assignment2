package cse360assign2;

/**
 * Calculator class contains methods that will perform the four most basic mathematical operations 
 * add, subtract, multiply, and divide, and it will only take in integer values. The operations/methods 
 * and values used in the calculator will also be recorded in its history, which can be shown any time.
 * 
 * @author Richard Cao <br>
 * ClassID: 342 <br>
 * Assignment #2 <br>
 * @version %I%, %G%
 *
 */
public class Calculator 
{

	private int total;
	private String data = "0"; 
	
	/**
	 * Class constructor
	 */
	public Calculator () 
	{
		total = 0;  // not needed - included for clarity
	}
	
	/**
	 * This method will return the result of the calculations made.
	 * @return		the output of whatever was inputted 
	 */
	public int getTotal () 
	{
		return total;
	}
	
	/**
	 * This method will perform the mathematical operation of addition with the total using the value parameter.
	 * @param value	the integer to be added to the total
	 */
	public void add (int value) 
	{
		total = total + value;
		data = data + " + " + value;
	}
	/**
	 * This method will perform the mathematical operation of subtraction with the total using the value parameter.
	 * @param value	the integer to be subtracted from the total
	 */
	public void subtract (int value) 
	{
		total = total - value;
		data = data + " - " + value;
	}
	
	/**
	 * This method will perform the mathematical operation of multiplication with the total using the value parameter.
	 * @param value	the integer to be multiplied with the total
	 */
	public void multiply (int value) 
	{
		total = total * value;
		data = data + " * " + value;
	}
	
	/**
	 * This method will perform the mathematical operation of division with the total using the value parameter.
	 * @param value	the integer to divide the total by
	 */
	public void divide (int value) 
	{
		if (value == 0)
			total = 0;
		else
			total = (int) (total / value);
		data = data + " / " + value;
	}
	
	/**
	 * This method will record the methods and values used and output a string of the operations and numbers used.
	 * @return		a math expression of the numbers and operations used
	 */
	public String getHistory () 
	{
		return data;
	}
	
}






