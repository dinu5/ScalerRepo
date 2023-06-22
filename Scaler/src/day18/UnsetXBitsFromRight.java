package day18;

/*
Q2. Unset x bits from right

Problem Description
Given an integer A. Unset B bits from the right of A in binary.

For example, if A = 93 and B = 4, the binary representation of A is 1011101.
If we unset the rightmost 4 bits, we get the binary number 1010000, which is equal to the decimal value 80.
 */

public class UnsetXBitsFromRight {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(solve(25,3));
	}
	public static long solve(long A, int B) {
        long temp=A;
        for(int i=0;i<B;i++){
            if((temp&1)!=0){
                A = A ^ (1<<i); 
            }
            temp=(temp>>1);
        }
        return A;
    }
}
