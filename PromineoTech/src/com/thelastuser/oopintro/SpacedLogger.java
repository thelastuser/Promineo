package com.thelastuser.oopintro;

public class SpacedLogger implements Logger {

	@Override
	public void log(String str) {
		// TODO The SpacedLogger should add a space or " " between each character of the String argument passed
		// into its methods.
		// a. If the log method received “Hello” as an argument, it should print H e l l o
		char[] strPart = new char[str.length()];
		for (int i = 0; i < str.length(); i++) {
			strPart[i] = str.charAt(i);
		}
		if (strPart.length != 0) {
			System.out.print(strPart[0]);
				if (strPart.length > 1) {
					for (int j = 1; j < strPart.length; j++) {
						System.out.printf(" ");
						System.out.printf(String.valueOf(strPart[j]));
					}
				}
			System.out.println();
			}
		}

	@Override
	public void error(String str) {
		// TODO b. The error method should do the same, but with “ERROR:” preceding the spaced out input
		// (i.e. ERROR: H e l l o)
		char[] strPart = new char[str.length()];
		System.out.print("ERROR: ");
		if (strPart.length != 0) {
			System.out.print(strPart[0]);
			for (int i = 0; i < str.length(); i++) {
				strPart[i] = str.charAt(i);
			}
			System.out.printf(String.valueOf(strPart[0]));
				if (strPart.length > 1) {
					for (int i = 1; i < strPart.length; i++) {
						System.out.print(" ");
						System.out.print(strPart[i]);
					}
				}
		}	
	}

	
	
}
