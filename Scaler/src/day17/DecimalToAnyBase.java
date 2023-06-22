package day17;

/*
Q8. Decimal to Any Base

Problem Description
Given a decimal number A and a base B, convert it into its equivalent number in base B.
 */

public class DecimalToAnyBase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(DecimalToAnyBase(4,3));
	}
	public static int DecimalToAnyBase(int A, int B) {
        int ans=0;
        int i=1;
        while(A>0){
            ans = ans + (A%B)*i;
            A/=B;
            i*=10;
        }
        return ans;
    }	
}
