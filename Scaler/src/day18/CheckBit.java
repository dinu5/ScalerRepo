package day18;

/*
Q1. Check bit

Problem Description
You are given two integers A and B.
Return 1 if B-th bit in A is set
Return 0 if B-th bit in A is unset
Note:
The bit position is 0-indexed, which means that the least significant bit (LSB) has index 0.
 */

public class CheckBit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(solve(4,1));
	}
	public static int solve(int A, int B) {
        if((A&(1<<B))==0) return 0;
        return 1;
    }
}
