package day37;

/*
Q2. Minimum Swaps

Problem Description

Given an array of integers A and an integer B, find and return the minimum number of swaps required to bring all the numbers less than or equal to B together.

Note: It is possible to swap any two elements, not necessarily consecutive.
 */

public class MinimumSwaps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A = {1, 12, 10, 3, 14, 10, 5};
		int B = 8;
		System.out.println(solve(A,B));
	}
	public static int solve(int[] A, int B) {
		int gd = 0;
        for(int i=0;i<A.length;i++){
            if(A[i]<=B){
            	gd++;
            }
        }
        int swaps = 0;
        for(int i=0;i<gd;i++){
            if(A[i]>B){
                swaps++;
            }
        }
        int ans = swaps;
        int s=1;
        int e=gd;
        while(e<A.length){
            if(A[s-1]>B){
                swaps--;
            }
            if(A[e]>B) swaps++;
            
            ans = Math.min(ans,swaps);
            s++;
            e++;
        }
        return ans;
	}
}
