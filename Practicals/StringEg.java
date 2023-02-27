
public class StringEg {

	public static void main(String[] args) {
		String a1 = "Anudip";
		String a3 = new String("anudip");
		String a2 = "Anudip Foundatiom Vashi";
		String a4 = "Anudip";
		//equals() compares values of string
		System.out.println(a1.equals(a2));//compares values of string
		System.out.println(a1.equals(a3));//case mismatch
		System.out.println(a1.equalsIgnoreCase(a3));
		
		//== compares values case sensitive
		
		System.out.println(a1==a2);
		System.out.println(a1==a4);

	}

}
