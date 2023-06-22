package day18;

/*
Q1. Toggle i-th bit

Problem Description
You are given two integers A and B.
If B-th bit in A is set, make it unset
If B-th bit in A is unset, make it set
Return the updated A value
 */

public class ToggleithBit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(solve(4,1));
	}
	public static int solve(int A, int B) {
        return (A^(1<<B));
    }
}
