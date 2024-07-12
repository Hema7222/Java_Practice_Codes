package Java_Practice_codes;



//public class PalindromeString {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		String str = "qwerty";
//		String str1 = "";
//		for(int i=str.length()-1;i>=0;i--) {
//			str1=str1+str.charAt(i);
//		}
//		if(str1.equalsIgnoreCase(str)) {
//			System.out.println("String is palindrome");
//		}
//		else {
//			System.out.println("String is not palindrome");
//		}
//
//	}
//
//}



                     /*   USING REVERSE() METHOD   */

//public class PalindromeString {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		String str = "qwerty";
//		String str1 = new StringBuilder(str).reverse().toString();
//		if(str1.equalsIgnoreCase(str)) {
//			System.out.println("String is palindrome");
//		}
//		else {
//			System.out.println("String is not palindrome");
//		}
//
//	}
//
//}


                     /*  To get input from user  */

import java.util.Scanner;
public class PalindromeString {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the String: ");
		
		String str = s.nextLine();
		
		String str1 = new StringBuilder(str).reverse().toString();
		
		if(str1.equalsIgnoreCase(str)) {
			System.out.println("String is palindrome");
		}
		else {
			System.out.println("String is not palindrome");
		}
		s.close();
	}

}



