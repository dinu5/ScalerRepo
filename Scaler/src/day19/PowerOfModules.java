package day19;

/*
Q1. Power with Modules

Problem Description
You are given A, B and C .
Calculate the value of (A ^ B) % C
 */

public class PowerOfModules {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(solve(2,3,3));
	}
	public static int solve(int A, int B, int C) {
        long ans=1;
        for(int i=0;i<B;i++){
            ans = (ans*A)%C;
        }
        return (int)ans;
    }
}
