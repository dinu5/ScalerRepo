package day4;

/*
 * Count Factors - 2

Problem Description
Given an integer A, you need to find the count of it's factors.

Factor of a number is the number which divides it perfectly leaving no remainder.

Example : 1, 2, 3, 6 are factors of 6
 * */

public class CountFactors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(solve(5));

	}
	public static int solve(int A) {
        int count=0;
        for(int i=1;i*i<=A;i++){
            if(A%i==0){
                if(i*i==A) count++;
                else count+=2;
            }
        }
        return count;
    }

}
