package com.nit.String;
/*
 * Java Program to count the total number of vowels and consonants in a string
 */
public class Program03 {

	public static void main(String[] args) {
		
		String str = "This is a really simple sentence";
		int vCount = 0;
		int cCount = 0;
		
		str = str.toLowerCase();
		
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u') {
				vCount++;
			} else if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z') {
				cCount++;
			}
		}
		System.out.println("Vowels Count : "+vCount);
		System.out.println("Consonent Count : "+cCount);
	}
}
