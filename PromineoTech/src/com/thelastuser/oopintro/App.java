package com.thelastuser.oopintro;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		// TODO Create a class named App that has a main method.
		// a.  In this class instantiate an instance of each of your logger classes that implement the Logger interface.
		// b. Test both methods on both instances, passing in Strings of your choice.
		Scanner userInput = new Scanner(System.in);
		AsteriskLogger testStarLog = new AsteriskLogger();
		SpacedLogger testSpaceLog = new SpacedLogger();
		System.out.println("Enter a string.");
		String userEntry = userInput.nextLine();
		System.out.println();
		System.out.println("Here is how the Log is rendered with Asterisks:");
		System.out.println();
		testStarLog.log(userEntry);
		System.out.println();
		System.out.println("And here is how the Error is rendered with Asterisks:");
		System.out.println();
		testStarLog.error(userEntry);
		System.out.println();
		System.out.println();
		System.out.println("Here is how the Log is rendered with Spaces:");
		System.out.println();
		testSpaceLog.log(userEntry);
		System.out.println();
		System.out.println("And here is how the Error is rendered with Spaces:");
		System.out.println();
		testSpaceLog.error(userEntry);
		
		userInput.close();
	}

}
