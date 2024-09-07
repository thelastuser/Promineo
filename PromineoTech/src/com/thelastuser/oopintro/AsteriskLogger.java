package com.thelastuser.oopintro;

public class AsteriskLogger implements Logger {

	@Override
	public void log(String str) {
		// TODO The log method on the AsteriskLogger should print out the String it receives
		// between 3 asterisks on either side of the String
		// (e.g. if the String passed in is “Hello”, then it should print ***Hello*** to the console).
		System.out.println("***" + str + "***");
	}

	@Override
	public void error(String str) {
		// TODO The error method on the AsteriskLogger should print the String it receives
		// inside a box of asterisks, with the String preceded by the word “ERROR:”.
		int boxWidth = 3 + 7 + str.length() + 3; // "ERROR: " has 7 chars, + 3 asterisks on either side
		for (int count = 1; count <= boxWidth; count++) {
			System.out.print("*"); // draw upper perimeter of box
		}
		System.out.println();
		System.out.print("***ERROR: " + str + "***");
		System.out.println();
		for (int count = 1; count <= boxWidth; count++) {
			System.out.print("*"); // draw lower perimeter of box
		}
	}
	
}
