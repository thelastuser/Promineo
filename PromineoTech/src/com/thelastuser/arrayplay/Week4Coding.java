// I am still working on my coding conventions
// And have a wedding to attend this weekend
// So next week's assignment will be better
package com.thelastuser.arrayplay;
import java.util.Arrays;

// No time for number 13! off to the wedding!

public class Week4Coding {
	//11. Write a method that takes two Arrays of double and returns true if the average of the
	//elements in the first Array is greater than the average of the elements in the second Array.
	public static boolean isFirstGreater(double[] firstArray, double[] secondArray) {
		double array1Sum = 0;
		//loop through the elements of the first array and add the current element to a running sum
		for (double d : firstArray) {
			array1Sum = array1Sum + d;
		}
		//calculate the average of the first array
		double arr1Avg = array1Sum / firstArray.length;
		double array2Sum = 0;
		//loop through the elements of the second array and add the current element to a running sum
		for (double d : secondArray) {
			array2Sum = array2Sum + d;
		}
		//calculate the average of the second array
		double arr2Avg = array2Sum / secondArray.length;
	return arr1Avg > arr2Avg;
	}
	//12. Write a method called willBuyDrink that takes a boolean isHotOutside, and a double
	//moneyInPocket, and returns true if it is hot outside and if moneyInPocket is greater than 10.50.
	public static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) {
		//straightforward condition
	if (isHotOutside && moneyInPocket > 10.50) {
		return true;
	}
		//method needs to return a boolean
	return false;
	}
	//7. Write a method that takes a String, word, and an int, n, as arguments and returns the word
	//concatenated to itself n number of times. (i.e. if I pass in “Hello” and 3, I expect the method to
	//return “HelloHelloHello”).
	public static String selfConcat(String word, int n) {
	StringBuilder strResult = new StringBuilder();
	for (int i = 1; i < n; i++) {
		strResult = strResult.append(word);
	}
	return strResult.toString();
	}
	/*8. Write a method that takes two Strings, firstName and lastName, and returns a full name (the
	full name should be the first and the last name as a String separated by a space).*/
	public static String fullNamer(String firstName, String lastName) {
	String fn = firstName + " " + lastName;
	return fn;
	}
	/*9. Write a method that takes an Array of int and returns true if the sum of all the ints in the Array
	is greater than 100*/
	boolean IsMoreThan100(int[] array) {
	int arrSum = 0;
	for (int i : array) {
		arrSum = arrSum + i;
	}
	return arrSum > 100;
	}
	/*10. Write a method that takes an Array of double and returns the average of all the elements in
	the Array.*/
	double arrAverage(double[] array) {
	double arraySum = 0;
	for (double d : array) {
		arraySum = arraySum + d;
	}
	return arraySum / array.length;
	}
	//Where I started, before I tripped over myself by defining methods within methods
	public static void main(String[] args) {
		/*1. Create an Array of int called ages that contains the following values: 3, 9, 23, 64, 2, 8, 28, 93.
		 */
		int[] ages = {3, 9, 23, 64, 2, 8, 28, 93};
		/*1a. Programmatically subtract the value of the first element in the Array from the value in
		the last element of the Array (i.e. do not use ages[7] in your code). Print the result to the
		console. */
		int result = ages[ages.length-1] - ages[0];
		System.out.println("Last element minus first element from " + Arrays.toString(ages) + " equals " + result);
		/*1b. Create a new array of int called ages2 with 9 elements (ages2 will be longer than
		the ages array, and have more elements). */
		int[] ages2 = new int[9];
		//1bi. Make sure that there are 9 elements of type int in this new array.
		boolean has9Elements = (ages2.length == 9);
		System.out.println("Does ages2 have 9 elements? " + has9Elements);

		//Would be nice to have non-zero integers in ages2...
		for (int age: ages2) {
			age = ((int)Math.random() * 120) + 1;
		}
		
		System.out.println("Here is ages2: " + Arrays.toString(ages2));
		// ... Better luck next time, I guess.
		
		/*1bii. Repeat the subtraction from Step 1.a. (Programmatically subtract the value of
		the first element in the new array ages2 from the last element of ages2).*/
		int result2 = ages2[ages2.length-1] - ages2[0];
		System.out.println("The last element " + ages2[ages2.length-1] + " minus the first element " + ages2[0] +  " is " + result2);
		/*1c. Use a loop to iterate through the Array and calculate the average age. Print the result
		to the console.*/
		int sum = 0;
		for (int index = 0; index < ages.length; index++) {
			sum = sum + ages[index];
		}
		System.out.println("The sum of ages is " + sum);
		int avg = sum / ages.length;
		System.out.println("The average age is " + avg);
		/*2. Create an Array of String called names that contains the following values: “Sam”, “Tommy”,
		“Tim”, “Sally”, “Buck”, “Bob”.*/
		String[] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};
		/*a. Use a loop to iterate through the Array and calculate the average number of letters per
		name. Print the result to the console.*/
		int strLenSum = 0;
		for (String name : names) {
			strLenSum = strLenSum + name.length();
		}
		int strLenAvg = strLenSum / names.length;
		System.out.println("The average string length of the names is :" + strLenAvg);
		/*3. How do you access the last element of any Array?
		4. How do you access the first element of any Array?*/
		System.out.print("You access the last element of the of an Array by referencing the element by its zero-based index: arrayName[length-of-array minus 1]. ");
		System.out.println("The length of the array is a property returned by arrayName.length");
		System.out.println("The first item of an array has index of '0', so arrayName[0] returns this element.");
		/*5. Create a new Array of int called nameLengths. Write a loop to iterate over the previously
		created names Array and add the length of each name to the nameLengths Array.*/
		int[] nameLengths = new int[names.length];
		for (int i = 0; i < names.length; i++) {
			nameLengths[i] = names[i].length();
		}
		/*6. Write a loop to iterate over the nameLengths Array and calculate the sum of all the elements in
		the Array. Print the result to the console.*/
		int nameLengthsSum  = 0;
		for (int nameLength : nameLengths) {
			nameLengthsSum = nameLengthsSum + nameLength;
		}
		System.out.println("The sum of nameLength elements is: " + nameLengthsSum);
		
	}
}
