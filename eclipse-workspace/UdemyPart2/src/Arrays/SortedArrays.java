package Arrays;

import java.lang.reflect.Array;
import java.util.Scanner;

public class SortedArrays {

	private static Scanner scanner = new Scanner (System.in);
	
	public static void main(String[] args) {
		
		int[] myIntegers = getIntegers(5); // we are going to sort 5 numbers
		int[] sorted = sortIntegers(myIntegers);
		printArray(sorted);
	}
	
	// Create Get integers methods
	
	public static int[] getIntegers (int capacity) { // We want to return an array  int[]
		// define our array 
		
		int [] array = new int [capacity];
		System.out.println("Enter " + capacity  + " array value.\r");


		for (int i = 0; i < array.length; i++) {
				array[i] = scanner.nextInt();
			}
		return array;
		}
	
	// next Create our Print Array
	
	  public static void printArray (int [] array ) {
		  for (int i = 0; i <array.length; i++) {
			  System.out.println("Element  " + i + " contents" + array[i]);
		  }
	  }
	  
	  public static int[] sortIntegers (int [] array) {
		  int[] sortedArray = new int [array.length]; // array that is exactly the same size as the array that has been 
		  // passed to us
		  
		  for (int i = 0; i < array.length; i++) {
			  sortedArray[i]= array[i];
	  }
//		  so we continue this loop until while flag is set to true
//		  so when we initially go into that while loop for the first time
//		  flag is set to true, so it is going to execute at least once
//		  Then we immediately set that flag to false 
//		  We go through each element of the loop until all elements are sorted.
//		  
//		  We start our element at zero -> i=0;
		  
//		  element 0 ->50
//		  element 1 -> 160
//		  element 2 -> 40
//		  if sortedArray[i], which is now 50, less than sortedArray[i+1], which is 160,
//		  in other word 50 is less than 160, in tha tcase that is true, we swap values around
//		  so we put temp = sortedArray[i], again i is 0.
//		  second flag is set to true because we want to go through loop again to check if 50 is less than 40, which is 
//		  false. But because flag has already been set true the first time, it will start again
//		  
		  
		 // so the next time we go through , we assign flag to false again 
		  
		  
		  boolean flag = true;
		  int temp;
		  
		  // we need to go through the array 
		  while(flag) {
			  flag = false; 
			  for(int i =0 ; i<sortedArray.length-1; i++) {
				  if(sortedArray[i] < sortedArray[i+1]) {
					  temp = sortedArray[i];
					  sortedArray[i] = sortedArray[i+1];
					  sortedArray[i+1] = temp;
					  flag = true;
				  }
			  }
		  }
		  return sortedArray; 
		  
	  }
	}