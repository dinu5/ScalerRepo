package day29;

/*
Q1. Implement Power Function

Problem Description
Implement pow(A, B) % C.
In other words, given A, B and C, Find (AB % C).
Note: The remainders on division cannot be negative. In other words, make sure the answer you return is non-negative.


Problem Constraints
-109 <= A <= 109
0 <= B <= 109
1 <= C <= 109
 */

public class ImplementPowerFunction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(pow(2,3,3));
	}
	public static int pow(int A,int B,int C) {
		if(B==0) return 1;
		if(A==0) return 0;
		long prod = pow(A,B/2,C);
		prod = (prod*prod)%C;
		if(B%2==1) {
			prod = (A*prod)%C;
		}
		if(A<0) prod = (prod+C)%C;
		return (int)prod;
	}
}
