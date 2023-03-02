
public class StringMutableEg {

	public static void main(String[] args) {
		StringBuffer s1 = new StringBuffer("Apurva Gawde");
		System.out.println(s1.append("Kishor"));
		System.out.println(s1);
		
		//insert()
		System.out.println(s1.insert(0,"name - "));
		//replace()
		System.out.println(s1.replace(6, 10, "Hi"));
		//delete
		System.out.println(s1.delete(3,5));
		//reverse()
		System.out.println(s1.reverse());
		
	

	}

}
