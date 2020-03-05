package arrays;

import java.util.Random;

public class _00_ArrayCheatSheet {
	public static void main(String[] args) {
		//1. make an array of 5 Strings
		String [] strings;
		strings = new String[5];
		//2. print the third element in the array
		System.out.println(strings [2]);
		//3. set the third element to a different value
		strings [2] = "hi";
		//4. print the third element again
		System.out.println(strings [2]);
		//5. use a for loop to print all the values in the array
		//   BE SURE TO USE THE ARRAY'S length VARIABLE
		for(int i = 0; i<strings.length; i++) {
			System.out.println(strings [i]);
		}
		
		//6. make an array of 50 integers
		int [] numbers;
		numbers = new int[50];
		//7. use a for loop to make every value of the integer array a random number
		Random randy = new Random();
		for(int i=0; i<numbers.length; i++) {
			numbers [i] = randy.nextInt(1000);
		}
		//8. without printing the entire array, print only the smallest number in the array
		int smallest = numbers [0];
		for(int i=0; i<numbers.length; i++) {
			if(numbers[i]<smallest) {
				smallest = numbers [i];
			}
		}
		System.out.println("The smallest number equals " + smallest);
		//9 print the entire array to see if step 8 was correct
		for(int i=0; i<numbers.length; i ++) {
			System.out.println(numbers[i]);
		}
		//10. print the largest number in the array.
		int largest = numbers [0];
		for(int i=0; i<numbers.length; i++) {
			if(numbers[i]>largest) {
				largest = numbers [i];
			}
		}
		System.out.println("The largest number is " + largest);
	}
}
