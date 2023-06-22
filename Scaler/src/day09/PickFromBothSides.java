package day09;

/*
Q8. Pick from both sides!

Problem Description
You are given an integer array A of size N.

You have to perform B operations. In one operation, you can remove either the leftmost or the rightmost element of the array A.

Find and return the maximum possible sum of the B elements that were removed after the B operations.

NOTE: Suppose B = 3, and array A contains 10 elements, then you can:

Remove 3 elements from front and 0 elements from the back, OR
Remove 2 elements from front and 1 element from the back, OR
Remove 1 element from front and 2 elements from the back, OR
Remove 0 elements from front and 3 elements from the back.
 */

public class PickFromBothSides {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {5, -2, 3 , 1, 2};
		System.out.println(solve(arr,3));
	}
	public static int solve(int[] A, int B) {
        int sum=0;
        
        for(int i=0;i<B;i++){
            sum+=A[i];
        }
        int maxSum=sum;
        int left=B-1;
        int right=A.length-1;
        while(left>=0){
            sum-=A[left];
            sum+=A[right];
            maxSum = Math.max(maxSum,sum);
            left--;
            right--;
        }
        return maxSum;
    }
}
