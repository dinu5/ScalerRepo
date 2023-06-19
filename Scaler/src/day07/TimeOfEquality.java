package day07;

/*
Q4. Time to equality

Problem Description
Given an integer array A of size N. In one second, you can increase the value of one element by 1.

Find the minimum time in seconds to make all elements of the array equal.
 */

public class TimeOfEquality {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {2, 4, 1, 3, 2};
		System.out.println(solve(arr));
	}
	public static int solve(int[] A) {
        int max=A[0];
        for(int i=1;i<A.length;i++){
            max=Math.max(A[i],max);
        }
        int count=0;
        for(int i=0;i<A.length;i++){
            count+=max-A[i];
        }
        return count;
    }
}
