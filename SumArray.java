// Given an array A[] of n numbers and another number x, the task is to check whether or not there exist two elements in A[] whose sum is exactly x. 
// Input: arr[] = {0, -1, 2, -3, 1}, x= -2
//Output: Yes
//Explanation:  If we calculate the sum of the output,1 + (-3) = -2

// Java program to check if there exists a pair
// in array whose sum results in x.
import java.io.*;
class GFG {

	// Function to find and print pair
	static boolean chkPair(int A[], int size, int x)
	{
		for (int i = 0; i < (size - 1); i++) {
			for (int j = (i + 1); j < size; j++) {
				if (A[i] + A[j] == x) {
					return true;
				}
			}
		}

		return false;
	}

	public static void main(String[] args)
	{

		int A[] = { 0, -1, 2, -3, 1 };
		int x = -2;
		int size = A.length;

		if (chkPair(A, size, x)) {
			System.out.println("Yes");
		}
		else {
			System.out.println("No");
		}
	}
}

// This code is contributed by umadevi9616
