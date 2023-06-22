package day09;

/*
Q3. Closest MinMax

Problem Description
Given an array A, find the size of the smallest subarray 
such that it contains at least one occurrence of the maximum value of the array

and at least one occurrence of the minimum value of the array.
 */

public class ClosestMinMax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {2, 6, 1, 6, 9};
		System.out.println(solve(arr));
	}
	public static int solve(int[] A) {
        int minVal=Integer.MAX_VALUE;;
        int maxVal=Integer.MIN_VALUE;
        for(int i=0;i<A.length;i++){
            minVal = Math.min(minVal,A[i]);
            maxVal = Math.max(maxVal,A[i]);
        }
        int lastMin = -1;
        int lastMax = -1;
        int minLen=A.length;
        for(int i=0;i<A.length;i++){
            if(A[i]==maxVal){
                lastMax=i;
                if(lastMin!=-1){
                    minLen = Math.min(minLen,i-lastMin);
                }
            }
            if(A[i]==minVal){
                lastMin=i;
                if(lastMax!=-1){
                    minLen = Math.min(minLen,i-lastMax);
                }
            }
        }
        return minLen+1;
    }
}
