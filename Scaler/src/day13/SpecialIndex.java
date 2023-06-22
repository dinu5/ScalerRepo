package day13;

/*
Q3. Special Index

Problem Description
Given an array, arr[] of size N, the task is to find the count of array indices such that removing an element from these indices makes the sum of even-indexed and odd-indexed array elements equal.
 */

public class SpecialIndex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {2, 1, 6, 4};
		System.out.println(solve(arr));
	}
	public static int solve(int[] A) {
        int[] pse=new int[A.length];
        int[] pso=new int[A.length];
        pse[0]=A[0];
        pso[0]=0;
        for(int i=1;i<A.length;i++){
            if(i%2==0){
                pse[i]=pse[i-1]+A[i];
            }else{
                pse[i]=pse[i-1];
            }
        }
        for(int i=1;i<A.length;i++){
            if(i%2!=0){
                pso[i]=pso[i-1]+A[i];
            }else{
                pso[i]=pso[i-1];
            }
        }
        int count=0;
        for(int i=0;i<A.length;i++){
            int oddSum=0;
            int evenSum=0;
            if(i==0){
                evenSum = pso[A.length-1];
                oddSum = pse[A.length-1] - A[i];
            }else{
                evenSum = pse[i-1] + pso[A.length-1] - pso[i];
                oddSum = pso[i-1] + pse[A.length-1] - pse[i];
            }
            if(evenSum==oddSum) count++;
        }
        return count;
    }
}
