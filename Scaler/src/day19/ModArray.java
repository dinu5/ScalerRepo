package day19;

/*
Q2. Mod Array

Problem Description
You are given a large number in the form of a array A of size N where each element denotes a digit of the number.
You are also given a number B. You have to find out the value of A % B and return it.
 */

public class ModArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {4, 3, 5, 3, 5, 3, 2, 1};
		System.out.println(solve(arr,47));
	}
	public static long solve(int[] A,int B) {
		int t=1;
		long ans=0;
		for(int i=A.length-1;i>=0;i--) {
			ans = (ans+(A[i]*t)%B)%B;
			t=(t*10)%B;
		}
		return ans;
	}
}
