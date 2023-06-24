package day26;

import java.util.Map;
import java.util.Arrays;
import java.util.HashMap;

/*
Q1. Frequency of element query

Problem Description
Given an array A. You have some integers given in the array B.
For the i-th number, find the frequency of B[i] in the array A and return a list containing all the frequencies.

 */

public class FrequencyOfElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1 = {1, 2, 1, 1};
		int[] arr2 = {1, 2};
		System.out.println(Arrays.toString(solve(arr1,arr2)));
	}
	public static int[] solve(int[] A, int[] B) {
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<A.length;i++){
            if(map.containsKey(A[i])){
                map.put(A[i],map.get(A[i])+1);
            }else{
                map.put(A[i],1);
            }
        }
        int[] ans=new int[B.length];
        for(int i=0;i<B.length;i++){
            if(map.containsKey(B[i])){
                ans[i] = map.get(B[i]);
            }else{
                ans[i]=0;
            }
        }
        return ans;
    }
}
