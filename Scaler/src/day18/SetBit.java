package day18;

/*
Q3. Set Bit

Problem Description
You are given two integers A and B.
Set the A-th bit and B-th bit in 0, and return output in decimal Number System.

Note:
The bit positions are 0-indexed, which means that the least significant bit (LSB) has index 0.
 */

public class SetBit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(solve(3,5));
	}
	public static int solve(int A, int B) {
        int ans=0;
        ans = (ans | (1<<A));
        return (ans | (1<<B));
    }
}
