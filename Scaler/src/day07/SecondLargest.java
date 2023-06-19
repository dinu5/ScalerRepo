package day07;

/*
Q3. Second Largest

Problem Description
You are given an integer array A. You have to find the second largest element/value in the array or report that no such element exists.


 */

public class SecondLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {2, 1, 2};
		System.out.println(solve(arr));
	}
	
	public static int solve(int[] A) {
        int max=-1;
        int sec=-1;
        for(int i=0;i<A.length;i++){
            if(A[i]>max){
                sec=max;
                max=A[i];
                
            }
            if(A[i]>sec && A[i]<max){
                sec=A[i];
            }
        }
        return sec;
    }

}
