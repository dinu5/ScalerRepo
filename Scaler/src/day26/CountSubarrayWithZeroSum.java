package day26;
import java.util.HashMap;

/*
Q1. Count Subarray Zero Sum

Problem Description
Given an array A of N integers.

Find the count of the subarrays in the array which sums to zero. Since the answer can be very large, return the remainder on dividing the result with 109+7
 */

public class CountSubarrayWithZeroSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1, -1, -2, 2};
		System.out.println(solve(arr));
	}
	public static int solve(int[] A) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int sum=0;
        long count=0;
        int MOD = 1000000007;
        for(int i=0;i<A.length;i++){
            
            sum += A[i];
            if(sum==0) count++;
            if(map.containsKey(sum)){
                count += map.get(sum);
                map.put(sum,map.get(sum)+1);
            }else{
                map.put(sum,1);
            }
        }
        return (int)count%MOD;
    }
}
