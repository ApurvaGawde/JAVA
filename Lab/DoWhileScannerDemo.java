import java.util.Scanner;

public class DoWhileScannerDemo {


	public static void main(String[] args) {
		// declare here
				int a,b,res;
				char Operator, o;
				Scanner S=new Scanner(System.in);
				
				do //do loop begins
				{
					
					System.out.println("\n\nMain Menu : \n1.Addition\n2.Subtraction\n3.Division\n4.Multiplication\n5.Even or Odd\n6. Exit\n");
					
					// enter the choice
					System.out.print("Enter your choice : ");
					
					// read the input choice value.
					Operator=S.next().charAt(0);
					
					
					switch(Operator) //switch loop
					{ 
					    case '1':System.out.print("Enter two numbers : "); 
					    a=S.nextInt();
					    b=S.nextInt();	
					    res=a+b;
					    System.out.print("Result : " +res);
					    break;
					     
					     case '2':System.out.print("Enter two numbers : ");
						 a=S.nextInt();
						 b=S.nextInt();	
						 res=a-b;
						 System.out.print("Result : " +res);
						 break;
						    
					     case '3':System.out.print("Enter two numbers : ");
						 a=S.nextInt();
						 b=S.nextInt();	
						 res=a/b;
						 System.out.print("Result : " +res);
						 break;
						    
					     case '4':System.out.print("Enter two numbers : ");
						 a=S.nextInt();
						 b=S.nextInt();	
						 res=a*b;
						 System.out.print("Result : " +res);
						 break;
						 
					     case '5':System.out.print("Enter two numbers : ");
						 a=S.nextInt();
						 b=S.nextInt();	
						 if(a % 2 ==0 && b % 2 != 0){ //If statement: checks whether the number is even or odd
								System.out.println("The Result is:Even and Odd"); //Result is printed
								}
								else if(a % 2 !=0 && b % 2 == 0) { //If statement: checks whether the number is even or odd
								System.out.println("The Result is: Odd & Even "); //Result is printed
								
								}
								else if(a % 2 ==0 && b % 2 == 0) {//If statement: checks whether the number is even or odd
									System.out.println("The Result is: Even & Even "); //Result is printed
									
									}
								else if(a % 2 !=0 && b % 2 != 0) { //If statement: checks whether the number is even or odd
									System.out.println("The Result is: Odd & Odd "); //Result is printed
									break; //the statement breaks
									}
					     case '6':
						 System.exit(0);
						 break;
						 default : System.out.print("Wrong Choice.....\n");
						 break;
					}
			    }
				
			  while(Operator!=6); //while loop
			}
		
	}
		
		

	
