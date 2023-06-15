package day4;

/*
 * Problem Description
You are given an integer A. You have to tell whether it is a perfect number or not.

Perfect number is a positive integer which is equal to the sum of its proper positive divisors.

A proper divisor of a natural number is the divisor that is strictly less than the number.
 */

public class PerfectNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(solve(6));

	}
	public static int solve(int A) {
        if(A==1) return 0;
        int sum=0;
        for(int i=1;i<A;i++){
            if(A%i==0) sum+=i;
        }
        if(A==sum) return 1;
        return 0;
    }

}
