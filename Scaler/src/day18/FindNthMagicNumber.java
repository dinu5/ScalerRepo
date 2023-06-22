package day18;

/*
Q5. Find nth Magic Number

Problem Description
Given an integer A, find and return the Ath magic number.

A magic number is defined as a number that can be expressed as a power of 5 or a sum of unique powers of 5.

First few magic numbers are 5, 25, 30(5 + 25), 125, 130(125 + 5), ….
 */

public class FindNthMagicNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(solve(3));
	}
	public static int solve(int A) {
        int power = 5;
        int ans=0;
        while(A>0){
            if((A&1)==1) ans+=(A&1)*power;
            A>>=1;
            power*=5;
        }
        return ans;
    }
}
