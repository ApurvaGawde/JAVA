

public class Singlearray {

	public static void main(String[] args) {
		int myarray[] = new int[4]; //declaration & instantiation
		myarray[0] = 78; //initialization
		myarray[1] = 97;
		myarray[2] = 72;
		myarray[3] = 38;
		
		System.out.println(myarray[2]); //value of index 2
		for(int i=0; i<myarray.length; i++) { //length of array
			System.out.println(myarray[i]);
		}
		float num[] = {3.5f,8.9f,8.8f,9.8f}; //declaration, instantion & initialisation
		System.out.println("Array elements: ");
		for(int j=0; j<num.length;j++) {
			
			
			System.out.println(num[j] + " , ");
		}
	}

}
