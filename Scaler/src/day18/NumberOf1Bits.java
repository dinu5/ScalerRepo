package day18;

/*
Q2. Number of 1 Bits

Problem Description
Write a function that takes an integer and returns the number of 1 bits present in its binary representation.

 */

public class NumberOf1Bits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(numSetBits(11));
	}
	public static int numSetBits(int A) {
        int count=0;
        while(A>0){
            if((A&1)==1) count++;
            A=(A>>1);
        }
        return count;
    }
}
