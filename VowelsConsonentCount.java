//package Java_Practice_codes;
//
//public class VowelsConsonentCount {
//
//	public static void main(String[] args) {
//		String str = "Biodegradations";
//		int vowels=0, consonent=0;
//		str = str.toLowerCase();
//		for(char c : str.toCharArray()) {
//			if(c>='a' && c<='z') {
//				if(c=='a' || c=='e' || c=='i' || c=='o' ||c=='u') {
//					vowels++;
//				}
//				else {
//					consonent++;
//				}
//			}
//		}
//		System.out.println("Vowels: "+vowels);
//		System.out.println("Consonent: "+consonent);
//	}
//
//}


//-------------------------------Repetitions is not allowed---------------------------------


package Java_Practice_codes;

import java.util.HashSet;
import java.util.Set;

public class VowelsConsonentCount {

	public static void main(String[] args) {
		String str = "Biodegradations";
		int vowels=0, consonent=0;
		Set<Character> uniqueChars = new HashSet<>();
		str = str.toLowerCase();
		for(char c : str.toCharArray()) {
			if(c>='a' && c<='z' && !uniqueChars.contains(c)) {
				uniqueChars.add(c);
				if(c=='a' || c=='e' || c=='i' || c=='o' ||c=='u') {
					vowels++;
				}
				else {
					consonent++;
				}
			}
		}
		System.out.println("Vowels: "+vowels);
		System.out.println("Consonent: "+consonent);
	}

}

