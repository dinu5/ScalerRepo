package day11;

/*
Q2. Are Matrices Same ?

Problem Description
You are given two matrices A and B of equal dimensions and you have to check whether two matrices are equal or not.

NOTE: Both matrices are equal if A[i][j] == B[i][j] for all i and j.
 */

public class AreMatricesSame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr1 = {
				{1,2,3},
				{4,5,6},
				{7,8,9}
		};
		int[][] arr2 = {
				{1,2,3},
				{4,5,6},
				{7,8,9}
		};
		System.out.println(solve(arr1,arr2));
	}
	public static int solve(int[][] A, int[][] B) {
        for(int i=0;i<A.length;i++){
            for(int j=0;j<A[i].length;j++){
                if(A[i][j]!=B[i][j]){
                    return 0;
                }
                
            }
        }
        return 1;
    }
}
