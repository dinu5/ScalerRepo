package day38;

/*
Q3. First Missing Integer

Problem Description
Given an unsorted integer array, A of size N. Find the first missing positive integer.

Note: Your algorithm should run in O(n) time and use constant space.
 */

public class FirstMissingInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A = {1, 2, 0};
		System.out.println(firstMissingPositive(A));
	}
	public static int firstMissingPositive(int[] A) {
		int i = 0;
		while(i<A.length) {
			
			if(A[i]>0 && A[i]<=A.length) {
                int correctIndex = A[i] - 1;
                if(A[i]!=A[correctIndex]){ 
				    int temp = A[correctIndex];
				    A[correctIndex] = A[i];
				    A[i] = temp;
                }else i++;
			}else i++;
			
		}
		for(int j=0;j<A.length;j++) {
			if(A[j]!=j+1) return j+1;
		}
		return A.length+1;
	}
}
