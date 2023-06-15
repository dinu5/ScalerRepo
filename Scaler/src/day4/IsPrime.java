package day4;

/*
 * Problem Description
Given a number A. Return 1 if A is prime and return 0 if not. 

Note : 
The value of A can cross the range of Integer.
 * */

public class IsPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(solve(23));

	}
	public static int solve(long A) {
        if(A==1) return 0;
        for(long i=2;i*i<=A;i++){
            if(A%i==0) return 0;
        }
        return 1;
    }

}
