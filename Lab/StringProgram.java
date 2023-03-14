//Write a program which creates a StringBuffer “This is StringBuffer” and performs the following.
//    Adds the string ”- This is a sample program” to existing string and display it.
//    Inserts the string “Object” into the existing string at 21st postion and display it.
//    Reverses the entire string and displays it.
//    Replaces the word “Buffer” with “Builder” and display it.
package stringLab;

public class StringProgram {

	public static void main(String[] args) { //main class
		StringBuffer s1 = new StringBuffer("This is StringBuffer"); // Make a new object 
		
		String c =  "- This is a sample program";  //Assign a string value to another variable
	    System.out.println(s1+ " " +c); // addition of strings
		System.out.println(s1.insert(20 ,"Object"));  //Inserts the string “Object” into the existing string at 21st postion and display it.
		System.out.println(s1.reverse());  //Reverses the entire string and displays it.
		System.out.println(s1.replace(11,16,"Builder")); // Replaces the word “Buffer” with “Builder” and display it.

	}

}
