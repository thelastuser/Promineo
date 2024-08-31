
package com.thelastuser.arrayplay;

public class Week4Coding {
	
	public static boolean isFirstGreater(double[] firstArray, double[] secondArray) {
		double array1Sum = 0;
		for (double d : firstArray) {
			array1Sum = array1Sum + d;
		}
		double arr1Avg = array1Sum / firstArray.length;
		double array2Sum = 0;
		for (double d : secondArray) {
			array2Sum = array2Sum + d;
		}
		double arr2Avg = array2Sum / secondArray.length;
	return arr1Avg > arr2Avg;	
}
public static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) {
	if (isHotOutside && moneyInPocket > 10.50) {
		return true;
	}
	return false;
}

public static String selfConcat(String word, int n) {
	StringBuilder strResult = new StringBuilder();
	for (int i = 1; i < n; i++) {
		strResult = strResult.append(word);
	}
	return strResult.toString();
}

public static String fullNamer(String firstName, String lastName) {
	String fn = firstName + " " + lastName;
	return fn;
}

boolean IsMoreThan100(int[] array) {
	
	int arrSum = 0;
	for (int i : array) {
		arrSum = arrSum + i;
	}
	return arrSum > 100;
}

double arrAverage(double[] array) {
	double arraySum = 0;
	for (double d : array) {
		arraySum = arraySum + d;
	}
	return arraySum / array.length;
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Java 4: Coding Project
		 * 
		 */
		
		int[] ages = {3, 9, 23, 64, 2, 8, 28, 93};
		int result = ages[ages.length-1] - ages[0];
		System.out.println(result);
		int[] ages2 = new int[9];
		boolean has9Elements = (ages2.length == 9);
		System.out.println(has9Elements);
		int result2 = ages2[ages2.length-1] - ages2[0];
		System.out.println(result2);
		int sum = 0;
		for (int index = 0; index < ages.length; index++) {
			sum = sum + ages[index];
		}
		System.out.println("The sum of ages is " + sum);
		int avg = sum / ages.length;
		System.out.println("The average ages is " + avg);
		
		String[] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};
		int strLenSum = 0;
		for (String name : names) {
			strLenSum = strLenSum + name.length();
		}
		int strLenAvg = strLenSum / names.length;
		System.out.println("The average string length of the names is :" + strLenAvg);
		
		System.out.print("You access the last element of the of an Array by referencing the element by its zero-based index: arrayName[length-of-array minus 1]. ");
		System.out.println("The length of the array is a property returned by arrayName.length");
		System.out.println("The first item of an array has index of '0', so arrayName[0] returns this element.");
		
		int[] nameLengths = new int[names.length];
		for (int i = 0; i < names.length; i++) {
			nameLengths[i] = names[i].length();
		}
		int nameLengthsSum  = 0;
		for (int nameLength : nameLengths) {
			nameLengthsSum = nameLengthsSum + nameLength;
		}
		System.out.println("The sum of nameLength elements is: " + nameLengthsSum);
		
	}
}
