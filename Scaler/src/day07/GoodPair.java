package day07;

/*
Q2. Good Pair

Problem Description
Given an array A and an integer B. A pair(i, j) in the array is a good pair if i != j and (A[i] + A[j] == B). Check if any good pair exist or not.
 */

public class GoodPair {
	
	public static void main(String[] args) {
		int[] arr = {1,2,3,4};
		int B = 7;
		System.out.println(solve(arr,B));
	}
	
	public static int solve(int[] A, int B) {
        for(int i=0;i<A.length;i++){
            for(int j=i+1;j<A.length;j++){
                if(A[i]+A[j]==B){
                    return 1;
                }
            }
        }
        return 0;
    }
}
