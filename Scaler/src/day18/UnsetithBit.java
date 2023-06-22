package day18;

/*
Q4. Unset i-th bit

Problem Description
You are given two integers A and B.
If B-th bit in A is set, make it unset.
If B-th bit in A is unset, leave as it is.
Return the updated A value.

Note:
The bit position is 0-indexed, which means that the least significant bit (LSB) has index 0.
 */

public class UnsetithBit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(solve(4,1));
	}
	public static int solve(int A, int B) {
        if((A&(1<<B))==0) return A;
        return (A^(1<<B));
    }
}
