/*
Given an array of integers, move all the 0s to the right end of the array.

The relative order of the elements in the original array does not need to be maintained.

Assumptions:

The given array is not null.
Examples:

{1} --> {1}
{1, 0, 3, 0, 1} --> {1, 3, 1, 0, 0} or {1, 1, 3, 0, 0} or {3, 1, 1, 0, 0}
*/

public class Solution{

public static int[] moveZero(int[] array){

	  if (array == null || array.length ==0){
		  return array;
	  }

	  int first = 0;
	  int last = array.length - 1;

	  while (first < last){

		  if (array[first] == 0 && array[last] != 0){
			  int temp = array[first];
			  array[first] = array[last];
			  array[last] = temp;

			  first++;
			  last--;

		  } else{
			  if (array[first] != 0)
				  first++;
			  if (array[last] == 0)
				  last--;
		     }
	  	}
	  	return array;
	 }
}
