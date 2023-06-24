package day26;
import java.util.Map;
import java.util.HashMap;
/*
Q2. First Repeating element

Problem Description
Given an integer array A of size N, find the first repeating element in it.

We need to find the element that occurs more than once and whose index of the first occurrence is the smallest.

If there is no repeating element, return -1.
 */

public class FirstRepeatingElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {10, 5, 3, 4, 3, 5, 6};
		System.out.println(solve(arr));
	}
	public static int solve(int[] A) {
        Map<Integer,Integer> map=new HashMap<>();
        int index = A.length;
        for(int i=0;i<A.length;i++){
            if(map.containsKey(A[i])){
                index = Math.min(index,map.get(A[i]));
            }else{
                map.put(A[i],i);
            }
        }
        if(index==A.length) return -1;
        return A[index];
    }
}
