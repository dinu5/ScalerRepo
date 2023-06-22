package day17;

/*
Q7. Any base to decimal

Problem Description
You are given a number A. You are also given a base B. A is a number on base B.
You are required to convert the number A into its corresponding value in decimal number system.
 */

public class AnyBaseToDecimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(solve(1010,2));
	}
	public static int solve(int A, int B) {
        int power=1;
        int ans = 0;
        while(A>0){
            ans = ans + (A%10)*power;
            A/=10;
            power*=B;
        }
        return ans;
    }
}
