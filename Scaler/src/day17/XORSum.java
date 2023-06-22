package day17;

/*
Q1. XOR Sum

Problem Description
Given two integers A and B. Find the minimum value (A ⊕ X) + (B ⊕ X) that can be achieved for any X.

where P ⊕ Q is the bitwise XOR operation of the two numbers P and Q.

Note: Bitwise XOR operator will return 1, if both bits are different. If bits are same, it will return 0.
 */

public class XORSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(solve(6,12));
	}
	public static int solve(int A, int B) {
        return A^B;
    }
}
