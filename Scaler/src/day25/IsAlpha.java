package day25;

/*
Q2. Isalnum()

Problem Description
You are given a function isalpha() consisting of a character array A.

Return 1 if all the characters of a character array are alphanumeric (a-z, A-Z, and 0-9) else, return 0.
 */

public class IsAlpha {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] arr = {'S', 'c', 'a', 'l', 'e', 'r', 'A', 'c', 'a', 'd', 'e', 'm', 'y', '2', '0', '2', '0'};
		System.out.println(solve(arr));
	}
	public static int solve(char[] A) {
        
        for(int i=0;i<A.length;i++){
            if(!((A[i]>='a' && A[i]<='z') || (A[i]>='A' && A[i]<='Z') || (A[i]>='0' && A[i]<='9'))){
                return 0;
            }
        }
        return 1;
    }
}
