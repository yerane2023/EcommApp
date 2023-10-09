package com.nit.String;

/*
 * Java Program to count the total number of characters in a string
 */
public class Program01 {

	public static void main(String[] args) {

		String str = "Shubham Ganesh Yerane Om Nagar";
		int count = 0;
		System.out.println("welcome to java")
		
		for (int i = 0; i < str.length(); i++) {
			if(str.charAt(i) != ' ')
				count++;
		}
		System.out.println("Print the Character Present in String : "+count);
	}
}
