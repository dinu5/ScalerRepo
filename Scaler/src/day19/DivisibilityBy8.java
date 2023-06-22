package day19;

/*
Q2. Divisibility by 8

Problem Description
You are given a number A in the form of a string. Check if the number is divisible by eight or not.

Return 1 if it is divisible by eight else, return 0.

 */

public class DivisibilityBy8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(solve("16"));
	}
	public static int solve(String A) {

        if(A.length()>4){
            String last4 = A.substring(A.length()-5,A.length());
            if(Integer.parseInt(last4)%8==0) return 1;
            return 0;
        }
        if(Integer.parseInt(A)%8==0) return 1;
        return 0;
    }
}
