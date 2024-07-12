package Java_Practice_codes;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "qwerty";
		String s2 = "";
		for(int i=str.length()-1;i>=0;i--) {   
			s2 = s2+str.charAt(i);
		}
		System.out.println("Reversed String: " +s2);

	}

}
