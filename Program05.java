package com.nit.String;

/*
 * Java Program to divide a string in 'N' equal parts.
 */
public class Program05 {

	public static void main(String[] args) {

		String str = "aaaabbbbcccc";
		int len = str.length();
		int n = 3;
		int temp = 0;
		int chars = len / n;

		String[] equalstr = new String[n];

		if (len % n != 0) {
			System.out.println("String is not divide in N equal Parts...");
		} else {

			for (int i = 0; i < len; i = i + chars) {
				String parts = str.substring(i, i + chars);
				equalstr[temp] = parts;
				temp++;
			}
			System.out.println("String is divide in N equal Parts..");
			for (int i = 0; i < equalstr.length; i++) {
				System.out.println(equalstr[i]);
			}
		}

	}
}
