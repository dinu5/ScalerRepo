package day04;

/*
 * Given two integers A and B. A represents the count of mangoes
 *  and B represent the count of slices of mangoes. 
 *  Mango can be cut into three slices of mangoes. 
 *  A glass of mango shake can be formed by two slices of mangoes.

Find the maximum number of glasses of mango shakes 
you can make with A mangoes and B slices of mangoes initially.
 */

public class MakeIt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(solve(19,0));

	}
	public static int solve(int A, int B) {
        int total = A*3 + B;
        return total/2;
    }

}
