package day12;

/*
Q2. Minimum Swaps

Problem Description

Given an array of integers A and an integer B, find and return the minimum number of swaps required to bring all the numbers less than or equal to B together.

Note: It is possible to swap any two elements, not necessarily consecutive.
 */

public class MinimumSwaps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1, 12, 10, 3, 14, 10, 5};
		System.out.println(solve(arr,8));
	}
	public static int solve(int[] A, int B) {
        if(A.length<=1) return 0;
        int good = 0;
        int bad = 0;
        for(int i=0;i<A.length;i++){
            if(A[i]<=B) good++;
            
        }
        
        for(int i=0;i<good;i++){
            if(A[i]>B) bad++;
        }
        int swap = bad;
        int s=1;
        int e=good;
        while(e<A.length){
            if(A[s-1]>B) bad--;
            if(A[e]>B) bad++;
            swap = Math.min(swap,bad);
            s++;
            e++;
        }
        return swap;
    }
}
