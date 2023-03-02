//Create a class ScannerLaptopDemo.java with a main method which performs the required operations as specified above.

//Algorithm:
//1.    Display message as specified to print the various options 1 to 5.

//2.    On user enters one of the option based on the input the appropriate arithmetic operation is done as mentioned below.

//3.    Using switch statement, display the appropriate message.

//a.    Example if option is 1 “Enter two numbers to be added”, get the two numbers using Scanner class and print the added result.

//b.    If option is 2 “Enter two numbers to be subtracted”, get the two numbers using Scanner class and print the subtracted result.

//c.     If option is 3 “Enter two numbers to be multiplied”, get the two numbers using Scanner class and print the multiplied result.

//d.    If option is 4 “Enter numbers to check even or add”, get the number using Scanner class and print the result.

//e.    If option is 5 terminate the program.


import java.util.Scanner; //Import scanner

public class ScannerLaptopDemo { //Define class
	
	public void  Calculator(char Operator,int num1,int num2) { //define method along with variables
		int result;
		switch(Operator) { //switch case starts
		case '1' : //first case
			result = num1 + num2; //Addition is taking place
			System.out.println("The result is : "+result ); //Result is printed
			break; //the statement breaks
		case '2' ://switch case starts
			result = num1 - num2; //Subtraction is taking place
			System.out.println( "The result is : " + result );//Result is printed
			break;//the statement breaks
		case '3' : //switch case starts
			result = num1 * num2; //Multiplication is taking place
			System.out.println("The result is : "+ result ); //Result is printed
			break; //the statement breaks
		case '4' : //switch case starts
			result = num1 / num2; //Division is taking place
			System.out.println("The result is : " + result ); //Result is printed
			break;//the statement breaks
		case '5' ://switch case starts
			if(num1 % 2 ==0 && num2 % 2 != 0){ //If statement: checks whether the number is even or odd
			System.out.println("The Result is:Even and Odd"); //Result is printed
			}
			else if(num1 % 2 !=0 && num2 % 2 == 0) { //If statement: checks whether the number is even or odd
			System.out.println("The Result is: Odd & Even "); //Result is printed
			
			}
			else if(num1 % 2 ==0 && num2 % 2 == 0) {//If statement: checks whether the number is even or odd
				System.out.println("The Result is: Even & Even "); //Result is printed
				
				}
			else if(num1 % 2 !=0 && num2 % 2 != 0) { //If statement: checks whether the number is even or odd
				System.out.println("The Result is: Odd & Odd "); //Result is printed
				break; //the statement breaks
				}
			
		case '6' :
			
			break;
		
		}
	}
	

	public static void main(String[] args) { //main string
		Scanner sc = new Scanner(System.in); //making object of scanner class
		System.out.println("Choose a case: 1,2,3,4,5 0r 6"); //asking to choose a case
	    char Operator = sc.next().charAt(0);
		System.out.println("Enter first number : "); //taking user input
		int num1 = sc.nextInt();
		System.out.println("Enter second number : ");
		int num2 = sc.nextInt();
		
		
		ScannerLaptopDemo c = new ScannerLaptopDemo(); //making object class
		c.Calculator( Operator,num1, num2);
		

	}

}
