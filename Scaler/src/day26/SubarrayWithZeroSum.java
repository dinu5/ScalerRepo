package day26;
import java.util.Set;
import java.util.HashSet;

/*
Q3. Sub-array with 0 sum

Problem Description
Given an array of integers A, find and return whether the given array contains a non-empty subarray with a sum equal to 0.

If the given array contains a sub-array with sum zero return 1, else return 0.
 */

public class SubarrayWithZeroSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1, 2, 3, 4, 5};
		System.out.println(solve(arr));
	}
	public static int solve(int[] A) {
	      // Just write your code below to complete the function. Required input is available to you as the function arguments.
	      // Do not print the result or any output. Just return the result via this function.
	      Set<Long> set=new HashSet<>();
	      long sum=0;
	      for(int i=0;i<A.length;i++){
	          sum+=A[i];
	          if(sum==0) return 1;
	          if(set.contains(sum)) return 1;
	          set.add(sum);
	      }
	      
	      return 0;
	  }
}
