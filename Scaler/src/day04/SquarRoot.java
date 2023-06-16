package day04;

/*
Square root of a number

Problem Description

Given a number A. Return square root of the number if it is perfect square otherwise return -1.

Note: A number is a perfect square if its square root is an integer.
*/

public class SquarRoot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(solve(4));

	}
	public static int solve(int A) {
        for(int i=1;i*i<=A;i++){
            if(i*i==A) return i;
        }
        return -1;
    }

}
