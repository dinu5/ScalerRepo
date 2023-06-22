package day18;

/*
Q6. Reverse Bits

Problem Description
Reverse the bits of an 32 bit unsigned integer A.

Input Format
First and only argument of input contains an integer A.

Output Format
Return a single unsigned integer denoting the decimal value of reversed bits.
 */

public class ReverseBits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(reverse(3));
	}
	public static long reverse(long a) {
        long ans=0;
        int i=0;
        while(a>0){
            if((a&1)==1){
                ans = (long)(ans | (1L<<(31-i)));
                
            }
            i++;
            a>>=1;
        }
        return ans;
	}
}
