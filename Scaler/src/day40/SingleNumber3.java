package day40;

import java.util.Arrays;

/*
Q1. Single Number III

Problem Description
Given an array of positive integers A, two integers appear only once, and all the other integers appear twice.
Find the two integers that appear only once.

Note: Return the two numbers in ascending order.
 */

public class SingleNumber3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A = {1, 2, 3, 1, 2, 4};
		System.out.println(Arrays.toString(solve(A)));
	}
	public static int[] solve(int[] A) {
		int value = 0;
        for(int i=0;i<A.length;i++){
            value = value^A[i];
        }
        int k;
        for(k=0;k<32;k++){
            if((value&(1<<k))==(1<<k)){
                break;
            }
        }
        int[] ans = new int[2];
        int num1 = 0;
        int num2 = 0;
        for(int i=0;i<A.length;i++){
            if((A[i]&(1<<k))==(1<<k)){
                num1 = num1 ^ A[i];
            }else{
                num2 = num2 ^ A[i];
            }
        }
        ans[0] = num2;
        ans[1] = num1;
        Arrays.sort(ans);
        return ans;
	}
}
