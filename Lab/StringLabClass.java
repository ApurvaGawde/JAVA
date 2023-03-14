//Write a program which creates a String “Welcome to Java World” and performs the following
//        Returns the character at 5th position and display it.
//        Compares the above String with “Welcome” lexicographically ignoring case differences and display the result.
//        Concatenates “- Let us learn” to the above string and display it.
//        Returns the position of the first occurrence of character ‘a’ and display it.
//        Replaces all the occurrences of ‘a’ character with the new ‘e’ and display it.
//        Returns string between 4th position and 10th position and display it.
//        Returns the lowercase of the string and display it.

package stringLab;

public class StringLabClass {

	public static void main(String[] args) {
		String a="Welcome to Java World"; //Take a string variable
		System.out.println("The character at 5th position is : " +a.charAt(5) ); //Returns the character at 5th position and display it.
		String b="Welcome"; //Compares the above String with “Welcome” lexicographically ignoring case differences and display the result.
		System.out.println(a.compareTo(b));	//Compares the above String with “Welcome” lexicographically ignoring case differences and display the result.
		String c =  "- Let us learn"; //Take another string
		System.out.println(a+ " " +c); //Concatenates “- Let us learn” to the above string and display it.
		int d = a.indexOf('a');//returns the index of a char value  
		System.out.println("position of the first occurrence of character ‘a’ is : "+d); // Returns the position of the first occurrence of character ‘a’ and display it.
		
		System.out.println(a.replace('a', 'e')); // Replaces all the occurrences of ‘a’ character with the new ‘e’ and display it.
		System.out.println("string between 4th position and 10th position is: " +a.substring(4, 10)); // Returns string between 4th position and 10th position and display it.
		System.out.println("The lowercase string is : " +a.toLowerCase()); //Returns the lowercase of the string and display it.


	}

}
