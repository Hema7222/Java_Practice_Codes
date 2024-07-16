package Java_Practice_codes;

import java.util.Scanner;

public class Anagrams {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the first String: ");
		String str = s.nextLine();
		
		System.out.println("Enter the second String: ");
		String str1 = s.nextLine();
		
		if(isAnagram(str,str1)) {
			System.out.println("String is anagram");
		}
		else {
			System.out.println("String is not anagram");
		}
		
		s.close();

	}
	
	public static boolean isAnagram(String str, String str1) {
		if(str.length() != str1.length()) {
			return false;
		}
		
		int[] charCount = new int[256];
		for(char c: str.toCharArray()) {
			charCount[c]++;
		}
		
		for(char c: str1.toCharArray()) {
			charCount[c]--;
		}
		
		for(int count:charCount) {
			if(count != 0) {
				return false;
			}
		}
		return true;
	}

}
