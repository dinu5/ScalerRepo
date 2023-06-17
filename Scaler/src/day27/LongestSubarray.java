package day27;
import java.util.Map;
import java.util.HashMap;
/*
 Q1. Longest Subarray Zero Sum

Problem Description
Given an array A of N integers.
Find the length of the longest subarray in the array which sums to zero.

Note :
while we A[i] multiple times, it may cross the range of integer, so wisely select data type for any operations.
 * */

public class LongestSubarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1, -2, 1, 2};
		System.out.println(solve(arr));
	}
	
	public static int solve(int[] arr) {
		Map<Integer,Integer> map=new HashMap<>();
		int sum = 0;
		int maxLen = 0;
		for(int i=0;i<arr.length;i++) {
			sum+=arr[i];
			if(sum==0) {
				maxLen = Math.max(maxLen, i+1);
			}
			if(map.containsKey(sum)) {
				maxLen = Math.max(maxLen, i - map.get(sum));
			}else {
				map.put(sum, i);
			}
		}
		return maxLen;
	}
	

}
