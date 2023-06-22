package day17;

/*
Q2. Interesting Array

Problem Description
You have an array A with N elements. We have two types of operation available on this array :
We can split an element B into two elements, C and D, such that B = C + D.
We can merge two elements, P and Q, to one element, R, such that R = P ^ Q i.e., XOR of P and Q.
You have to determine whether it is possible to convert array A to size 1, containing a single element equal to 0 after several splits and/or merge?
 */

public class InterestingArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {9, 17};
		System.out.println(solve(arr));
	}
	public static String solve(int[] A) {
        int countOfOdd=0;
        for(int i=0;i<A.length;i++){
            if((A[i]&1)==1) countOfOdd++;
        }
        if((countOfOdd&1)==1) return "No";
        return "Yes";
    }
}