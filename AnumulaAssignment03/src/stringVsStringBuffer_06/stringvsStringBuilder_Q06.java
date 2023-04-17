package stringVsStringBuffer_06;

public class stringvsStringBuilder_Q06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Welcome";
		str += " Home"; // new instance of str is created	
		System.out.println(str); // Output: "Hello world"

		StringBuffer sb = new StringBuffer("Welcome");
		sb.append(" Home");
		System.out.println(sb.toString()); // Output: "Hello world"

	}

}
