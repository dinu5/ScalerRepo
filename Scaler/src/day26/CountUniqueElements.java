package day26;

import java.util.Map;
import java.util.HashMap;

/*
Q4. Count unique elements

Problem Description
You are given an array A of N integers. Return the count of elements with frequncy 1 in the given array.
 */

public class CountUniqueElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {3, 4, 3, 6, 6};
		System.out.println(solve(arr));
	}
	public static int solve(int[] A) {
        int count = 0;
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<A.length;i++){
            if(map.containsKey(A[i])){
                map.put(A[i],map.get(A[i])+1);
            }else{
                map.put(A[i],1);
            }
        }
        for(int i=0;i<A.length;i++){
            if(map.get(A[i])==1) count++;
        }
        return count;
    }
}
