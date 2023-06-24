package day25;

import java.util.Arrays;

/*
Q2. toupper()

Problem Description
You are given a function to_upper() consisting of a character array A.

Convert each character of A into Uppercase character if it exists. If the Uppercase of a character does not exist, it remains unmodified.
The lowercase letters from a to z is converted to uppercase letters from A to Z respectively.

Return the uppercase version of the given character array.
 */

public class ToUpper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] arr = {'S', 'c', 'A', 'l', 'e', 'r', 'A', 'c', 'a', 'D', 'e', 'm', 'y'};
		System.out.println(Arrays.toString(to_upper(arr)));
	}
	public static char[] to_upper(char[] A) {
        for(int i=0;i<A.length;i++){
            if(A[i]>=97 && A[i]<=122){
                A[i] = (char)(A[i] - 32);
            }
        }
        return A;
    }
}
