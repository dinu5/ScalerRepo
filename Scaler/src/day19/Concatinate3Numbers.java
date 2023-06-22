package day19;

/*
Q3. Concatenate Three Numbers

Problem Description
Given three 2-digit integers, A, B, and C, find out the minimum number obtained by concatenating them in any order.

Return the minimum result obtained.
 */

public class Concatinate3Numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(solve(10,20,30));
	}
	public static int solve(int A, int B, int C) {
        String ans="";
        if(A<=B && A<=C){
            if(B<C){
                ans = "" + A + B + C;
            }else{
                ans = "" + A + C + B;
            }
        }else if(B<=A && B<=C){
            if(A<C){
                ans = "" + B + A + C;
            }else{
                ans = "" + B + C + A;
            }
        }else{
            if(A<B){
                ans = "" + C + A + B;
            }else{
                ans = "" + C + B + A;
            }
        }
        return Integer.parseInt(ans);
    }
}
